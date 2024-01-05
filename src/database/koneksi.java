/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Muhammad Adif Fikri || 1910631170101
 */
public class koneksi {
        private static Connection mysqlconfig;
    
    public static Connection configDB() throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/contohjdbc";
            String user="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url,user,pass);
            System.out.println("terkoneksi");
        } catch (Exception e) {
            System.err.println("koneksi gagal" + e.getMessage());
        }
        return mysqlconfig;
    }
}
