package Airline;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.text.*;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

public class LoginPage extends JFrame
{
	Container c = getContentPane();
	JPanel PFlightTypes = new JPanel(null);
	JPanel PFlightDetails = new JPanel(null);
	public boolean bCheck=true;

	JLabel LDomesticFlight = new JLabel("<html><B>Domestic Flights</B></html>");
	JLabel LInternationalFlight = new JLabel("<html><B>International Flights</B></html>");
	JLabel LUserName, LPassword;

	JLabel LDomesticFlight1 = new JLabel("<html><B>Domestic Flight Booking</B></html>");
	
	JLabel LInternationalFlight1 = new JLabel("<html><B>International Flight Booking</B></html>");

	JTextField TFUserName;
	JPasswordField TPPassword;

	JButton BLogin;

	final Object[] col1 ={ "From", "To", "Price", "Time" };
	//final Object[] col2 = { "From", "To", "Price", "Time" };
	//final Object[] col3 = { "From", "To", "Price", "Time" };

	final Object[][] row1 = { { "Bangalore", "Trivandrum", "3125", "16:30" }, { "Bangalore", "Chennai ", "3225", "19:00" }, { "Bangalore", "Delhi", "1425 ", "08:30" }, { "Bangalore", "Goa", "1025 ", "09:50" }, { "Bangalore", "Hyderabad", "1525", "11:00" }, { "Bangalore", "Kolkata", "3825 ", "05:30" }, { "Bangalore", "Lucknow", "3025 ", "05:30" }, { "Bangalore", "Mumbai", "1725", "12:00" }, { "Bangalore", "Vishakapatnam", "3725", "19:00" } };
	final Object[][] row2 = { { "Bangalore", "Bali", "21485", "06:20" }, { "Bangalore", "Bangkok", "9000", "20:45" }, { "Bangalore", "Cairo", "22975", "10:25" }, { "Bangalore", "CapeTown", "42500", "16:45" }, { "Bangalore", "Chicago", "35000", "06:30" }, { "Bangalore", "Dubai", "12000", "08:15" }, { "Bangalore", "Frankfurt", "18500", "06:50" }, { "Bangalore", "HongKong", "20845", "12:00" }, { "Bangalore", "Istanbul", "22000", "10:45" }, { "Bangalore", "London", "22600", "14:35" }, { "Bangalore", "LosAngeles", "35000", "22:00" }, { "Bangalore", "Melbourne", "27800", "21:15" }, { "Bangalore", "New York", "32000", "08:50" }, { "Bangalore", "Paris", "18500", "18:45" }, { "Bangalore", "Rome", "19900", "20:00"}, { "Bangalore", "SanFrancisco", "35000", "12:00"}, { "Bangalore", "shanghai", "24430", "10:15" }, { "Bangalore", "Singapore", "9000", "21:10" }, { "Bangalore", "Sydney", "27800", "12:00"}, { "Bangalore", "Toronto", "35000", "17:00 " } };
	final Object[][] row3 = { { "Bangalore", "Trivandrum", "9375", "16:30" }, { "Bangalore", "Chennai ", "9675", "19:00" }, { "Bangalore", "Delhi", "4275", "08:30" }, { "Bangalore", "Goa", "3075", "09:50" }, { "Bangalore", "Hyderabad", "4575", "11:00" }, { "Bangalore", "Kolkata", "11475", "05:30" }, { "Bangalore", "Lucknow", "9075", "05:30" }, { "Bangalore", "Mumbai", "5175", "12:00" }, { "Bangalore", "Vishakapatnam", "11175", "19:00" } };
	final Object[][] row4 = { { "Bangalore", "Bali", "64455", "06:20" }, { "Bangalore", "Bangkok", "27000", "20:45" }, { "Bangalore", "Cairo", "68925", "10:25" }, { "Bangalore", "CapeTown", "37500", "16:45" }, { "Bangalore", "Chicago", "105000", "06:30" }, { "Bangalore", "Dubai", "36000", "08:15" }, { "Bangalore", "Frankfurt", "55500", "06:50" }, { "Bangalore", "HongKong", "62535", "12:00" }, { "Bangalore", "Istanbul", "66000", "10:45" }, { "Bangalore", "London", "67800", "14:35" }, { "Bangalore", "LosAngeles", "105000", "22:00" }, { "Bangalore", "Melbourne", "83400", "21:15" }, { "Bangalore", "New York", "96000", "08:50" }, { "Bangalore", "Paris", "55500", "18:45" }, { "Bangalore", "Rome", "59700", "20:00" }, { "Bangalore", "SanFrancisco", "105000", "12:00" }, { "Bangalore", "shanghai", "73290", "10:15" }, { "Bangalore", "Singapore", "27000", "21:10"}, { "Bangalore", "Sydney", "83400", "12:00"}, { "Bangalore", "Toronto", "105000", "17:00" } };

