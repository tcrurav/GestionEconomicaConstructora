/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obra;

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
 * @author Tiburcio
 */
public class ObraFormulario extends javax.swing.JFrame {
    
    Connection conn;
    DefaultTableModel modelo;
    Statement sentencia;
    /**
     * Creates new form Formulario
     */
    public ObraFormulario() {
        initComponents();
        conn = MySQL.getConnection();
        deshabilitar();
        llenar();
    }
    
    public void limpiar(){
        txtFechaInicio.setText("");
        txtFechaFin.setText("");
        txtDireccion.setText("");
        txtPresupuestoTotalEjecucion.setText("");
        txtEstimacionCosteMateriales.setText("");
        txtEstimacionCosteManoDeObra.setText("");
        txtEstimacionGastosGenerales.setText("");
        txtEstimacionBeneficioIndustrial.setText("");
        txtPorcentajeDeObraEjecutado.setText("");
        txtCantidadCobrada.setText("");
        txtCantidadFacturada.setText("");
    }
    
    public void habilitar(){
        txtFechaInicio.setEnabled(true);
        txtFechaFin.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtPresupuestoTotalEjecucion.setEnabled(true);
        txtEstimacionCosteMateriales.setEnabled(true);
        txtEstimacionCosteManoDeObra.setEnabled(true);
        txtEstimacionGastosGenerales.setEnabled(true);
        txtEstimacionBeneficioIndustrial.setEnabled(true);
        txtPorcentajeDeObraEjecutado.setEnabled(true);
        txtCantidadCobrada.setEnabled(true);
        txtCantidadFacturada.setEnabled(true);
    }
    
    public void deshabilitar(){
        txtFechaInicio.setEnabled(false);
        txtFechaFin.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtPresupuestoTotalEjecucion.setEnabled(false);
        txtEstimacionCosteMateriales.setEnabled(false);
        txtEstimacionCosteManoDeObra.setEnabled(false);
        txtEstimacionGastosGenerales.setEnabled(false);
        txtEstimacionBeneficioIndustrial.setEnabled(false);
        txtPorcentajeDeObraEjecutado.setEnabled(false);
        txtCantidadCobrada.setEnabled(false);
        txtCantidadFacturada.setEnabled(false);
        
    }
    
