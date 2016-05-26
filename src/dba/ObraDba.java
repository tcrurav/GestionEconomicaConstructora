/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dba;
import POJOS.Obra;
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
public class ObraDba {
    public static Obra getObra(int identificador) throws SQLException{
        Obra obra = new Obra();
        
        String sql = "Select * from obra where ID=" + identificador;
            try {
                Connection conn = MySQL.getConnection();
                Statement sentencia = conn.createStatement();
                ResultSet rs = sentencia.executeQuery(sql);
                
                if(rs.next()){
                    obra.setPK_ID(rs.getInt("ID"));
                    obra.setFechaInicio(rs.getDate("FechaInicio"));
                    obra.setFechaFin(rs.getDate("FechaFin"));
                    obra.setDireccion(rs.getString("Direccion"));
                    obra.setPresupuestoTotalEjecucion(rs.getFloat("PresupuestoTotalEjecucion"));
                    obra.setEstimacionCosteMateriales(rs.getFloat("EstimacionCosteMateriales"));
                    obra.setEstimacionCosteManoDeObra(rs.getFloat("EstimacionCosteManoDeObra"));
                    obra.setEstimacionGastosGenerales(rs.getFloat("EstimacionGastosGenerales"));
                    obra.setEstimacionBeneficioIndustrial(rs.getFloat("EstimacionBeneficioIndustrial"));
                    obra.setPorcentajeDeObraEjecutado(rs.getFloat("PorcentajeDeObraEjecutado"));
                    obra.setCantidadCobrada(rs.getFloat("CantidadCobrada"));
                    obra.setCantidadFacturada(rs.getFloat("CantidadFacturada"));
                } else {
                    return null;
                }

            } catch (SQLException ex) {
                throw ex;
            }
       
        return obra;
    }
    
    public static ArrayList<Obra> getObras() throws SQLException{
        Connection conn = MySQL.getConnection();
        String sql = "select * from obra";
        
        ArrayList<Obra> obras = new ArrayList<Obra>();
        
        try {
            Statement sentencia = conn.createStatement();
            ResultSet rs = sentencia.executeQuery(sql);
            
            while(rs.next()){
                Obra obra = new Obra();
                obra.setPK_ID(rs.getInt("ID"));
                obra.setFechaInicio(rs.getDate("FechaInicio"));
                obra.setFechaFin(rs.getDate("FechaFin"));
                obra.setDireccion(rs.getString("Direccion"));
                obra.setPresupuestoTotalEjecucion(rs.getFloat("PresupuestoTotalEjecucion"));
                obra.setEstimacionCosteMateriales(rs.getFloat("EstimacionCosteMateriales"));
                obra.setEstimacionCosteManoDeObra(rs.getFloat("EstimacionCosteManoDeObra"));
                obra.setEstimacionGastosGenerales(rs.getFloat("EstimacionGastosGenerales"));
                obra.setEstimacionBeneficioIndustrial(rs.getFloat("EstimacionBeneficioIndustrial"));
                obra.setPorcentajeDeObraEjecutado(rs.getFloat("PorcentajeDeObraEjecutado"));
                obra.setCantidadCobrada(rs.getFloat("CantidadCobrada"));
                obra.setCantidadFacturada(rs.getFloat("CantidadFacturada"));                
                
                obras.add(obra);
            }
            
            return obras;
            
        } catch (SQLException ex) {
            throw ex;
        }
        
    }
    
    public static boolean insertObra(Obra obra) throws SQLException{
        Connection conn = MySQL.getConnection();
        String sql = "insert into obra (FechaInicio, FechaFin, Direccion, " 
                + "PresupuestoTotalEjecucion, EstimacionCosteMateriales, EstimacionCosteManoDeObra, " 
                + "EstimacionGastosGenerales, EstimacionBeneficioIndustrial, "
                + "PorcentajeDeObraEjecutado, CantidadCobrada, CantidadFacturada) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
           
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, sdf.format(obra.getFechaInicio()));
            ps.setString(2, sdf.format(obra.getFechaFin()));
            ps.setString(3, obra.getDireccion());
            ps.setFloat(4, obra.getPresupuestoTotalEjecucion());
            ps.setFloat(5, obra.getEstimacionCosteMateriales());
            ps.setFloat(6, obra.getEstimacionCosteManoDeObra());
            ps.setFloat(7, obra.getEstimacionGastosGenerales());
            ps.setFloat(8, obra.getEstimacionBeneficioIndustrial());
            ps.setFloat(9, obra.getPorcentajeDeObraEjecutado());
            ps.setFloat(10, obra.getCantidadCobrada());
            ps.setFloat(11, obra.getCantidadFacturada());
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
    
    public static boolean updateObra(Obra obra) throws SQLException{
        Connection conn = MySQL.getConnection();
        
        String sql = "update obra set FechaInicio=?, FechaFin=?, Direccion=?, " 
                + "PresupuestoTotalEjecucion=?, EstimacionCosteMateriales=?, EstimacionCosteManoDeObra=?, " 
                + "EstimacionGastosGenerales=?, EstimacionBeneficioIndustrial=?, "
                + "PorcentajeDeObraEjecutado=?, CantidadCobrada=?, CantidadFacturada=?"
                +" where ID=?";
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        PreparedStatement ps;
        try {
            ps = conn.prepareCall(sql);
            ps.setString(1, sdf.format(obra.getFechaInicio()));
            ps.setString(2, sdf.format(obra.getFechaFin()));
            ps.setString(3, obra.getDireccion());
            ps.setFloat(4, obra.getPresupuestoTotalEjecucion());
            ps.setFloat(5, obra.getEstimacionCosteMateriales());
            ps.setFloat(6, obra.getEstimacionCosteManoDeObra());
            ps.setFloat(7, obra.getEstimacionGastosGenerales());
            ps.setFloat(8, obra.getEstimacionBeneficioIndustrial());
            ps.setFloat(9, obra.getPorcentajeDeObraEjecutado());
            ps.setFloat(10, obra.getCantidadCobrada());
            ps.setFloat(11, obra.getCantidadFacturada());
            ps.setInt(12, obra.getPK_ID());
            
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
