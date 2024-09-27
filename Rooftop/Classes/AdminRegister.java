package Classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import Entity.*;

public class AdminRegister extends JFrame implements MouseListener,ActionListener
{
    
	ImageIcon img;
	JLabel imgLabel;
	JPanel FastP, ImageP, FromP, MainP, LoginP;
	JLabel Heading, name, phone , pass , gender;
	JTextField nameF, phoneF;
	JPasswordField passF;
	JRadioButton male, female;
	JButton SingUP, Login , See;
	ButtonGroup Gn;
	JButton regbt , Backbt;

	
	public AdminRegister()
	{
		
        super("ADMIN REGISTRATION");
        super.setBounds(300,80,1200,800);// (x,y,width, height);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		MainP = new JPanel();
		MainP.setLayout(null);
		MainP.setBounds(0,0,1200,800);
		MainP.setBackground(new Color(255,204,229));
		add(MainP);
		
		FastP = new JPanel();
		FastP.setLayout(null);
		FastP.setBounds(40,30,1100,700);
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
		FromP.setBackground(new Color(255,255,255));
		FastP.add(FromP);
		
		LoginP = new JPanel();
		LoginP.setLayout(null);
		LoginP.setBounds(70,110,400,500);
		LoginP.setBackground(Color.WHITE);
		FromP.add(LoginP);
		

		img = new ImageIcon("image\\PIC4.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(10,120,548,img.getIconHeight());
		ImageP.add(imgLabel);
		
		//Set Text and Box
		
		Heading = new JLabel("REGISTRATION");
		Heading.setBounds(140,30,250,50);
		Heading.setFont(new Font ("Rubik Bubbles", Font.BOLD,28));
		Heading.setForeground(Color.BLACK);
		LoginP.add(Heading);
		
		name = new JLabel("Username :");
		name.setBounds(30,100,100,25);
		name.setFont(new Font ("Rubik Bubbles", Font.BOLD,14));
		name.setForeground(Color.BLACK);
		LoginP.add(name);
		
		nameF = new JTextField();
		nameF.setBounds(140,100,210,25);
		LoginP.add(nameF);
		
		phone = new JLabel("Contact :");
		phone.setBounds(30,150,100,25);
		phone.setFont(new Font ("Rubik Bubbles", Font.BOLD,14));
		phone.setForeground(Color.BLACK);
		LoginP.add(phone);
		
		phoneF = new JTextField();
		phoneF.setBounds(140,150,210,25);
		LoginP.add(phoneF);
		
		pass = new JLabel("Password :");
		pass.setBounds(30,200,100,25);
		pass.setFont(new Font ("Rubik Bubbles", Font.BOLD,14));
		pass.setForeground(Color.BLACK);
		LoginP.add(pass);
		
		passF = new JPasswordField();
		passF.setBounds(140,200,210,25);
		LoginP.add(passF);
		
		gender = new JLabel("Gender :");
		gender.setBounds(30,250,100,25);
		gender.setFont(new Font ("Rubik Bubbles", Font.BOLD,14));
		gender.setForeground(Color.BLACK);
		LoginP.add(gender);
		
		Gn = new ButtonGroup();
		
		male =  new JRadioButton ("Male ");
		male.setBounds(140, 250, 100, 25);
		male.setBackground(Color.WHITE);
		LoginP.add(male);
		
		female =  new JRadioButton ("Female ");
		female.setBounds(240, 250, 100, 25);
		female.setBackground(Color.WHITE);
		LoginP.add(female);
		
		Gn.add(male);
		Gn.add(female);
		
		regbt = new JButton("REGISTER");
		regbt.setBounds(60,300,300,25);
		regbt.setBackground(new Color(255,102,178));
		regbt.setForeground(Color.WHITE);
		regbt.addMouseListener(this);
		regbt.addActionListener(this);
		LoginP.add(regbt);
		
		
		Backbt = new JButton("< BACK");
		Backbt.setBounds(260,360,110,25);
		Backbt.setBackground(new Color(255,102,178));
		Backbt.setForeground(Color.WHITE);
		Backbt.addMouseListener(this);
		Backbt.addActionListener(this);
		LoginP.add(Backbt);
		

	}	
	
	//Mouse Work 
	public void mouseClicked (MouseEvent me) {}
	public void mousePressed (MouseEvent me) {}
	public void mouseReleased (MouseEvent me) {}
	public void mouseEntered (MouseEvent me) 
	{
		if (me.getSource()==regbt)
		{
			regbt.setBackground(new Color(255,255,255));
			regbt.setForeground(Color.BLACK);
		}
		else if (me.getSource()==Backbt)
		{
			Backbt.setBackground(new Color(255,255,255));
			Backbt.setForeground(Color.BLACK);
		}
	}
	public void mouseExited (MouseEvent me) 
	{
		if (me.getSource()==regbt)
		{
			regbt.setBackground(new Color(255,102,178));
			regbt.setForeground(Color.WHITE);
		}
		else if (me.getSource()==Backbt)
		{
			Backbt.setBackground(new Color(255,102,178));
			Backbt.setForeground(Color.WHITE);
		}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==regbt)
		{
			
			String name=nameF.getText();
			String pass=passF.getText();
			String phone=phoneF.getText();
			
			if(name.isEmpty()||pass.isEmpty()||phone.isEmpty())
			{
				JOptionPane.showMessageDialog(null,"Fill All");
			}
			else
			{
				AdminAccount aacc=new AdminAccount(name,pass,phone);
				aacc.addAdminAccount();
				
				JOptionPane.showMessageDialog(null,"SucessFully Register");
				
				nameF.setText("");
				passF.setText("");
				
				AdminLogin L1 = new AdminLogin();
				L1.setVisible(true);
				this.setVisible(false);
				
			}
		}
		 if (ae.getSource()==Backbt)
		{
			AdminLogin AL1 = new AdminLogin();
		    AL1.setVisible(true);
			this.setVisible(false);
		}
	}
}