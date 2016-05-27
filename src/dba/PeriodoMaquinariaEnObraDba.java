/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dba;

import POJOS.EmpleadoAlmacen;
import POJOS.Maquinaria;
import POJOS.PeriodoMaquinariaEnObra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Albbe
 */
public class PeriodoMaquinariaEnObraDba {

    public static PeriodoMaquinariaEnObra getPeriodoMaquinariaEnObra(int identificador) throws SQLException {
        PeriodoMaquinariaEnObra periodomaquinariaenobra = new PeriodoMaquinariaEnObra();

        String sql = "Select * from periodomaquinariaenobra where ID=" + identificador;

        try {
            Connection conn = MySQL.getConnection();
            Statement sentencia = conn.createStatement();
            ResultSet rs = sentencia.executeQuery(sql);
            if (rs.next()) {
                periodomaquinariaenobra.setPK_ID(rs.getInt("ID"));
                periodomaquinariaenobra.setEmpleadoAlmacen(dba.PersonaDba.getEmpleadoAlmacen(rs.getInt("EmpleadoAlmacenQueAsignaID")));
                periodomaquinariaenobra.setJefeDeObra(dba.PersonaDba.getJefeDeObra(rs.getInt("JefeDeObraQueSolicitaID")));
                periodomaquinariaenobra.setFechaInicio(rs.getDate("FechaInicio"));
                periodomaquinariaenobra.setFechaFin(rs.getDate("FechaFin"));
                periodomaquinariaenobra.setFechaSolicitud(rs.getDate("FechaSolicitud"));
                periodomaquinariaenobra.setFechaRecepcion(rs.getDate("FechaRecepcion"));
                periodomaquinariaenobra.setMaquinaria(dba.MaquinariaDba.getMaquinaria(rs.getInt("MaquinariaID")));
                periodomaquinariaenobra.setObra(dba.ObraDba.getObra(rs.getInt("ObraID")));
                periodomaquinariaenobra.setAdministrativoObra(dba.PersonaDba.getAdministrativoObra(rs.getInt("AdministrativoObraQueVerificaID")));

            } else {
                return null;
            }

        } catch (SQLException ex) {
            throw ex;
        }

        return periodomaquinariaenobra;

    }

    public static ArrayList<PeriodoMaquinariaEnObra> getPeriodoMaquinariasEnObra() throws SQLException {
        Connection conn = MySQL.getConnection();
        String sql = "Select * from periodomaquinariaenobra";
        ArrayList<PeriodoMaquinariaEnObra> periodomaquinariasenobra = new ArrayList<PeriodoMaquinariaEnObra>();
        try {
            Statement sentencia = conn.createStatement();
            ResultSet rs = sentencia.executeQuery(sql);

            while (rs.next()) {
                PeriodoMaquinariaEnObra periodomaquinariaenobra = new PeriodoMaquinariaEnObra();

                periodomaquinariaenobra.setPK_ID(rs.getInt("ID"));
                periodomaquinariaenobra.setEmpleadoAlmacen(PersonaDba.getEmpleadoAlmacen(rs.getInt("EmpleadoAlmacenQueAsignaID")));
                periodomaquinariaenobra.setJefeDeObra(PersonaDba.getJefeDeObra(rs.getInt("JefeDeObraQueSolicitaID")));
                periodomaquinariaenobra.setFechaInicio(rs.getDate("FechaInicio"));
                periodomaquinariaenobra.setFechaFin(rs.getDate("FechaFin"));
                periodomaquinariaenobra.setFechaSolicitud(rs.getDate("FechaSolicitud"));
                periodomaquinariaenobra.setFechaRecepcion(rs.getDate("FechaRecepcion"));
                periodomaquinariaenobra.setMaquinaria(MaquinariaDba.getMaquinaria(rs.getInt("MaquinariaID")));
                periodomaquinariaenobra.setObra(ObraDba.getObra(rs.getInt("ObraID")));
                periodomaquinariaenobra.setAdministrativoObra(PersonaDba.getAdministrativoObra(rs.getInt("AdministrativoObraQueVerificaID")));

                periodomaquinariasenobra.add(periodomaquinariaenobra);

            }
            return periodomaquinariasenobra;

        } catch (SQLException ex) {
            throw ex;
        }

    }

