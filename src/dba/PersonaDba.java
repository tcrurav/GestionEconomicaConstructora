/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dba;

import POJOS.AdministrativoManoDeObra;
import POJOS.Empleado;
import POJOS.EmpleadoObra;
import POJOS.JefeDeObra;
import POJOS.Persona;
import static gestioneconomicaconstructora.TiposDePersona.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiburcio
 */
public class PersonaDba {

    static ResultSet rs;
    static Statement sentencia;
    static Connection conn;

    public static JefeDeObra getJefeDeObra(int identificador) throws SQLException {
        JefeDeObra jefeDeObra = new JefeDeObra();

        String sql = "Select * from persona where ID=" + identificador;
        try {
            conn = MySQL.getConnection();
            sentencia = conn.createStatement();
            rs = sentencia.executeQuery(sql);
            if (rs.next()) {
                jefeDeObra.setPK_ID(rs.getInt("ID"));
                jefeDeObra.setNombre(rs.getString("Nombre"));
                jefeDeObra.setApellidos(rs.getString("Apellidos"));
                jefeDeObra.setTelefono(rs.getString("Telefono"));
                jefeDeObra.setDni(rs.getString("Dni"));
                jefeDeObra.setUsuario(rs.getString("Usuario"));
                jefeDeObra.setContra(rs.getString("Contra"));
                jefeDeObra.setCategoria(CategoriaDba.getCategoria(rs.getInt("CategoriaID")));
            } else {
                return null;
            }

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "No se ha podido leer la información en la BD");
            throw ex;
        } finally {
            close();
        }

