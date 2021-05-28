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

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Registretion {
	
	 
	public static  void Reg()
	{
		JFrame ob=new JFrame();
		ob.setSize(700,700);
		
		ob.setTitle("Registration");
		
		ob.setResizable(false);
		ob.setVisible(true);
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
		
		//label tital
        Font f=new Font("Serif",Font.BOLD,30);
		
		JLabel name=new JLabel("INFORMATION");
		name.setBounds(250,30,700,50);
		name.setForeground(Color.black);
		name.setFont(f);
		
		p1.add(name);
		
		//name
		
		Font f1=new Font("Serif",Font.ITALIC,20);
		JLabel us=new JLabel("Name ");
		us.setBounds(150,150,700,50);
		us.setFont(f1);
		us.setForeground(Color.WHITE);
		//.setFont(f);
		p2.add(us);
		
		//name_textfeild
		
		JTextField ut=new JTextField(300);
		ut.setBounds(310,160,200,30);
		p2.add(ut);
		
		//address
		
		
		Font f2=new Font("Serif",Font.ITALIC,20);
		JLabel addr=new JLabel("Location ");
		addr.setBounds(150,200,700,50);
		addr.setFont(f2);
		addr.setForeground(Color.WHITE);
		//.setFont(f);
		p2.add(addr);
		
		//add_textfeild
		
		JTextField addt=new JTextField(300);
		addt.setBounds(310,210,200,30);
		p2.add(addt);
		
		//BIrthdate
		
		
				Font f3=new Font("Serif",Font.ITALIC,20);
				JLabel birth=new JLabel("Birthdate ");
				birth.setBounds(150,250,700,50);
				birth.setFont(f3);
				birth.setForeground(Color.WHITE);
				//.setFont(f);
				p2.add(birth);
				
				//birth_textfeild
				
				JTextField birth_t=new JTextField(300);
				birth_t.setBounds(310,260,200,30);
				p2.add(birth_t);
		

				
				//gender
				
				//Font f3=new Font("Serif",Font.ITALIC,20);
				JLabel g=new JLabel("Gender ");
				g.setBounds(150,300,700,50);
				g.setFont(f3);
				g.setForeground(Color.WHITE);
				//.setFont(f);
				p2.add(g);
				
				JRadioButton r1=new JRadioButton("Male");
				JRadioButton r2=new JRadioButton("Female");
				
				r1.setForeground(Color.WHITE);
				r2.setForeground(Color.WHITE);
				
				r1.setBounds(310, 300,80,50);
				r2.setBounds(410, 300,100,50);
				
				r1.setBackground(Color.BLACK);
				r2.setBackground(Color.BLACK);
				
				r1.setFont(r1.getFont().deriveFont(18.0f));r2.setFont(r2.getFont().deriveFont(18.0f));
				
				
				ButtonGroup bg=new ButtonGroup();
				bg.add(r1);
				bg.add(r2);
				
				p2.add(r1);
				p2.add(r2);
				
				
				
				
				
				
				
		
				//address
				
				
				Font f4=new Font("Serif",Font.ITALIC,20);
				JLabel user=new JLabel("username ");
				user.setBounds(150,390,700,50);
				user.setFont(f4);
				user.setForeground(Color.WHITE);
				//.setFont(f);
				p2.add(user);
				
				//add_textfeild
				
				JTextField user_t=new JTextField(300);
				user_t.setBounds(310,400,200,30);
				p2.add(user_t);
				
				
				//address
				
				
				Font f5=new Font("Serif",Font.ITALIC,20);
				JLabel pass=new JLabel("Password ");
				pass.setBounds(150,450,700,50);
				pass.setFont(f5);
				pass.setForeground(Color.WHITE);
				//.setFont(f);
				p2.add(pass);
				
				//add_textfeild
				
				JTextField passt=new JTextField(300);
				passt.setBounds(310,470,200,30);
				p2.add(passt);
				
				//button
				JButton b=new JButton("Submit");
				b.setBounds(280,540,150,40);
				b.setBackground(Color.green);
				b.setForeground(Color.WHITE);
				
				b.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e)
					{
						try
						{
						String n=ut.getText();
						String add=addt.getText();
						String male=r1.getText();
						String f=r2.getText();
						String b=birth_t.getText();
						String u=user_t.getText();
						String p1=passt.getText();
						
						System.out.println("name :"+n+" add :"+add+" male :"+male+" female "+f+" birth "+b+"user"+u+"pss"+p1);
						
						Class.forName("com.mysql.cj.jdbc.Driver");
						
						
						String url = "jdbc:mysql://localhost:3306/my_database";
						String username = "root";
						String password = "dnyanu6410";
						Connection con = DriverManager.getConnection(url, username, password);
						//PreparedStatement pstmt = null;
						String sql="insert into gym values(?,?,?,?,?,?,?)";
						
						
						PreparedStatement pstmt = con.prepareStatement(sql);
						BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
						
						int i=0;
						if(pstmt==null)
						{
						System.out.println("yes");
						}
						else
						{
							System.out.println("1,,,,,,,,,,,");
						}
						Statement stmt=(Statement) ((java.sql.Connection) con).createStatement();
						ResultSet rs = ((java.sql.Statement) stmt).executeQuery("select * from my_database.gym");
						while(rs.next())
						{
							i=rs.getInt(1);
						}
						System.out.println(i);
						
						pstmt.setInt(1,i+1);
			            pstmt.setString(2, n);
			        	
			            pstmt.setString(3, add);
			           
			            pstmt.setString(5,b);
			           
			            pstmt.setString(6,u);
			            
			            pstmt.setString(7,p1);
			           
			            if(pstmt==null)
						{
						    System.out.println("yes");
						}
						else
						{
							System.out.println("1,,,,,,,,,,,");
						}
			            
						if(r1.isSelected())
						{
							 pstmt.setString(4,male);
						}
						else
							{	
							pstmt.setString(4,f);
							
							System.out.println("nhi");
							}
						 
						int x=pstmt.executeUpdate();
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

	public static void main(String[] args) throws Exception  {
		//new Registretion();
		Reg();
	}

}
