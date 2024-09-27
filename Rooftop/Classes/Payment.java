package Classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Entity.*;

public class Payment extends JFrame  implements MouseListener,ActionListener
{
	JPanel MainP, From;
	ImageIcon img1,img2;
	JLabel imgLabel1 ,imgLabel2, number, name;
	JTextField NumF, dateF, nameF;
	JButton Done , Cancel,Exit;
	
	public Payment()
	{
		super("Online Payment System ");
        super.setBounds(550,200,1000,600);// (x,y,width, height);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		MainP = new JPanel();
		MainP.setLayout(null);
		MainP.setBounds(0,0,1000,600);
		MainP.setBackground(new Color(255,255,255));
		add(MainP);
		
		From = new JPanel();
		From.setLayout(null);
		From.setBounds(20,150,350,250);
		From.setBackground(new Color(255,255,255));
		MainP.add(From);
		
		img1 = new ImageIcon("image\\rpay.png");
		imgLabel1 = new JLabel(img1);
		imgLabel1.setBounds(250,20,80,160);
		From.add(imgLabel1);
		
		img2 = new ImageIcon("image\\PIC13.png");
		imgLabel2 = new JLabel(img2);
		imgLabel2.setBounds(300,70,700,img2.getIconHeight());
		MainP.add(imgLabel2);
		
		number = new JLabel("Card Number :");
		number.setBounds(20,7,400,50);
		number.setFont(new Font ("Rubik Bubbles", Font.BOLD,10));
		number.setForeground(Color.BLACK);
		From.add(number);
		
		NumF = new JTextField();
		NumF.setBounds(20,42,200,20);
		From.add(NumF);
		
		number = new JLabel("Exprition Date :");
		number.setBounds(20,62,400,50);
		number.setFont(new Font ("Rubik Bubbles", Font.BOLD,10));
		number.setForeground(Color.BLACK);
		From.add(number);
		
		dateF = new JTextField("DD/MM/YY");
		dateF.setBounds(20,102,200,20);
		From.add(dateF);
		
		name = new JLabel("Holder Name :");
		name.setBounds(20,122,400,50);
		name.setFont(new Font ("Rubik Bubbles", Font.BOLD,10));
		name.setForeground(Color.BLACK);
		From.add(name);
		
		nameF = new JTextField();
		nameF.setBounds(20,162,200,20);
		From.add(nameF);
		
		Done = new JButton("Done");
		Done.setBounds(10,199,120,30);
		Done.setBackground(new Color(255,178,102));
		Done.setForeground(Color.BLACK);
		Done.addMouseListener(this);
		Done.addActionListener(this);
		From.add(Done);
		
		Cancel = new JButton("Cancel");
		Cancel.setBounds(152,199,120,30);
		Cancel.setBackground(new Color(255,178,102));
		Cancel.setForeground(Color.BLACK);
		Cancel.addMouseListener(this);
		Cancel.addActionListener(this);
		From.add(Cancel);
		
		Exit = new JButton("Exit");
		Exit.setBounds(400,500,120,30);
		Exit.setBackground(new Color(255,178,102));
		Exit.setForeground(Color.BLACK);
		Exit.addMouseListener(this);
		Exit.addActionListener(this);
		MainP.add(Exit);
		
	}
	
	//Mouse Work
	
	public void mouseClicked (MouseEvent me) {}
	public void mousePressed (MouseEvent me) {}
	public void mouseReleased (MouseEvent me) {}
	public void mouseEntered (MouseEvent me) 
	{
		if (me.getSource()==Done)
		{
			Done.setBackground(new Color(248,148,30));
			Done.setForeground(Color.BLACK);
		}
		if (me.getSource()==Cancel)
		{
			Cancel.setBackground(new Color(248,148,30));
			Cancel.setForeground(Color.BLACK);
		}
		if (me.getSource()==Exit)
		{
			Exit.setBackground(new Color(248,148,30));
			Exit.setForeground(Color.BLACK);
		}
	}
	public void mouseExited (MouseEvent me)
	{
		if (me.getSource()==Done)
		{
			Done.setBackground(new Color(255,178,102));
			Done.setForeground(Color.BLACK);
		}
		if (me.getSource()==Cancel)
		{
			Cancel.setBackground(new Color(255,178,102));
			Cancel.setForeground(Color.BLACK);
		}
		if (me.getSource()==Exit)
		{
			Exit.setBackground(new Color(255,178,102));
			Exit.setForeground(Color.BLACK);
		}
	}
	public void actionPerformed(ActionEvent ae) 
	{
		if (ae.getSource()==Done)
		{
			JOptionPane.showMessageDialog(null,"SucessFully parchesed");
			Rooftop R1 = new Rooftop();
			R1.setVisible(true);
			this.setVisible(false);
		}
		if (ae.getSource()==Cancel)
		{
			Rooftop R1 = new Rooftop();
			R1.setVisible(true);
			this.setVisible(false);
		}
		
		if (ae.getSource()==Exit)
		{
			System.exit(0);
		}
	}
}