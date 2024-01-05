/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;
import database.koneksi;
import java.sql.SQLException;
import view.viewMahasiswa;

/**
 *
 * @author Muhammad Adif Fikri || 1910631170101
 */
public class JDBC {
    public static void main(String[] args) {
        //        koneksi.configDB();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewMahasiswa().setVisible(true);
            }
        });
    }
    
}
