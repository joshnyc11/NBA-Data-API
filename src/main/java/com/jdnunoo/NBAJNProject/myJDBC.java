package com.jdnunoo.NBAJNProject;
import java.sql.*;

//setting up
public class myJDBC {

    public static void main(String [] args){
        try {
        Connection connection = DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/databasename","${DB_USERNAME}","${DB_PASSWORD}");


           // Statement statement = connection.createStatement();
           // ResultSet resultSet = statement.executeQuery("");

            /*while(resultSet.next()){


            } */







        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