    public void llenar(){
        conn = MySQL.getConnection();
        String titulos[] = {"id","fechaInicio","fechaFin","direccion","presupuestoTotalEjecucion",
            "estimacionCosteMateriales","estimacionCosteManoDeObra","estimacionGastosGenerales","estimacionBeneficioIndustrial",
            "porcentajeDeObraEjecutado","cantidadCobrada","cantidadFacturada"};
        String sql = "select * from obras";
        modelo = new DefaultTableModel(null, titulos);
        
        try {
            sentencia = conn.createStatement();
            ResultSet rs = sentencia.executeQuery(sql);
            
            String fila[] = new String[12];
            
            while(rs.next()){
                fila[0] = rs.getString("id");
                fila[1] = rs.getString("fechaInicio");
                fila[2] = rs.getString("fechaFin");
                fila[3] = rs.getString("direccion");
                fila[4] = String.valueOf(rs.getFloat("presupuestoTotalEjecucion"));
                fila[5] = String.valueOf(rs.getFloat("estimacionCosteMateriales"));
                fila[6] = String.valueOf(rs.getFloat("estimacionCosteManoDeObra"));
                fila[7] = String.valueOf(rs.getFloat("estimacionGastosGenerales"));
                fila[8] = String.valueOf(rs.getFloat("estimacionBeneficioIndustrial"));
                fila[9] = String.valueOf(rs.getFloat("porcentajeDeObraEjecutado"));
                fila[10] = String.valueOf(rs.getFloat("cantidadCobrada"));
                fila[11] = String.valueOf(rs.getFloat("cantidadFacturada"));                
                
                modelo.addRow(fila);
            }
            
            tblObras.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(ObraFormulario.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }
    
    
    
    public void nuevo(){
        String sql = "insert into obras (fechaInicio, fechaFin, direccion, " 
                + "presupuestoTotalEjecucion, estimacionCosteMateriales, estimacionCosteManoDeObra, " 
                + "estimacionGastosGenerales, estimacionBeneficioIndustrial, "
                + "porcentajeDeObraEjecutado, cantidadCobrada, cantidadFacturada) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, txtFechaInicio.getText());
            ps.setString(2, txtFechaFin.getText());
            ps.setString(3, txtDireccion.getText());
            ps.setFloat(4, Float.parseFloat(txtPresupuestoTotalEjecucion.getText()));
            ps.setFloat(5, Float.parseFloat(txtEstimacionCosteMateriales.getText()));
            ps.setFloat(6, Float.parseFloat(txtEstimacionCosteManoDeObra.getText()));
            ps.setFloat(7, Float.parseFloat(txtEstimacionGastosGenerales.getText()));
            ps.setFloat(8, Float.parseFloat(txtEstimacionBeneficioIndustrial.getText()));
            ps.setFloat(9, Float.parseFloat(txtPorcentajeDeObraEjecutado.getText()));
            ps.setFloat(10, Float.parseFloat(txtCantidadCobrada.getText()));
            ps.setFloat(11, Float.parseFloat(txtCantidadFacturada.getText()));
            int n = ps.executeUpdate();
            
            if(n>0){
                JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente.");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se ha producido un Error. Error:" + ex.getMessage());
        }
        
    }
    
    public void modificar(){
        int fila = tblObras.getSelectedRow();
        String identificador = (String)tblObras.getValueAt(fila, 0);
        String sql = "update obras set fechaInicio=?, fechaFin=?, direccion=?, " 
                + "presupuestoTotalEjecucion=?, estimacionCosteMateriales=?, estimacionCosteManoDeObra=?, " 
                + "estimacionGastosGenerales=?, estimacionBeneficioIndustrial=?, "
                + "porcentajeDeObraEjecutado=?, cantidadCobrada=?, cantidadFacturada=?"
                +" where id=" + identificador;
        PreparedStatement ps;
        try {
            ps = conn.prepareCall(sql);
            ps.setString(1, txtFechaInicio.getText());
            ps.setString(2, txtFechaFin.getText());
            ps.setString(3, txtDireccion.getText());
            ps.setFloat(4, Float.parseFloat(txtPresupuestoTotalEjecucion.getText()));
            ps.setFloat(5, Float.parseFloat(txtEstimacionCosteMateriales.getText()));
            ps.setFloat(6, Float.parseFloat(txtEstimacionCosteManoDeObra.getText()));
            ps.setFloat(7, Float.parseFloat(txtEstimacionGastosGenerales.getText()));
            ps.setFloat(8, Float.parseFloat(txtEstimacionBeneficioIndustrial.getText()));
            ps.setFloat(9, Float.parseFloat(txtPorcentajeDeObraEjecutado.getText()));
            ps.setFloat(10, Float.parseFloat(txtCantidadCobrada.getText()));
            ps.setFloat(11, Float.parseFloat(txtCantidadFacturada.getText()));
            
            int n = ps.executeUpdate();
            
            if(n>0){
                JOptionPane.showMessageDialog(null, "Datos Modificados");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }        
    }

    public void borrar(){
        int fila = tblObras.getSelectedRow();
        String identificador = (String)tblObras.getValueAt(fila, 0);
        String sql = "delete from obras where id=" + identificador;
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
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblObras = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFechaInicio = new javax.swing.JTextField();
        txtFechaFin = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtPresupuestoTotalEjecucion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEstimacionCosteMateriales = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEstimacionCosteManoDeObra = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEstimacionGastosGenerales = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEstimacionBeneficioIndustrial = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPorcentajeDeObraEjecutado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCantidadCobrada = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCantidadFacturada = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblObras.setModel(new javax.swing.table.DefaultTableModel(
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
        tblObras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblObrasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblObras);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestión de Obras"));

        jLabel3.setText("Fecha de Inicio:");

        jLabel4.setText("Fecha de Fin:");

        jLabel5.setText("Dirección:");

        txtFechaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaInicioActionPerformed(evt);
            }
        });

        txtFechaFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaFinActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel6.setText("presupuestoTotalEjecucion:");

        jLabel7.setText("estimacionCosteMateriales:");

        jLabel8.setText("estimacionCosteManoDeObra:");

        jLabel9.setText("estimacionGastosGenerales:");

        jLabel10.setText("estimacionBeneficioIndustrial:");

        jLabel11.setText("porcentajeDeObraEjecutado:");

        jLabel12.setText("cantidadCobrada:");

        jLabel13.setText("cantidadFacturada:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCantidadFacturada)
                            .addComponent(txtCantidadCobrada)
                            .addComponent(txtPorcentajeDeObraEjecutado)
                            .addComponent(txtEstimacionBeneficioIndustrial)
                            .addComponent(txtEstimacionGastosGenerales)
                            .addComponent(txtEstimacionCosteManoDeObra)
                            .addComponent(txtEstimacionCosteMateriales)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDireccion)
                                    .addComponent(txtFechaFin)
                                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 305, Short.MAX_VALUE))
                            .addComponent(txtPresupuestoTotalEjecucion))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPresupuestoTotalEjecucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEstimacionCosteMateriales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEstimacionCosteManoDeObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtEstimacionGastosGenerales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtEstimacionBeneficioIndustrial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtPorcentajeDeObraEjecutado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCantidadCobrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtCantidadFacturada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnModificar)
                    .addComponent(btnBorrar)
                    .addComponent(btnGuardar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaInicioActionPerformed

    private void txtFechaFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaFinActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiar();
        habilitar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        nuevo();
        deshabilitar();
        llenar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tblObrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblObrasMouseClicked
        if (evt.getButton()==1){           
                int fila = tblObras.getSelectedRow();              
                String sql = "Select * from obras where id=" + tblObras.getValueAt(fila, 0);
                //JOptionPane.showMessageDialog(null, sql);
            try {
                sentencia = conn.createStatement();
                ResultSet rs = sentencia.executeQuery(sql);
                rs.next();
                
                txtFechaInicio.setText(rs.getString("fechaInicio"));
                txtFechaFin.setText(rs.getString("fechaFin"));
                txtDireccion.setText(rs.getString("direccion"));
                txtPresupuestoTotalEjecucion.setText(rs.getString("PresupuestoTotalEjecucion"));
                txtEstimacionCosteMateriales.setText(rs.getString("estimacionCosteMateriales"));
                txtEstimacionCosteManoDeObra.setText(rs.getString("estimacionCosteManoDeObra"));
                txtEstimacionGastosGenerales.setText(rs.getString("estimacionGastosGenerales"));
                txtEstimacionBeneficioIndustrial.setText(rs.getString("estimacionBeneficioIndustrial"));
                txtPorcentajeDeObraEjecutado.setText(rs.getString("porcentajeDeObraEjecutado"));
                txtCantidadCobrada.setText(rs.getString("cantidadCobrada"));
                txtCantidadFacturada.setText(rs.getString("cantidadFacturada"));
                
                habilitar();
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido leer la información en la BD");
            }
        }
    }//GEN-LAST:event_tblObrasMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificar();
        limpiar();
        deshabilitar();
        llenar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        borrar();
        limpiar();
        deshabilitar();
        llenar();
    }//GEN-LAST:event_btnBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(ObraFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ObraFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ObraFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ObraFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ObraFormulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblObras;
    private javax.swing.JTextField txtCantidadCobrada;
    private javax.swing.JTextField txtCantidadFacturada;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEstimacionBeneficioIndustrial;
    private javax.swing.JTextField txtEstimacionCosteManoDeObra;
    private javax.swing.JTextField txtEstimacionCosteMateriales;
    private javax.swing.JTextField txtEstimacionGastosGenerales;
    private javax.swing.JTextField txtFechaFin;
    private javax.swing.JTextField txtFechaInicio;
    private javax.swing.JTextField txtPorcentajeDeObraEjecutado;
    private javax.swing.JTextField txtPresupuestoTotalEjecucion;
    // End of variables declaration//GEN-END:variables
}
