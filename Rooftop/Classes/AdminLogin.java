package Classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Entity.*;

public class AdminLogin extends JFrame implements MouseListener,ActionListener
{
	ImageIcon img;
	JLabel imgLabel;
	JPanel FastP, ImageP, FromP, MainP, LoginP;
	JLabel Heading, Email, Pass;
	JTextField EmailF;
	JPasswordField PassF;
	JButton Loginbt, Singupbt, Back;

    public AdminLogin ()
    {
		
        super("Admin Login");
        
	    super.setBounds(300,80,1200,800);// (x,y,width, height);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Panel Create
		
		MainP = new JPanel();
		MainP.setLayout(null);
		MainP.setBounds(0,0,1200,800);
		MainP.setBackground(new Color(255, 178, 102 ));
		add(MainP);
		
		FastP = new JPanel();
		FastP.setLayout(null);
		FastP.setBounds(40,32,1100,696);
		FastP.setBackground(new Color(255,204,153));
		MainP.add(FastP);
		
		ImageP = new JPanel();
		ImageP.setLayout(null);
		ImageP.setBounds(0,0,550,700);
		ImageP.setBackground(new Color(255,255,255));
		FastP.add(ImageP);
		
		FromP = new JPanel();
		FromP.setLayout(null);
		FromP.setBounds(550,0,600,800);
		FromP.setBackground(new Color(255,229,204));
		FastP.add(FromP);
		
		LoginP = new JPanel();
		LoginP.setLayout(null);
		LoginP.setBounds(60,190,400,300);
		LoginP.setBackground(new Color(255,204,153));
		FromP.add(LoginP);
		
		

		img = new ImageIcon("image\\PIC2.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0,100,548,img.getIconHeight());
		ImageP.add(imgLabel);
		
		
		Heading = new JLabel("ADMIN LOGIN");
		Heading.setBounds(100,30,400,50);
		Heading.setFont(new Font ("Rubik Bubbles", Font.BOLD,28));
		Heading.setForeground(Color.BLACK);
		LoginP.add(Heading);
		
		Email = new JLabel("Username :");
		Email.setBounds(30,100,100,25);
		Email.setFont(new Font ("Rubik Bubbles", Font.BOLD,14));
		Email.setForeground(Color.BLACK);
		LoginP.add(Email);
		
		EmailF = new JTextField();
		EmailF.setBounds(140,100,210,25);
		LoginP.add(EmailF);
		
		Pass = new JLabel("Password :");
		Pass.setBounds(30,150,100,25);
		Pass.setFont(new Font ("Rubik Bubbles", Font.BOLD,14));
		Pass.setForeground(Color.BLACK);
		LoginP.add(Pass);
		
		PassF = new JPasswordField();
		PassF.setBounds(140,150,210,25);
		LoginP.add(PassF);
		
		//Set Button
		
		Loginbt = new JButton("LOGIN");
		Loginbt.setBounds(50,200,110,25);
		Loginbt.setBackground(new Color(102,255,255));
		Loginbt.setForeground(Color.BLACK);
		Loginbt.addMouseListener(this);
		Loginbt.addActionListener(this);
		LoginP.add(Loginbt);
		
		Singupbt = new JButton("Register");
		Singupbt.setBounds(220,200,110,25);
		Singupbt.setBackground(new Color(102,255,255));
		Singupbt.setForeground(Color.BLACK);
		Singupbt.addMouseListener(this);
		Singupbt.addActionListener(this);
		LoginP.add(Singupbt);
		
		Back = new JButton("< Back");
		Back.setBounds(200,500,110,25);
		Back.setBackground(new Color(102,255,255));
		Back.setForeground(Color.BLACK);
		Back.addMouseListener(this);
		Back.addActionListener(this);
		FromP.add(Back);
		
		
    }
	
	public void mouseClicked (MouseEvent me) {}
	public void mousePressed (MouseEvent me) {}
	public void mouseReleased (MouseEvent me) {}
	public void mouseEntered (MouseEvent me) 
	{
		if (me.getSource()==Loginbt)
		{
			Loginbt.setBackground(new Color(255,255,255));
			Loginbt.setForeground(Color.BLACK);
		}
		else if (me.getSource()==Singupbt)
		{
			Singupbt.setBackground(new Color(255,255,255));
			Singupbt.setForeground(Color.BLACK);
		}
		else if (me.getSource()==Back)
		{
			Back.setBackground(new Color(255,255,255));
			Back.setForeground(Color.BLACK);
		}
	}
	public void mouseExited (MouseEvent me) 
	{
		if (me.getSource()==Loginbt)
		{
			Loginbt.setBackground(new Color(102,255,255));
			Loginbt.setForeground(Color.BLACK);
		}
		else if (me.getSource()==Singupbt)
		{
			Singupbt.setBackground(new Color(102,255,255));
			Singupbt.setForeground(Color.BLACK);
		}
		else if (me.getSource()==Back)
		{
			Back.setBackground(new Color(102,255,255));
			Back.setForeground(Color.BLACK);
		}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource()==Singupbt)
		{
			AdminRegister AD1 = new AdminRegister();
		    AD1.setVisible(true);
			this.setVisible(false);
		}
		else if (ae.getSource()==Back)
		{
			Intro I1= new Intro();
		    I1.setVisible(true);
			this.setVisible(false);
		}

		else if(ae.getSource()==Loginbt)
		{
			String email=EmailF.getText();
			String pass=PassF.getText();
			
			AdminAccount aacc=new AdminAccount();
			
			if(aacc.getAdminAccount(email,pass)==true)
			{
			JOptionPane.showMessageDialog(null,"Valid Account");
		
			AdminHome AH1=new AdminHome();
			AH1.loadUserData();
			AH1.setVisible(true);
			this.setVisible(false);
		   }
		   
		   else{
			   JOptionPane.showMessageDialog(null,"Please Enter a Valid Data");
		   }
		   
		}
	}
}