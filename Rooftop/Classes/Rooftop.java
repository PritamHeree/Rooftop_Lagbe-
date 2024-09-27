package Classes;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Rooftop extends JFrame implements MouseListener,ActionListener
{
	JPanel MainP,Heading1;
	JLabel name;
	JPanel mp1,mp2,mp3,mp4,mp5,mp6,mp7,mp8;
	JPanel Panel1,Panel2,Panel3,Panel4,Panel5,Panel6,Panel7,Panel8;
	JButton B1,B2,B3,B4,B5,B6,B7,B8, Back;
	ImageIcon img1,img2,img3,img4,img5,img6,img7,img8;
	JLabel imgLabel1,imgLabel2, imgLabel3, imgLabel4,imgLabel5,imgLabel6,imgLabel7,imgLabel8;

	public Rooftop ()
	{
		super("Rooftop");
        super.setBounds(300,90,1200,800);// (x,y,width, height);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		MainP = new JPanel();
		MainP.setLayout(null);
		MainP.setBounds(0,0,1200,800);
		MainP.setBackground(new Color(0,153,0));
		add(MainP);
		
		//Heading Part 
		
		Heading1 = new JPanel();
		Heading1.setLayout(null);
		Heading1.setBounds(0,0,1200,50);
		Heading1.setBackground(new Color(255,255,255));
		MainP.add(Heading1);
		

		
		name = new JLabel(" LISTS ");
		name.setBounds(505,13,150,25);
		name.setFont(new Font ("Rubik Bubbles", Font.BOLD,20));
		name.setForeground(Color.BLACK);
		Heading1.add(name);
		
		//Rooftop 1 
		
		mp1 = new JPanel();
		mp1.setLayout(null);
		mp1.setBounds(142,120,210,250);
		mp1.setBackground(Color.WHITE);
		MainP.add(mp1);
		
		Panel1 = new JPanel();
		Panel1.setLayout(null);
		Panel1.setSize(200,200);
		Panel1.setBounds(5,5,200,200);
		Panel1.setBackground(new Color(200,200,200));
		mp1.add(Panel1);
		
		img1 = new ImageIcon("image\\PICRR1.png");
		imgLabel1 = new JLabel(img1);
		imgLabel1.setBounds(0,0,200,200);
		Panel1.add(imgLabel1);
		
		B1 = new JButton("  AIUB  ");
		B1.setBounds(30,215,150,25);
		B1.setBackground(new Color(0,153,0));
		B1.setForeground(Color.WHITE);
		B1.addMouseListener(this);
		B1.addActionListener(this);
		mp1.add(B1);
		
		//Rooftop 2
		
		mp2 = new JPanel();
		mp2.setLayout(null);
		mp2.setBounds(494,120,210,250);
		mp2.setBackground(Color.WHITE);
		MainP.add(mp2);
		
		Panel2 = new JPanel();
		Panel2.setLayout(null);
		Panel2.setBounds(5,5,200,200);
		Panel2.setBackground(new Color(200,200,200));
		mp2.add(Panel2);
		
		img2 = new ImageIcon("image\\PICRR2.png");  
		imgLabel2 = new JLabel(img2);
		imgLabel2.setBounds(0,0,200,200);
		Panel2.add(imgLabel2);
		
		B2 = new JButton("UTTARA");
		B2.setBounds(30,215,150,25);
		B2.setBackground(new Color(0,153,0));
		B2.setForeground(Color.WHITE);
		B2.addMouseListener(this);
		B2.addActionListener(this);
		mp2.add(B2);
		
		//Rooftop 3
		
		mp3 = new JPanel();
		mp3.setLayout(null);
		mp3.setBounds(846,120,210,250);
		mp3.setBackground(Color.WHITE);
		MainP.add(mp3);
		
		Panel3 = new JPanel();
		Panel3.setLayout(null);
		Panel3.setBounds(5,5,200,200);
		Panel3.setBackground(new Color(200,200,200));
		mp3.add(Panel3);
		
		img3 = new ImageIcon("image\\PICRR3.png");
		imgLabel3 = new JLabel(img3);
		imgLabel3.setBounds(0,0,200,200);
		Panel3.add(imgLabel3);
		
		B3 = new JButton("BASHUNDHARA");
		B3.setBounds(30,215,150,25);
		B3.setBackground(new Color(0,153,0));
		B3.setForeground(Color.WHITE);
		B3.addMouseListener(this);
		B3.addActionListener(this);
		mp3.add(B3);
		
		//Rooftop 4
		
		mp4 = new JPanel();
		mp4.setLayout(null);
		mp4.setBounds(142,420,210,250);
		mp4.setBackground(Color.WHITE);
		MainP.add(mp4);
		
		Panel4 = new JPanel();
		Panel4.setLayout(null);
		Panel4.setBounds(5,5,200,200);
		Panel4.setBackground(new Color(200,200,200));
		mp4.add(Panel4);
		
		img4 = new ImageIcon("image\\PICRR4.png");
		imgLabel4 = new JLabel(img4);
		imgLabel4.setBounds(0,0,200,200);
		Panel4.add(imgLabel4);
		
		B4 = new JButton("BANANNI");
		B4.setBounds(30,215,150,25);
		B4.setBackground(new Color(0,153,0));
		B4.setForeground(Color.WHITE);
		B4.addMouseListener(this);
		B4.addActionListener(this);
		mp4.add(B4);
		
		//Rooftop 5
		
		mp5 = new JPanel();
		mp5.setLayout(null);
		mp5.setBounds(494,420,210,250);
		mp5.setBackground(Color.WHITE);
		MainP.add(mp5);
		
		Panel5 = new JPanel();
		Panel5.setLayout(null);
		Panel5.setBounds(5,5,200,200);
		Panel5.setBackground(new Color(200,200,200));
		mp5.add(Panel5);
		
		img5 = new ImageIcon("image\\PICRR5.png");
		imgLabel5 = new JLabel(img5);
		imgLabel5.setBounds(0,0,200,200);
		Panel5.add(imgLabel5);
		
		B5 = new JButton("MIRPUR");
		B5.setBounds(30,215,150,25);
		B5.setBackground(new Color(0,153,0));
		B5.setForeground(Color.WHITE);
		B5.addMouseListener(this);
		B5.addActionListener(this);
		mp5.add(B5);
		
		//Rooftop 6
		
		mp6 = new JPanel();
		mp6.setLayout(null);
		mp6.setBounds(846,420,210,250);
		mp6.setBackground(Color.WHITE);
		MainP.add(mp6);
		
		Panel6 = new JPanel();
		Panel6.setLayout(null);
		Panel6.setBounds(5,5,200,200);
		Panel6.setBackground(new Color(200,200,200));
		mp6.add(Panel6);
		
		img6 = new ImageIcon("image\\PICRR6.png");
		imgLabel6 = new JLabel(img6);
		imgLabel6.setBounds(0,0,200,200);
		Panel6.add(imgLabel6);
		
		B6 = new JButton("Gulshan - 1");
		B6.setBounds(30,215,150,25);
		B6.setBackground(new Color(0,153,0));
		B6.setForeground(Color.WHITE);
		B6.addMouseListener(this);
		B6.addActionListener(this);
		mp6.add(B6);
		
		Back = new JButton("< Back");
		Back.setBounds(520,700,150,25); 
		Back.setBackground(Color.WHITE); 
		Back.setForeground(Color.BLACK);
		Back.addMouseListener(this);
		Back.addActionListener(this);
		MainP.add(Back);
		
	}	
	//MouseListener Work
	public void mouseClicked (MouseEvent me) {}
	public void mousePressed (MouseEvent me) {}
	public void mouseReleased (MouseEvent me) {}
	public void mouseEntered (MouseEvent me)  
	{
		if(me.getSource()==B1)
		{
			B1.setBackground(new Color(0,204,0));
			B1.setForeground(Color.WHITE);
		}
		else if(me.getSource()==B2)
		{
			B2.setBackground(new Color(0,204,0));
			B2.setForeground(Color.WHITE);
		}
		else if(me.getSource()==B3)
		{
			B3.setBackground(new Color(0,204,0));
			B3.setForeground(Color.WHITE);
		}
		else if(me.getSource()==B4)
		{
			B4.setBackground(new Color(0,204,0));
			B4.setForeground(Color.WHITE);
		}
		else if(me.getSource()==B5)
		{
			B5.setBackground(new Color(0,204,0));
			B5.setForeground(Color.WHITE);
		}
		else if(me.getSource()==B6)
		{
			B6.setBackground(new Color(0,204,0));
			B6.setForeground(Color.WHITE);
		}
	}
	public void mouseExited (MouseEvent me) 
	{
		if(me.getSource()==B1)
		{
			B1.setBackground(new Color(0,153,0));
			B1.setForeground(Color.WHITE);
		}
		else if(me.getSource()==B2)
		{
			B2.setBackground(new Color(0,153,0));
			B2.setForeground(Color.WHITE);
		}
		else if(me.getSource()==B3)
		{
			B3.setBackground(new Color(0,153,0));
			B3.setForeground(Color.WHITE);
		}
		else if(me.getSource()==B4)
		{
			B4.setBackground(new Color(0,153,0));
			B4.setForeground(Color.WHITE);
		}
		else if(me.getSource()==B5)
		{
			B5.setBackground(new Color(0,153,0));
			B5.setForeground(Color.WHITE);
		}
		else if(me.getSource()==B6)
		{
			B6.setBackground(new Color(0,153,0));
			B6.setForeground(Color.WHITE);
		}
		
	}
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource()==B1)
		{
			Payment D1 = new Payment();
			D1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==B2)
		{
			Payment D2 = new Payment();
			D2.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==B3)
		{
			Payment D3 = new Payment();
			D3.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==B4)
		{
			Payment D4 = new Payment();
			D4.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==B5)
		{
			Payment D5 = new Payment();
			D5.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==B6)
		{
			Payment D6 = new Payment();
			D6.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==Back)
		{
			Homepage H6 = new Homepage();
			H6.setVisible(true);
			this.setVisible(false);
		}
	}	
}