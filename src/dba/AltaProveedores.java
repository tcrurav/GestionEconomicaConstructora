/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dba;

import POJOS.Persona;
import POJOS.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos
 */
public class AltaProveedores {

    static ResultSet rs;
    static Statement sentencia;
    static Connection conn;

    public static Proveedor getProveedores(String identificador) throws SQLException {
        Proveedor prov = new Proveedor();

        String sql = "Select * from proveedor where Dni='"+ identificador+"'";
        try {
            Connection conn = MySQL.getConnection();
            Statement sentencia = conn.createStatement();
            ResultSet rs = sentencia.executeQuery(sql);

            if (rs.next()) {
                prov.setPK_ID(rs.getInt("ID"));
                prov.setNombre(rs.getString("Nombre"));
                prov.setDireccion(rs.getString("Direccion"));
            } else {
                return null;
            }

        } catch (SQLException ex) {
            throw ex;
        }

        return prov;
    }

    public static boolean deleteProveedorPersona(int consulta1, int consulta2) {
                conn = MySQL.getConnection();
        String sql = "delete from persona_proveedor where PersonaID='" + consulta1 + "' and ProveedorID='" + consulta2 + "'";

        try {
            sentencia = conn.createStatement();
            int n = sentencia.executeUpdate(sql);
            if (n > 0) {
                //JOptionPane.showMessageDialog(null, "Datos Borrados");
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());

        } finally {
            close();
        }
        return false;
    
    }

    public boolean comprobarConsulta(String nom, String direc) {
        Connection conn = MySQL.getConnection();
        String sql = "select * from proveedor where Nombre =" + nom + " and Direccion = " + direc;
        boolean resul = false;
        if (sql.equals("")) {
            resul = false;
        } else {
            resul = true;
        }
        return resul;
    }

    public static ArrayList<Proveedor> getProveedor() throws SQLException {
        Connection conn = MySQL.getConnection();
        String sql = "select * from proveedor";

        ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();

        try {
            Statement sentencia = conn.createStatement();
            ResultSet rs = sentencia.executeQuery(sql);

            while (rs.next()) {
                Proveedor alta = new Proveedor();
                alta.setPK_ID(rs.getInt("ID"));
                alta.setNombre(rs.getString("Nombre"));
                alta.setDireccion(rs.getString("Direccion"));

                proveedores.add(alta);
            }

            return proveedores;

        } catch (SQLException ex) {
            throw ex;
        }

    }

    public static boolean insertProveedor(Proveedor proveedores) throws SQLException {
        Connection conn = MySQL.getConnection();
        String sql = "insert into proveedor (Nombre, Direccion, Dni) values (?, ?, ?)";

        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, proveedores.getNombre());
            ps.setString(2, proveedores.getDireccion());
            ps.setString(3, proveedores.getDni());

            int n = ps.executeUpdate();

            if (n > 0) {

                return true;
            }

        } catch (SQLException ex) {
            throw ex;

        }
        return false;
    }

    public static boolean updateProveedores(Proveedor proveedores) throws SQLException {
         conn = MySQL.getConnection();

        String sql = "update proveedor set Nombre=?, Direccion=?"
                + " where Dni=?";

        PreparedStatement ps;
        try {
            ps = conn.prepareCall(sql);
            ps.setString(1, proveedores.getNombre());
            ps.setString(2, proveedores.getDireccion());
            ps.setString(3, proveedores.getDni());
            int n = ps.executeUpdate();

            if (n > 0) {
                return true;
            }

        } catch (SQLException ex) {
            throw ex;
        }
        return false;
    }

    public static boolean deleteProveedor(String identificador) throws SQLException {
        System.out.println(identificador);
        conn = MySQL.getConnection();
        String sql = "delete from proveedor where Dni='"+ identificador+"'";

        try {
            sentencia = conn.createStatement();
            int n = sentencia.executeUpdate(sql);
            if (n > 0) {
               // JOptionPane.showMessageDialog(null, "Datos Borrados");
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());

        } finally {
            close();
        }
        return false;
    }

    public static int selectProveedorID(String dniConsulta) throws SQLException {
        int resultado1;
        String sql = "select ID from proveedor where Dni='"+dniConsulta+"'";
        try {
            conn = MySQL.getConnection();
            sentencia = conn.createStatement();
            rs = sentencia.executeQuery(sql);
            if (rs.next()) {
                resultado1 = rs.getInt("ID");
            } else {
                return 0;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido leer la información en la BD de ProveedorID");
            throw ex;
        } finally {
            rs.close();
        }
        return resultado1;
    }

    public static boolean insertProveedorPersona(int con1, int con2) throws SQLException {

        Connection conn = MySQL.getConnection();
        String sql = "insert into persona_proveedor (PersonaID,ProveedorID) values(?, ?)";

        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setInt(1, con1);
            ps.setInt(2, con2);

            int n = ps.executeUpdate();

            if (n > 0) {
                return true;
            }
        } catch (SQLException ex) {
            throw ex;
        }
        return false;
    }

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
