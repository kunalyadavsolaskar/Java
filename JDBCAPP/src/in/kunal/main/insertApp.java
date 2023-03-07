package in.kunal.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class insertApp {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		Connection connection=null;
		
		String url="jdbc:mysql://localhost:3306/JDBC";
		String userName="root";
		String passWord="Yadav@300";
		connection =DriverManager.getConnection(url,userName,passWord);
		
		
		//3.create statement object and send query
		Statement stmt=connection.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id ");
		String sid=sc.next();
		System.out.println("Enter the name ");
		String sname=sc.next();
		System.out.println("Enter the age " );
		String sage=sc.next();
		System.out.println("Enter the address ");
		String saddress=sc.next();
		//4.excute qurey
		String sqlInsertQuery="Insert into student(`sid`,`sname`,`sage`,`saddress`)values ("+sid+",'"+sname+"',"+sage+",'"+saddress+"')";
		
		int rowaff=stmt.executeUpdate(sqlInsertQuery);
		//System.out.println(resultSet);
		System.out.println("row affected "+rowaff);
		
		//5.process the result
		//
		
		

		connection.close();
		//resultSet.close();
		stmt.close();

	}

}
