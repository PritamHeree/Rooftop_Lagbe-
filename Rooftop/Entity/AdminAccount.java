package Entity;
import java.lang.*;
import java.util.*;
import java.io.*;
import Entity.*;

public class AdminAccount
{
	private String username;
	private String pass;
	private String phone;
	
	private File file;
	private FileWriter fwriter;
	private Scanner sc;
	
	public AdminAccount()
	{
		this.username="";
	}
	
	public AdminAccount(String username,String pass, String phone)
	{
		this.username=username;
		this.pass=pass;
		this.phone=phone;
	}
	
	public void setusername(String username)
	{
		this.username=username;
	}
	
	public void setpass(String pass)
	{
		this.pass=pass;
	}
	public void setphone(String phone)
	{
		this.phone=phone;
	}
	
	
	public String getusername()
	{
		return username;
	}
	
	public String getpass()
	{
		return pass;
	}
	public String getphone()
	{
		return phone;
	}
	
	
	public void addAdminAccount()
	{
		try{
		file=new File("./Data/AdminAccountData.txt");
		file.createNewFile();
		fwriter=new FileWriter(file,true);
		fwriter.write(getusername()+"\t");
		fwriter.write(getpass()+"\t");
		fwriter.write(getphone()+"\n");
		fwriter.flush();
		fwriter.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public boolean getAdminAccount(String username,String pass)
	{
		boolean flag=false;
		file=new File("./Data/AdminAccountData.txt");
		
		try
		{
		  sc=new Scanner(file);
		  
		  while(sc.hasNextLine())
		  {
			  String line=sc.nextLine();
			  String[] value=line.split("\t");
			  if(value[0].equals(username)&&value[1].equals(pass))
			  {
				  flag=true;
			  }
		  }
		
		
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		
		return flag;	
	}
}