package Airline;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;

public class PrintTicket1 extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PrintTicket1(String sFrom, String sTo, String sClass, Integer iAdult, Integer iChildren, Integer iInfant, String sBookingDate, Integer iPrice, String sTime, String sBookingby)
	{
		Container c=getContentPane();
		c.setLayout(new BorderLayout());


		JPanel Panel2 = new JPanel(null);

		Panel2.setPreferredSize(new Dimension(500,200));

		JLabel LTitle = new JLabel("<html><b>Airline Ticket</b></html>");
		LTitle.setFont(new Font("Times New Roman", Font.BOLD, 25));
		LTitle.setForeground(new Color(25, 25, 112));
		
		JLabel LFrom = new JLabel("<html><font color=\"#000000\">From &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font><font color=\"#778899\">"+sFrom+"</font></html>" );
		JLabel LTo = new JLabel("<html><font color=\"#000000\">To &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font><font color=\"#778899\">"+sTo+"</font></html>");
		JLabel LClass = new JLabel("<html><font color=\"#000000\">Class &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font><font color=\"#778899\">"+sClass+"</font></html>" );
		JLabel LBookingDate = new JLabel("<html><font color=\"#000000\">Traveling Date &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;:&nbsp;</font><font color=\"#778899\">"+ sBookingDate+"</font></html>" );
		JLabel LPrice = new JLabel("<html><font color=\"#000000\">Total Price &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;:&nbsp;</font><font color=\"#778899\">"+ iPrice+"</font></html>" );
		JLabel LTime = new JLabel("<html><font color=\"#000000\">DepatureTime  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;:&nbsp;</font><font color=\"#778899\">"+ sTime+"</font></html>" );
		JLabel LAdult = new JLabel("<html><font color=\"#000000\">Adult &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp;: &nbsp;</font><font color=\"#778899\">"+iAdult+"</font></html>" );
		JLabel LChildren = new JLabel("<html><font color=\"#000000\">Children &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; : &nbsp;</font><font color=\"#778899\">"+ iChildren+"</font></html>" );
		JLabel LInfant = new JLabel("<html><font color=\"#000000\">Infant &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font><font color=\"#778899\">"+iInfant+"</font></html>" );
		JLabel LWishes = new JLabel("<html><body>Wish you a happy journey</body></html>");
		LWishes.setForeground(new Color(72, 61, 139));
		LWishes.setFont(new Font("Arial Narrow", Font.BOLD, 16));

		String tn="";
		String str="123456890QWERTYUIOPASDFGHJKLZXCVBNM";
		int rand=0;
		for(int i=0;i<10;i++)
		{
			rand=(int)(((Math.random()*100)%36)+1);
			tn+=str.charAt((int)rand);
		}
		JLabel LTicketNo=new JLabel("<html><font color=\"#000000\">Ticket number &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; : &nbsp;</font><font color=\"#778899\">"+ tn+"</font></html>" );
		JLabel LBookedBy=new JLabel("<html><font color=\"#000000\">Booking by &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; : &nbsp;</font><font color=\"#778899\">"+ sBookingby+"</font></html>" );



		
		
		LTitle.setBounds(217,11,316,45);
		LFrom.setBounds(20,80,300,20);

		LTo.setBounds(20,125,300,20);
		LClass.setBounds(20,170,300,20);
		LBookingDate.setBounds(20,215,300,20);
		LPrice.setBounds(20,260,300,20);
		LTime.setBounds(20,305,300,20);
		LAdult.setBounds(20,345,300,20);
		LChildren.setBounds(20,385,300,20);
		LInfant.setBounds(20,430,300,20);
		LTicketNo.setBounds(20,460,300,20);
		LBookedBy.setBounds(320,125,300,20);
		LWishes.setBounds(258,502,300,20);


		LTicketNo.setBounds(320,80,300,20);
		LBookedBy.setBounds(320,125,300,20);

	


		Panel2.add(LTitle);
		Panel2.add(LFrom);
		Panel2.add(LTo);
		Panel2.add(LClass);
		Panel2.add(LBookingDate);
		Panel2.add(LAdult);
		Panel2.add(LChildren);
		Panel2.add(LInfant);
		Panel2.add(LPrice);
		Panel2.add(LTime);
		Panel2.add(LTicketNo);

		Panel2.add(LWishes);

		Panel2.add(LTicketNo);
		Panel2.add(LBookedBy);


		Panel2.setBackground(Color.white);

		c.add(Panel2, BorderLayout.CENTER);


		//pack();
		setSize(700,650);
		setVisible(true);
	}
}