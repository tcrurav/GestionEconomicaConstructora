/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dba;
import POJOS.Categoria;
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
public class CategoriaDba {
    
    static ResultSet rs;
    static Statement sentencia;
    static Connection conn;
    
    public static Categoria getCategoria(int identificador) throws SQLException{
        Categoria categoria = new Categoria();
        String sql = "Select * from categoria where ID=" + identificador;
            try {
                conn = MySQL.getConnection();
                sentencia = conn.createStatement();
                rs = sentencia.executeQuery(sql);
                if(rs.next()){
                    categoria.setPK_ID(rs.getInt("ID"));
                    categoria.setNombre(rs.getString("Nombre"));
                    categoria.setCoste(rs.getFloat("Coste"));
                } else{
                    return null;
                }

            } catch (SQLException ex) {
                throw ex;
            } finally {
            close();
            }
       
        return categoria;
    }
    
    public static ArrayList<Categoria> getCategorias() throws SQLException{
        conn = MySQL.getConnection();
        String sql = "select * from categoria";
        
        ArrayList<Categoria> categorias = new ArrayList<Categoria>();
        
        try {
            sentencia = conn.createStatement();
            rs = sentencia.executeQuery(sql);
            
            while(rs.next()){
                Categoria categoria = new Categoria();
                categoria.setPK_ID(rs.getInt("ID"));
                categoria.setNombre(rs.getString("Nombre"));
                categoria.setCoste(rs.getFloat("Coste"));               
                
                categorias.add(categoria);
            }
            
            return categorias;
            
        } catch (SQLException ex) {
            throw ex;
        } finally {
            close();
        }
        
    }
    
    public static boolean insertCategoria(Categoria categoria) throws SQLException{
        conn = MySQL.getConnection();
        String sql = "insert into categoria (Nombre, Coste) values (?, ?)";
           
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, categoria.getNombre());
            ps.setFloat(2, categoria.getCoste());
            int n = ps.executeUpdate();
            
            if(n>0){
                //JOptionPane.showMessageDialog(null, "Datos guardados");
                return true;
            }
            
        } catch (SQLException ex) {
            throw ex;
            
        } finally {
            close();
        }
        return false;
    }
    
    public static boolean updateCategoria(Categoria categoria) throws SQLException{
        conn = MySQL.getConnection();
        
        String sql = "update categoria set Nombre=?, Coste=?"
                +" where ID=?";
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        PreparedStatement ps;
        try {
            ps = conn.prepareCall(sql);
            ps.setString(1, categoria.getNombre());
            ps.setFloat(2, categoria.getCoste());
            ps.setInt(3, categoria.getPK_ID());
            
            int n = ps.executeUpdate();
            
            if(n>0){
                return true;
            }
            
        } catch (SQLException ex) {
            throw ex;
        } finally {
            close();
        } 
        return false;
    }
    
    public static boolean deleteCategoria(int identificador) throws SQLException{
        conn = MySQL.getConnection();
        String sql = "delete from categoria where id=" + identificador;
        try {
            sentencia = conn.createStatement();
            int n = sentencia.executeUpdate(sql);
            if (n>0){
                //JOptionPane.showMessageDialog(null, "Datos Borrados");
                return true;
            }
        } catch (SQLException ex) {
            throw ex;
        } finally {
            close();
        }
        return false;
    }
    
    // You need to close the resultSet
    private static void close() {
        try {
            if (rs != null) {
                rs.close();
            }

            if (sentencia != null) {
                sentencia.close();
            }

            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {

        }
    }
}
