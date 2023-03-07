package in.kunal.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class selectApp {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		Connection connection=null;
		ResultSet resultSet=null;
		//1.load the driver
			//Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded Successfully");
			//2.establish the connection
			
			String url="jdbc:mysql://localhost:3306/JDBC";
			String userName="root";
			String passWord="Yadav@300";
			connection =DriverManager.getConnection(url,userName,passWord);
			
			
			//3.create statement object and send query
			Statement stmt=connection.createStatement();
			
			//4.excute qurey
			String sqlSelectQuery="Select * from student";
			
			resultSet=stmt.executeQuery(sqlSelectQuery);
			System.out.println(resultSet);
			System.out.println("SID\tSNAME\tSAGE\tSADDRESS");
			
			//5.process the result
			while (resultSet.next()) {
				Integer sid=resultSet.getInt(1);
				String sname=resultSet.getString(2);
				Integer sage=resultSet.getInt(3);
				String saddress=resultSet.getString(4);
				System.out.println(sid+"\t"+sname+"\t"+sage+"\t"+saddress);
			}
			
			
		
			connection.close();
			resultSet.close();
			stmt.close();
		

	}

}
