package Classes;
import java.lang.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.border.Border;
import javax.swing.JOptionPane;
import Entity.*;


public class AdminHome extends JFrame implements ActionListener
{
	JPanel MainP;
	JLabel Username, Password, Number, Name , UserData ;
	JTextField UsernameF, PasswordF, NumberF;
	JButton Delete , Update, Search, Back ;
	JTable userTable;
	
	public AdminHome ()
    {
		//Create Frame
        super("Admin Home");
        super.setBounds(300,100,1200,800);// (x,y,width, height);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		MainP = new JPanel();
		MainP.setLayout(null);
		MainP.setBounds(0,0,1200,800);
		MainP.setBackground(new Color(204,153,255));
		add(MainP);
		
		String[] columnNames = {"      Username     ", "       Password      ", "       Number           "};
        DefaultTableModel model = new DefaultTableModel(null, columnNames);
        userTable = new JTable(model);
        JScrollPane tableScrollPane = new JScrollPane(userTable);
        tableScrollPane.setBounds(650,150, 400, 450);
		userTable.setBackground(new Color(102,102,255));

        MainP.add(tableScrollPane);
		
		Name = new JLabel("Admin Panel");
		Name.setBounds(30,-30,800,200);
		Name.setFont(new Font ("Forte", Font.BOLD,40));
		Name.setForeground(Color.BLACK);
		MainP.add(Name);
		
		Username = new JLabel("Username :");
		Username.setBounds(30,200,100,25);
		Username.setFont(new Font ("Rubik Bubbles", Font.BOLD,14));
		Username.setForeground(Color.BLACK);
		MainP.add(Username);
		
		UsernameF = new JTextField();
		UsernameF.setBounds(140,200,300,25);
		MainP.add(UsernameF);
		
		Password = new JLabel("Password :");
		Password.setBounds(30,250,100,25);
		Password.setFont(new Font ("Rubik Bubbles", Font.BOLD,14));
		Password.setForeground(Color.BLACK);
		MainP.add(Password);
		
		PasswordF = new JTextField();
		PasswordF.setBounds(140,250,300,25);
		MainP.add(PasswordF);
		
		Number = new JLabel("Number :");
		Number.setBounds(30,300,100,25);
		Number.setFont(new Font ("Rubik Bubbles", Font.BOLD,14));
		Number.setForeground(Color.BLACK);
		MainP.add(Number);
		
		NumberF = new JTextField();
		NumberF.setBounds(140,300,300,25);
		MainP.add(NumberF);
		
		Search = new JButton("Search");
		Search.setBounds(140,150,110,25);
		Search.setBackground(new Color(102,0,51));
		Search.setForeground(Color.WHITE);
		MainP.add(Search);
		
		
		Update = new JButton("Update");
		Update.setBounds(280,150,110,25);
		Update.setBackground(new Color(102,0,51));
		Update.setForeground(Color.WHITE);
		MainP.add(Update);
		
		Delete = new JButton("Delete");
		Delete.setBounds(400,150,110,25);
		Delete.setBackground(new Color(102,0,51));
		Delete.setForeground(Color.WHITE);
		MainP.add(Delete);
		
		Back = new JButton("Logout");
		Back.setBounds(300,420,150,30);
		Back.setBackground(new Color(102,0,51));
		Back.setForeground(Color.WHITE);
		MainP.add(Back);
		
		UserData = new JLabel("===User Data===");
		UserData.setBounds(780,100,200,25);
		UserData.setFont(new Font ("Arial Black", Font.BOLD,14));
		UserData.setForeground(Color.BLACK);
		MainP.add(UserData);
		
	    Search.addActionListener(this);
        Update.addActionListener(this);
        Delete.addActionListener(this);
		Back.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		 if (ae.getSource() == Search) {
            searchUser();
        } else if (ae.getSource() == Update) {
            updateUser();
        } else if (ae.getSource() == Delete) {
            deleteUser();
        }
		else if (ae.getSource() == Back) {
            AdminLogin a1 = new AdminLogin();
			a1.setVisible(true);
			this.setVisible(false);
        }
	}
	
