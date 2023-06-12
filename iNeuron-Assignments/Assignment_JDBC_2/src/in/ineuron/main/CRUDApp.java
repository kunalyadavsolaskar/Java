package in.ineuron.main;

import java.sql.*;
import java.util.Scanner;

import in.ineuron.util.JdbcUtil;

public class CRUDApp {
    private static final String TABLE_NAME = "users";

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Enter option: ");
                System.out.println("1. Add User");
                System.out.println("2. View Users");
                System.out.println("3. Update User");
                System.out.println("4. Delete User");
                System.out.println("5. Exit");

                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        addUser();
                        break;
                    case 2:
                        viewUsers();
                        break;
                    case 3:
                        updateUser();
                        break;
                    case 4:
                        deleteUser();
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void addUser() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        Connection connection = JdbcUtil.getConnection();
        PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO " + TABLE_NAME + " (name, email) VALUES (?, ?)",
                Statement.RETURN_GENERATED_KEYS
        );

        statement.setString(1, name);
        statement.setString(2, email);

        int affectedRows = statement.executeUpdate();

        if (affectedRows > 0) {
            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                int id = generatedKeys.getInt(1);
                System.out.println("User added with ID: " + id);
            }
        }

        statement.close();
        connection.close();
    }

    private static void viewUsers() throws SQLException {
        Connection connection = JdbcUtil.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM " + TABLE_NAME);

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String email = resultSet.getString("email");

            System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
        }

        resultSet.close();
        statement.close();
        connection.close();
    }

    private static void updateUser() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter user ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter new name: ");
        String name = scanner.nextLine();

        System.out.print("Enter new email: ");
        String email = scanner.nextLine();

        Connection connection = JdbcUtil.getConnection();
        PreparedStatement statement = connection.prepareStatement(
                "UPDATE " + TABLE_NAME + " SET name = ?, email = ? WHERE id = ?"
        );

        statement.setString(1, name);
        statement.setString(2, email);
        statement.setInt(3, id);

        int affectedRows = statement.executeUpdate();

        if (affectedRows > 0) {
            System.out.println("User updated successfully.");
        } else {
            System.out.println("User not found.");
        }

        statement.close();
        connection.close();
    }

    private static void deleteUser() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter user ID: ");
        int id = scanner.nextInt();

        Connection connection = JdbcUtil.getConnection();
        PreparedStatement statement = connection.prepareStatement(
                "DELETE FROM " + TABLE_NAME + " WHERE id = ?"
        );

        statement.setInt(1, id);

        int affectedRows = statement.executeUpdate();

        if (affectedRows > 0) {
            System.out.println("User deleted successfully.");
        } else {
            System.out.println("User not found.");
        }

        statement.close();
        connection.close();
    }
}
