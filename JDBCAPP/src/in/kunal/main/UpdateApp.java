package in.kunal.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateApp {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {

		Connection connection=null;
		
		String url="jdbc:mysql://localhost:3306/JDBC";
		String userName="root";
		String passWord="Yadav@300";
		connection =DriverManager.getConnection(url,userName,passWord);
		
		

		Statement stmt=connection.createStatement();
		

		String sqlUpdateQuery="update student set saddress='MI' where sid=2";
		
		int rowaff=stmt.executeUpdate(sqlUpdateQuery);
	
		System.out.println("row affected "+rowaff);
		

	

		connection.close();
	
		stmt.close();


	}

}
