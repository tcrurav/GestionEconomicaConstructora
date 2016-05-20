/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dba;
import POJOS.Material;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Tiburcio
 */
public class MaterialDba {
    public static Material getMaterial(int identificador) throws SQLException{
        Material material = new Material();
        
        String sql = "Select * from material where ID=" + identificador;
            try {
                Connection conn = MySQL.getConnection();
                Statement sentencia = conn.createStatement();
                ResultSet rs = sentencia.executeQuery(sql);
                
                if(rs.next()){
                    material.setPK_ID(rs.getInt("ID"));
                    material.setCodigo(rs.getString("Codigo"));
                    material.setDescripcion(rs.getString("Descripcion"));
                    material.setStockMedio(rs.getInt("StockMedio"));
                    material.setStockMinimo(rs.getInt("StockMinimo"));
                    material.setPrecio(rs.getFloat("Precio"));
                    material.setStock(rs.getInt("Stock"));
                } else {
                    return null;
                }

            } catch (SQLException ex) {
                throw ex;
            }
       
        return material;
    }
    
    public static ArrayList<Material> getMateriales() throws SQLException{
        Connection conn = MySQL.getConnection();
        String sql = "select * from material";
        
        ArrayList<Material> materiales = new ArrayList<Material>();
        
        try {
            Statement sentencia = conn.createStatement();
            ResultSet rs = sentencia.executeQuery(sql);
            
            while(rs.next()){
                Material material = new Material();
                
                material.setPK_ID(rs.getInt("ID"));
                material.setCodigo(rs.getString("Codigo"));
                material.setDescripcion(rs.getString("Descripcion"));
                material.setStockMedio(rs.getInt("StockMedio"));
                material.setStockMinimo(rs.getInt("StockMinimo"));
                material.setPrecio(rs.getFloat("Precio"));
                material.setStock(rs.getInt("Stock"));
                
                materiales.add(material);
            }
            
            return materiales;
            
        } catch (SQLException ex) {
            throw ex;
        }
        
    }
    
    public static boolean insertMaterial(Material material) throws SQLException{
        Connection conn = MySQL.getConnection();

        String sql = "insert into material (Codigo, Descripcion, StockMedio, " 
                + "StockMinimo, Precio, Stock) values (?, ?, ?, ?, ?, ?)";        
        
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            
            ps.setString(1,material.getCodigo());
            ps.setString(2,material.getDescripcion());
            ps.setInt(3,material.getStockMedio());
            ps.setInt(4,material.getStockMinimo());
            ps.setFloat(5,material.getPrecio());
            ps.setInt(6,material.getStock());

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
    
    public static boolean updateMaterial(Material material) throws SQLException{
        Connection conn = MySQL.getConnection();
        
        String sql = "update material set Codigo=?, Descripcion=?, StockMedio=?, " 
                + "StockMinimo=?, Precio=?, Stock=? " 
                +" where ID=?";        
               
        PreparedStatement ps;
        try {
            ps = conn.prepareCall(sql);
            
            ps.setString(1,material.getCodigo());
            ps.setString(2,material.getDescripcion());
            ps.setInt(3,material.getStockMedio());
            ps.setInt(4,material.getStockMinimo());
            ps.setFloat(5,material.getPrecio());
            ps.setInt(6,material.getStock());
            
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
