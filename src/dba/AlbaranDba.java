/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dba;
import POJOS.Obra;
import POJOS.Albaran;
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
public class AlbaranDba {
    public static Albaran getAlbaran(int identificador) throws SQLException{
        Albaran albaran = new Albaran();
        
        String sql = "Select * from obra where ID=" + identificador;
            try {
                Connection conn = MySQL.getConnection();
                Statement sentencia = conn.createStatement();
                ResultSet rs = sentencia.executeQuery(sql);
                
                if(rs.next()){
                    albaran.setPK_ID(rs.getInt("ID"));
                    albaran.setFecha(rs.getDate("Fecha"));
                    albaran.setNumAlbaran(rs.getString("numAlbaran"));
                    
                } else {
                    return null;
                }

            } catch (SQLException ex) {
                throw ex;
            }
       
        return albaran;
    }
    
    public static ArrayList<Albaran> getAlbaran() throws SQLException{
        Connection conn = MySQL.getConnection();
        String sql = "select * from albaran";
        
        ArrayList<Albaran> albaran = new ArrayList<Albaran>();
        
        try {
            Statement sentencia = conn.createStatement();
            ResultSet rs = sentencia.executeQuery(sql);
            
            while(rs.next()){
                Albaran alba;
                alba = new Albaran();
                alba.setPK_ID(rs.getInt("ID"));
                alba.setFecha(rs.getDate("Fecha"));
                alba.setNumAlbaran(rs.getString("numAlbaran"));
              
               albaran.add(alba);
               
            }
            
            return albaran;
            
        } catch (SQLException ex) {
            throw ex;
        }
        
    }
    
    public static boolean insertAlbaran(Albaran albaran) throws SQLException{
        Connection conn = MySQL.getConnection();
        String sql = "insert into obra (FechaInicio, FechaFin, Direccion, " 
                + "PresupuestoTotalEjecucion, EstimacionCosteMateriales, EstimacionCosteManoDeObra, " 
                + "EstimacionGastosGenerales, EstimacionBeneficioIndustrial, "
                + "PorcentajeDeObraEjecutado, CantidadCobrada, CantidadFacturada) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
           
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, sdf.format(albaran.getFecha()));
            ps.setString(2, sdf.format(albaran.getNumAlbaran()));
            int n = 0;
           
            
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
        
        String sql = "update obra set Fecha=?, numAlbaran=?, Direccion=?, ";
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        PreparedStatement ps;
        try {
            ps = conn.prepareCall(sql);
            ps.setString(1, sdf.format(albaran.getFecha()));
            ps.setString(2, sdf.format(albaran.getNumAlbaran()));
       
            
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
