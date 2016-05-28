/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dba;

import POJOS.Obra;
import POJOS.PeriodoEmpleadoEnObra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author mandelrot
 */
public class HorasEnObraDba {
    
    public static PeriodoEmpleadoEnObra getPeriodoEmpleadoEnObra(int identificador) throws SQLException{
        PeriodoEmpleadoEnObra periodoEmpleadoEnObra = new PeriodoEmpleadoEnObra();
        
        String sql = "Select * from periodoEmpleadoEnObra where ID=" + identificador;
            try {
                Connection conn = MySQL.getConnection();
                Statement sentencia = conn.createStatement();
                ResultSet rs = sentencia.executeQuery(sql);
                
                if(rs.next()){
                    periodoEmpleadoEnObra.setPK_ID(rs.getInt("ID"));
                    periodoEmpleadoEnObra.setJefeDeObra_ID(rs.getInt("JefeDeObraQueSolicitaID"));
                    periodoEmpleadoEnObra.setAdministrativoManoObra_ID(rs.getInt("AdministrativoManoDeObraQueAsignaID"));
                    periodoEmpleadoEnObra.setFechaInicio(rs.getDate("FechaInicio"));
                    periodoEmpleadoEnObra.setFechaFin(rs.getDate("FechaFin"));
                    periodoEmpleadoEnObra.setCoste(rs.getFloat("Coste"));
                    periodoEmpleadoEnObra.setFechaSolicitud(rs.getDate("FechaSolicitud"));
                    periodoEmpleadoEnObra.setFechaRecepcion(rs.getDate("FechaRecepcion"));
                    periodoEmpleadoEnObra.setObra_ID(rs.getInt("ObraID"));
                    periodoEmpleadoEnObra.setEmpleadoObra_ID(rs.getInt("EmpleadoDeObraID"));
                    
                } else {
                    return null;
                }
                
            } catch (SQLException ex) {
                throw ex;
            }
       
        return periodoEmpleadoEnObra;
    }
    
    public static ArrayList<PeriodoEmpleadoEnObra> getPeriodosEmpleadoEnObras() throws SQLException{
        Connection conn = MySQL.getConnection();
        String sql = "select * from periodoEmpleadoEnObra";
        
        ArrayList<PeriodoEmpleadoEnObra> periodosEmpleadoEnObra = new ArrayList<PeriodoEmpleadoEnObra>();
        
        try {
            Statement sentencia = conn.createStatement();
            ResultSet rs = sentencia.executeQuery(sql);
            
            while(rs.next()){
                PeriodoEmpleadoEnObra periodoEmpleadoEnObra = new PeriodoEmpleadoEnObra();
                
                periodoEmpleadoEnObra.setPK_ID(rs.getInt("ID"));
                periodoEmpleadoEnObra.setJefeDeObra_ID(rs.getInt("JefeDeObraQueSolicitaID"));
                periodoEmpleadoEnObra.setAdministrativoManoObra_ID(rs.getInt("AdministrativoManoDeObraQueAsignaID"));
                periodoEmpleadoEnObra.setFechaInicio(rs.getDate("FechaInicio"));
                periodoEmpleadoEnObra.setFechaFin(rs.getDate("FechaFin"));
                periodoEmpleadoEnObra.setCoste(rs.getFloat("Coste"));
                periodoEmpleadoEnObra.setFechaSolicitud(rs.getDate("FechaSolicitud"));
                periodoEmpleadoEnObra.setFechaRecepcion(rs.getDate("FechaRecepcion"));
                periodoEmpleadoEnObra.setObra_ID(rs.getInt("ObraID"));
                periodoEmpleadoEnObra.setEmpleadoObra_ID(rs.getInt("EmpleadoDeObraID"));
                
                periodosEmpleadoEnObra.add(periodoEmpleadoEnObra);
            }
            return periodosEmpleadoEnObra;
        } catch (SQLException ex) {
            throw ex;
        }
    }
    
    public static boolean insertPeriodoEmpleadoEnObra(PeriodoEmpleadoEnObra periodoEmpleadoEnObra) throws SQLException{
        Connection conn = MySQL.getConnection();
        String sql = "insert into periodoEmpleadoEnObra (JefeDeObraQueSolicitaID, AdministrativoManoDeObraQueAsignaID, FechaInicio, FechaFin, Coste, FechaSolicitud, FechaRecepcion, ObraID, EmpleadoDeObraID) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
           
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            PreparedStatement ps = conn.prepareStatement(sql); // Era conn.prepareCall
            ps.setInt(1, periodoEmpleadoEnObra.getJefeDeObra_ID());
            ps.setInt(2, periodoEmpleadoEnObra.getAdministrativoManoObra_ID());
            ps.setString(3, sdf.format(periodoEmpleadoEnObra.getFechaInicio()));
            ps.setString(4, sdf.format(periodoEmpleadoEnObra.getFechaFin()));
            ps.setFloat(5, periodoEmpleadoEnObra.getCoste());
            ps.setString(6, sdf.format(periodoEmpleadoEnObra.getFechaSolicitud()));
            ps.setString(7, sdf.format(periodoEmpleadoEnObra.getFechaRecepcion()));
            ps.setInt(8, periodoEmpleadoEnObra.getObra_ID());
            ps.setInt(9, periodoEmpleadoEnObra.getEmpleadoObra_ID());
            
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
    
    public static boolean updatePeriodoEmpleadoEnObra(PeriodoEmpleadoEnObra periodoEmpleadoEnObra) throws SQLException{
        Connection conn = MySQL.getConnection();
        
        String sql = "update periodoEmpleadoEnObra set JefeDeObraQueSolicitaID=?, AdministrativoManoDeObraQueAsignaID=?, FechaInicio=?, FechaFin=?, Coste=?, FechaSolicitud=?, FechaRecepcion=?, ObraID=?, EmpleadoDeObraID=?"
                +" where ID=?";
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);  // era conn.prepareCall
            ps.setInt(1, periodoEmpleadoEnObra.getJefeDeObra_ID());
            ps.setInt(2, periodoEmpleadoEnObra.getAdministrativoManoObra_ID());
            ps.setString(3, sdf.format(periodoEmpleadoEnObra.getFechaInicio()));
            ps.setString(4, sdf.format(periodoEmpleadoEnObra.getFechaFin()));
            ps.setFloat(5, periodoEmpleadoEnObra.getCoste());
            ps.setString(6, sdf.format(periodoEmpleadoEnObra.getFechaSolicitud()));
            ps.setString(7, sdf.format(periodoEmpleadoEnObra.getFechaRecepcion()));
            ps.setInt(8, periodoEmpleadoEnObra.getObra_ID());
            ps.setInt(9, periodoEmpleadoEnObra.getEmpleadoObra_ID());
            ps.setInt(10, periodoEmpleadoEnObra.getPK_ID());
            
            int n = ps.executeUpdate();
            
            if(n>0){
                return true;
            }
        } catch (SQLException ex) {
            throw ex;
        } 
        return false;
    }
    
    
    public static boolean deletePeriodoEmpleadoEnObra(int identificador) throws SQLException{
        Connection conn = MySQL.getConnection();
        String sql = "delete from periodoEmpleadoEnObra where id=" + identificador;
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
