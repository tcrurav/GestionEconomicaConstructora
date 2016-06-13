/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obra;

import POJOS.Maquiaria;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import login.FrmMain;

/**
 *
 * @author Tiburcio
 */
public class FrmObra extends javax.swing.JFrame {

    DefaultTableModel modelo;

    /**
     * Creates new form Formulario
     */
    public FrmObra() {
        initComponents();
        deshabilitar();
        llenar();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void limpiar() {
        final Calendar instance = Calendar.getInstance();
        jXDatePickerFechaInicio.setDate(instance.getTime());
        jXDatePickerFechaFin.setDate(instance.getTime());
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

    public void habilitar() {
        jXDatePickerFechaInicio.setEnabled(true);
        jXDatePickerFechaFin.setEnabled(true);
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

    public void deshabilitar() {
        jXDatePickerFechaInicio.setEnabled(false);
        jXDatePickerFechaFin.setEnabled(false);
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

    public void llenar() {
        String titulos[] = {"ID", "FechaInicio", "FechaFin", "Nombre", "Cod_Inventario",
            "PrecioDeCompra", "EstimacionCosteManoDeObra","CantidadFacturada"};
        modelo = new DefaultTableModel(null, titulos);

        String fila[] = new String[12];
        ArrayList<Maquiaria> obras = new ArrayList<>();
        try {
            obras = dba.ObraDba.getObras();
        } catch (SQLException ex) {
            Logger.getLogger(FrmObra.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (Maquiaria obra : obras) {
            fila[0] = String.valueOf(obra.getPK_ID());
            fila[1] = obra.getFechaInicio().toString();
            fila[2] = obra.getFechaFin().toString();
            fila[3] = obra.getNombre();
            fila[4] = String.valueOf(obra.getCodInventario());
            fila[5] = String.valueOf(obra.getPrecioDeCompra());
            fila[6] = String.valueOf(obra.getCantidadFacturada());

            modelo.addRow(fila);
        }

        tblObras.setModel(modelo);
    }

    public void nuevo() {
        Maquiaria obra = new Maquiaria();

        try {
            obra.setFechaInicio(jXDatePickerFechaInicio.getDate());
            obra.setFechaFin(jXDatePickerFechaFin.getDate());
            obra.setNombre(txtDireccion.getText());
            obra.setCod_Inventario(Float.parseFloat(txtPresupuestoTotalEjecucion.getText()));
            obra.setPrecioDeCompra(Float.parseFloat(txtCantidadCobrada.getText()));
            obra.setCantidadFacturada(Float.parseFloat(txtCantidadFacturada.getText()));

            if (dba.ObraDba.insertObra(obra)) {
                JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente.");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Se ha producido un Error. Error:" + ex.getMessage());
        }

    }

    public void modificar() {
        int fila = tblObras.getSelectedRow();
        String identificador = (String) tblObras.getValueAt(fila, 0);

        Maquiaria obra = new Maquiaria();

        try {
            obra.setPK_ID(Integer.parseInt(identificador));
            obra.setFechaInicio(jXDatePickerFechaInicio.getDate());
            obra.setFechaFin(jXDatePickerFechaFin.getDate());
            obra.setNombre(txtDireccion.getText());
            obra.setCod_Inventario(Float.parseFloat(txtPresupuestoTotalEjecucion.getText()));
            obra.setPrecioDeCompra(Float.parseFloat(txtCantidadCobrada.getText()));
            obra.setCantidadFacturada(Float.parseFloat(txtCantidadFacturada.getText()));

            if (dba.ObraDba.updateObra(obra)) {
                JOptionPane.showMessageDialog(null, "Datos Modificados");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }

    }

    public void borrar() {
        int fila = tblObras.getSelectedRow();
        String identificador = (String) tblObras.getValueAt(fila, 0);

        try {

            if (dba.ObraDba.deleteObra(Integer.valueOf(identificador))) {
                JOptionPane.showMessageDialog(null, "Datos Borrados");
            }

        } catch (Exception ex) {
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
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
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
        jXDatePickerFechaInicio = new org.jdesktop.swingx.JXDatePicker();
        jXDatePickerFechaFin = new org.jdesktop.swingx.JXDatePicker();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblObras = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestión de Obras"));

        jLabel3.setText("Fecha de Inicio:");

        jLabel4.setText("Fecha de Fin:");

        jLabel5.setText("Dirección:");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 326, Short.MAX_VALUE)
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
                            .addComponent(txtPresupuestoTotalEjecucion)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(jXDatePickerFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jXDatePickerFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jXDatePickerFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jXDatePickerFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void tblObrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblObrasMouseClicked
        if (evt.getButton() == 1) {
            int fila = tblObras.getSelectedRow();
            Maquiaria obra = new Maquiaria();
            try {
                obra = dba.ObraDba.getObra(Integer.parseInt(String.valueOf(tblObras.getValueAt(fila, 0))));
            } catch (SQLException ex) {
                Logger.getLogger(FrmObra.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                jXDatePickerFechaInicio.setDate(obra.getFechaInicio());
                jXDatePickerFechaFin.setDate(obra.getFechaFin());
                txtDireccion.setText(obra.getNombre());
                txtPresupuestoTotalEjecucion.setText(String.valueOf(obra.getCodInventario()));
                txtCantidadCobrada.setText(String.valueOf(obra.getPrecioDeCompra()));
                txtCantidadFacturada.setText(String.valueOf(obra.getCantidadFacturada()));

                habilitar();

            } catch (Exception ex) {
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

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        FrmMain frmMain = new FrmMain();
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(FrmObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmObra().setVisible(true);
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXDatePicker jXDatePickerFechaFin;
    private org.jdesktop.swingx.JXDatePicker jXDatePickerFechaInicio;
    private javax.swing.JTable tblObras;
    private javax.swing.JTextField txtCantidadCobrada;
    private javax.swing.JTextField txtCantidadFacturada;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEstimacionBeneficioIndustrial;
    private javax.swing.JTextField txtEstimacionCosteManoDeObra;
    private javax.swing.JTextField txtEstimacionCosteMateriales;
    private javax.swing.JTextField txtEstimacionGastosGenerales;
    private javax.swing.JTextField txtPorcentajeDeObraEjecutado;
    private javax.swing.JTextField txtPresupuestoTotalEjecucion;
    // End of variables declaration//GEN-END:variables
}
