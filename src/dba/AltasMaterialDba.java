/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dba;

import POJOS.EmpleadoAlmacen;
import com.sun.media.sound.EmergencySoundbank;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Marcos
 */
public class AltasMaterialDba {
    public static EmpleadoAlmacen getMateriales(int identificador) throws SQLException{
        EmpleadoAlmacen almacen = new EmpleadoAlmacen();
        
        String sql = "Select * from material where ID=" + identificador;
            try {
                Connection conn = MySQL.getConnection();
                Statement sentencia = conn.createStatement();
                ResultSet rs = sentencia.executeQuery(sql);
                
                if(rs.next()){
                    almacen.setPK_ID(rs.getInt("ID"));
                    almacen.setCodigo(rs.getInt("Codigo"));
                    almacen.setDescripcion(rs.getString("Descripcion"));
                    almacen.setStockMedio(rs.getInt("StockMedio"));
                    almacen.setStockMinimo(rs.getInt("StockMinimo"));
                    almacen.setPrecio(rs.getFloat("Precio"));
                    almacen.setStock(rs.getInt("Stock"));
                } else {
                    return null;
                }

            } catch (SQLException ex) {
                throw ex;
            }
       
        return almacen;
    }
    
    public static ArrayList<EmpleadoAlmacen> getMateriales() throws SQLException{
        Connection conn = MySQL.getConnection();
        String sql = "select * from material";
        
        ArrayList<EmpleadoAlmacen> materiales = new ArrayList<EmpleadoAlmacen>();
        
        try {
            Statement sentencia = conn.createStatement();
            ResultSet rs = sentencia.executeQuery(sql);
            
            while(rs.next()){
                EmpleadoAlmacen alta = new EmpleadoAlmacen();
                alta.setPK_ID(rs.getInt("ID"));
                alta.setCodigo(rs.getInt("Codigo"));
                alta.setDescripcion(rs.getString("Descripcion"));
                alta.setStockMedio(rs.getInt("StockMedio"));
                alta.setStockMinimo(rs.getInt("StockMinimo"));
                alta.setPrecio(rs.getFloat("Precio"));
                alta.setStock(rs.getInt("Stock"));               
                
                materiales.add(alta);
            }
            
            return materiales;
            
        } catch (SQLException ex) {
            throw ex;
        }
        
    }
    
    public static boolean insertMateriales(EmpleadoAlmacen material) throws SQLException{
        Connection conn = MySQL.getConnection();
        String sql = "insert into material (Codigo, Descripcion, StockMedio, " 
                + "StockMinimo, Precio, Stock) values (?, ?, ?, ?, ?, ?)";
           
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setInt(1, material.getCodigo());
            ps.setString(2, material.getDescripcion());
            ps.setInt(3, material.getStockMedio());
            ps.setInt(4, material.getStockMinimo());
            ps.setFloat(5, material.getPrecio());
            ps.setInt(6, material.getStock());
            
            int n = ps.executeUpdate();
            
            if(n>0){
                
                return true;
            }
            
        } catch (SQLException ex) {
            throw ex;
            
        }
        return false;
    }
    
    public static boolean updateMateriales(EmpleadoAlmacen material) throws SQLException{
        Connection conn = MySQL.getConnection();
        
        String sql = "update material set Codigo=?, Descripcion=?, StockMedio=?, " 
                + "StockMinimo=?, Precio=?, Stock=?"
                +" where ID=?";

        PreparedStatement ps;
        try {
            ps = conn.prepareCall(sql);
            ps.setInt(1, material.getCodigo());
            ps.setString(2, material.getDescripcion());
            ps.setInt(3, material.getStockMedio());
            ps.setInt(4, material.getStockMinimo());
            ps.setFloat(5, material.getPrecio());
            ps.setInt(6, material.getStock());
            ps.setInt(7, material.getPK_ID());
            
            int n = ps.executeUpdate();
            
            if(n>0){
                return true;
            }
            
        } catch (SQLException ex) {
            throw ex;
        } 
        return false;
    }
    
    public static boolean deleteMaterial(int identificador) throws SQLException{
        Connection conn = MySQL.getConnection();
        String sql = "delete from material where id=" + identificador;
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
