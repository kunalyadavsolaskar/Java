package in.ineuron.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.ineuron.util.JdbcUtil;

/**
 * @author nitin
 * @Company iNeuron
 * @see www.ineuron.ai
 *
 */
public class InsertApp {

	public static void main(String[] args) throws Exception {
		Connection connection = null;
		PreparedStatement pstmt = null;

		try {
			connection = JdbcUtil.getJdbcConnection();
			
			String sqlInsertQuery = "insert into student(`sid`,`sname`,`sage`,`saddress`)values(?,?,?,?)";
			if (connection != null)
				pstmt = connection.prepareStatement(sqlInsertQuery);

			if (pstmt != null) {

				// use precompiled query to set the values
				pstmt.setString(2, "lalitha");
				pstmt.setInt(3, 26);
				pstmt.setString(4, "USA");
				pstmt.setInt(1, 4);

				System.out.println(sqlInsertQuery);
				
				// execute the query
				int rowCount = pstmt.executeUpdate();
				System.out.println("No of rows updated is :: " + rowCount);
			}

		} catch (IOException ie) {
			ie.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				JdbcUtil.cleanUp(connection, pstmt, null);
				System.out.println("Closing the resource...");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
}
