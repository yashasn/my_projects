package Airline;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class DomesticFlight extends JFrame
{
	JComboBox CBFrom, CBTo, CBClass, CBAdult, CBChildren, CBInfant;
	JLabel LFrom, LTo, LBookingDate, LClass, LAdult, LChildren, LInfant, LBookingDetails, LPassengerDetails, LDate, LNotes, LBookingby;
	JTextField TFBookingDate, TFBookingby;
	Icon img1, img2;
	JButton BFindFlight;
	JPanel PPanel1;

	LoginPage type1;
	private JPanel panel;
	private JPanel panel_2;
	private JPanel panel_1;
	private JPanel panel_3;

	public DomesticFlight(LoginPage type1)
	{
		Container c =getContentPane();
		c.setLayout(new BorderLayout());
		String[] sItem1={"Bangalore"};
		String[] sItem2 ={ "Trivandrum", "Chennai ", "Delhi", "Goa", "Hyderabad", "Kolkata", "Lucknow", "Mumbai", "Vishakapatnam" };
		String[] sItem3={"Economic","Business"};

		this.type1 = type1;
		PPanel1 = new JPanel(null);
		PPanel1.setPreferredSize(new Dimension(800, 200));

		LBookingDetails = new JLabel("<html><b>Booking Details</b></html>");
		LBookingDetails.setForeground(new Color(0, 0, 255));
		LBookingDetails.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		
		LFrom = new JLabel("From          :");
		LFrom.setForeground(new Color(0, 0, 255));
		LFrom.setFont(new Font("Tahoma", Font.PLAIN, 13));
		LTo = new JLabel("To               :");
		LTo.setForeground(new Color(0, 0, 255));
		LTo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		LBookingDate = new JLabel("Booking Date:");
		LBookingDate.setForeground(new Color(0, 0, 255));
		LBookingDate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		LClass = new JLabel("Class         :");
		LClass.setForeground(new Color(0, 0, 255));
		LClass.setFont(new Font("Tahoma", Font.PLAIN, 13));

		CBFrom = new JComboBox(sItem1);
		CBTo = new JComboBox(sItem2);
		CBClass = new JComboBox(sItem3);

		TFBookingDate = new JTextField(10);
		LDate = new JLabel("(DD/MM/YYYY)");
		LDate.setForeground(new Color(0, 0, 0));

		img1=new ImageIcon("map1.jpg");

		BFindFlight = new JButton("Find Flight");
		BFindFlight.setForeground(new Color(0, 0, 205));
		BFindFlight.setFont(new Font("Times New Roman", Font.BOLD, 13));

		LBookingDetails.setBounds(337,21,124,20);
		
		

		LFrom.setBounds(20,73,100,20);
		CBFrom.setBounds(100,73,100,20);

		LTo.setBounds(237,73,100,20);
		CBTo.setBounds(347,73,100,20);

		LBookingDate.setBounds(221,143,100,20);
		TFBookingDate.setBounds(347,143,100,20);
		LDate.setBounds(464,143,100,20);

		LClass.setBounds(492,73,100,20);
		CBClass.setBounds(602,73,100,20);

		BFindFlight.setBounds(314,466,100,25);

		PPanel1.add(LBookingDetails);
		PPanel1.add(LFrom);
		PPanel1.add(CBFrom);
		PPanel1.add(LTo);
		PPanel1.add(CBTo);
		PPanel1.add(LBookingDate);
		PPanel1.add(TFBookingDate);
		PPanel1.add(LDate);
		PPanel1.add(LClass);
		PPanel1.add(CBClass);
		PPanel1.add(BFindFlight);
		PPanel1.setBackground(SystemColor.activeCaption);

		c.add(PPanel1,BorderLayout.WEST);
		String[] item4={"1","2","3","4","5","6"};
				CBAdult = new JComboBox(item4);
				CBAdult.setBounds(384, 268, 100, 20);
				PPanel1.add(CBAdult);
				
						LAdult = new JLabel("Adults(12+)");
						LAdult.setBackground(SystemColor.inactiveCaption);
						LAdult.setForeground(new Color(0, 0, 255));
						LAdult.setFont(new Font("Tahoma", Font.PLAIN, 13));
						LAdult.setBounds(237, 268, 100, 20);
						PPanel1.add(LAdult);
						String[] item5={"0","1","2","3","4"};
						CBChildren = new JComboBox(item5);
						CBChildren.setBounds(384, 312, 100, 20);
						PPanel1.add(CBChildren);
						
								LChildren = new JLabel("Children(2-11)");
								LChildren.setFont(new Font("Tahoma", Font.PLAIN, 13));
								LChildren.setForeground(new Color(0, 0, 255));
								LChildren.setBounds(237, 312, 100, 20);
								PPanel1.add(LChildren);
								LInfant = new JLabel("Infants(under 2)");
								LInfant.setForeground(new Color(0, 0, 255));
								LInfant.setFont(new Font("Tahoma", Font.PLAIN, 13));
								LInfant.setBounds(237, 356, 100, 20);
								PPanel1.add(LInfant);
								String[] item6={"0","1","2","3"};
								CBInfant = new JComboBox(item6);
								CBInfant.setBounds(384, 356, 100, 20);
								PPanel1.add(CBInfant);
								
								LBookingby = new JLabel("Booking by:");
								LBookingby.setForeground(new Color(0, 0, 255));
								LBookingby.setFont(new Font("Tahoma", Font.PLAIN, 13));
								LBookingby.setBounds(237, 400, 100, 22);
								PPanel1.add(LBookingby);
								TFBookingby = new JTextField(20);
								TFBookingby.setBounds(384, 400, 100, 22);
								PPanel1.add(TFBookingby);
								
								panel = new JPanel();
								panel.setBounds(327, 21, 134, 20);
								PPanel1.add(panel);
								
								panel_2 = new JPanel();
								panel_2.setBackground(SystemColor.inactiveCaption);
								panel_2.setBounds(10, 11, 700, 159);
								PPanel1.add(panel_2);
										
												LPassengerDetails=new JLabel("<html><b>PassengerDetails</b></html>");
												LPassengerDetails.setBounds(293, 212, 121, 18);
												PPanel1.add(LPassengerDetails);
												LPassengerDetails.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
												LPassengerDetails.setForeground(new Color(0, 0, 255));
												
												panel_1 = new JPanel();
												panel_1.setBounds(291, 206, 134, 25);
												PPanel1.add(panel_1);
												
												panel_3 = new JPanel();
												panel_3.setBackground(SystemColor.inactiveCaption);
												panel_3.setBounds(230, 194, 273, 248);
												PPanel1.add(panel_3);

		

		

		

		//img2 = new ImageIcon("note_bg.gif");

		setSize(795,580);
		setVisible(true);

		BFindFlight.addActionListener(new button3(this, type1));
	}
	public static void main(String args[])
	{
		LoginPage type1=null;
		new DomesticFlight(type1);
	}
}

