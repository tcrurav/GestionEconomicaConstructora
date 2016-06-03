/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materialObra;

import POJOS.JefeDeObra;
import POJOS.Obra;
import POJOS.Material;
import POJOS.Persona;
import POJOS.MaterialParaObra;
import POJOS.AdministrativoObra;
import dba.MySQL;
import dba.MaterialObraDba;
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
public class FrmMaterialObra extends javax.swing.JFrame {
    Connection conn;
    DefaultTableModel modelo;
    Statement sentencia;
    private Object instance;
    /**
     * Creates new form Formulario
     */
    public FrmMaterialObra() {
        initComponents();
        conn = MySQL.getConnection();
        deshabilitar();
        llenar();
    }
    
    public void limpiar(){
        final Calendar instance = Calendar.getInstance();
        slcMaterial.setSelectedItem(null);
        slcObra.setSelectedItem(null);
        txtCantidad.setText("");
        slcAdministrativo.setSelectedItem(null);
        slcJefeObra.setSelectedItem(null);
        txtCoste.setText("");
        jxFechaSolicitud.setDate(instance.getTime());
        jxFechaRecepcion.setDate(instance.getTime());
    }
    
    public void habilitar(){
        slcMaterial.setEnabled(true);
        slcObra.setEnabled(true);
        txtCantidad.setEnabled(true);
        slcAdministrativo.setEnabled(true);
        slcJefeObra.setEnabled(true);
        txtCoste.setEnabled(true);
        jxFechaSolicitud.setEnabled(true);
        jxFechaRecepcion.setEnabled(true);
    }
    
    public void deshabilitar(){
        slcMaterial.setEnabled(false);
        slcObra.setEnabled(false);
        txtCantidad.setEnabled(false);
        slcAdministrativo.setEnabled(false);
        slcJefeObra.setEnabled(false);
        txtCoste.setEnabled(false);
        jxFechaSolicitud.setEnabled(false);
        jxFechaRecepcion.setEnabled(false);
    }
    
