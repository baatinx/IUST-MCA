package edu.iust.advancejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

public class VehicleJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String connectionString = "jdbc:mysql://localhost:3306/iustdemo";
        String username = "root";
        String password = "root";
        try(Connection conn = DriverManager.getConnection(connectionString, username, password)){
            VehicleDAO dao = new VehicleDAO(conn);
            runMysqlCommands(dao);
        }
    }

    public static void runMysqlCommands(VehicleDAO dao) throws SQLException{
        Vehicle vehicle = new Vehicle("JK278B1209", 2, LocalDate.now());
        int id = dao.create(vehicle);
        System.out.println();

    }
}
