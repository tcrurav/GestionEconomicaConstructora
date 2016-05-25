/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dba;

import POJOS.Maquinaria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author samue
 */
public class MaquinariaDba {
    public static Maquinaria getMaquinaria(int identificador) throws SQLException{
        Maquinaria maquinaria = new Maquinaria();
        
        String sql = "Select * from maquinaria where ID=" + identificador;
            try {
                Connection conn = MySQL.getConnection();
                Statement sentencia = conn.createStatement();
                ResultSet rs = sentencia.executeQuery(sql);
                
                if(rs.next()){
                    maquinaria.setPK_ID(rs.getInt("ID"));
                    maquinaria.setNombre(rs.getString("Nombre"));
                    maquinaria.setPrecioDeCompra(rs.getFloat("PrecioDeCompra"));
                    maquinaria.setFechaFinVidaUtil(rs.getDate("FechaFinVidaUtil"));
                    maquinaria.setFechaCompra(rs.getDate("FechaCompra"));
                    maquinaria.setCodInventario(rs.getString("CodInventario"));
                } else {
                    return null;
                }

            } catch (SQLException ex) {
                throw ex;
            }
       
        return maquinaria;
    }
    
    public static ArrayList<Maquinaria> getMaquinarias() throws SQLException{
        Connection conn = MySQL.getConnection();
        String sql = "select * from maquinaria";
        
        ArrayList<Maquinaria> maquinarias = new ArrayList<Maquinaria>();
        
        try {
            Statement sentencia = conn.createStatement();
            ResultSet rs = sentencia.executeQuery(sql);
            
            while(rs.next()){
                Maquinaria maquinaria = new Maquinaria();
                
                maquinaria.setPK_ID(rs.getInt("ID"));
                maquinaria.setNombre(rs.getString("Nombre"));
                maquinaria.setPrecioDeCompra(rs.getFloat("PrecioDeCompra"));
                maquinaria.setFechaFinVidaUtil(rs.getDate("FechaFinVidaUtil"));
                maquinaria.setFechaCompra(rs.getDate("FechaCompra"));
                maquinaria.setCodInventario(rs.getString("CodInventario"));               
                
                maquinarias.add(maquinaria);
            }
            
            return maquinarias;
            
        } catch (SQLException ex) {
            throw ex;
        }
        
    }
    
    
    public static boolean insertMaquinaria(Maquinaria maquinaria) throws SQLException{
        Connection conn = MySQL.getConnection();
        String sql = "insert into maquinaria (Nombre, PrecioDeCompra, FechaFinVidaUtil, " 
                + "FechaCompra, CodInventario) values (?, ?, ?, ?, ?)";
           
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, maquinaria.getNombre());
            ps.setFloat(2, maquinaria.getPrecioDeCompra());
            ps.setString(3, sdf.format(maquinaria.getFechaFinVidaUtil()));
            ps.setString(4, sdf.format(maquinaria.getFechaCompra()));
            ps.setString(5, maquinaria.getCodInventario());

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
    
    
    public static boolean updateMaquinaria(Maquinaria maquinaria) throws SQLException{
        Connection conn = MySQL.getConnection();
        
        String sql = "update maquinaria set Nombre=?, PrecioDeCompra=?, FechaFinVidaUtil=?, " 
                + "FechaCompra=?, CodInventario=?"
                + " where ID=?";
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        PreparedStatement ps;
        try {
            ps = conn.prepareCall(sql);
            ps.setString(1, maquinaria.getNombre());
            ps.setFloat(2, maquinaria.getPrecioDeCompra());
            ps.setString(3, sdf.format(maquinaria.getFechaFinVidaUtil()));
            ps.setString(4, sdf.format(maquinaria.getFechaCompra()));
            ps.setString(5, maquinaria.getCodInventario());
            
            int n = ps.executeUpdate();
            
            if(n>0){
                return true;
            }
            
        } catch (SQLException ex) {
            throw ex;
        } 
        return false;
    }
    
    
    public static boolean deleteMaquinaria(int identificador) throws SQLException{
        Connection conn = MySQL.getConnection();
        String sql = "delete from maquinaria where id=" + identificador;
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