    public void llenar(){
        String titulos[] = {"material", "obra", "cantidad", "administrador", "jefeObra", "coste", "fechaSolicitud", "fechaRecepcion"};
        modelo = new DefaultTableModel(null, titulos);

        String fila[] = new String[8];
        ArrayList <MaterialParaObra> materialesObras = new ArrayList<>();
        ArrayList <AdministrativoObra> administrativosObras = new ArrayList<>();
        ArrayList <Material> materiales = new ArrayList<>();
        ArrayList <Obra> obras = new ArrayList<>();
        ArrayList <JefeDeObra> jefesObras = new ArrayList<>();
        
        try {
            materialesObras = dba.MaterialObraDba.getMateriales();
        } catch (SQLException ex) {
            Logger.getLogger(FrmMaterialObra.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (MaterialParaObra materialParaObra : materialesObras) {
            fila[0] = String.valueOf(materialParaObra.getMaterial());
            fila[1] = String.valueOf(materialParaObra.getObra());
            fila[2] = String.valueOf(materialParaObra.getCantidadMaterial());
            fila[3] = String.valueOf(materialParaObra.getAdministrativoObra());
            fila[4] = String.valueOf(materialParaObra.getJefeDeObra());
            fila[5] = String.valueOf(materialParaObra.getCoste());
            fila[6] = String.valueOf(materialParaObra.getFechaSolicitud());
            fila[7] = String.valueOf(materialParaObra.getFechaRecepcion());

            modelo.addRow(fila);
        }

        tblMaterialObra.setModel(modelo);
 
    }
    
    public void nuevo(){
        MaterialParaObra materialParaObra = new MaterialParaObra();

        try {
            Material material = materiales.get(slcMaterial.getSelectedIndex());
            materialParaObra.setMaterial(material);
            Obra obra = obras.get(slcObra.getSelectedIndex());
            materialParaObra.setObra(obra);
            materialParaObra.setCantidadMaterial(Float.parseFloat(txtCantidad.getText()));
            AdministrativoObra administrativoObra = administrativosObras.get(slcAdministrativo.getSelectedIndex());
            materialParaObra.setAdministrativoObra(administrativoObra);
            JefeDeObra jefeDeObra = jefesObras.get(slcJefeObra.getSelectedIndex());
            materialParaObra.setJefeDeObra(jefeDeObra);
            materialParaObra.setCoste(Float.parseFloat(txtCoste.getText()));
            materialParaObra.setFechaSolicitud(materialParaObra.getFechaSolicitud());
            materialParaObra.setFechaRecepcion(materialParaObra.getFechaRecepcion());
            
            if (dba.MaterialObraDba.insertMaterial(materialParaObra)) {
                JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente.");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Se ha producido un Error. Error:" + ex.getMessage());
        }
    }
    
    public void modificar(){
        int fila = tblMaterialObra.getSelectedRow();
        String identificador = (String) tblMaterialObra.getValueAt(fila, 0);
        
        MaterialParaObra materialParaObra = new MaterialParaObra();
        
        try {
            Material material = materiales.get(slcMaterial.getSelectedIndex());
            materialParaObra.setMaterial(material);
            Obra obra = obras.get(slcObra.getSelectedIndex());
            materialParaObra.setObra(obra);
            materialParaObra.setCantidadMaterial(Float.parseFloat(txtCantidad.getText()));
            AdministrativoObra administrativoObra = administrativosObras.get(slcAdministrativo.getSelectedIndex());
            materialParaObra.setAdministrativoObra(administrativoObra);
            JefeDeObra jefeDeObra = jefesObras.get(slcJefeObra.getSelectedIndex());
            materialParaObra.setJefeDeObra(jefeDeObra);
            materialParaObra.setCoste(Float.parseFloat(txtCoste.getText()));
            materialParaObra.setFechaSolicitud(materialParaObra.getFechaSolicitud());
            materialParaObra.setFechaRecepcion(materialParaObra.getFechaRecepcion());
            
        if (dba.MaterialObraDba.updateMaterial(materialParaObra)) {
                JOptionPane.showMessageDialog(null, "Datos Modificados");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }       
    }

    public void borrar(){
        int fila = tblMaterialObra.getSelectedRow();
        String identificador = (String)tblMaterialObra.getValueAt(fila, 0);
        String sql = "delete from materialObra where factura=" + identificador;
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
    
    public void listarMaterial(){
        try {
            materialesObras = MaterialObraDba.getMateriales();
        } catch (SQLException ex) {
            Logger.getLogger(FrmMaterialObra.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Material material : materiales){
            slcMaterial.addItem(material.getCodigo()+material.getDescripcion());
        }
        
    }
    
    public void listarObra(){
        try {
            obras = ObraDba.getObras();
        } catch (SQLException ex) {
            Logger.getLogger(FrmMaterialObra.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Obra obra : obras){
            slcObra.addItem(obra.getDireccion());
        }
        
    }
    
    public void listarJefeObra(){
        try {
            jefesObras = PersonaDba.getJefesDeObra();
        } catch (SQLException ex) {
            Logger.getLogger(FrmMaterialObra.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (JefeDeObra jefeDeObra : jefesObras){
            slcJefeObra.addItem(jefeDeObra.getNombre()+jefeDeObra.getApellidos());
        }
        
    }
    
    public void listarAdministrativo(){
        try {
            personas = PersonaDba.getPersonas();
        } catch (SQLException ex) {
            Logger.getLogger(FrmMaterialObra.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Persona persona : personas){
            slcAdministrativo.addItem(persona.getNombre()+persona.getApellidos());
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
        tblMaterialObra = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        slcMaterial = new javax.swing.JComboBox<>();
        slcObra = new javax.swing.JComboBox<>();
        jxFechaSolicitud = new org.jdesktop.swingx.JXDatePicker();
        jLabel5 = new javax.swing.JLabel();
        jxFechaRecepcion = new org.jdesktop.swingx.JXDatePicker();
        jLabel6 = new javax.swing.JLabel();
        slcJefeObra = new javax.swing.JComboBox<>();
        txtCoste = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        slcAdministrativo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

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

        tblMaterialObra.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblMaterialObra);

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

        jLabel1.setText("Material:");

        jLabel2.setText("Obra:");

        jLabel3.setText("Cantidad:");

        jLabel4.setText("Fecha Solicitud:");

        slcMaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        slcObra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Jefe de Obra:");

        jLabel6.setText("Fecha Recepción:");

        slcJefeObra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Coste:");

        slcAdministrativo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("Administrativo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(slcAdministrativo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jxFechaRecepcion, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(jxFechaSolicitud, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(slcMaterial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(slcObra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slcJefeObra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCoste))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(slcMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(slcObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(slcAdministrativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(slcJefeObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCoste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jxFechaSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jxFechaRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
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
                .addContainerGap(52, Short.MAX_VALUE))
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

    private void tblMaterialObraMouseClicked(java.awt.event.MouseEvent evt) {                                        
        if (evt.getButton() == 1) {
            int fila = tblMaterialObra.getSelectedRow();
            MaterialParaObra materialParaObra = new MaterialParaObra();
            Material material = new Material();
            Obra obra = new Obra();
            JefeDeObra jefeDeObra = new JefeDeObra();
            
            try {
                materialParaObra = dba.MaterialObraDba.getMaterial(Integer.parseInt(String.valueOf(tblMaterialObra.getValueAt(fila, 0))));
            } catch (SQLException ex) {
                Logger.getLogger(FrmMaterialObra.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                slcMaterial.setSelectedItem(material.getDescripcion());
                slcObra.setSelectedItem(obra.getPK_ID());
                txtCantidad.setText(String.valueOf(materialParaObra.getCantidadMaterial()));
                slcAdministrativo.setSelectedItem(jefeDeObra.getUsuario());
                slcJefeObra.setSelectedItem(jefeDeObra.getUsuario());
                txtCoste.setText(String.valueOf(materialParaObra.getCoste()));
                jxFechaSolicitud.setDate(materialParaObra.getFechaSolicitud());
                jxFechaRecepcion.setDate(materialParaObra.getFechaRecepcion());
        
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
            java.util.logging.Logger.getLogger(FrmMaterialObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMaterialObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMaterialObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMaterialObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new FrmMaterialObra().setVisible(true);
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private org.jdesktop.swingx.JXDatePicker jxFechaRecepcion;
    private org.jdesktop.swingx.JXDatePicker jxFechaSolicitud;
    private javax.swing.JComboBox<String> slcAdministrativo;
    private javax.swing.JComboBox<String> slcJefeObra;
    private javax.swing.JComboBox<String> slcMaterial;
    private javax.swing.JComboBox<String> slcObra;
    private javax.swing.JTable tblMaterialObra;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCoste;
    // End of variables declaration//GEN-END:variables
    ArrayList <MaterialParaObra> materialesObras = new ArrayList<>();
    ArrayList <AdministrativoObra> administrativosObras = new ArrayList<>();
    ArrayList <Material> materiales = new ArrayList<>();
    ArrayList <Persona> personas = new ArrayList<>();
    ArrayList <Obra> obras = new ArrayList<>();
    ArrayList <JefeDeObra> jefesObras = new ArrayList<>();

}
