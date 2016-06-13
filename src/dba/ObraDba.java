/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dba;
import POJOS.Maquiaria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * idaira isabel artiles tellado
 */
public class ObraDba {
    public static Maquiaria getObra(int identificador) throws SQLException{
        Maquiaria obra = new Maquiaria();
        
        String sql = "Select * from obra where ID=" + identificador;
            try {
                Connection conn = MySQL.getConnection();
                Statement sentencia = conn.createStatement();
                ResultSet rs = sentencia.executeQuery(sql);
                
                if(rs.next()){
                    obra.setPK_ID(rs.getInt("ID"));
                    obra.setFechaInicio(rs.getDate("FechaInicio"));
                    obra.setFechaFin(rs.getDate("FechaFin"));
                    obra.setNombre(rs.getString("Nombre"));
                    obra.setCod_Inventario(rs.getFloat("Codigo Inventario de la Maquinaria"));
                    obra.setPrecioDeCompra(rs.getFloat("PrecioDeCompra"));
                    obra.setCantidadFacturada(rs.getFloat("CantidadFacturada"));
                } else {
                    return null;
                }

            } catch (SQLException ex) {
                throw ex;
            }
       
        return obra;
    }
    
    public static ArrayList<Maquiaria> getObras() throws SQLException{
        Connection conn = MySQL.getConnection();
        String sql = "select * from obra";
        
        ArrayList<Maquiaria> obras = new ArrayList<Maquiaria>();
        
        try {
            Statement sentencia = conn.createStatement();
            ResultSet rs = sentencia.executeQuery(sql);
            
            while(rs.next()){
                Maquiaria obra = new Maquiaria();
                obra.setPK_ID(rs.getInt("ID"));
                obra.setFechaInicio(rs.getDate("FechaInicio"));
                obra.setFechaFin(rs.getDate("FechaFin"));
                obra.setNombre(rs.getString("nombre"));
                obra.setCod_Inventario(rs.getFloat("Codigo Inventario de la Maquinaria"));
                obra.setPrecioDeCompra(rs.getFloat("PrecioDeCompra"));
                obra.setCantidadFacturada(rs.getFloat("CantidadFacturada"));                
                
                obras.add(obra);
            }
            
            return obras;
            
        } catch (SQLException ex) {
            throw ex;
        }
        
    }
    
    public static boolean insertObra(Maquiaria obra) throws SQLException{
        Connection conn = MySQL.getConnection();
        String sql = "insert into obra (FechaInicio, FechaFin, Nombre, " 
                + "Cod_Inventario, PrecioDeCompra, CantidadFacturada) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
           
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, sdf.format(obra.getFechaInicio()));
            ps.setString(2, sdf.format(obra.getFechaFin()));
            ps.setString(3, obra.getNombre());
            ps.setFloat(4, obra.getCodInventario());
            ps.setFloat(5, obra.getPrecioDeCompra());
            ps.setFloat(6, obra.getCantidadFacturada());
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
    
    public static boolean updateObra(Maquiaria obra) throws SQLException{
        Connection conn = MySQL.getConnection();
        
        String sql = "update obra set FechaInicio=?, FechaFin=?, Nombre=?, " 
                + "Cod_Inventario=?,PrecioDeCompra=?, CantidadFacturada=?"
                +" where ID=?";
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        PreparedStatement ps;
        try {
            ps = conn.prepareCall(sql);
            ps.setString(1, sdf.format(obra.getFechaInicio()));
            ps.setString(2, sdf.format(obra.getFechaFin()));
            ps.setString(3, obra.getNombre());
            ps.setFloat(4, obra.getCodInventario());
            ps.setFloat(5, obra.getPrecioDeCompra());
            ps.setFloat(6, obra.getCantidadFacturada());
            ps.setInt(7, obra.getPK_ID());
            
            int n = ps.executeUpdate();
            
            if(n>0){
                return true;
            }
            
        } catch (SQLException ex) {
            throw ex;
        } 
        return false;
    }
    
    public static boolean deleteObra(int identificador) throws SQLException{
        Connection conn = MySQL.getConnection();
        String sql = "delete from obra where id=" + identificador;
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
