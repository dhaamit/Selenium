package com.functions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Records {

	static Connection conn;
	
	//just for testing class locally
//	public static void main(String args[]) throws Throwable {
//		Records reco = new Records();
//		System.out.println(reco.getRecordCount());
//		List <Object> myPlayer = new ArrayList<Object>();
//		myPlayer.add(reco.getRecordListFromDB(7));
//		myPlayer.add(reco.getRecordListFromDB(3));
//		myPlayer.add(reco.getRecordListFromDB(4));
//		System.out.println(myPlayer);
//		int maxVal = reco.getMaxValue("Matches");
//		System.out.println("Max Matches : "+maxVal);
//		maxVal = reco.getMaxValue("Runs");
//		System.out.println("Max Runs : "+maxVal);
//	}

	public int getRecordCount() throws Throwable {
		String host = "jdbc:mysql://localhost:3306/records";
		String uName = "root";
		String uPass = "admin";
		String sqlQuery = "select count(*) as count from players";
		int recCount = 0;
		try {
			// 1. connect to DB (Open DB)
			conn = DriverManager.getConnection(host, uName, uPass);

			// 2. Execute sql
			Statement stat = conn.createStatement();

			// ResultSet
			ResultSet rs = stat.executeQuery(sqlQuery);

			/* USE THIS LOOP TO TEST INSIDE FUNCTION */
			 while (rs.next()) {
				 //System.out.println(rs.getInt("count"));
				 recCount = rs.getInt("count");
				}
			 conn.close();
			return recCount;
			

		} catch (Throwable t) {

		} finally {
			conn.close();
		}
		return recCount;
	}
	// Function getRecordCount() ends.
	
	public int getMaxValue(String ColName) throws Throwable {
		String host = "jdbc:mysql://localhost:3306/records";
		String uName = "root";
		String uPass = "admin";
		String sqlQuery = "select Max("+ ColName +") as MAX from players";
		int recCount = 0;
		try {
			// 1. connect to DB (Open DB)
			conn = DriverManager.getConnection(host, uName, uPass);

			// 2. Execute sql
			Statement stat = conn.createStatement();

			// ResultSet
			ResultSet rs = stat.executeQuery(sqlQuery);

			/* USE THIS LOOP TO TEST INSIDE FUNCTION */
			 while (rs.next()) {
				 //System.out.println(rs.getInt("count"));
				 recCount = rs.getInt("MAX");
				}
			 conn.close();
			return recCount;
			

		} catch (Throwable t) {

		} finally {
			conn.close();
		}
		return recCount;
	}
	
	public  List<Object> getRecordListFromDB(int idx) throws Throwable {
		String host = "jdbc:mysql://localhost:3306/records";
		String uName = "root";
		String uPass = "admin";
		String sqlQuery = "select * from players where PlayerId = "+idx;
		List<Object> cricRecord= new ArrayList<Object> ();
		try {
			// 1. connect to DB (Open DB)
			conn = DriverManager.getConnection(host, uName, uPass);

			// 2. Execute sql
			Statement stat = conn.createStatement();

			// ResultSet
			ResultSet rs = stat.executeQuery(sqlQuery);

			/* USE THIS LOOP TO TEST INSIDE FUNCTION */
			 while (rs.next()) {
				 //System.out.println(rs.getInt("PlayerId"));
				 cricRecord.add(rs.getInt("PlayerId"));
				 //System.out.println(rs.getString("Name"));
				 cricRecord.add(rs.getString("Name"));
				 //System.out.println(rs.getInt("Matches"));
				 cricRecord.add(rs.getInt("Matches"));
				 //System.out.println(rs.getInt("Innings"));
				 cricRecord.add(rs.getInt("HighestScore"));
				 //System.out.println(rs.getInt("Runs"));
				 cricRecord.add(rs.getInt("Runs"));
				 //System.out.println(rs.getInt("Hundred"));
				 cricRecord.add(rs.getInt("Hundreds"));
				 //System.out.println(rs.getInt("Fifty"));
				 cricRecord.add(rs.getInt("Fifties"));
				 //System.out.println(rs.getInt("Catches"));
				 cricRecord.add(rs.getInt("Catches"));
				 //System.out.println(rs.getInt("Wickets"));
				 cricRecord.add(rs.getInt("Wickets"));
				 //System.out.println(rs.getInt("FiveWickets"));
				 cricRecord.add(rs.getInt("FiveWickets"));
				}
			 conn.close();
			return cricRecord;
			

		} catch (Throwable t) {

		} finally {
			conn.close();
		}
		return cricRecord;
	}
	// Function getResultSetFromDB ends.
}
