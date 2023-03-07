package in.kunal.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class deleteApp {
public static void main(String[] args) throws ClassNotFoundException,SQLException {
	// TODO Auto-generated method stub
	Connection connection=null;
	
	String url="jdbc:mysql://localhost:3306/JDBC";
	String userName="root";
	String passWord="Yadav@300";
	connection =DriverManager.getConnection(url,userName,passWord);
	
	
	//3.create statement object and send query
	Statement stmt=connection.createStatement();
	
	//4.excute qurey
	String sqlDeleteQuery="delete from student where sid=1";
	
	int rowaff=stmt.executeUpdate(sqlDeleteQuery);
	//System.out.println(resultSet);
	System.out.println("row affected "+rowaff);
	
	//5.process the result
	//
	
	

	connection.close();
	//resultSet.close();
	stmt.close();
}
}
