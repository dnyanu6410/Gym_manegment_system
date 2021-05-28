import java.sql.*;
import com.sun.jdi.connect.spi.Connection;

public class connection {

	public static void main(String[] args) throws Exception
	{
		System.out.println("main");
		try
		{
			System.out.println("in");
		
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("fornme");
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/my_database","dnyaneshwari","dnyanu6410");
			System.out.println("connection");
			if(con!=null)
			{
				//JOptionPane.showMessageDialog(null,"Login sucessfull");
				System.out.println("not null");
			}
			else
				{
				//JOptionPane.showMessageDialog(null,"Login  unnsucessfull");
				System.out.println("null");
				}
			/*
			Statement stmt=(Statement) ((java.sql.Connection) con).createStatement();
			String s="select * from my_database.gym where name='"+ut.getCaret()+"'";
			ResultSet rs=((java.sql.Statement) stmt).executeQuery(s);
			if(rs.next())
			{
				JOptionPane.showMessageDialog(null,"Login sucessfull");
			}
			else
				JOptionPane.showMessageDialog(null,"Login  unnsucessfull");
			
			con.close();
			*/
			
					
					
			
			
		} 
		catch (ClassNotFoundException e)
		{
			System.out.println(e);
			
		}
		catch (Exception e1) 
		{
			System.out.println(e1);
		}
	}

	public static PreparedStatement prepareStatement(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

}
