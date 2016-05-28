/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dba;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiburcio
 */
public class MySQL {
    private static Connection conn = null;
    private static final String db = "constructora";
    private static final String user = "root";
    private static final String password = "1234";
    private static String url = "jdbc:mysql://localhost/" + db;
    
    public static Connection getConnection(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,password);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Eror:"+e.getMessage());
        }
        return conn;
    }
}
