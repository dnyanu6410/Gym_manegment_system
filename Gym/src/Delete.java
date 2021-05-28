import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Delete {

	
	public static void delete(int n)
	{
		JFrame ob=new JFrame();
		ob.setSize(700,700);
		
		ob.setTitle("FitBox 0.2");
		
		ob.setResizable(false);
		
		
		//maincode;
		JPanel p1,p2;
		
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
		
		
		
		if(n==0)
		{
		
			Font f=new Font("Serif",Font.BOLD,30);
			
			JLabel name=new JLabel("Delete");
			name.setBounds(250,30,700,50);
			name.setForeground(Color.black);
			name.setFont(f);
			
			p1.add(name);
			
			Font f1=new Font("Serif",Font.ITALIC,30);
			JLabel us=new JLabel("Name ");
			us.setBounds(150,250,700,50);
			us.setFont(f1);
			us.setForeground(Color.WHITE);
			//.setFont(f);
			p2.add(us);
			
			JTextField ut=new JTextField("Enter there name");
			ut.setBounds(310,250,300,40);
			p2.add(ut);
			
			
			JButton b=new JButton("Delete");
			b.setBounds(280,550,150,40);
			b.setBackground(Color.WHITE);
			
			 b.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e)
					{
						try
						{
							String url = "jdbc:mysql://localhost:3306/my_database";
							String username = "root";
							String password = "dnyanu6410";
							Connection con = DriverManager.getConnection(url, username, password);
							
							
							String n1=ut.getText();
							String sql="delete from gym where name='"+n1+"'";
							
							Statement stmt=(Statement) ((java.sql.Connection) con).createStatement();
							//ResultSet rs = ((java.sql.Statement) stmt).executeQuery(sql);
							stmt.executeUpdate(sql);
							
							//PreparedStatement pstmt = con.prepareStatement(sql);
							//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
							// pstmt.setString(2, n1);
							 //int x=pstmt.executeUpdate();
							 //System.out.println(x);
							
						}
						catch(Exception e1)
						{
							System.out.println(e1);
						}
						
						
					}
					
					
				});
				p2.add(b);
			
		}
		if(n==1)
		{
			Font f=new Font("Serif",Font.BOLD,30);
			
			JLabel name=new JLabel("UPDATE");
			name.setBounds(250,30,700,50);
			name.setForeground(Color.black);
			name.setFont(f);
			
			p1.add(name);
			
			String[] c= {"name","address","gender","birth","username","password"};
			
			JComboBox co1=new JComboBox(c);
			co1.setBounds(250,250,100,50);
			//co1.setFont(f1);
			co1.setForeground(Color.WHITE);
			co1.setBackground(Color.pink);
			//.setFont(f);
			p2.add(co1);
			
			JTextField ut=new JTextField("Enter there nane");
			ut.setBounds(280,350,300,40);
			
			p2.add(ut);
			
			JTextField ut1=new JTextField("Enter new data");
			ut1.setBounds(280,450,300,40);
			p2.add(ut1);
			
			
			JButton b=new JButton("update");
			b.setBounds(280,610,150,40);
			b.setBackground(Color.WHITE);
			 b.addActionListener(new ActionListener() 
			 {
					
					public void actionPerformed(ActionEvent e)
					{
						try
						{
							String url = "jdbc:mysql://localhost:3306/my_database";
							String username = "root";
							String password = "dnyanu6410";
							Connection con = DriverManager.getConnection(url, username, password);
							
							
							String n1=ut.getText();
							String n4=ut1.getText();
							
							String n2=(String) co1.getSelectedItem();
							System.out.println(" "+n1+" "+n4+" "+n2);
							//String sql="update gym set'"+n2.toString()+"'='"+n4.toString()+"'where name='"+n1.toString()+"'";
							//System.out.println(" "+n1+" "+n4+" "+n2);
							
							//Statement stmt=(Statement) ((java.sql.Connection) con).createStatement();
							//System.out.println(" "+n1+" "+n4+" "+n2);
							
							//ResultSet rs = ((java.sql.Statement) stmt).executeQuery(sql);
							//stmt.executeUpdate(sql);
							//System.out.println(" "+n1+" "+n4+" "+n2);
							
							//-----------------------------------------------------
							String sql = null;
							
							if(n2.equals(c[0]))
							{
							 sql="update gym set name=? where name =?";
							}
							else if(n2.equals(c[1]))
							{
								sql="update gym set address=? where name =?";
								
							}
							else if(n2.equals(c[2]))
							{
								sql="update gym set gender=? where name =?";
								
							}
							else if(n2.equals(c[3]))
							{
								sql="update gym set birth=? where name =?";
								
							}
							else if(n2.equals(c[4]))
							{
								sql="update gym set username=? where name =?";
								
							}
							else if(n2.equals(c[5]))
							{
								sql="update gym set password=? where name =?";
								
							}
							PreparedStatement pstmt = con.prepareStatement(sql);
					
							BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
					

							pstmt.setString(1, n4);
							
							pstmt.setString(2, n1);
							
							//pstmt.setString(3, n1);
							
							int x=pstmt.executeUpdate();
							System.out.println(" done");
							System.out.println(x);
							
						}
						catch(Exception e1)
						{
							System.out.println(e1);
						}
						
						
					}
			 });
				p2.add(b);
					
			
			
		}
			ob.setVisible(true);
			ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		
		
	}
	public static void main(String[] args) throws Exception {
		delete(1);
	}

}
