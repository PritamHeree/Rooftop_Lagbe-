package Classes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Homepage extends JFrame implements MouseListener, ActionListener {
	// Object create
	JPanel MainP, Heading1, Panel1, Panel2, Panel3, BP1, BP2, BP3;
	JLabel name, HI;
	ImageIcon img1, img2, img3, img4;
	JLabel imgLabel1, imgLabel2, imgLabel3, imgLabel4;
	JButton Bt1, Bt2, Bt3, Logout;
	UserLogin L1;

	public Homepage() {
		super("Home Page");
		super.setBounds(300, 90, 1200, 800);// (x,y,width, height);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.L1 = L1;

		// Background Panel

		MainP = new JPanel();
		MainP.setLayout(null);
		MainP.setBounds(0, 0, 1200, 800);
		MainP.setBackground(new Color(204, 229, 201));
		add(MainP);

		img4 = new ImageIcon("image\\PICX.png");
		imgLabel4 = new JLabel(img4);
		imgLabel4.setBounds(20, 140, 548, img4.getIconHeight());
		MainP.add(imgLabel4);

		// Heading Part

		Heading1 = new JPanel();
		Heading1.setLayout(null);
		Heading1.setBounds(0, 0, 1200, 50);
		Heading1.setBackground(new Color(0, 153, 0));
		MainP.add(Heading1);

		name = new JLabel("LISTS");
		name.setBounds(500, 13, 150, 25);
		name.setFont(new Font("Rubik Bubbles", Font.BOLD, 20));
		name.setForeground(Color.WHITE);
		Heading1.add(name);

		// Panel 3 Part

		BP3 = new JPanel();
		BP3.setLayout(null);
		BP3.setBounds(640, 0, 600, 800);
		BP3.setBackground(Color.WHITE);
		MainP.add(BP3);

		img3 = new ImageIcon("image\\PICX2.png");
		imgLabel3 = new JLabel(img3);
		imgLabel3.setBounds(50, 100, 600, img3.getIconHeight());
		BP3.add(imgLabel3);

		Bt3 = new JButton("For Rooftop");
		Bt3.setBounds(100, 350, 300, 25);
		Bt3.setBackground(new Color(0, 153, 0));
		Bt3.setForeground(Color.WHITE);
		Bt3.addMouseListener(this);
		Bt3.addActionListener(this);
		BP3.add(Bt3);

		Logout = new JButton("Logout");
		Logout.setBounds(190, 400, 100, 25);
		Logout.setBackground(new Color(0, 153, 0));
		Logout.setForeground(Color.WHITE);
		Logout.addMouseListener(this);
		Logout.addActionListener(this);
		BP3.add(Logout);
	}

	public void mouseClicked(MouseEvent me) {
	}

	public void mousePressed(MouseEvent me) {
	}

	public void mouseReleased(MouseEvent me) {
	}

	public void mouseEntered(MouseEvent me) {
		if (me.getSource() == Bt3)

		{
			Bt3.setBackground(new Color(0, 204, 0));
			Bt3.setForeground(Color.WHITE);
		}
	}

	public void mouseExited(MouseEvent me) {

		if (me.getSource() == Bt3) {
			Bt3.setBackground(new Color(0, 153, 0));
			Bt3.setForeground(Color.WHITE);
		}
	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == Bt3) {
			Rooftop R1 = new Rooftop();
			R1.setVisible(true);
			this.setVisible(false);
		}

		if (ae.getSource() == Logout) {
			UserLogin U1 = new UserLogin();
			U1.setVisible(true);
			this.setVisible(false);
		}
	}
}