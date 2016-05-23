/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dba;

import POJOS.Obra;
import POJOS.PeriodoMaquinariaEnObra;
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
public class PeriodoMaquinariaEnObraDba {
    public static PeriodoMaquinariaEnObra getPeriodoMaquinariaEnObra(int identificador) throws SQLException{
        PeriodoMaquinariaEnObra periodoMaquinariaEnObra = new PeriodoMaquinariaEnObra();
        
        String sql = "Select * from periodomaquinariaenobra where ID=" + identificador;
            try {
                Connection conn = MySQL.getConnection();
                Statement sentencia = conn.createStatement();
                ResultSet rs = sentencia.executeQuery(sql);
                
                if(rs.next()){
                    JOptionPane.showMessageDialog(null, "aqui estamos22222");
                    periodoMaquinariaEnObra.setPK_ID(rs.getInt("ID"));
                    periodoMaquinariaEnObra.setEmpleadoAlmacen(PersonaDba.getEmpleadoAlmacen(rs.getInt("EmpleadoAlmacenQueAsignaID")));
                    periodoMaquinariaEnObra.setJefeDeObra(PersonaDba.getJefeDeObra(rs.getInt("JefeDeObraQueSolicitaID")));
                    periodoMaquinariaEnObra.setFechaInicio(rs.getDate("FechaInicio"));
                    periodoMaquinariaEnObra.setFechaFin(rs.getDate("FechaFin"));
                    periodoMaquinariaEnObra.setFechaSolicitud(rs.getDate("FechaSolicitud"));
                    periodoMaquinariaEnObra.setFechaRecepcion(rs.getDate("FechaRecepcion"));
                    periodoMaquinariaEnObra.setMaquinaria(MaquinariaDba.getMaquinaria(rs.getInt("MaquinariaID")));
                    periodoMaquinariaEnObra.setObra(ObraDba.getObra(rs.getInt("ObraID")));
                    
                } else {
                    return null;
                }

            } catch (SQLException ex) {
                throw ex;
            }
       
        return periodoMaquinariaEnObra;
    }
    
    
public static ArrayList<PeriodoMaquinariaEnObra> getPeriodoMaquinariasEnObras() throws SQLException{
        Connection conn = MySQL.getConnection();
        String sql = "Select * from periodomaquinariaenobra";
        
        ArrayList<PeriodoMaquinariaEnObra> periodoMaquinariasEnObras = new ArrayList<PeriodoMaquinariaEnObra>();
        
        try {
            Statement sentencia = conn.createStatement();
            ResultSet rs = sentencia.executeQuery(sql);
            
            while(rs.next()){
                    PeriodoMaquinariaEnObra periodoMaquinariaEnObra = new PeriodoMaquinariaEnObra();
                    
                    periodoMaquinariaEnObra.setPK_ID(rs.getInt("ID"));
                    periodoMaquinariaEnObra.setEmpleadoAlmacen(PersonaDba.getEmpleadoAlmacen(rs.getInt("EmpleadoAlmacenQueAsignaID")));
                    periodoMaquinariaEnObra.setJefeDeObra(PersonaDba.getJefeDeObra(rs.getInt("JefeDeObraQueSolicitaID")));
                    periodoMaquinariaEnObra.setFechaInicio(rs.getDate("FechaInicio"));
                    periodoMaquinariaEnObra.setFechaFin(rs.getDate("FechaFin"));
                    periodoMaquinariaEnObra.setFechaSolicitud(rs.getDate("FechaSolicitud"));
                    periodoMaquinariaEnObra.setFechaRecepcion(rs.getDate("FechaRecepcion"));
                    periodoMaquinariaEnObra.setMaquinaria(MaquinariaDba.getMaquinaria(rs.getInt("MaquinariaID")));
                    periodoMaquinariaEnObra.setObra(ObraDba.getObra(rs.getInt("ObraID")));                
                
                    periodoMaquinariasEnObras.add(periodoMaquinariaEnObra);
            }
            
            return periodoMaquinariasEnObras;
            
        } catch (SQLException ex) {
            throw ex;
        }
        
    }


    public static boolean insertPeriodoMaquinariaEnObra(PeriodoMaquinariaEnObra periodoMaquinariaEnObra) throws SQLException{
        Connection conn = MySQL.getConnection();
        String sql = "insert into periodomaquinariaenobra (EmpleadoAlmacenQueAsignaID, JefeDeObraQueSolicitaID, " 
                + "FechaInicio, FechaFin, FechaSolicitud, FechaRecepcion, MaquinariaID, ObraID)" 
                + " values (?, ?, ?, ?, ?, ?, ?, ?)";
           
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setInt(1, periodoMaquinariaEnObra.getEmpleadoAlmacen().getPK_ID());
            ps.setInt(2, periodoMaquinariaEnObra.getJefeDeObra().getPK_ID());
            ps.setString(3, sdf.format(periodoMaquinariaEnObra.getFechaInicio()));
            ps.setString(4, sdf.format(periodoMaquinariaEnObra.getFechaFin()));
            ps.setString(5, sdf.format(periodoMaquinariaEnObra.getFechaSolicitud()));
            ps.setString(6, sdf.format(periodoMaquinariaEnObra.getFechaRecepcion()));
            ps.setInt(7, periodoMaquinariaEnObra.getMaquinaria().getPK_ID());
            ps.setInt(8, periodoMaquinariaEnObra.getObra().getPK_ID());
           
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
    

    public static boolean updatePeriodoMaquinariaEnObra(PeriodoMaquinariaEnObra periodoMaquinariaEnObra) throws SQLException{
        Connection conn = MySQL.getConnection();
        
        String sql = "update periodomaquinariaenobra set EmpleadoAlmacenQueAsignaID=?, JefeDeObraQueSolicitaID=?, " 
                + "FechaInicio=?, FechaFin=?, FechaSolicitud=?, FechaRecepcion=?," 
                + "MaquinariaID=?, ObraID=?"
                +" where ID=?";
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        PreparedStatement ps;
        try {
            ps = conn.prepareCall(sql);
            
            ps.setInt(1, periodoMaquinariaEnObra.getEmpleadoAlmacen().getPK_ID());
            ps.setInt(2, periodoMaquinariaEnObra.getJefeDeObra().getPK_ID());
            ps.setString(3, sdf.format(periodoMaquinariaEnObra.getFechaInicio()));
            ps.setString(4, sdf.format(periodoMaquinariaEnObra.getFechaFin()));
            ps.setString(5, sdf.format(periodoMaquinariaEnObra.getFechaSolicitud()));
            ps.setString(6, sdf.format(periodoMaquinariaEnObra.getFechaRecepcion()));
            ps.setInt(7, periodoMaquinariaEnObra.getMaquinaria().getPK_ID());
            ps.setInt(8, periodoMaquinariaEnObra.getObra().getPK_ID());
            ps.setInt(9, periodoMaquinariaEnObra.getPK_ID());
            
            int n = ps.executeUpdate();
            
            if(n>0){
                return true;
            }
            
        } catch (SQLException ex) {
            throw ex;
        } 
        return false;
    }
    
 
    public static boolean deletePeriodoMaquinariaEnObra(int identificador) throws SQLException{
        Connection conn = MySQL.getConnection();
        String sql = "delete from periodomaquinariaenobra where id=" + identificador;
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