class button3 implements ActionListener
{
	DomesticFlight type;
	LoginPage type1;
	button3(DomesticFlight type, LoginPage type1)
	{
		this.type = type;
		this.type1 = type1;
	}
	public void actionPerformed(ActionEvent e)
	{
		String sFrom = (String)type.CBFrom.getSelectedItem();
		String sTo = (String)type.CBTo.getSelectedItem();
		String sClass = (String)type.CBClass.getSelectedItem();
		String sBookingDate = type.TFBookingDate.getText();
		Integer iPrice=0;
		String sTime="";


		Integer iAdult = Integer.parseInt((String)type.CBAdult.getSelectedItem());
		Integer iChildren = Integer.parseInt((String)type.CBChildren.getSelectedItem());
		Integer iInfant = Integer.parseInt((String)type.CBInfant.getSelectedItem());
		String sBookingby = (String)type.TFBookingby.getText();

		int i = 0;

		if(sClass.equals("Economic"))
		{
			try{
				while(i<20)
				{
					if(type1.row1[i][1].equals(sTo))
					{
						iPrice = Integer.parseInt((String)type1.row1[i][2]);
						sTime = (String)type1.row1[i][3];
						break;
					}
					i++;
				}
			}catch(Exception e1)
			{
				JOptionPane.showMessageDialog(null, "You have no rights to access");
				System.exit(0);
			}
		}
		else
		{
			try
			{
				while(i<20)
				{
					if(type1.row1[i][1].equals(sTo))
					{
						iPrice = Integer.parseInt((String)type1.row3[i][2]);
						sTime = (String)type1.row3[i][3];
						break;
					}
					i++;
				}
			}catch(Exception e1)
			{
				JOptionPane.showMessageDialog(null, "You have no rights to access it");
				System.exit(0);
			}
		}
		type.setTitle(iPrice + " " + sTime);

		iPrice = (iPrice*iAdult)+(iPrice*(iChildren/2));

		int iCount=0;
		int iSeatCount=0;

		String[] sTempFrom=new String[1250];
		String[] sTempTo=new String[1250];
		String[] sTempClass=new String[1250];
		String[] sTempBookingDate=new String[1250];
		String[] sTempBookingby=new String[1250];
		String[] sTempTime=new String[1250];
		Integer[] iTempAdult=new Integer[1250];
		Integer[] iTempChildren=new Integer[1250];
		Integer[] iTempInfant=new Integer[1250];
		Integer[] iTempPrice=new Integer[1250];

		try
		{
//read from data
			Save2 save1;
			ObjectInputStream OIS1 = new ObjectInputStream(new FileInputStream("domestic.txt"));
			do
			{
				save1 = (Save2)OIS1.readObject();
				sTempFrom[iCount] = save1.sFrom;
				sTempTo[iCount] = save1.sTo;
				sTempClass[iCount] = save1.sClass;
				sTempBookingDate[iCount] = save1.sBookingDate;
				sTempTime[iCount] = save1.sTime;
				iTempAdult[iCount] = save1.iAdult;
				iTempChildren[iCount] = save1.iChildren;
				iTempInfant[iCount] = save1.iInfant;
				iTempPrice[iCount] = save1.iPrice;
                sTempBookingby[iCount]= save1.sBookingby;
				iCount++;
				if(save1.sBookingDate.equals(sBookingDate))
					if(save1.sTo.equals(sTo))
						iSeatCount=iSeatCount + save1.iAdult + save1.iChildren + save1.iInfant;
			}while(save1!=null);
			OIS1.close();

		}
		catch(Exception e1)
		{
		}

		iSeatCount = iSeatCount + iAdult + iChildren + iInfant;

		if(iSeatCount > 60)
		{
			JOptionPane.showMessageDialog(null,"Seats are full. Sorry!");
		}
		else
		{
			int iChoice = JOptionPane.showConfirmDialog(null,"Seats available. Do you want to Book now?");
			if(iChoice == JOptionPane.YES_OPTION)
			{
				new PrintTicket1(sFrom, sTo, sClass, iAdult, iChildren, iInfant, sBookingDate, iPrice, sTime, sBookingby);
			try
			{
//write into data
				Save2 save2=new Save2(sFrom, sTo, sClass, iAdult, iChildren, iInfant, sBookingDate, iPrice, sTime, sBookingby);
				ObjectOutputStream OOS1 = new ObjectOutputStream(new FileOutputStream("domestic.txt"));
				for(i=0;i<iCount;i++)
				{
					Save2 temp1=new Save2(sTempFrom[i], sTempTo[i], sTempClass[i], iTempAdult[i], iTempChildren[i], iTempInfant[i], sTempBookingDate[i], iTempPrice[i], sTempTime[i], sTempBookingby[i]);
					OOS1.writeObject(temp1);
System.out.println(temp1);
				}
				OOS1.writeObject(save2);
				OOS1.close();
			}catch(Exception e1)
			{
				System.out.println(e1);
			}
			}
			else
			{
			}
		}
	}
}


class Save2 implements Serializable
{
	public String sBookingby;
	String sFrom, sTo, sClass, sBookingDate, sTime;
	Integer iPrice, iAdult, iChildren, iInfant;
//	int iCount;
	public Save2(String sFrom, String sTo, String sClass, Integer iAdult, Integer iChildren, Integer iInfant, String sBookingDate, Integer iPrice, String sTime, String sBookingby2)
	{
		this.sFrom=sFrom;
		this.sTo=sTo;
		this.sClass=sClass;
		this.iAdult=iAdult;
		this.iChildren=iChildren;
		this.iInfant=iInfant;
		this.sBookingDate=sBookingDate;
		this.iPrice=iPrice;
		this.sTime=sTime;
//		this.iCount = iCount;
	}
	public String toString()
	{
		return sFrom+" "+sTo+" "+sClass+" "+iAdult+" "+iChildren+" "+iInfant+" "+sBookingDate+" "+iPrice+" "+sTime;
	}
}