	JTable TDomesticFlight = new JTable(row1, col1);
	JTable TInternationalFlight = new JTable(row2, col1);
	JTable TDomesticFlight1 = new JTable(row3, col1);
	JTable TInternationalFlight1 = new JTable(row4, col1);

	JScrollPane JSP1 = new JScrollPane(TDomesticFlight, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	JScrollPane JSP2 = new JScrollPane(TInternationalFlight, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	JScrollPane JSP3 = new JScrollPane(TDomesticFlight1, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	JScrollPane JSP4 = new JScrollPane(TInternationalFlight1, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

	Icon img1 = new ImageIcon("C:\\Users\\yasha\\Desktop\\airline-r41\\Airline Reservarion\\img/economic.jpg");
	Icon img2 = new ImageIcon("C:\\Users\\yasha\\Desktop\\airline-r41\\Airline Reservarion\\img/business.jpg");
	Icon img3 = new ImageIcon("C:\\Users\\yasha\\Desktop\\airline-r41\\Airline Reservarion\\img/economic1.jpg");
	Icon img4 = new ImageIcon("C:\\Users\\yasha\\Desktop\\airline-r41\\Airline Reservarion\\img/business1.jpg");

	JLabel LEconomic = new JLabel("Economic", img1, SwingConstants.LEFT);
	JLabel LBusiness = new JLabel("Business", img2, SwingConstants.LEFT);
	JLabel LEconomic1 = new JLabel("Economic", img3, SwingConstants.LEFT);
	JLabel LBusiness1 = new JLabel("Business", img4, SwingConstants.LEFT);
	private final JLabel Ltitle = new JLabel("Airline booking system");

	public LoginPage()
	{
		//WindowUtilities.setNativeLookAndFeel();
		setPreferredSize(new Dimension(800,800));
		PFlightDetails.setBackground(new Color(25, 25, 112));
		PFlightDetails.setBounds(0,500,780,200);
		LDomesticFlight1.setBounds(60,60,200,20);
		LInternationalFlight1.setBounds(60,100,200,20);
		PFlightDetails.setLayout(null);
		JSP1.setBounds(0, 500, 780, 200);

		PFlightDetails.add(JSP1);
		JSP2.setBounds(0, 500, 780, 200);
		PFlightDetails.add(JSP2);
		JSP3.setBounds(0, 500, 780, 200);
		PFlightDetails.add(JSP3);
		JSP4.setBounds(0, 500, 780, 200);
		PFlightDetails.add(JSP4);

		JSP1.setVisible(true);
		JSP2.setVisible(false);
		JSP3.setVisible(false);
		JSP4.setVisible(false);
		c.add(PFlightDetails);
		PFlightTypes.setBounds(0, 101, 780, 400);
		PFlightDetails.add(PFlightTypes);
		PFlightTypes.setBackground(SystemColor.inactiveCaptionBorder);
				LBusiness.setFont(new Font("Lucida Fax", Font.BOLD, 13));
		
				LBusiness.setBounds(476, 222, 300, 125);
				LEconomic.setFont(new Font("Lucida Fax", Font.BOLD, 13));
				LEconomic.setBounds(88, 234, 261, 125);
				LBusiness1.setBounds(490, 267, 135, 60);
				LEconomic1.setBounds(88, 255, 147, 60);
				PFlightTypes.add(LEconomic);
				PFlightTypes.add(LBusiness);
				PFlightTypes.add(LEconomic1);
				PFlightTypes.add(LBusiness1);
				LBusiness.setVisible(false);
				LEconomic1.setVisible(false);
				LBusiness1.setVisible(true);
				LEconomic.setVisible(true);
						LDomesticFlight.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 15));
				
				
						LDomesticFlight.setBounds(71, 181, 147, 42);
						LInternationalFlight.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 15));
						LInternationalFlight.setBounds(504, 170, 158, 42);
						LDomesticFlight1.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 15));
						LInternationalFlight1.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 15));
		PFlightTypes.add(LDomesticFlight);
		PFlightTypes.add(LInternationalFlight);
		

		LUserName = new JLabel("         User Name ");
		LUserName.setFont(new Font("Myanmar Text", Font.ITALIC, 13));
		LUserName.setBounds(208, 42, 153, 21);
		PFlightTypes.add(LUserName);
		TFUserName = new JTextField(10);
		TFUserName.setBounds(371, 40, 100, 21);
		PFlightTypes.add(TFUserName);
		LPassword = new JLabel("         Password ");
		LPassword.setFont(new Font("Myanmar Text", Font.ITALIC, 13));
		LPassword.setBounds(226, 91, 100, 21);
		PFlightTypes.add(LPassword);
		TPPassword = new JPasswordField(10);
		TPPassword.setBounds(371, 89, 100, 21);
		PFlightTypes.add(TPPassword);
		BLogin = new JButton("Sign In");
		BLogin.setFont(new Font("Sitka Text", Font.BOLD, 11));
		BLogin.setBackground(SystemColor.inactiveCaption);
		BLogin.setBounds(306, 153, 100, 25);
		PFlightTypes.add(BLogin);
		
				BLogin.addActionListener(new button1(this));
		Ltitle.setBackground(new Color(255, 255, 255));
		Ltitle.setForeground(new Color(0, 255, 255));
		Ltitle.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		Ltitle.setHorizontalAlignment(SwingConstants.CENTER);
		Ltitle.setBounds(222, 29, 347, 61);
		
		PFlightDetails.add(Ltitle);
		
				LDomesticFlight.addMouseListener(new mouse1(this, true));
				LInternationalFlight.addMouseListener(new mouse1(this, false));
				
						LBusiness1.addMouseListener(new mouse2(this, true));
						LEconomic1.addMouseListener(new mouse2(this, false));

		pack();
		setVisible(true);

	   addWindowListener(new ExitListener());

		LDomesticFlight1.addMouseListener(new mouse3(this, true));
		LInternationalFlight1.addMouseListener(new mouse3(this, false));
	}

	public static void main(String args[])
	{
		new LoginPage();
	}
}