    public static boolean insertPeriodoMaquinaraEnObra(PeriodoMaquinariaEnObra periodomaquinariaenobra) throws SQLException {
        Connection conn = MySQL.getConnection();
        String sql = "insert into periodomaquinariaenobra(EmpleadoAlmacenQueAsignaID, JefeDeObraQueSolicitaID, FechaInicio, FechaFin, FechaSolicitud, FechaRecepcion, MaquinariaID, ObraID, AdministrativoObraQueVerificaID)"
                + "values(?, ?, ?, ? , ? , ?, ?, ?, ?)";

        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {

            PreparedStatement ps = conn.prepareCall(sql);

            ps.setInt(1, periodomaquinariaenobra.getEmpleadoAlmacen().getPK_ID());
            ps.setInt(2, periodomaquinariaenobra.getJefeDeObra().getPK_ID());
            ps.setString(3, sdf.format(periodomaquinariaenobra.getFechaInicio()));
            ps.setString(4, sdf.format(periodomaquinariaenobra.getFechaFin()));
            ps.setString(5, sdf.format(periodomaquinariaenobra.getFechaSolicitud()));
            ps.setString(6, sdf.format(periodomaquinariaenobra.getFechaRecepcion()));
            ps.setInt(7, periodomaquinariaenobra.getMaquinaria().getPK_ID());
            ps.setInt(8, periodomaquinariaenobra.getObra().getPK_ID());
            ps.setInt(9, periodomaquinariaenobra.getAdministrativoObra().getPK_ID());
            int n = ps.executeUpdate();
            if (n > 0) {
                //JOptionPane.showMessageDialog(null, "Datos guardados");
                return true;
            }

        } catch (SQLException ex) {
            throw ex;
        }
        return false;

    }

    public static boolean updatePeriodoMaquinariaEnObra(PeriodoMaquinariaEnObra periodomaquinariaenobra) throws SQLException {
        Connection conn = MySQL.getConnection();
        
        String sql = "update periodomaquinariaenobra set EmpleadoAlmacenQueAsignaID=?, JefeDeObraQueSolicitaID=?, FechaInicio=?, FechaFin=?, FechaSolicitud=?, FechaRecepcion=?, MaquinariaID=?, ObraID=?, AdministrativoObraQueVerificaID=?"
                + "where ID=?";

        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        PreparedStatement ps;
        try {
            ps = conn.prepareCall(sql);
            
            ps.setInt(1, periodomaquinariaenobra.getEmpleadoAlmacen().getPK_ID());
            ps.setInt(2, periodomaquinariaenobra.getJefeDeObra().getPK_ID());
            ps.setString(3, sdf.format(periodomaquinariaenobra.getFechaInicio()));
            ps.setString(4, sdf.format(periodomaquinariaenobra.getFechaFin()));
            ps.setString(5, sdf.format(periodomaquinariaenobra.getFechaSolicitud()));
            ps.setString(6, sdf.format(periodomaquinariaenobra.getFechaRecepcion()));
            ps.setInt(7, periodomaquinariaenobra.getMaquinaria().getPK_ID());
            ps.setInt(8, periodomaquinariaenobra.getObra().getPK_ID());
            ps.setInt(9, periodomaquinariaenobra.getAdministrativoObra().getPK_ID());

            int n = ps.executeUpdate();
            if (n > 0) {
                return true;
            }

        } catch (SQLException ex) {
            throw ex;
        }
        return false;

    }

    public static boolean deletePeriodoMaquinariaEnObrea(int identificador) throws SQLException {
        Connection conn = MySQL.getConnection();
        String sql = "delete from periodomaquinariaenobra where id=" + identificador;
        try {
            Statement sentencia = conn.createStatement();
            int n = sentencia.executeUpdate(sql);
            if (n > 0) {
                //JOptionPane.showMessageDialog(null, "Datos Borrados");
                return true;
            }
        } catch (SQLException ex) {
            throw ex;
        }
        return false;
    }

}
