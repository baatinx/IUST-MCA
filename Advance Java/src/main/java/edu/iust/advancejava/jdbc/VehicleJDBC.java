package edu.iust.advancejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class VehicleJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc");
        String connectionString = "jdbc:mysql://localhost:3306/iustdemo";
        String username = "root";
        String password = "root";
        try(Connection conn = DriverManager.getConnection(connectionString,, username, password)){
            VehicleDAO dao = new VehicleDAO(conn);
        }
    }
}