	private void searchUser() 
	{
        String nameSearchTerm = UsernameF.getText().trim();
        String numberSearchTerm = NumberF.getText().trim();

        if (nameSearchTerm.isEmpty() && numberSearchTerm.isEmpty()) 
		{
            JOptionPane.showMessageDialog(this, "Enter a search term", "Search Result", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        boolean userFound = false;

        for (int i = 0; i < model.getRowCount(); i++) 
		{
            String usernameInTable = (String) model.getValueAt(i, 0);
            String passwordInTable = (String) model.getValueAt(i, 1);
            String numberInTable = (String) model.getValueAt(i, 2);
		    
            boolean nameMatch = nameSearchTerm.isEmpty() || usernameInTable.equals(nameSearchTerm);
            boolean numberMatch = numberSearchTerm.isEmpty() || numberInTable.equals(numberSearchTerm);
		    
            if (nameMatch && numberMatch) 
			{
                // Select the row in the table
                userTable.setRowSelectionInterval(i, i);
		    
                // Set the found data to the text fields
                UsernameF.setText(usernameInTable);
                PasswordF.setText(passwordInTable);
                NumberF.setText(numberInTable);
		    
                userFound = true;
                break; // Exit the loop if the user is found
            }
        }

        if (!userFound) 
	    {
            JOptionPane.showMessageDialog(this, "User not found", "Search Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }
	
	private void updateUser() 
	{
        int selectedRow = userTable.getSelectedRow();
        if (selectedRow == -1) 
		{
            // No row selected, display a message or take appropriate action
            JOptionPane.showMessageDialog(this, "Select a row to update","Messege", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        String username = UsernameF.getText().trim();
        String password = PasswordF.getText().trim();
        String number = NumberF.getText().trim();

        // Update data in the table
        model.setValueAt(username, selectedRow, 0);
        model.setValueAt(password, selectedRow, 1);
        model.setValueAt(number, selectedRow, 2);

        // Save the updated data to the file
        saveUserDataToFile();

        clearTextFields();
    }
	
	private void deleteUser() 
	{
        int selectedRow = userTable.getSelectedRow();
        if (selectedRow == -1) 
		{
            // No row selected, display a message or take appropriate action
            JOptionPane.showMessageDialog(this, "Select a row to delete","Messege", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        model.removeRow(selectedRow);

        // Save the updated data to the file
        saveUserDataToFile();

        clearTextFields();
    }
	
	
	private void saveUserDataToFile() 
	{
        try (FileWriter writer = new FileWriter("./Data/UserAccountData.txt")) 
		{
            DefaultTableModel model = (DefaultTableModel) userTable.getModel();
            for (int i = 0; i < model.getRowCount(); i++) {
                String username = (String) model.getValueAt(i, 0);
                String password = (String) model.getValueAt(i, 1);
                String number = (String) model.getValueAt(i, 2);
                writer.write(username +       "\t"        + password + "      \t"        + number +    "\n"    );
            }
        } catch (IOException e) 
		{
            JOptionPane.showMessageDialog(this, "I/O Exception","Messege", JOptionPane.INFORMATION_MESSAGE);
        }
    }
	
	private void clearTextFields() {
        UsernameF.setText("");
        PasswordF.setText("");
        NumberF.setText("");
    }
	
		
	 void loadUserData() {
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        model.setRowCount(0);

        try (Scanner scanner = new Scanner(new File("./Data/UserAccountData.txt"))) 
		{
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split("\t");
                model.addRow(data);
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "I/O Exception","Messege", JOptionPane.INFORMATION_MESSAGE);
        }
    }
	
	public static void main(String[] args) 
	{        
        AdminHome adminHome = new AdminHome();
		
        adminHome.setVisible(true);
        adminHome.loadUserData();          
    }
}