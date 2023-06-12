package in.ineuron.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import in.ineuron.model.DatabaseConnector;
import in.ineuron.view.DataView;

public class Main {
    public static void main(String[] args) {
        DatabaseConnector connector = new DatabaseConnector();
        DataView view = new DataView();

        try {
            ResultSet resultSet = connector.getDataFromTable("mytable");
            view.displayData(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
