package project;

import java.sql.SQLException;

public class phase1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		String dburl = "jdbc:msql://localhost:3306/aamazon";
		String username = "root";
		String password = "root";
		String query = "Select * from amazon";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(dburl,username,password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			System.out.print("Brand:" + rs.getString("brand") +"\t");
			System.out.print("Mobile_Name:" + rs.getString("mobile_name") + "\t");
			System.out.print("Price:" + rs.getString("price") + "\t");	
			System.out.println();		
		}
	}
}