class button1 implements ActionListener
{
	LoginPage type;
	char[] cCheck, cPassword={'a','d','m','i','n','\0'};
	JFrame f;
	String sCheck,sCheck1="admin";

	public button1(LoginPage type)
	{
		this.type = type;
	}
	public void actionPerformed(ActionEvent e)
	{
		cCheck=type.TPPassword.getPassword();
		sCheck = type.TFUserName.getText();
		if ((sCheck1.equals(sCheck)) && check())
		{
			type.PFlightTypes.add(type.LDomesticFlight1);
			type.PFlightTypes.add(type.LInternationalFlight1);

			type.PFlightTypes.remove(type.LUserName);
			type.PFlightTypes.remove(type.TFUserName);
			type.PFlightTypes.remove(type.LPassword);
			type.PFlightTypes.remove(type.TPPassword);
			type.PFlightTypes.remove(type.BLogin);

			type.c.repaint();
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Invalid username or password. Try again");
		}
	}
	public boolean check()
	{
		if (cCheck.length >= 6 || cCheck.length < 4)
			return false;
		for(int i=0;i<=4;i++)
		{
			if(cCheck[i]!=cPassword[i])
				return false;
		}
		return true;
	}
}

class mouse1 extends MouseAdapter
{
	LoginPage type;
	boolean bCheck;

