package edu.iust.advancejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Optional;

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

        Optional<Vehicle> returned = dao.getById(id);
        System.out.println(returned);

        vehicle.setRegistrationNumber("UP01A2845");
        dao.update(vehicle);
        returned = dao.getById(id);

        System.out.println("After Updation result is ");
        System.out.println(returned);

        dao.delete(vehicle);

        returned = dao.getById(id);
        if(!returned.isPresent())
            System.out.println("The vehicle record has been successfully deleted from the database ");
    }

}
