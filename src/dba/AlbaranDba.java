/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dba;
import POJOS.Albaran;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Tiburcio
 */
public class AlbaranDba {
    public static Albaran getAlbaran(int identificador) throws SQLException{
        Albaran albaran = new Albaran();
        
        String sql = "Select * from albaran where ID=" + identificador;
            try {
                Connection conn = MySQL.getConnection();
                Statement sentencia = conn.createStatement();
                ResultSet rs = sentencia.executeQuery(sql);
                
                if(rs.next()){
                    albaran.setNumAlbaran(rs.getString("numeroAlbaran"));
                    albaran.setFecha(rs.getDate("fecha"));                                
                } else {
                    return null;
                }

            } catch (SQLException ex) {
                throw ex;
            }
       
        return albaran;
    }
    
    public static ArrayList<Albaran> getAlbaranes() throws SQLException{
        Connection conn = MySQL.getConnection();
        String sql = "select * from albaran";
        
        ArrayList<Albaran> albaranes = new ArrayList<Albaran>();
        
        try {
            Statement sentencia = conn.createStatement();
            ResultSet rs = sentencia.executeQuery(sql);
            
            while(rs.next()){
                Albaran albaran = new Albaran();
                albaran.setNumAlbaran(rs.getString("numeroAlbaran"));
                albaran.setFecha(rs.getDate("fecha"));                                 
                albaranes.add(albaran);
            }
            
            return albaranes;
            
        } catch (SQLException ex) {
            throw ex;
        }
        
    }
    
    public static boolean insertAlbaran(Albaran albaran) throws SQLException{
        Connection conn = MySQL.getConnection();
        String sql = "insert into albaran (lineaAlbaran, proveedor, empleado, numeroAlbaran, fecha values (?, ?, ?, ?, ?)";
           
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, albaran.getNumAlbaran());
            ps.setDate(2, (Date) albaran.getFecha());
            
            int n = ps.executeUpdate();

            if(n>0){
                //JOptionPane.showMessageDialog(null, "Datos guardados");
                return true;
            }
            
        } catch (SQLException ex) {
            throw ex;
            
        }
        return false;
    }
    
    public static boolean updateAlbaran(Albaran albaran) throws SQLException{
        Connection conn = MySQL.getConnection();
        
        String sql = "update albaran set lineaAlbaran=?, proveedor=?, empleado=?, numeroAlbaran=?, fecha=? where ID=?";
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        PreparedStatement ps;
        try {
            ps = conn.prepareCall(sql);
            ps.setString(1, albaran.getNumAlbaran());
            ps.setDate(2, (Date) albaran.getFecha());
            
            int n = ps.executeUpdate();
            
            if(n>0){
                return true;
            }
            
        } catch (SQLException ex) {
            throw ex;
        } 
        return false;
    }
    
    public static boolean deleteAlbaran(int identificador) throws SQLException{
        Connection conn = MySQL.getConnection();
        String sql = "delete from albaran where id=" + identificador;
        try {
            Statement sentencia = conn.createStatement();
            int n = sentencia.executeUpdate(sql);
            if (n>0){
                //JOptionPane.showMessageDialog(null, "Datos Borrados");
                return true;
            }
        } catch (SQLException ex) {
            throw ex;
        }
        return false;
    }
    
}
