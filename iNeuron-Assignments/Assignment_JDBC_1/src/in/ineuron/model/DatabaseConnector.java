package in.ineuron.model;

import java.sql.*;

public class DatabaseConnector {
    private static final String URL = "jdbc:mysql://localhost:3306/jdbc";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root123";

    public ResultSet getDataFromTable(String tableName) throws SQLException {
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        Statement statement = connection.createStatement();
        String query = "SELECT * FROM " + tableName;
        return statement.executeQuery(query);
    }
}
