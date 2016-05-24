/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albaran;

import POJOS.Albaran;
import POJOS.Empleado;
import POJOS.EmpleadoAlmacen;
import POJOS.LineaAlbaran;
import POJOS.Obra;
import POJOS.Persona;
import dba.MySQL;
import dba.AlbaranDba;
import dba.PersonaDba;
import dba.ObraDba;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import obra.FrmObra;

/**
 *
 * @author ZareRed
 */
public class FrmAlbaran extends javax.swing.JFrame {
    Connection conn;
    DefaultTableModel modelo;
    Statement sentencia;
    private Object instance;
    /**
     * Creates new form Formulario
     */
    public FrmAlbaran() {
        initComponents();
        conn = MySQL.getConnection();
        deshabilitar();
        llenar();
    }
    
    public void limpiar(){
        final Calendar instance = Calendar.getInstance();
        slcProveedor.setSelectedItem(null);
        slcEmpleado.setSelectedItem(null);
        txtNumAlbaran.setText("");
        jxFecha.setDate(instance.getTime());
    }
    
    public void habilitar(){
        slcProveedor.setEnabled(true);
        slcEmpleado.setEnabled(true);
        txtNumAlbaran.setEnabled(true);
        jxFecha.setEnabled(true);
    }
    
    public void deshabilitar(){
        slcProveedor.setEnabled(false);
        slcEmpleado.setEnabled(false);
        txtNumAlbaran.setEnabled(false);
        jxFecha.setEnabled(false);
    }
    
    public void llenar(){
        String titulos[] = {"lineaAlbaran", "proveedor", "empleado", "numeroAlbaran", "fecha"};
        modelo = new DefaultTableModel(null, titulos);

        String fila[] = new String[5];
        ArrayList<Albaran> albaranes = new ArrayList<>();
        ArrayList <Empleado> empleados = new ArrayList<>();
        ArrayList <Persona> proveedores = new ArrayList<>();
        
        try {
            albaranes = dba.AlbaranDba.getAlbaranes();
        } catch (SQLException ex) {
            Logger.getLogger(FrmAlbaran.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (Albaran albaran : albaranes) {
            fila[0] = String.valueOf(albaran.getProveedor());
            fila[1] = String.valueOf(albaran.getEmpleado());
            fila[2] = String.valueOf(albaran.getNumAlbaran());
            fila[3] = String.valueOf(albaran.getFecha());

            modelo.addRow(fila);
        }

        tblAlbaran.setModel(modelo);
 
    }
    
    public void nuevo(){
        Albaran albaran = new Albaran();

        try {
            Persona proveedor = personas.get(slcProveedor.getSelectedIndex());
            albaran.setProveedor(proveedor);
            Empleado empleado = empleados.get(slcEmpleado.getSelectedIndex());
            albaran.setEmpleado(empleado);
            albaran.setNumAlbaran(txtNumAlbaran.getText());
            albaran.setFecha(albaran.getFecha());
            
            if (dba.AlbaranDba.insertAlbaran(albaran)) {
                JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente.");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Se ha producido un Error. Error:" + ex.getMessage());
        }
    }
    
    public void modificar(){
        int fila = tblAlbaran.getSelectedRow();
        String identificador = (String) tblAlbaran.getValueAt(fila, 0);
        
        Albaran albaran = new Albaran();
        
        try {
            Persona proveedor = personas.get(slcProveedor.getSelectedIndex());
            albaran.setProveedor(proveedor);
            Empleado empleado = empleados.get(slcEmpleado.getSelectedIndex());
            albaran.setEmpleado(empleado);
            albaran.setNumAlbaran(txtNumAlbaran.getText());
            albaran.setFecha(albaran.getFecha());
            
        if (dba.AlbaranDba.updateAlbaran(albaran)) {
                JOptionPane.showMessageDialog(null, "Datos Modificados");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }       
    }

    public void borrar(){
        int fila = tblAlbaran.getSelectedRow();
        String identificador = (String)tblAlbaran.getValueAt(fila, 0);
        String sql = "delete from albaran where factura=" + identificador;
        try {
            sentencia = conn.createStatement();
            int n = sentencia.executeUpdate(sql);
            if (n>0){
                JOptionPane.showMessageDialog(null, "Datos Borrados");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
             
    }
    
    public void listarEmpleados(){
        try {
            empleados = PersonaDba.getEmpleados();
        } catch (SQLException ex) {
            Logger.getLogger(FrmAlbaran.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Empleado empleado : empleados){
            slcEmpleado.addItem(empleado.getNombre()+empleado.getApellidos());
        }
        
    }
    
    public void listarProveedores(){
        try {
            personas = PersonaDba.getPersonas();
        } catch (SQLException ex) {
            Logger.getLogger(FrmAlbaran.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Persona persona : personas){
            slcProveedor.addItem(persona.getNombre());
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAlbaran = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNumAlbaran = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        slcProveedor = new javax.swing.JComboBox<>();
        slcEmpleado = new javax.swing.JComboBox<>();
        jxFecha = new org.jdesktop.swingx.JXDatePicker();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblAlbaran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblAlbaran);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de albarán:"));

        jLabel1.setText("Proveedor:");

        jLabel2.setText("Empleado:");

        jLabel3.setText("Nº Albarán:");

        jLabel4.setText("Fecha:");

        slcProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        slcEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(slcProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNumAlbaran, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(slcEmpleado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jxFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(slcProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(slcEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumAlbaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jxFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiar();
        habilitar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        nuevo();
        deshabilitar();
        llenar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificar();
        limpiar();
        deshabilitar();
        llenar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        borrar();
        limpiar();
        deshabilitar();
        llenar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblAlbaranMouseClicked(java.awt.event.MouseEvent evt) {                                        
        if (evt.getButton() == 1) {
            int fila = tblAlbaran.getSelectedRow();
            Albaran albaran = new Albaran();
            Persona proveedor = new Persona();
            Empleado empleado = new Empleado();
            
            try {
                albaran = dba.AlbaranDba.getAlbaran(Integer.parseInt(String.valueOf(tblAlbaran.getValueAt(fila, 0))));
            } catch (SQLException ex) {
                Logger.getLogger(FrmAlbaran.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                slcProveedor.setSelectedItem(proveedor.getNombre());
                slcEmpleado.setSelectedItem(empleado.getUsuario());
                txtNumAlbaran.setText(albaran.getNumAlbaran());
                jxFecha.setDate(albaran.getFecha());

                habilitar();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido leer la información en la BD");
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmAlbaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAlbaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAlbaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAlbaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAlbaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private org.jdesktop.swingx.JXDatePicker jxFecha;
    private javax.swing.JComboBox<String> slcEmpleado;
    private javax.swing.JComboBox<String> slcProveedor;
    private javax.swing.JTable tblAlbaran;
    private javax.swing.JTextField txtNumAlbaran;
    // End of variables declaration//GEN-END:variables
    ArrayList <Empleado> empleados = new ArrayList<>();
    ArrayList <Persona> personas = new ArrayList<>();
    ArrayList <Albaran> albaranes = new ArrayList<>();

}
