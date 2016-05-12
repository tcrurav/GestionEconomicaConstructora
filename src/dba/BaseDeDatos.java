/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiburcio
 */
public class BaseDeDatos {
    private static Connection conn = null;
    private static final String baseDeDatosUtilizada = "MySQL";
    //Descomenta la siguiente línea para usar SQLite
    //private static final String baseDeDatosUtilizada = "SQLite"; 
    
    
    public static Connection getConnection(){

        switch(baseDeDatosUtilizada){
            case "MySQL": return MySQL.getConnection();
            case "SQLite": return SQLite.getConnection();
        }
        return null;
    }
}
