/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleadoAlmacen;

import dba.MySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marcos
 */



public class interfazEmpleadoAlmacen extends javax.swing.JFrame {
    Connection conn;
    DefaultTableModel modelo;
    Statement sentencia;
    /**
     * Creates new form Formulario
     */
    public void limpiar(){
        campoDNI.setText("");
        campoNombre.setText("");
        campoApellidos.setText("");
        campoTelefono.setText("");
        campoSueldo.setText("");
    }
    
    public void habilitar(){
        campoDNI.setEnabled(true);
        campoNombre.setEnabled(true);
        campoApellidos.setEnabled(true);
        campoTelefono.setEnabled(true);
        campoSueldo.setEnabled(true);
    }
    
    public void deshabilitar(){
        campoDNI.setEnabled(false);
        campoNombre.setEnabled(false);
        campoApellidos.setEnabled(false);
        campoTelefono.setEnabled(false);
        campoSueldo.setEnabled(false);
    }
    
    public void llenar(){
        conn = MySQL.getConnection();
        String titulos[] = {"dni","nombre","apellidos","telefono","sueldo"};
        String sql = "select personas.dni, nombre, apellidos, telefono, sueldo from personas, empleados where personas.dni=empleados.dni";
        modelo = new DefaultTableModel(null, titulos);
        
        try {
            sentencia = conn.createStatement();
            ResultSet rs = sentencia.executeQuery(sql);
            
            String fila[] = new String[5];
            
            while(rs.next()){
                fila[0] = rs.getString("personas.dni");
                fila[1] = rs.getString("nombre");
                fila[2] = rs.getString("apellidos");
                fila[3] = rs.getString("telefono");
                fila[4] = rs.getString("sueldo");
                
                modelo.addRow(fila);
            }
            
            tablaMostrar.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(interfazEmpleadoAlmacen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void nuevo(){
        String sql = "insert into personas (dni, nombre, apellidos, telefono, tipo) values (?, ?, ?, ?, ?)";
        String sql2 = "insert into empleados (dni, sueldo, tipo) values (?, ?, ?)";

        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, campoDNI.getText());
            ps.setString(2, campoNombre.getText());
            ps.setString(3, campoApellidos.getText());
            ps.setString(4, campoTelefono.getText());
            ps.setString(5, "empleado");
            int n = ps.executeUpdate();
            
            if(n>0){
                JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente.");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se ha producido un Error. Error:" + ex.getMessage());
        }
        
        try {
            PreparedStatement ps = conn.prepareCall(sql2);
            ps.setString(1, campoDNI.getText());
            ps.setString(2, campoSueldo.getText());
            ps.setString(3, "empleadoAlmacen");
            
            int n = ps.executeUpdate();
            
            if(n>0){
                JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente.");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se ha producido un Error. Error:" + ex.getMessage());
        }
        
    }
    
    public void modificar(){
        int fila = tablaMostrar.getSelectedRow();
        String identificador = (String)tablaMostrar.getValueAt(fila, 0);
        String sql = "update personas set dni=?, nombre=?, apellidos=?, telefono=? where dni='"+ identificador+"'";
        String sql2 = "update empleados set sueldo=? where dni='" + identificador+"'";
        PreparedStatement ps;
        try {
            ps = conn.prepareCall(sql);
            ps.setString(1, campoDNI.getText());
            ps.setString(2, campoNombre.getText());
            ps.setString(3, campoApellidos.getText());
            ps.setString(4, campoTelefono.getText());
            
            int n = ps.executeUpdate();
            
            if(n>0){
                JOptionPane.showMessageDialog(null, "Datos Modificados");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }     
        
        try {
            ps = conn.prepareCall(sql2);
            ps.setString(1, campoSueldo.getText());
            
            int n = ps.executeUpdate();
            
            if(n>0){
                JOptionPane.showMessageDialog(null, "Datos Modificados");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        } 
    }

    public void borrar(){
        int fila = tablaMostrar.getSelectedRow();
        String identificador = (String)tablaMostrar.getValueAt(fila, 0);
        String sql = "delete from personas where dni='"+ identificador+"'";
        String sql2 = "delete from empleados where dni='"+ identificador+"'";
        try {
            sentencia = conn.createStatement();
            int n = sentencia.executeUpdate(sql);
            if (n>0){
                JOptionPane.showMessageDialog(null, "Datos Borrados");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
        
        try {
            sentencia = conn.createStatement();
            int n = sentencia.executeUpdate(sql2);
            if (n>0){
                JOptionPane.showMessageDialog(null, "Datos Borrados");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
        
        
    }
    /**
     * Creates new form interfazEmpleadoAlmacen
     */
    public interfazEmpleadoAlmacen() {
        initComponents();
        conn = MySQL.getConnection();
        deshabilitar();
        llenar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoDNI = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        campoApellidos = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoSueldo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMostrar = new javax.swing.JTable();
        botonInsertar = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setText("DNI:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Teléfono:");

        jLabel5.setText("Sueldo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(campoApellidos, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoDNI, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoSueldo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Nombre", "Apellidos", "Teléfono", "Sueldo"
            }
        ));
        tablaMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMostrarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaMostrar);

        botonInsertar.setText("Insertar");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        botonBorrar.setText("Borrar");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonInsertar)
                        .addGap(18, 18, 18)
                        .addComponent(botonBorrar)
                        .addGap(18, 18, 18)
                        .addComponent(botonModificar)
                        .addGap(18, 18, 18)
                        .addComponent(botonGuardar)
                        .addGap(143, 143, 143)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonInsertar)
                    .addComponent(botonBorrar)
                    .addComponent(botonModificar)
                    .addComponent(botonGuardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        // TODO add your handling code here:
        limpiar();
        habilitar();
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        // TODO add your handling code here:
        modificar();
        limpiar();
        deshabilitar();
        llenar();
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        // TODO add your handling code here:
        borrar();
        limpiar();
        deshabilitar();
        llenar();
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        // TODO add your handling code here:
        nuevo();
        deshabilitar();
        llenar();
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void tablaMostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMostrarMouseClicked
        // TODO add your handling code here:
                if (evt.getButton()==1){           
                int fila = tablaMostrar.getSelectedRow();  
                System.out.println("principio");
                String sql = "select personas.dni, nombre, apellidos, telefono, sueldo from personas, empleados where personas.dni='"+ tablaMostrar.getValueAt(fila, 0)+"' AND empleados.dni='"+ tablaMostrar.getValueAt(fila, 0)+("'") ;
               // System.out.println("sql"+sql);
                //select personas.dni, nombre, apellidos, telefono, sueldo from personas, empleados where personas.dni= "45364867N" and empleados.dni="45364867N"
                //JOptionPane.showMessageDialog(null, sql);
            try {
                sentencia = conn.createStatement();
                ResultSet rs = sentencia.executeQuery(sql);
                rs.next();
               // System.out.println("ESTOY AQUI");
               // System.out.println("RESULTADO="+rs.getString("dni"));
                campoDNI.setText(rs.getString("dni"));
                campoNombre.setText(rs.getString("nombre"));
                campoApellidos.setText(rs.getString("apellidos"));
                campoTelefono.setText(rs.getString("telefono"));
                campoSueldo.setText(rs.getString("sueldo"));
                
                
                habilitar();
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido leer la información en la BD");
            }
        }

    }//GEN-LAST:event_tablaMostrarMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JTextField campoDNI;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoSueldo;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMostrar;
    // End of variables declaration//GEN-END:variables
}
