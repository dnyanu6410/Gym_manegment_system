

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class demo {
	public demo()
	{
		try
		{
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/my_database";
		String username = "root";
		String password = "dnyanu6410";

		Connection con = DriverManager.getConnection(url, username, password);
		Statement stmt=(Statement) con.createStatement();
		
			
			ResultSet rs=stmt.executeQuery("select * from my_database.gym");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getString(4)+" | "+rs.getString(5)+" | "+rs.getString(6)+" | "+rs.getString(7)+" | ");
				
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			



		}
		
	

public static void main(String[] args) throws Exception
{
	new demo();
}
}