        return jefeDeObra;
    }
    
    public static JefeDeObra getJefeDeObra(String identificador) throws SQLException {
        JefeDeObra jefeDeObra = new JefeDeObra();

        String sql = "Select * from persona where Nombre like '" + identificador + "'";
        try {
            conn = MySQL.getConnection();
            sentencia = conn.createStatement();
            rs = sentencia.executeQuery(sql);
            if (rs.next()) {
                jefeDeObra.setPK_ID(rs.getInt("ID"));
                jefeDeObra.setNombre(rs.getString("Nombre"));
                jefeDeObra.setApellidos(rs.getString("Apellidos"));
                jefeDeObra.setTelefono(rs.getString("Telefono"));
                jefeDeObra.setDni(rs.getString("Dni"));
                jefeDeObra.setUsuario(rs.getString("Usuario"));
                jefeDeObra.setContra(rs.getString("Contra"));
                jefeDeObra.setCategoria(CategoriaDba.getCategoria(rs.getInt("CategoriaID")));
            } else {
                return null;
            }

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "No se ha podido leer la información en la BD");
            throw ex;
        } finally {
            close();
        }

        return jefeDeObra;
    }
    
    public static EmpleadoObra getEmpleadoObra(int identificador) throws SQLException {
        EmpleadoObra empleadoObra = new EmpleadoObra();

        String sql = "Select * from persona where ID=" + identificador;
        System.out.println(sql);
        try {
            conn = MySQL.getConnection();
            sentencia = conn.createStatement();
            rs = sentencia.executeQuery(sql);
            if (rs.next()) {
                empleadoObra.setPK_ID(rs.getInt("ID"));
                empleadoObra.setNombre(rs.getString("Nombre"));
                empleadoObra.setApellidos(rs.getString("Apellidos"));
                empleadoObra.setTelefono(rs.getString("Telefono"));
                empleadoObra.setDni(rs.getString("Dni"));
                empleadoObra.setUsuario(rs.getString("Usuario"));
                empleadoObra.setContra(rs.getString("Contra"));
                empleadoObra.setCategoria(CategoriaDba.getCategoria(rs.getInt("CategoriaID")));
            } else {
                return null;
            }

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "No se ha podido leer la información en la BD");
            throw ex;
        } finally {
            close();
        }

        return empleadoObra;
    }
    
    public static EmpleadoObra getEmpleadoObra(String identificador) throws SQLException {
        EmpleadoObra empleadoObra = new EmpleadoObra();

        String sql = "Select * from persona where Nombre like '" + identificador + "'";
        System.out.println(sql);
        try {
            conn = MySQL.getConnection();
            sentencia = conn.createStatement();
            rs = sentencia.executeQuery(sql);
            if (rs.next()) {
                empleadoObra.setPK_ID(rs.getInt("ID"));
                empleadoObra.setNombre(rs.getString("Nombre"));
                empleadoObra.setApellidos(rs.getString("Apellidos"));
                empleadoObra.setTelefono(rs.getString("Telefono"));
                empleadoObra.setDni(rs.getString("Dni"));
                empleadoObra.setUsuario(rs.getString("Usuario"));
                empleadoObra.setContra(rs.getString("Contra"));
                empleadoObra.setCategoria(CategoriaDba.getCategoria(rs.getInt("CategoriaID")));
            } else {
                return null;
            }

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "No se ha podido leer la información en la BD");
            throw ex;
        } finally {
            close();
        }

        return empleadoObra;
    }
    
    public static AdministrativoManoDeObra getAdministrativoManoDeObra(int identificador) throws SQLException {
        AdministrativoManoDeObra administrativoManoDeObra = new AdministrativoManoDeObra();

        String sql = "Select * from persona where ID=" + identificador;
        try {
            conn = MySQL.getConnection();
            sentencia = conn.createStatement();
            rs = sentencia.executeQuery(sql);
            if (rs.next()) {
                administrativoManoDeObra.setPK_ID(rs.getInt("ID"));
                administrativoManoDeObra.setNombre(rs.getString("Nombre"));
                administrativoManoDeObra.setApellidos(rs.getString("Apellidos"));
                administrativoManoDeObra.setTelefono(rs.getString("Telefono"));
                administrativoManoDeObra.setDni(rs.getString("Dni"));
                administrativoManoDeObra.setUsuario(rs.getString("Usuario"));
                administrativoManoDeObra.setContra(rs.getString("Contra"));
                administrativoManoDeObra.setCategoria(CategoriaDba.getCategoria(rs.getInt("CategoriaID")));
            } else {
                return null;
            }

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "No se ha podido leer la información en la BD");
            throw ex;
        } finally {
            close();
        }

        return administrativoManoDeObra;
    }
    
    public static AdministrativoManoDeObra getAdministrativoManoDeObra(String identificador) throws SQLException {
        AdministrativoManoDeObra administrativoManoDeObra = new AdministrativoManoDeObra();

        String sql = "Select * from persona where Nombre like '" + identificador + "'";
        try {
            conn = MySQL.getConnection();
            sentencia = conn.createStatement();
            rs = sentencia.executeQuery(sql);
            if (rs.next()) {
                administrativoManoDeObra.setPK_ID(rs.getInt("ID"));
                administrativoManoDeObra.setNombre(rs.getString("Nombre"));
                administrativoManoDeObra.setApellidos(rs.getString("Apellidos"));
                administrativoManoDeObra.setTelefono(rs.getString("Telefono"));
                administrativoManoDeObra.setDni(rs.getString("Dni"));
                administrativoManoDeObra.setUsuario(rs.getString("Usuario"));
                administrativoManoDeObra.setContra(rs.getString("Contra"));
                administrativoManoDeObra.setCategoria(CategoriaDba.getCategoria(rs.getInt("CategoriaID")));
            } else {
                return null;
            }

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "No se ha podido leer la información en la BD");
            throw ex;
        } finally {
            close();
        }

        return administrativoManoDeObra;
    }

    
    public static int getDiscriminator(Empleado empleado) throws SQLException{
        int identificador = empleado.getPK_ID();
        String sql = "Select Discriminator from persona where ID=" + identificador;
        try {
            conn = MySQL.getConnection();
            sentencia = conn.createStatement();
            rs = sentencia.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("Discriminator");
            } else {
                return 0;
            }

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "No se ha podido leer la información en la BD");
            throw ex;
        } finally {
            close();
        }
    }
    
    public static Empleado getEmpleado(int identificador) throws SQLException {
        Empleado empleado = new Empleado();

        String sql = "Select * from persona where ID=" + identificador;
        try {
            conn = MySQL.getConnection();
            sentencia = conn.createStatement();
            rs = sentencia.executeQuery(sql);
            if (rs.next()) {
                empleado.setPK_ID(rs.getInt("ID"));
                empleado.setNombre(rs.getString("Nombre"));
                empleado.setApellidos(rs.getString("Apellidos"));
                empleado.setTelefono(rs.getString("Telefono"));
                empleado.setDni(rs.getString("Dni"));
                empleado.setUsuario(rs.getString("Usuario"));
                empleado.setContra(rs.getString("Contra"));
                empleado.setCategoria(CategoriaDba.getCategoria(rs.getInt("CategoriaID")));
            } else {
                return null;
            }

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "No se ha podido leer la información en la BD");
            throw ex;
        } finally {
            close();
        }

        return empleado;
    }

    public static Empleado getEmpleado(String usuario, String contrasena) throws SQLException {
        Empleado empleado = new Empleado();

        String sql = "select * from Persona where Usuario='" + usuario + "' and Contra='" + contrasena + "'";

        try {

            conn = MySQL.getConnection();
            sentencia = conn.createStatement();
            rs = sentencia.executeQuery(sql);

            if (rs.next()) {
                empleado.setPK_ID(rs.getInt("ID"));
                empleado.setNombre(rs.getString("Nombre"));
                empleado.setApellidos(rs.getString("Apellidos"));
                empleado.setTelefono(rs.getString("Telefono"));
                empleado.setDni(rs.getString("Dni"));
                empleado.setUsuario(rs.getString("Usuario"));
                empleado.setContra(rs.getString("Contra"));
                empleado.setCategoria(CategoriaDba.getCategoria(rs.getInt("CategoriaID")));
            } else {
                return null;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido leer la información en la BD");
            throw ex;
        } finally {
            close();
        }

        return empleado;
    }

    public static Persona getPersona(int identificador) throws SQLException {
        Persona persona = new Persona();

        String sql = "Select * from persona where ID=" + identificador;
        try {
            conn = MySQL.getConnection();
            sentencia = conn.createStatement();
            rs = sentencia.executeQuery(sql);
            rs.next();

            persona.setPK_ID(rs.getInt("ID"));
            persona.setNombre(rs.getString("Nombre"));
            persona.setApellidos(rs.getString("Apellidos"));
            persona.setTelefono(rs.getString("Telefono"));
            persona.setDni(rs.getString("Dni"));

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "No se ha podido leer la información en la BD");
            throw ex;
        } finally {
            close();
        }

        return persona;
    }

    public static ArrayList<JefeDeObra> getJefesDeObra() throws SQLException {
        conn = MySQL.getConnection();
        String sql = "select * from JefeDeObra";

        ArrayList<JefeDeObra> jefesDeObra = new ArrayList<JefeDeObra>();

        try {
            sentencia = conn.createStatement();
            rs = sentencia.executeQuery(sql);

            while (rs.next()) {
                JefeDeObra jefeDeObra = new JefeDeObra();
                jefeDeObra.setPK_ID(rs.getInt("ID"));
                jefeDeObra.setNombre(rs.getString("Nombre"));
                jefeDeObra.setApellidos(rs.getString("Apellidos"));
                jefeDeObra.setTelefono(rs.getString("Telefono"));
                jefeDeObra.setDni(rs.getString("Dni"));
                jefeDeObra.setCategoria(CategoriaDba.getCategoria(rs.getInt("CategoriaID")));

                jefesDeObra.add(jefeDeObra);
            }

            return jefesDeObra;

        } catch (SQLException ex) {
            //Logger.getLogger(FrmPersona.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } finally {
            close();
        }

        //return null;
    }

    public static ArrayList<Empleado> getEmpleados() throws SQLException {
        conn = MySQL.getConnection();
        String sql = "select * from Persona";

        ArrayList<Empleado> empleados = new ArrayList<>();

        try {
            sentencia = conn.createStatement();
            rs = sentencia.executeQuery(sql);

            while (rs.next()) {
                Empleado empleado = new Empleado();
                empleado.setPK_ID(rs.getInt("ID"));
                empleado.setNombre(rs.getString("Nombre"));
                empleado.setApellidos(rs.getString("Apellidos"));
                empleado.setTelefono(rs.getString("Telefono"));
                empleado.setDni(rs.getString("Dni"));
                empleado.setCategoria(CategoriaDba.getCategoria(rs.getInt("CategoriaID")));

                empleados.add(empleado);
            }

            return empleados;

        } catch (SQLException ex) {
            //Logger.getLogger(FrmPersona.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } finally {
            close();
        }

        //return null;
    }

    public static ArrayList<Persona> getPersonas() throws SQLException {
        conn = MySQL.getConnection();
        String sql = "select * from Persona";

        ArrayList<Persona> personas = new ArrayList<>();

        try {
            sentencia = conn.createStatement();
            rs = sentencia.executeQuery(sql);

            while (rs.next()) {
                Persona persona = new Persona();
                persona.setPK_ID(rs.getInt("ID"));
                persona.setNombre(rs.getString("Nombre"));
                persona.setApellidos(rs.getString("Apellidos"));
                persona.setTelefono(rs.getString("Telefono"));
                persona.setDni(rs.getString("Dni"));

                personas.add(persona);
            }

            return personas;

        } catch (SQLException ex) {
            //Logger.getLogger(FrmPersona.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } finally {
            close();
        }

        //return null;
    }

    public static boolean insertJefeDeObra(JefeDeObra jefeDeObra) throws SQLException {
        conn = MySQL.getConnection();
        String sql = "insert into persona (Nombre, Apellidos, Telefono, Dni, CategoriaID, Usuario, Contra) "
                + "values (?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, jefeDeObra.getNombre());
            ps.setString(2, jefeDeObra.getApellidos());
            ps.setString(3, jefeDeObra.getTelefono());
            ps.setString(4, jefeDeObra.getDni());
            ps.setInt(5, jefeDeObra.getCategoria().getPK_ID());
            ps.setString(6, jefeDeObra.getUsuario());
            ps.setString(7, jefeDeObra.getContra());
            int n = ps.executeUpdate();

            if (n > 0) {
                //JOptionPane.showMessageDialog(null, "Datos guardados");
                return true;
            }

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Se ha producido un Error. Error:" + ex.getMessage());
            throw ex;

        } finally {
            close();
        }
        return false;
    }

    /*    public static boolean insertEmpleado(Empleado empleado) throws SQLException{
        Connection conn = MySQL.getConnection();
        String sql = "insert into persona (Nombre, Apellidos, Telefono, Dni, CategoriaID, Usuario, Contra) " +
                "values (?, ?, ?, ?, ?, ?, ?)";
           
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, empleado.getNombre());
            ps.setString(2, empleado.getApellidos());
            ps.setString(3, empleado.getTelefono());
            ps.setString(4, empleado.getDni());
            ps.setInt(5, empleado.getCategoria().getPK_ID());
            ps.setString(6, empleado.getUsuario());
            ps.setString(7, empleado.getContra());
            int n = ps.executeUpdate();
            
            if(n>0){
                //JOptionPane.showMessageDialog(null, "Datos guardados");
                return true;
            }
            
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Se ha producido un Error. Error:" + ex.getMessage());
            throw ex;
            
        }
        return false;
    }
    
    public static boolean insertPersona(Persona persona) throws SQLException{
        Connection conn = MySQL.getConnection();
        String sql = "insert into persona (Nombre, Apellidos, Telefono, Dni) values (?, ?, ?, ?)";
           
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, persona.getNombre());
            ps.setString(2, persona.getApellidos());
            ps.setString(3, persona.getTelefono());
            ps.setString(4, persona.getDni());
            int n = ps.executeUpdate();
            
            if(n>0){
                //JOptionPane.showMessageDialog(null, "Datos guardados");
                return true;
            }
            
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Se ha producido un Error. Error:" + ex.getMessage());
            throw ex;
            
        }
        return false;
    }
     */
    public static boolean updateJefeDeObra(JefeDeObra jefeDeObra) throws SQLException {
        conn = MySQL.getConnection();

        String sql = "update persona set Nombre=?, Apellidos=?, Telefono=?, Dni=?, CategoriaID=?, Usuario=?, Contra=? "
                + " where ID=?";

        PreparedStatement ps;
        try {
            ps = conn.prepareCall(sql);
            ps.setString(1, jefeDeObra.getNombre());
            ps.setString(2, jefeDeObra.getApellidos());
            ps.setString(3, jefeDeObra.getTelefono());
            ps.setString(4, jefeDeObra.getDni());
            ps.setInt(5, jefeDeObra.getCategoria().getPK_ID());
            ps.setString(6, jefeDeObra.getUsuario());
            ps.setString(7, jefeDeObra.getContra());
            ps.setInt(8, jefeDeObra.getPK_ID());

            int n = ps.executeUpdate();

            if (n > 0) {
                return true;
            }

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            throw ex;
        } finally {
            close();
        }
        return false;
    }

    public static boolean updateEmpleado(Empleado empleado) throws SQLException{
        Connection conn = MySQL.getConnection();
        
        String sql = "update persona set Nombre=?, Apellidos=?, Telefono=?, Dni=?, CategoriaID=?, Usuario=?, Contra=? "
                +" where ID=?";

        PreparedStatement ps;
        try {
            ps = conn.prepareCall(sql);
            ps.setString(1, empleado.getNombre());
            ps.setString(2, empleado.getApellidos());
            ps.setString(3, empleado.getTelefono());
            ps.setString(4, empleado.getDni());
            ps.setInt(5, empleado.getCategoria().getPK_ID());
            ps.setString(6, empleado.getUsuario());
            ps.setString(7, empleado.getContra());
            ps.setInt(8, empleado.getPK_ID());
            
            int n = ps.executeUpdate();
            
            if(n>0){
                return true;
            }
            
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            throw ex;
        } 
        return false;
    }
    
    public static boolean updateCategoriaEmpleado(Empleado empleado) throws SQLException{
        Connection conn = MySQL.getConnection();
        
        String sql = "update persona set CategoriaID=? where ID=?";

        PreparedStatement ps;
        try {
            ps = conn.prepareCall(sql);
            ps.setInt(1, empleado.getCategoria().getPK_ID());
            ps.setInt(2, empleado.getPK_ID());
            
            int n = ps.executeUpdate();
            
            if(n>0){
                return true;
            }
            
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            throw ex;
        } 
        return false;
    }
    
    public static boolean updatePersona(Persona persona) throws SQLException{
        Connection conn = MySQL.getConnection();
        
        String sql = "update persona set Nombre=?, Apellidos=?, Telefono=?, Dni=?"
                +" where ID=?";

        PreparedStatement ps;
        try {
            ps = conn.prepareCall(sql);
            ps.setString(1, persona.getNombre());
            ps.setString(2, persona.getApellidos());
            ps.setString(3, persona.getTelefono());
            ps.setString(4, persona.getDni());
            ps.setInt(5, persona.getPK_ID());
            
            int n = ps.executeUpdate();
            
            if(n>0){
                return true;
            }
            
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            throw ex;
        } 
        return false;
    }
    public static boolean deletePersona(int identificador) throws SQLException {
        conn = MySQL.getConnection();
        String sql = "delete from persona where id=" + identificador;
        try {
            sentencia = conn.createStatement();
            int n = sentencia.executeUpdate(sql);
            if (n > 0) {
                //JOptionPane.showMessageDialog(null, "Datos Borrados");
                return true;
            }
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
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
