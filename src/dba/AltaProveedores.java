/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dba;

import POJOS.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Marcos
 */
public class AltaProveedores {

    public static Proveedor getProveedores(int identificador) throws SQLException {
        Proveedor prov = new Proveedor();

        String sql = "Select * from proveedor where ID=" + identificador;
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
    
    public boolean comprobarConsulta(String nom, String direc){
        Connection conn = MySQL.getConnection();
        String sql = "select * from proveedor where Nombre ="+nom+" and Direccion = "+direc;
        boolean resul= false;
        if(sql.equals("")){
            resul = false;
        }else{
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
        String sql = "insert into proveedor (Nombre, Direccion) values (?, ?)";

        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, proveedores.getNombre());
            ps.setString(2, proveedores.getDireccion());

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
        Connection conn = MySQL.getConnection();

        String sql = "update proveedor set Nombre=?, Direccion=?"
                + " where ID=?";

        PreparedStatement ps;
        try {
            ps = conn.prepareCall(sql);
            ps.setString(1, proveedores.getNombre());
            ps.setString(2, proveedores.getDireccion());
            ps.setInt(3, proveedores.getPK_ID());

            int n = ps.executeUpdate();

            if (n > 0) {
                return true;
            }

        } catch (SQLException ex) {
            throw ex;
        }
        return false;
    }

    public static boolean deleteProveedor(int identificador) throws SQLException {
        Connection conn = MySQL.getConnection();
        String sql = "delete from proveedor where id=" + identificador;
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
