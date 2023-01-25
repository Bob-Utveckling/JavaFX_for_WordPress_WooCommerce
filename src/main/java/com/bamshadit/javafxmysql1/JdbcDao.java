package com.bamshadit.javafxmysql1;

import java.io.IOException;
import java.sql.*;

public class JdbcDao {

    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/test?useSSL=false";
    public static final String DATABASE_USERNAME = "bob2";
    public static final String DATABASE_PASSWORD = "bob2";
    public static final String INSERT_QUERY = "INSERT INTO user (name, email) VALUES (?, ?)";

    public void insertRecord(String name, String email) throws SQLException {
        //Step 1: establishing a connection and
        //try-with-resource statement will auto close the connection.
        try (Connection connection = DriverManager
                .getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
            //Step 2: Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);

            System.out.println("BL PreparedStatement: " + preparedStatement);
            //Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            //print SQL exception information
            printSQLException(e);
        }
    }

    public void getAllCustomers() {
        try (Connection connection = DriverManager
                .getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
            //Step 2: Create a statement using connection object

            //error: String query = "SELECT * FROM users";

            //create the java statement
            Statement st = connection.createStatement()) {
            //execute the query, and get a java resultset
            ResultSet rs = st.executeQuery("SELECT * FROM user");
            while (rs.next())
            {
                String name = rs.getString("name");
                String email = rs.getString("email");
                System.out.println("name: " + name + ", email: " + email);
            }
        } catch (SQLException e) {
            //print SQL exception information
            printSQLException(e);
        }
    }

    public static void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
