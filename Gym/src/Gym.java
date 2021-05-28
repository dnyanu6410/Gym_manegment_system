import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.Statement;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;


public class Gym implements ActionListener
{
	JPanel p1,p2;
	
	public Gym() 
	{
		JFrame ob=new JFrame();
		ob.setSize(700,700);
		
		ob.setTitle("FitBox 0.2");
		
		ob.setResizable(false);
		
		
		//maincode;
		
		
		p1=new JPanel();
		p1.setLayout(null);
		//p1.setLayout(null);
		p1.setBounds(0,0,700,150);
		p1.setBackground(Color.pink);
		ob.add(p1);
		
		p2=new JPanel();
		p2.setLayout(null);
		p2.setSize(700,700);
		p2.setBackground(Color.black);
		//p2.setBounds(10, 10, 400, 400);
		ob.add(p2);
		
		Font f1=new Font("Serif",Font.ITALIC,30);
		JLabel us=new JLabel("User name ");
		us.setBounds(150,250,700,50);
		us.setFont(f1);
		us.setForeground(Color.WHITE);
		//.setFont(f);
		p2.add(us);
		
		
		Font f2=new Font("Serif",Font.ITALIC,30);
		JLabel pw=new JLabel("Password ");
		pw.setBounds(150,350,700,50);
		pw.setFont(f2);
		pw.setForeground(Color.WHITE);
		//.setFont(f);
		p2.add(pw);
		
		
		//text box
		
		JTextField ut=new JTextField(300);
		ut.setBounds(310,250,300,40);
		p2.add(ut);
		
		JPasswordField pwt=new JPasswordField(200);
		pwt.setBounds(310,350,300,40);
		p2.add(pwt);
		
		//button
		
		JButton b=new JButton("Login");
		b.setBounds(280,450,150,40);
		b.setBackground(Color.WHITE);
		
		b.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e)
			{
				
				try
				{
					
					//connection form
					
					Class.forName("com.mysql.cj.jdbc.Driver");
				
					
					String url = "jdbc:mysql://localhost:3306/my_database";
					String username = "root";
					String password = "dnyanu6410";
					//System.out.println("in:2 "+username+" "+password+"  "+url);
					
					Connection con = DriverManager.getConnection(url, username, password);
					//System.out.println("in:3");
					
					//Statment
					
					Statement stmt=(Statement) ((java.sql.Connection) con).createStatement();
					//System.out.println("in:4");
					
					//String s="dnyanuuu";
					String usera=ut.getText();
					String p=new String(pwt.getPassword());
					String str="select * from my_database.gym";
					//String str="select name from my_database.gym where username='"+s+"'";
					
					//System.out.println(str);
					
							
					//System.out.println("in:5"+ut.getText()+"  "+pwt.getText().toString());
					
				ResultSet rs = ((java.sql.Statement) stmt).executeQuery(str);
					//System.out.println(rs);
					//System.out.println("in:6");
				//System.out.println("Datatype "+p.getClass().getSimpleName());
					int flag=0;
					
					while(rs.next())
					{
					//	System.out.println("if in");
						String a=rs.getString(6);
						String b=rs.getString(7);
					//	System.out.println("Datatype "+a.getClass().getSimpleName());
						//System.out.println("Datatype "+b.getClass().getSimpleName());
						//System.out.println(usera+"|"+a);
						//int n=ut.getDocument().getLength();
						//int v=a.length();
						//System.out.println("  "+ut.getText()==rs.getString(6)+" length"+n+"|"+v);
						
						if(usera.equals(a))
						{
							System.out.println("hiiiiiiiiiiiii");
						}
						else
							System.out.println("bye");
						System.out.println(p+"|"+b);
						if(p.equals(b))
						{
							System.out.println("heloo");
						}
						else
							System.out.println("tata");
						if(usera.equals(a) && p.equals(b))
						{
							flag=1;
							System.out.println("login--------------");
							Login l=new Login();
							l.log();
							
						}
						String adm="Admin";
						if(usera.equals(adm) && p.equals(adm))
						{
							flag=1;
							System.out.println("admin--------------");
							Admin a1=new Admin();
							a1.run();
							break;
							
						}
						
					}
					if(flag==0)
					{
						JOptionPane.showMessageDialog(null,"Login  unnsucessfull");
						
					}
					con.close();
					
					
							
					
					
				} 
				catch (Exception e1) 
				{
					
					System.out.println(e1);
				} 
				//Login log=new Login();
				//Login.log();
				
				
			}
			
			
		});
			
		
			
		
		
		p2.add(b);
		
		JButton c=new JButton("Create account !");
		c.setBounds(280,550,150,40);
		c.setBackground(Color.pink);
		
        c.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e)
			{
				
				Registretion res=new Registretion();
				Registretion.Reg();
				
				
			}
			
			
		});
		p2.add(c);
		
		
		ob.add(p2);
		
		//font
		Font f=new Font("Serif",Font.BOLD,30);
		
		JLabel name=new JLabel("FITBOXX 2.0");
		name.setBounds(250,30,700,50);
		name.setForeground(Color.black);
		name.setFont(f);
		
		p1.add(name);
		
		
		
		
		
		//login
		
		
		
		ob.setVisible(true);
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		
		
		
		
		
	}

	
	public static void main(String[] args) throws Exception 
	{
		
		
		
		new Gym();
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


	
	
	
}

