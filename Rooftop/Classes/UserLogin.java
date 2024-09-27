package Classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Entity.*;


public class UserLogin extends JFrame implements MouseListener,ActionListener
{
	ImageIcon img; 
	JLabel imgLabel; 
	JPanel FastP, ImageP, FromP, MainP, LoginP;
	JLabel Heading, username, Pass;
	JTextField usernameF;
	JPasswordField PassF;
	JButton Loginbt, Singupbt, Back;

    public UserLogin ()
    {
		//Create Frame
        super("User Login");
        super.setBounds(300,80,1200,800);// (x,y,width, height);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Panel Create
		
		MainP = new JPanel();
		MainP.setLayout(null);
		MainP.setBounds(0,0,1200,800);
		MainP.setBackground(new Color(178, 255, 102));
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
		FromP.setBackground(new Color(204,255,204));
		FastP.add(FromP);
		
		LoginP = new JPanel();
		LoginP.setLayout(null);
		LoginP.setBounds(60,190,400,300);
		LoginP.setBackground(new Color (153,255,51));
		FromP.add(LoginP);
		
	
		
		
		img = new ImageIcon("image\\PIC3.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0,120,548,img.getIconHeight());
		ImageP.add(imgLabel);
		
		
		
		Heading = new JLabel("USER LOGIN");
		Heading.setBounds(110,30,400,50);
		Heading.setFont(new Font ("Rubik Bubbles", Font.BOLD,28));
		Heading.setForeground(Color.BLACK);
		LoginP.add(Heading);
		
		username = new JLabel("Username :");
		username.setBounds(30,100,100,25);
		username.setFont(new Font ("Rubik Bubbles", Font.BOLD,14));
		username.setForeground(Color.BLACK);
		LoginP.add(username);
		
		usernameF = new JTextField();
		usernameF.setBounds(140,100,210,25);
		LoginP.add(usernameF);
		
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
		Loginbt.setBounds(60,200,120,25);
		Loginbt.setBackground(new Color(229,204,255));
		Loginbt.setForeground(Color.BLACK);
		Loginbt.addMouseListener(this);
		Loginbt.addActionListener(this);
		LoginP.add(Loginbt);
		
		Singupbt = new JButton("REGISTER ");
		Singupbt.setBounds(200,200,120,25);
		Singupbt.setBackground(new Color(229,204,255));
		Singupbt.setForeground(Color.BLACK);
		Singupbt.addMouseListener(this);
		Singupbt.addActionListener(this);
		LoginP.add(Singupbt);	
		
		Back = new JButton("< Back");
		Back.setBounds(200,500,110,25);
		Back.setBackground(new Color(229,204,255));
		Back.setForeground(Color.BLACK);
		Back.addMouseListener(this);
		Back.addActionListener(this);
		FromP.add(Back);
    }
	
	//Mouse Work 
	public void mouseClicked (MouseEvent me) {}
	public void mousePressed (MouseEvent me) {}
	public void mouseReleased (MouseEvent me) {}
	public void mouseEntered (MouseEvent me) 
	{
		if (me.getSource()==Loginbt)
		{
			Loginbt.setBackground(new Color(146, 224, 210));
			Loginbt.setForeground(Color.BLACK);
		}
		else if (me.getSource()==Singupbt)
		{
			Singupbt.setBackground(new Color(146, 224, 210));
			Singupbt.setForeground(Color.BLACK);
		}
		else if (me.getSource()==Back)
		{
			Back.setBackground(new Color(146, 224, 210));
			Back.setForeground(Color.BLACK);
		}
	}
	public void mouseExited (MouseEvent me) 
	{
		if (me.getSource()==Loginbt)
		{
			Loginbt.setBackground(new Color(224,224,224));
			Loginbt.setForeground(Color.BLACK);
		}
		else if (me.getSource()==Singupbt)
		{
			Singupbt.setBackground(new Color(224,224,224));
			Singupbt.setForeground(Color.BLACK);
		}
		else if (me.getSource()==Back)
		{
			Back.setBackground(new Color(224,224,224));
			Back.setForeground(Color.BLACK);
		}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource()==Singupbt)
		{
			UserRegister U1 = new UserRegister();
		    U1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==Loginbt)
		{
			
		    String username = usernameF.getText();
            String pass = PassF.getText();
            UserAccount acc = new UserAccount();
            if (acc.getUserAccount(username, pass))
		       {
                  JOptionPane.showMessageDialog(null, "Valid Account");
                  Homepage H1 = new Homepage();//username,this
                  H1.setVisible(true);
                  this.setVisible(false);
               }
			   else{
			   JOptionPane.showMessageDialog(null,"Please Enter a Valid Data");
		   }
		}
		   
		else if (ae.getSource()==Back)
		{
			Intro I1 = new Intro ();
			I1.setVisible(true);
			this.setVisible(false);
		}
		else
		{
			
			
		}
		
		
	}
	
}	