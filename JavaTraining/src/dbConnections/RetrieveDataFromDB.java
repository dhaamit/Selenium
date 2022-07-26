package dbConnections;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveDataFromDB {
	static Connection conn;
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//String host = "jdbc:mysql://localhost:3306/company";

		String host = "jdbc:mysql://localhost:3306/records";
		String uName = "root";
		String uPass = "admin";
		String sQuery = "select * from players";
		
		try {
			//1. connect to DB (Open DB)
			conn=DriverManager.getConnection(host,uName,uPass);
			//2. Execute sql
			Statement stat = conn.createStatement();
//			ResultSet rs=stat.executeQuery("select * from synechron");
			ResultSet rs=stat.executeQuery(sQuery);

			while(rs.next()) {
//				System.out.println("Name:"+rs.getString("name")+"==="+"Location:"+rs.getString("location")+"Salary:"+rs.getString("salary"));
				System.out.println("Name:"+rs.getString("Name"));

			}
			}
			catch(Throwable t)
			{
				
			}finally
			{
				conn.close();
			}
			
		}
	}

