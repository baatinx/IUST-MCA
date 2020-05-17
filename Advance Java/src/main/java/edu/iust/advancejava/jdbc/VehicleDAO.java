package edu.iust.advancejava.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class VehicleDAO {
    private final Connection conn;

    public  VehicleDAO(Connection conn){
        this.conn = conn;
    }

    public int create(Vehicle vehicle) throws SQLException {
        String sql = "insert into vehicle(registration_number,no_of_wheels, date_of_registration) values(?, ?, ?);";
    }
}
