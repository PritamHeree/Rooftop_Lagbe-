package Classes;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Intro extends JFrame implements MouseListener,ActionListener
{
	ImageIcon img;
	JLabel imgLabel; 
	JPanel FastP, ImageP, FromP, MainP, LoginP;
	JLabel Heading, Heading2,Heading3, HLog;
	JButton Adlog , Uslog, doclog;
	
	public Intro()
	{
	
        super("START WITH LOGIN");
     
	    super.setBounds(300,80,1200,800);// (x,y,width, height);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		MainP = new JPanel();
		MainP.setLayout(null);
		MainP.setBounds(0,0,1200,800);
		MainP.setBackground(new Color(255,153,153));
		add(MainP);
		
		FastP = new JPanel();
		FastP.setLayout(null);
		FastP.setBounds(40,32,1100,696);
		FastP.setBackground(new Color(167,146,211));
		MainP.add(FastP);
		
		ImageP = new JPanel();
		ImageP.setLayout(null);
		ImageP.setBounds(0,0,550,700);
		ImageP.setBackground(Color.WHITE);
		FastP.add(ImageP);
		
		FromP = new JPanel();
		FromP.setLayout(null);
		FromP.setBounds(550,0,600,800);
		FromP.setBackground(new Color(255,204,204));
		FastP.add(FromP);
		
		LoginP = new JPanel();
		LoginP.setLayout(null);
		LoginP.setBounds(60,190,400,300);
		LoginP.setBackground(Color.WHITE);
		FromP.add(LoginP);
	
		

		img = new ImageIcon("image\\PICR1.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0,0,548,img.getIconHeight());
		ImageP.add(imgLabel);
		
		Heading = new JLabel("ROOFTOP LAGBE?");
		Heading.setBounds(100,40,400,50);
		Heading.setFont(new Font ("Forte", Font.BOLD,28));
		Heading.setForeground(Color.BLACK);
		LoginP.add(Heading);
		
		Heading2 = new JLabel("ENJOY YOUR DAY");
		Heading2.setBounds(105,70,400,50);
		Heading2.setFont(new Font ("Rubik Bubbles", Font.BOLD,25));
		Heading2.setForeground(Color.BLACK);
		LoginP.add(Heading2);
		
		Heading3 = new JLabel("or");
		Heading3.setBounds(200,175,100,50);
		Heading3.setFont(new Font ("Rubik Bubbles", Font.ITALIC,25));
		Heading3.setForeground(Color.BLACK);
		LoginP.add(Heading3);
		
		HLog = new JLabel("^CHOOSE LOGIN OPTION^");
		HLog.setBounds(105,140,400,50);
		HLog.setFont(new Font ("Rubik Bubbles", Font.BOLD,13));
		HLog.setForeground(Color.BLACK);
		LoginP.add(HLog);
		
		
		Adlog = new JButton("Admin Login");//Admin Button
		Adlog.setBounds(50,190,120,28);
		Adlog.setBackground(new Color(0,153,0));
		Adlog.setForeground(Color.WHITE);
		Adlog.addMouseListener(this);
		Adlog.addActionListener(this);
		LoginP.add(Adlog);
		
		Uslog = new JButton("User Login");//User Button
		Uslog.setBounds(240,190,120,28);
		Uslog.setBackground(new Color(0,153,0));
		Uslog.setForeground(Color.WHITE);
		Uslog.addMouseListener(this);
		Uslog.addActionListener(this);
		LoginP.add(Uslog);	
	}
	
	public void mouseClicked (MouseEvent me) {}
	public void mousePressed (MouseEvent me) {}
	public void mouseReleased (MouseEvent me) {}
	public void mouseEntered (MouseEvent me) 
	{
		
		if (me.getSource()==Adlog)  //Admin Login button
		{
			Adlog.setBackground(new Color(0,204,0));
			Adlog.setForeground(Color.WHITE);
		}
		else if (me.getSource()==Uslog)  //User Login button
		{
			Uslog.setBackground(new Color(0,204,0));
			Uslog.setForeground(Color.WHITE);
		}
		   

	}
	public void mouseExited (MouseEvent me) {
		if (me.getSource()==Adlog)  //Admin Login button 
		{
			Adlog.setBackground(new Color(0,153,0));
			Adlog.setForeground(Color.WHITE);
		}
		else if (me.getSource()==Uslog)  //User Login button 
		{
			Uslog.setBackground(new Color(0,153,0));
			Uslog.setForeground(Color.WHITE);
		}
		
	
	
	}

	public void actionPerformed(ActionEvent ae) {
		
		if (ae.getSource()==Adlog)   //Admin Login button 
		{
			AdminLogin AL1 = new AdminLogin();
			AL1.setVisible(true);
			this.setVisible(false);
		}
		else if (ae.getSource()==Uslog)   //User Login button 
		{
			UserLogin UL1 = new UserLogin();
			UL1.setVisible(true);
			this.setVisible(false);
		}
		
	}
	
}