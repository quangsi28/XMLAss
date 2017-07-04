package main.Object;

import java.sql.*;

public class DBConnect {
	public void testConnection(){
		try {	
			String url = "";
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection(url);
			//Connection conn = DriverManager.getConnection("jdbc:odbc:xmlass");
			Statement st = conn.createStatement();
			
			
			st.executeUpdate("insert into BenA value ('1','dfdgdfg','dfdgdfg','dfdgdfg','dfdgdfg','dfdgdfg','dfdgdfg','dfdgdfg','dfdgdfg','dfdgdfg','dfdgdfg','dfdgdfg','dfdgdfg','dfdgdfg','dfdgdfg'"
					+ ",'dfdgdfg','dfdgdfg','dfdgdfg','dfdgdfg','dfdgdfg','dfdgdfg','dfdgdfg','dfdgdfg','dfdgdfg','dfdgdfg')");
			conn.commit();
			
			ResultSet rs = st.executeQuery("select * from BenA");
			
			while(rs.next()){
				System.out.println(rs.getString(1)+ "   "+ rs.getString(2));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("A");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("B");
			e.printStackTrace();
		}
	}
}
