package dbconnection;

import java.sql.*;


class MakeConnection{
	Connection con;
	Statement stmt;
	ResultSet rs;
	 MakeConnection() {
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("Jdbc:mysql://localhost:3306/javaproject","root","root");
			 stmt=con.createStatement();
			 rs=stmt.executeQuery("select* from emp");
			 
			 while(rs.next()) {
				 System.out.println(rs.getString(1)+" "+rs.getInt(2));
				 
			 }
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	
}

public class TestDatabase {

	public static void main(String[] args) {
		new MakeConnection();
		
	}

}