	public mouse1(LoginPage type, boolean bCheck)
	{
		this.type = type;
		this.bCheck = bCheck;
	}
	public void mouseEntered(MouseEvent e)
	{
		type.LDomesticFlight.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		type.LInternationalFlight.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
	public void mouseClicked(MouseEvent e)
	{
		if(bCheck)
			type.bCheck = true;
		else
			type.bCheck = false;
		type.LEconomic.setVisible(true);
		type.LBusiness1.setVisible(true);
		type.LEconomic1.setVisible(false);
		type.LBusiness.setVisible(false);

		type.JSP1.setVisible(false);
		type.JSP2.setVisible(false);
		type.JSP3.setVisible(false);
		type.JSP4.setVisible(false);
		if(bCheck)
			type.JSP1.setVisible(true);
		else
			type.JSP2.setVisible(true);
	}
}



class mouse3 extends MouseAdapter
{
	LoginPage type;
	boolean bCheck;

	public mouse3(LoginPage type, boolean bCheck)
	{
		this.type = type;
		this.bCheck = bCheck;
	}
	public void mouseEntered(MouseEvent e)
	{
		type.LDomesticFlight1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		type.LInternationalFlight1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
	public void mouseClicked(MouseEvent e)
	{
		if (bCheck)
			new DomesticFlight(type);
		else
			new InternationalFlight(type);
	}
}


class mouse2 extends MouseAdapter
{
	LoginPage type;
	boolean bCheck;

	public mouse2(LoginPage type, boolean bCheck)
	{
		this.type = type;
		this.bCheck = bCheck;
	}
	public void mouseEntered(MouseEvent e)
	{
		type.LEconomic1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		type.LBusiness1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
	public void mouseClicked(MouseEvent e)
	{
		if(type.bCheck)
		{
			if (bCheck)
			{
				type.LBusiness1.setVisible(false);
				type.LBusiness.setVisible(true);
				type.LEconomic.setVisible(false);
				type.LEconomic1.setVisible(true);
				type.JSP1.setVisible(false);
				type.JSP2.setVisible(false);
				type.JSP3.setVisible(true);
				type.JSP4.setVisible(false);
			}
			else
			{
				type.LEconomic1.setVisible(false);
				type.LBusiness.setVisible(false);
				type.LBusiness1.setVisible(true);
				type.LEconomic.setVisible(true);
				type.JSP1.setVisible(true);
				type.JSP2.setVisible(false);
				type.JSP3.setVisible(true);
				type.JSP4.setVisible(false);
			}
		}
		else
		{
			if (bCheck)
			{
				type.LBusiness1.setVisible(false);
				type.LBusiness.setVisible(true);
				type.LEconomic.setVisible(false);
				type.LEconomic1.setVisible(true);
				type.JSP1.setVisible(false);
				type.JSP2.setVisible(false);
				type.JSP3.setVisible(false);
				type.JSP4.setVisible(true);
			}
			else
			{
				type.LEconomic1.setVisible(false);
				type.LBusiness.setVisible(false);
				type.LBusiness1.setVisible(true);
				type.LEconomic.setVisible(true);
				type.JSP1.setVisible(false);
				type.JSP2.setVisible(true);
				type.JSP3.setVisible(false);
				type.JSP4.setVisible(false);
			}
		}
	}
}

