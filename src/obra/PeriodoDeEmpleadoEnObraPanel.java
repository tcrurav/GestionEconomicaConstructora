/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obra;

import POJOS.AdministrativoManoDeObra;
import POJOS.Obra;
import POJOS.PeriodoEmpleadoEnObra;
import POJOS.Persona;
import dba.ObraDba;
import dba.PersonaDba;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static gestioneconomicaconstructora.OpcionesDeMenu.*;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Tiburcio
 */
public class PeriodoDeEmpleadoEnObraPanel extends javax.swing.JPanel {

    int menuActual;
    DefaultTableModel modelo;
    /**
     * Creates new form panelObra
     */
    public PeriodoDeEmpleadoEnObraPanel(int menuActual) {
        initComponents();
        
        this.menuActual = menuActual;
        
        llenarComboBox();
        deshabilitar();
        llenar();
        
    }
    
    public void llenarComboBox(){
        ArrayList<Persona> personas = null;
        ArrayList<Obra> obras = null;
        try {
            personas = dba.PersonaDba.getPersonas();
            obras = dba.ObraDba.getObras();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        DefaultComboBoxModel model1 = new DefaultComboBoxModel();
        for(Persona p: personas){
           model1.addElement(p.getNombre());
        }
        jComboBoxEmpleado.setModel(model1);
        DefaultComboBoxModel model2 = new DefaultComboBoxModel();
        for(Persona p: personas){
           model2.addElement(p.getNombre());
        }
        jComboBoxJefeDeObra.setModel(model2);
        DefaultComboBoxModel model3 = new DefaultComboBoxModel();
        for(Persona p: personas){
           model3.addElement(p.getNombre());
        }
        jComboBoxAdministrativoAsignado.setModel(model3);
        DefaultComboBoxModel modelObra = new DefaultComboBoxModel();
        for(Obra o: obras){
           modelObra.addElement(o.getPK_ID());
        }
        jComboBoxObra.setModel(modelObra);
    }

    

    public void limpiar() {
        final Calendar instance = Calendar.getInstance();
        jXDatePickerFechaInicio.setDate(instance.getTime());
        jXDatePickerFechaFin.setDate(instance.getTime());
        jXDatePickerFechaSolicitud.setDate(instance.getTime());
        jComboBoxAdministrativoAsignado.setSelectedIndex(0);
        jComboBoxEmpleado.setSelectedIndex(0);
        jComboBoxJefeDeObra.setSelectedIndex(0);
        jComboBoxObra.setSelectedIndex(0);
        txtCoste.setText("0");
    }

    public void habilitar() {
        jXDatePickerFechaInicio.setEnabled(true);
        jXDatePickerFechaFin.setEnabled(true);
        jXDatePickerFechaSolicitud.setEnabled(true);
        jComboBoxAdministrativoAsignado.setEnabled(true);
        jComboBoxEmpleado.setEnabled(true);
        jComboBoxJefeDeObra.setEnabled(true);
        jComboBoxObra.setEnabled(true);
        txtCoste.setEnabled(true);
    }

    public void deshabilitar() {
        jXDatePickerFechaInicio.setEnabled(false);
        jXDatePickerFechaFin.setEnabled(false);
        jXDatePickerFechaSolicitud.setEnabled(false);
        jComboBoxAdministrativoAsignado.setEnabled(false);
        jComboBoxEmpleado.setEnabled(false);
        jComboBoxJefeDeObra.setEnabled(false);
        jComboBoxObra.setEnabled(false);
        txtCoste.setEnabled(false);
    }

    public void llenar() {
        String titulos[] = { "Id","JefeDeObra", "AdministrativoAsignado", "FechaDeInicio", "FechaDeFin",
            "Coste", "FechaDeSolicitud", "Obra",
            "Empleado"};
        modelo = new DefaultTableModel(null, titulos);

        String fila[] = new String[9];
        ArrayList<PeriodoEmpleadoEnObra> periodoEmpleadoEnObras = new ArrayList<>();
        try {
            periodoEmpleadoEnObras = dba.ObraDba.getPeriodoDeEmpleadoEnObras();
        } catch (SQLException ex) {
            Logger.getLogger(FrmObra.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (PeriodoEmpleadoEnObra periodoEmpleadoEnObra : periodoEmpleadoEnObras) {
            fila[0] = String.valueOf(periodoEmpleadoEnObra.getId());
            fila[1] = String.valueOf(periodoEmpleadoEnObra.getJefeDeObra().getNombre());
            fila[2] = String.valueOf(periodoEmpleadoEnObra.getAdministrativoManoObra().getNombre());
            fila[3] = periodoEmpleadoEnObra.getFechaInicio().toString();
            fila[4] = periodoEmpleadoEnObra.getFechaFin().toString();
            fila[5] = String.valueOf(periodoEmpleadoEnObra.getCoste());
            fila[6] = periodoEmpleadoEnObra.getFechaSolicitud().toString();
            fila[7] = String.valueOf(periodoEmpleadoEnObra.getObra().getPK_ID());
            fila[8] = String.valueOf(periodoEmpleadoEnObra.getEmpleado().getNombre());
            modelo.addRow(fila);
        }

        tblObras.setModel(modelo);
    }

    public void nuevo() {
        PeriodoEmpleadoEnObra periodoEmpleadoEnObra = new PeriodoEmpleadoEnObra();

        try {
            periodoEmpleadoEnObra.setFechaInicio(jXDatePickerFechaInicio.getDate());
            periodoEmpleadoEnObra.setFechaFin(jXDatePickerFechaFin.getDate());
            periodoEmpleadoEnObra.setFechaSolicitud(jXDatePickerFechaSolicitud.getDate());
            periodoEmpleadoEnObra.setCoste(Float.parseFloat(txtCoste.getText()));
            periodoEmpleadoEnObra.setAdministrativoManoObra(dba.PersonaDba.getAdministrativoManoDeObra((String) jComboBoxAdministrativoAsignado.getSelectedItem()));
            periodoEmpleadoEnObra.setEmpleado(dba.PersonaDba.getEmpleadoObra((String) jComboBoxEmpleado.getSelectedItem()));
            periodoEmpleadoEnObra.setJefeDeObra(dba.PersonaDba.getJefeDeObra((String) jComboBoxJefeDeObra.getSelectedItem()));
            periodoEmpleadoEnObra.setObra(dba.ObraDba.getObra((int) jComboBoxObra.getSelectedItem())); 

            if (dba.ObraDba.insertPeriodoDeEmpleadoEnObra(periodoEmpleadoEnObra)) {
                JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente.");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Se ha producido un Errorjaja. Error:" + ex.getMessage());
        }

    }

    public void modificar() {
        int fila = tblObras.getSelectedRow();
        String identificador = (String) tblObras.getValueAt(fila, 0);

        PeriodoEmpleadoEnObra periodoEmpleadoEnObra = new PeriodoEmpleadoEnObra();

        try {
            periodoEmpleadoEnObra.setId(Integer.parseInt(identificador));
            periodoEmpleadoEnObra.setFechaInicio(jXDatePickerFechaInicio.getDate());
            periodoEmpleadoEnObra.setFechaFin(jXDatePickerFechaFin.getDate());
            periodoEmpleadoEnObra.setFechaSolicitud(jXDatePickerFechaSolicitud.getDate());
            periodoEmpleadoEnObra.setCoste(Float.parseFloat(txtCoste.getText()));
            periodoEmpleadoEnObra.setAdministrativoManoObra(dba.PersonaDba.getAdministrativoManoDeObra((String) jComboBoxAdministrativoAsignado.getSelectedItem()));
            periodoEmpleadoEnObra.setEmpleado(dba.PersonaDba.getEmpleadoObra((String) jComboBoxEmpleado.getSelectedItem()));
            periodoEmpleadoEnObra.setJefeDeObra(dba.PersonaDba.getJefeDeObra((String) jComboBoxJefeDeObra.getSelectedItem()));
            periodoEmpleadoEnObra.setObra(dba.ObraDba.getObra((int) jComboBoxObra.getSelectedItem()));

            if (dba.ObraDba.updatePeriodoEmpleadoEnObra(periodoEmpleadoEnObra)) {
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

            if (dba.ObraDba.deletePeriodoDeEmpleadoEnObra(Integer.valueOf(identificador))) {
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

        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCoste = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jXDatePickerFechaInicio = new org.jdesktop.swingx.JXDatePicker();
        jXDatePickerFechaFin = new org.jdesktop.swingx.JXDatePicker();
        jComboBoxJefeDeObra = new javax.swing.JComboBox();
        jComboBoxAdministrativoAsignado = new javax.swing.JComboBox();
        jComboBoxObra = new javax.swing.JComboBox();
        jComboBoxEmpleado = new javax.swing.JComboBox();
        jXDatePickerFechaSolicitud = new org.jdesktop.swingx.JXDatePicker();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblObras = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestión de Obras"));

        jLabel3.setText("Fecha de Inicio:");

        jLabel4.setText("Fecha de Fin:");

        jLabel5.setText("Jefe de obra:");

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

        jLabel6.setText("Administrativo asignado:");

        jLabel7.setText("obra:");

        jLabel8.setText("Empleado");

        jLabel9.setText("Coste::");

        jLabel13.setText("Fecha de Solicitud:");

        jComboBoxJefeDeObra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxAdministrativoAsignado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxObra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxEmpleado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCoste)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBoxJefeDeObra, 0, 439, Short.MAX_VALUE)
                                            .addComponent(jComboBoxAdministrativoAsignado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBoxObra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 15, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jXDatePickerFechaSolicitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jXDatePickerFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                    .addComponent(jXDatePickerFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jXDatePickerFechaSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxJefeDeObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxAdministrativoAsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCoste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
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

    private void tblObrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblObrasMouseClicked
        if (evt.getButton() == 1) {
            int fila = tblObras.getSelectedRow();
            PeriodoEmpleadoEnObra periodoEmpleadoEnObra = new PeriodoEmpleadoEnObra();
            try {
                periodoEmpleadoEnObra = dba.ObraDba.getPeriodoDeEmpleadoEnObra(Integer.parseInt(String.valueOf(tblObras.getValueAt(fila, 0))));
            } catch (SQLException ex) {
                Logger.getLogger(FrmObra.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                jXDatePickerFechaInicio.setDate(periodoEmpleadoEnObra.getFechaInicio());
                jXDatePickerFechaFin.setDate(periodoEmpleadoEnObra.getFechaFin());
                jXDatePickerFechaSolicitud.setDate(periodoEmpleadoEnObra.getFechaSolicitud());
                jComboBoxAdministrativoAsignado.setSelectedItem(periodoEmpleadoEnObra.getAdministrativoManoObra().getNombre());
                jComboBoxEmpleado.setSelectedItem(periodoEmpleadoEnObra.getEmpleado().getNombre());
                jComboBoxJefeDeObra.setSelectedItem(periodoEmpleadoEnObra.getJefeDeObra().getNombre());
                jComboBoxObra.setSelectedItem(periodoEmpleadoEnObra.getObra().getPK_ID());
                txtCoste.setText(String.valueOf(periodoEmpleadoEnObra.getCoste()));
                habilitar();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido leer la información en la BD");
            }
        }
    }//GEN-LAST:event_tblObrasMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        nuevo();
        deshabilitar();
        llenar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        borrar();
        limpiar();
        deshabilitar();
        llenar();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificar();
        limpiar();
        deshabilitar();
        llenar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiar();
        habilitar();
    }//GEN-LAST:event_btnNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox jComboBoxAdministrativoAsignado;
    private javax.swing.JComboBox jComboBoxEmpleado;
    private javax.swing.JComboBox jComboBoxJefeDeObra;
    private javax.swing.JComboBox jComboBoxObra;
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
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private org.jdesktop.swingx.JXDatePicker jXDatePickerFechaFin;
    private org.jdesktop.swingx.JXDatePicker jXDatePickerFechaInicio;
    private org.jdesktop.swingx.JXDatePicker jXDatePickerFechaSolicitud;
    private javax.swing.JTable tblObras;
    private javax.swing.JTextField txtCoste;
    // End of variables declaration//GEN-END:variables

                      

}