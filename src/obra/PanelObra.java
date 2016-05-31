/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obra;

import POJOS.Obra;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static gestioneconomicaconstructora.OpcionesDeMenu.*;

/**
 *
 * @author Tiburcio
 */
public class PanelObra extends javax.swing.JPanel {

    int menuActual;
    DefaultTableModel modelo;
    /**
     * Creates new form panelObra
     */
    public PanelObra(int menuActual) {
        initComponents();


        this.menuActual = menuActual;

        deshabilitar();
        llenar();

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
        if(menuActual == MNU_INTRODUCIR_PRESUPUESTO){
            txtPresupuestoTotalEjecucion.setEnabled(true);
            txtEstimacionCosteMateriales.setEnabled(true);
            txtEstimacionCosteManoDeObra.setEnabled(true);
            txtEstimacionGastosGenerales.setEnabled(true);
            txtEstimacionBeneficioIndustrial.setEnabled(true);
            txtPorcentajeDeObraEjecutado.setEnabled(true);
        }
        if(menuActual == MNU_INTRODUCIR_CANTIDAD_COBRADA){
            txtCantidadCobrada.setEnabled(true);
        }
        if(menuActual == MNU_INTRODUCIR_CANTIDAD_FACTURADA){
            txtCantidadFacturada.setEnabled(true);
        }

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
        String titulos[] = {"ID", "FechaInicio", "FechaFin", "Direccion", "PresupuestoTotalEjecucion",
            "EstimacionCosteMateriales", "EstimacionCosteManoDeObra", "EstimacionGastosGenerales", "EstimacionBeneficioIndustrial",
            "PorcentajeDeObraEjecutado", "CantidadCobrada", "CantidadFacturada"};
        modelo = new DefaultTableModel(null, titulos);

        String fila[] = new String[12];
        ArrayList<Obra> obras = new ArrayList<>();
        try {
            obras = dba.ObraDba.getObras();
        } catch (SQLException ex) {
            Logger.getLogger(FrmObra.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (Obra obra : obras) {
            fila[0] = String.valueOf(obra.getPK_ID());
            fila[1] = obra.getFechaInicio().toString();
            fila[2] = obra.getFechaFin().toString();
            fila[3] = obra.getDireccion();
            fila[4] = String.valueOf(obra.getPresupuestoTotalEjecucion());
            fila[5] = String.valueOf(obra.getEstimacionCosteMateriales());
            fila[6] = String.valueOf(obra.getEstimacionCosteManoDeObra());
            fila[7] = String.valueOf(obra.getEstimacionGastosGenerales());
            fila[8] = String.valueOf(obra.getEstimacionBeneficioIndustrial());
            fila[9] = String.valueOf(obra.getPorcentajeDeObraEjecutado());
            fila[10] = String.valueOf(obra.getCantidadCobrada());
            fila[11] = String.valueOf(obra.getCantidadFacturada());

            modelo.addRow(fila);
        }

        tblObras.setModel(modelo);
    }

    public void nuevo() {
        Obra obra = new Obra();

        try {
            obra.setFechaInicio(jXDatePickerFechaInicio.getDate());
            obra.setFechaFin(jXDatePickerFechaFin.getDate());
            obra.setDireccion(txtDireccion.getText());
            obra.setPresupuestoTotalEjecucion(Float.parseFloat(txtPresupuestoTotalEjecucion.getText()));
            obra.setEstimacionCosteMateriales(Float.parseFloat(txtEstimacionCosteMateriales.getText()));
            obra.setEstimacionCosteManoDeObra(Float.parseFloat(txtEstimacionCosteManoDeObra.getText()));
            obra.setEstimacionGastosGenerales(Float.parseFloat(txtEstimacionGastosGenerales.getText()));
            obra.setEstimacionBeneficioIndustrial(Float.parseFloat(txtEstimacionBeneficioIndustrial.getText()));
            obra.setPorcentajeDeObraEjecutado(Float.parseFloat(txtPorcentajeDeObraEjecutado.getText()));
            obra.setCantidadCobrada(Float.parseFloat(txtCantidadCobrada.getText()));
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

        Obra obra = new Obra();

        try {
            obra.setPK_ID(Integer.parseInt(identificador));
            obra.setFechaInicio(jXDatePickerFechaInicio.getDate());
            obra.setFechaFin(jXDatePickerFechaFin.getDate());
            obra.setDireccion(txtDireccion.getText());
            obra.setPresupuestoTotalEjecucion(Float.parseFloat(txtPresupuestoTotalEjecucion.getText()));
            obra.setEstimacionCosteMateriales(Float.parseFloat(txtEstimacionCosteMateriales.getText()));
            obra.setEstimacionCosteManoDeObra(Float.parseFloat(txtEstimacionCosteManoDeObra.getText()));
            obra.setEstimacionGastosGenerales(Float.parseFloat(txtEstimacionGastosGenerales.getText()));
            obra.setEstimacionBeneficioIndustrial(Float.parseFloat(txtEstimacionBeneficioIndustrial.getText()));
            obra.setPorcentajeDeObraEjecutado(Float.parseFloat(txtPorcentajeDeObraEjecutado.getText()));
            obra.setCantidadCobrada(Float.parseFloat(txtCantidadCobrada.getText()));
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



        jComboBox1 = new javax.swing.JComboBox<>();

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



        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));


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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiar();
        habilitar();
    }//GEN-LAST:event_btnNuevoActionPerformed

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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        nuevo();
        deshabilitar();
        llenar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tblObrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblObrasMouseClicked
        if (evt.getButton() == 1) {
            int fila = tblObras.getSelectedRow();
            Obra obra = new Obra();
            try {
                obra = dba.ObraDba.getObra(Integer.parseInt(String.valueOf(tblObras.getValueAt(fila, 0))));
            } catch (SQLException ex) {
                Logger.getLogger(FrmObra.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                jXDatePickerFechaInicio.setDate(obra.getFechaInicio());
                jXDatePickerFechaFin.setDate(obra.getFechaFin());
                txtDireccion.setText(obra.getDireccion());
                txtPresupuestoTotalEjecucion.setText(String.valueOf(obra.getPresupuestoTotalEjecucion()));
                txtEstimacionCosteMateriales.setText(String.valueOf(obra.getEstimacionCosteMateriales()));
                txtEstimacionCosteManoDeObra.setText(String.valueOf(obra.getEstimacionCosteManoDeObra()));
                txtEstimacionGastosGenerales.setText(String.valueOf(obra.getEstimacionGastosGenerales()));
                txtEstimacionBeneficioIndustrial.setText(String.valueOf(obra.getEstimacionBeneficioIndustrial()));
                txtPorcentajeDeObraEjecutado.setText(String.valueOf(obra.getPorcentajeDeObraEjecutado()));
                txtCantidadCobrada.setText(String.valueOf(obra.getCantidadCobrada()));
                txtCantidadFacturada.setText(String.valueOf(obra.getCantidadFacturada()));

                habilitar();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido leer la información en la BD");
            }
        }
    }//GEN-LAST:event_tblObrasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;

    private javax.swing.JComboBox<String> jComboBox1;

    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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