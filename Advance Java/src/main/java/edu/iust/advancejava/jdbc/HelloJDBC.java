package edu.iust.advancejava.jdbc;

import javax.swing.text.html.Option;
import java.sql.*;
import java.util.Optional;

public class HelloJDBC {

    public static class Hello{
        private  int id;
        private  String message;

        public Hello(int id, String message){
            this.id = id;
            this.message = message;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        @Override
        public String toString() {
            return "Hello{" +
                    "id=" + id +
                    ", message='" + message + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String connectionString = "jdbc:mysql://localhost:3306/iustdemo";
        String username = "root";
        String password = "root";
        try (Connection conn = DriverManager.getConnection(connectionString, username, password)){
            runMysqlCommands(conn);
        }
    }

    public static void runMysqlCommands(Connection conn) throws  SQLException{
        Optional<Integer> id = createMessage("Hello World", conn);
        if(id.isPresent()){
            updateMessage(id.get(), "Welcome to Advance Java JDBC Class", conn);
            Optional<Hello> hello = getHello(id.get(), conn);
            hello.ifPresent(System.out::println);
         }
    }

    public static Optional<Integer> createMessage(String message, Connection conn) throws SQLException{
        String sql = "insert into hello(message) values(?);";
        try(PreparedStatement statement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            statement.setString(1, message);
            statement.execute();
            try(ResultSet rs = statement.getGeneratedKeys()) {
                    return rs.next() ? Optional.of(rs.getInt(1)) : Optional.empty();
            }
        }
    }

    public static void updateMessage(int id, String message, Connection conn) throws SQLException{
       String sql = "update hello set message = ? where id = ?;";
        try(PreparedStatement statement = conn.prepareStatement(sql)){
            statement.setString(1, message);
            statement.setInt(2, id);
            statement.execute();
        }
    }

    public static Optional<Hello> getHello(int id, Connection conn) throws SQLException{
        String sql = "select id, message from hello where id = ?;";
        try(PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, id);
            try(ResultSet rs = statement.executeQuery()){
                return rs.next() ? Optional.of(new Hello(rs.getInt(1), rs.getString(2))) : Optional.empty();
            }
        }
    }


}
