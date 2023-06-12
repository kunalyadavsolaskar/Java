package in.ineuron.main;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchUpdateProgram {

    public static void main(String[] args) {
        String fileName = "D:\\input.txt"; // Path to the input file

        try {
            // Establish the database connection
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/jdbc",
                    "root",
                    "root123"
            );

            // Create the batch update statement
            String insertQuery = "INSERT INTO mytable (col1, col2, col3) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(insertQuery);

            // Read the input file and add statements to the batch
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                // Set the parameter values
                statement.setString(1, data[0]);
                statement.setString(2, data[1]);
                statement.setString(3, data[2]);

                // Add the statement to the batch
                statement.addBatch();
            }

            reader.close();

            // Execute the batch update
            int[] updateCounts = statement.executeBatch();

            // Process the update counts
            for (int updateCount : updateCounts) {
                // Check if the update was successful
                if (updateCount == PreparedStatement.EXECUTE_FAILED) {
                    System.out.println("Batch update failed for one or more statements.");
                }
            }

            // Close the statement and connection
            statement.close();
            connection.close();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }
}
