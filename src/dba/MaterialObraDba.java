/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dba;
import POJOS.AdministrativoObra;
import POJOS.JefeDeObra;
import POJOS.Material;
import POJOS.MaterialParaObra;
import POJOS.Obra;
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
public class MaterialObraDba {
    public static MaterialParaObra getMaterial(int identificador) throws SQLException{
        MaterialParaObra materialParaObra = new MaterialParaObra();
        
        String sql = "Select * from materialParaObra where ID=" + identificador;
            try {
                Connection conn = MySQL.getConnection();
                Statement sentencia = conn.createStatement();
                ResultSet rs = sentencia.executeQuery(sql);
                
                if(rs.next()){
                    materialParaObra.setCantidadMaterial(rs.getFloat("cantidadMaterial"));
                    materialParaObra.setCoste(rs.getFloat("coste"));
                    materialParaObra.setFechaSolicitud(rs.getDate("fechaSolicitud"));
                    materialParaObra.setFechaRecepcion(rs.getDate("fechaRecepcion"));
                } else {
                    return null;
                }

            } catch (SQLException ex) {
                throw ex;
            }
       
        return materialParaObra;
    }
    
    public static ArrayList<MaterialParaObra> getMateriales() throws SQLException{
        Connection conn = MySQL.getConnection();
        String sql = "select * from materialParaObra";
        
        ArrayList <MaterialParaObra> materialesObras = new ArrayList<>();
        ArrayList <Material> materiales = new ArrayList<>();
        ArrayList <Obra> obras = new ArrayList<>();
        ArrayList <JefeDeObra> jefesObras = new ArrayList<>();
        
        try {
            Statement sentencia = conn.createStatement();
            ResultSet rs = sentencia.executeQuery(sql);
            
            while(rs.next()){
                MaterialParaObra materialParaObra = new MaterialParaObra();
                materialParaObra.setCantidadMaterial(rs.getFloat("cantidadMaterial"));
                materialParaObra.setCoste(rs.getFloat("coste"));
                materialParaObra.setFechaSolicitud(rs.getDate("fechaSolicitud"));
                materialParaObra.setFechaRecepcion(rs.getDate("fechaRecepcion"));                                 
                materialesObras.add(materialParaObra);
            }
            
            return materialesObras;
            
        } catch (SQLException ex) {
            throw ex;
        }
        
    }
    
    public static boolean insertMaterial(MaterialParaObra materialParaObra) throws SQLException{
        Connection conn = MySQL.getConnection();
        String sql = "insert into materialParaObra (material, obra, cantidad, administrativo, jefeObra, coste, fechaSolicitud, fechaRecepcion values (?, ?, ?, ?, ?, ?, ?, ?)";
           
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setFloat(1, materialParaObra.getCantidadMaterial());
            ps.setFloat(2, materialParaObra.getCoste());
            ps.setDate(3, (Date) materialParaObra.getFechaSolicitud());
            ps.setDate(4, (Date) materialParaObra.getFechaRecepcion());
            
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
    
    public static boolean updateMaterial(MaterialParaObra materialParaObra) throws SQLException{
        Connection conn = MySQL.getConnection();
        
        String sql = "update materialParaObra set material=?, obra=?, cantidad=?, administrativo=?, jefeObra=?, coste=?, fechaSolicitud=?, fechaRecepcion=? where ID=?";
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        PreparedStatement ps;
        try {
            ps = conn.prepareCall(sql);
            ps.setFloat(1, materialParaObra.getCantidadMaterial());
            ps.setFloat(2, materialParaObra.getCoste());
            ps.setDate(3, (Date) materialParaObra.getFechaSolicitud());
            ps.setDate(4, (Date) materialParaObra.getFechaRecepcion());
            
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
        String sql = "delete from materialParaObra where id=" + identificador;
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
