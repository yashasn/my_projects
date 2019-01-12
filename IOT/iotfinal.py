from picamera import PiCamera
from time import sleep, gmtime,strftime
import RPi.GPIO as gpio
import datetime
import time
import sys
import os
import smtplib
from shutil import copyfile
from email.mime.multipart import MIMEMultipart
from email.mime.base import MIMEBase
from email.mime.text import MIMEText
from email.utils import COMMASPACE, formatdate
from email import encoders
import telepot
from telepot.loop import MessageLoop
import pyrebase
import urllib

doorled=18
pin_to_circuit=7
led=16
gpio.setmode(gpio.BOARD)
gpio.setup(doorled,gpio.OUT)
gpio.output(18,gpio.LOW)


gpio.setup(12, gpio.IN, pull_up_down=gpio.PUD_UP)

camera=PiCamera()
camera.exposure_mode= 'antishake'

USERNAME = "iotdoorbellding@gmail.com"
PASSWORD = "********"
MAILTO = "yashasvrm3@gmail.com"
recentsnapshot='/home/pi/Documents/recent.png'

def sendmail():
    print('Sending mail')
    msg = MIMEMultipart()
    text = "Hi, \n\nSomeone knocked on your door at " + strftime("%l:%M %p on %d-%m-%Y")
    msg['to'] = MAILTO
    msg['from'] = "iotdoorbellding@gmail.com"
    msg['subject'] = "Ding Dong at " + strftime("%l:%M %p on %d-%m-%Y")

    msg.attach(MIMEText(text))
    part = MIMEBase('application', "octet-stream")
    part.set_payload(open(recentsnapshot, "rb").read())
    encoders.encode_base64(part)

    part.add_header('Content-Disposition', 'attachment; filename="photo.jpg"')

    msg.attach(part)
    #print('The mail was:' + str(msg.as_string))
    server = smtplib.SMTP('smtp.gmail.com:587')
    #print('1')
    server.ehlo_or_helo_if_needed()
    #print('2')
    server.starttls()
    #print('3')
    server.ehlo_or_helo_if_needed()
    #print('4')
    server.login(USERNAME, PASSWORD)
    #print('5')
    server.sendmail(USERNAME, MAILTO, msg.as_string())
    print('sent mail')
    server.quit()

def audio():
    config = {
      "apiKey": "AIzaSyB3p_5jR-cJrHT2aY2R7a_KJedyHz-j6eg",
      "authDomain": "doorbell-7152c.firebaseapp.com",
      "databaseURL": "https://doorbell-7152c.firebaseio.com",
      "storageBucket": "doorbell-7152c.appspot.com",
      "serviceAccount": "doorbell-7152c-firebase-adminsdk-b8ypk-1e8b5934a6.json"
                   }

    firebase = pyrebase.initialize_app(config)

    storage = firebase.storage()

    storage.child("images/piii.mp3").download("downloaded.mp3")
    # storage.child("south-indian.mp3").get_url()

def handle(msg):
    chat_id = msg['chat']['id'] # Receiving the message from telegram
    command = msg['text']   # Getting text from the message

    print ('Received:')
    print(command)

    if command == '/close':
        gpio.output(doorled,gpio.LOW)
        bot.sendMessage (chat_id, str("Door closed"))
        

    # Comparing the incoming message to send a reply according to it
    if command == '/open':
        gpio.output(doorled,gpio.HIGH)
        bot.sendMessage (chat_id, str("Door open"))
        
    if command == '/out':
        os.system('omxplayer pi1.mp3 &')
        time.sleep(5)
        bot.sendAudio(chat_id,open('downloaded.mp3','rb'))
    
gpio.setup(led,gpio.OUT)
gpio.output(led,gpio.LOW)
def rc_time(pin_to_circuit):
    count=0
    
    gpio.setup(pin_to_circuit, gpio.OUT)
    gpio.output(pin_to_circuit, gpio.LOW)
    time.sleep(0.1)

    gpio.setup(pin_to_circuit, gpio.IN)

    while(gpio.input(pin_to_circuit)==gpio.LOW):
            count=count+1
    #print(count)
    if count>2500:
        
        return 2
    else:
        return 3
    
count=0   
try: 
    while True:
        
        button_status=gpio.input(12)
        
        if button_status==False and count==0:
            count=1
            print('Bell pressed')
            
            os.system('omxplayer doorbell-5.mp3 &')
            sleep(1)
            print("Your photo is being taken. Please stand in front of the camera")
            newfile='/home/pi/Documents/'+  datetime.datetime.now().strftime('%Y-%m-%d%H:%M:%S')+'.png'
            val=rc_time(pin_to_circuit)
            if val==2:
                gpio.output(led, gpio.HIGH)
            else:
                gpio.output(led, gpio.LOW)
            
            camera.capture(newfile)
            gpio.output(led, gpio.LOW)
            copyfile(newfile,recentsnapshot)
            sendmail()
            print("Sending mail")
            print("sent mail")
            print("Sending to telegram")
            audio()
            bot=telepot.Bot('698352448:AAHHLrJyeCNOnusuGz85EofEoEd0SnFMjl8')
            bot.sendMessage(-1001441479475,str("Hi, \n\nSomeone knocked on your door at " + strftime("%l:%M %p on %d-%m-%Y")))
            bot.sendPhoto(-1001441479475,open(recentsnapshot,'rb'))
            MessageLoop(bot, handle).run_as_thread()
            print ('Listening....')
            print("Sent to telegram")
            sleep(.2)
        '''
        elif button_status==False and count==1:
            print("you have already pressed the bell. Please wait for the response")
        '''    
                    
except KeyboardInterrupt:
    camera.close()
except Exception:
    print("Not connected to internet")
    camera.close()

finally:
    try:
        os.remove("downloaded.mp3")
    except:
        print('Exiting')

gpio.cleanup()
