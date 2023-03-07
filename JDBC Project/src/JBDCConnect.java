import java.sql.*;

import javax.swing.plaf.synth.SynthTextPaneUI;
public class JBDCConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=null;
		ResultSet resultSet=null;
		try {
			//1.load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded Successfully");
			//2.establish the connection
			
			String url="jdbc:mysql://localhost:3306/JDBC";
			String userName="root";
			String passWord="Yadav@300";
			connection =DriverManager.getConnection(url,userName,passWord);
			System.out.println("implement class name "+ connection.getClass().getName());
			
			//3.create statement object and send query
			String sqlSelectQuery="Select * from student";
			Statement stmt=connection.createStatement();
			resultSet=stmt.executeQuery(sqlSelectQuery);
			System.out.println(resultSet);
			System.out.println("SID\tSNAME\tSAGE\tSADDRESS");
			
			//4.process the result
			while (resultSet.next()) {
				Integer sid=resultSet.getInt(1);
				String sname=resultSet.getString(2);
				Integer sage=resultSet.getInt(3);
				String saddress=resultSet.getString(4);
				System.out.println(sid+"\t"+sname+"\t"+sage+"\t"+saddress);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			if (connection!=null) {
				try {
					connection.close();
				}catch (SQLException ce) {
					ce.printStackTrace();
				}
				
			}
		}
	}

}
