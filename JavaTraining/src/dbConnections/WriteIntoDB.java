package dbConnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class WriteIntoDB {

	static Connection conn;
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		String host = "jdbc:mysql://localhost:3306/company";
		String uName = "root";
		String uPass = "admin";
		
		try {
			//1. connect to DB (Open DB)
			conn=DriverManager.getConnection(host,uName,uPass);
			//2. Execute sql
			PreparedStatement prestat = conn.prepareStatement("insert into synechron values('Manohar','Indore',100000)");
			prestat.executeUpdate();
			}
			catch(Throwable t)
			{
				
			}finally
			{
				//3. closeDB
				conn.close();
				System.out.println("Done");
			}
			
		}
}
