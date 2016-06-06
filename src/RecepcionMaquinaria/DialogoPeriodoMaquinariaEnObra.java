/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecepcionMaquinaria;

import POJOS.EmpleadoAlmacen;
import POJOS.JefeDeObra;
import POJOS.Maquinaria;
import POJOS.Obra;
import POJOS.PeriodoMaquinariaEnObra;
import POJOS.Persona;
import dba.MaquinariaDba;
import dba.PersonaDba;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pablo
 */
public class DialogoPeriodoMaquinariaEnObra extends javax.swing.JDialog {
    ArrayList<JefeDeObra> jefesDeObra = new ArrayList<>();
    ArrayList<Obra> obras = new ArrayList<>();
    ArrayList<EmpleadoAlmacen> empleadosAlmacen = new ArrayList<>();
    ArrayList<Maquinaria> maquinarias = new ArrayList<>();
    /**
     * Creates new form DialogoObra
     */
    public DialogoPeriodoMaquinariaEnObra(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setTitle("Constructora - Obras");
        initComponents();
        deshabilitar();
        llenar();
        llenarCboObras();
        llenarCboMaquinaria();
        this.pack();      
        this.setLocationRelativeTo(null);
    }

    DefaultTableModel modelo;

    /**
     * Creates new form Formulario
     */

    public void limpiar() {
        final Calendar instance = Calendar.getInstance();
        jXDatePickerFechaInicio.setDate(instance.getTime());
        jXDatePickerFechaFin.setDate(instance.getTime());
        jXDatePickerFechaSolicitud.setDate(instance.getTime());
        jXDatePickerFechaRecepcion.setDate(instance.getTime());

    }

    public void habilitar() {
        jXDatePickerFechaInicio.setEnabled(true);
        jXDatePickerFechaFin.setEnabled(true);
        cboMaquinaria.setEnabled(true);
        jXDatePickerFechaSolicitud.setEnabled(true);
        jXDatePickerFechaRecepcion.setEnabled(true);
        cboJefeObra.setEnabled(true);
        cboEmpleadoAlmacen.setEnabled(true);
    }

    public void deshabilitar() {
        jXDatePickerFechaInicio.setEnabled(false);
        jXDatePickerFechaFin.setEnabled(false);
        cboMaquinaria.setEnabled(false);
        jXDatePickerFechaSolicitud.setEnabled(false);
        jXDatePickerFechaRecepcion.setEnabled(false);
        cboJefeObra.setEnabled(false);
        cboEmpleadoAlmacen.setEnabled(false);
    }

    public void llenarCboObras() {

        
        try {
            obras = dba.ObraDba.getObras();
        } catch (SQLException ex) {
            //Logger.getLogger(fPeriodoMaquinariaEnObra.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (Obra obra : obras) {  
            cboObra.addItem(obra);
        }

    }
    
    public void llenarCboMaquinaria() {

        
        try {
            maquinarias = dba.MaquinariaDba.getMaquinarias();
            
        } catch (SQLException ex) {
            //Logger.getLogger(fPeriodoMaquinariaEnObra.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        for (Maquinaria maquinaria : maquinarias) { 
            
            cboMaquinaria.addItem(maquinaria.getNombre());
        }
    }
    
    public void llenarCboJefeObra() {

        try {
            jefesDeObra = dba.PersonaDba.getJefesDeObra();
        } catch (SQLException ex) {
            //Logger.getLogger(fPeriodoMaquinariaEnObra.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (JefeDeObra jefeDeObra : jefesDeObra) {  
            cboJefeObra.addItem(jefeDeObra.getNombre() + " " + jefeDeObra.getApellidos());
        }
    }
    
    public void llenarCboEmpleadoAlmacen() {

        
        try {
            empleadosAlmacen = dba.PersonaDba.getEmpleadosAlmacen();
        } catch (SQLException ex) {
            //Logger.getLogger(fPeriodoMaquinariaEnObra.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (EmpleadoAlmacen empleadoAlmacen : empleadosAlmacen) {  
            cboEmpleadoAlmacen.addItem(empleadoAlmacen.getNombre() + " " + empleadoAlmacen.getApellidos());
        }
    }
    
    
    
    public void llenar(){
        String titulos [] = {"ID", "EmpleadoAlmacenQueAsignaID", "JefeDeObra", "FechaInicio", "FechaFin", "FechaSolicitud", "FechaRecepcion","Maquinaria", "Obra", "AdministrativoObra"  };
        modelo = new DefaultTableModel(null, titulos);
        
        String fila [] = new String [10];
        
        ArrayList<PeriodoMaquinariaEnObra> maquinarias = new ArrayList<>();
        
         try {
            maquinarias = dba.PeriodoMaquinariaEnObraDba.getPeriodoMaquinariasEnObra();
        } catch (SQLException ex) {
            Logger.getLogger(DialogoPeriodoMaquinariaEnObra.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (PeriodoMaquinariaEnObra periodomaquinariaenobra : maquinarias) {
            
           // fila[0] = String.valueOf(periodomaquinariaenobra.getID());
            fila[0] = String.valueOf(periodomaquinariaenobra.getPK_ID());
            fila[1] = periodomaquinariaenobra.getEmpleadoAlmacen().getNombre();
            fila[2] = periodomaquinariaenobra.getJefeDeObra().getNombre();
            fila[3] = periodomaquinariaenobra.getFechaInicio().toString();
            fila[4] = periodomaquinariaenobra.getFechaFin().toString();
            fila[5] = periodomaquinariaenobra.getFechaSolicitud().toString();
            fila[6] = periodomaquinariaenobra.getFechaRecepcion().toString();
            fila[7] = periodomaquinariaenobra.getMaquinaria().getNombre();
            fila[8] = periodomaquinariaenobra.getObra().getDireccion();
            

            modelo.addRow(fila);
        }

        tblPeriodoMaquinaria.setModel(modelo);
               
    }

    public void nuevo() {
        
        PeriodoMaquinariaEnObra periodoMaquinariaEnObra = new PeriodoMaquinariaEnObra(); 
        
        try {
            periodoMaquinariaEnObra.setFechaInicio(jXDatePickerFechaInicio.getDate());
            periodoMaquinariaEnObra.setFechaFin(jXDatePickerFechaFin.getDate());           
            periodoMaquinariaEnObra.setObra(obras.get(cboObra.getSelectedIndex()));
            periodoMaquinariaEnObra.setMaquinaria(maquinarias.get(cboMaquinaria.getSelectedIndex()));
            periodoMaquinariaEnObra.setFechaSolicitud(jXDatePickerFechaSolicitud.getDate());
            periodoMaquinariaEnObra.setFechaRecepcion(jXDatePickerFechaRecepcion.getDate());
            periodoMaquinariaEnObra.setJefeDeObra(jefesDeObra.get(cboJefeObra.getSelectedIndex()));
            periodoMaquinariaEnObra.setEmpleadoAlmacen(empleadosAlmacen.get(cboEmpleadoAlmacen.getSelectedIndex()));
            
            
            

            if (dba.PeriodoMaquinariaEnObraDba.insertPeriodoMaquinariaEnObra(periodoMaquinariaEnObra)) {
                JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente.");
            }

        } catch (Exception ex) {
           ex.printStackTrace();
        }

    }

    public void modificar() {
        int fila = tblPeriodoMaquinaria.getSelectedRow();
        String identificador = (String) tblPeriodoMaquinaria.getValueAt(fila, 0);

        PeriodoMaquinariaEnObra periodoMaquinariaEnObra = new PeriodoMaquinariaEnObra();

        try {
            periodoMaquinariaEnObra.setFechaInicio(jXDatePickerFechaInicio.getDate());
            periodoMaquinariaEnObra.setFechaFin(jXDatePickerFechaFin.getDate());            
            periodoMaquinariaEnObra.setObra(obras.get(cboObra.getSelectedIndex()));
            periodoMaquinariaEnObra.setMaquinaria(maquinarias.get(cboMaquinaria.getSelectedIndex()));
            periodoMaquinariaEnObra.setFechaSolicitud(jXDatePickerFechaSolicitud.getDate());
            periodoMaquinariaEnObra.setFechaRecepcion(jXDatePickerFechaRecepcion.getDate());
            periodoMaquinariaEnObra.setJefeDeObra(jefesDeObra.get(cboJefeObra.getSelectedIndex()));
            periodoMaquinariaEnObra.setEmpleadoAlmacen(empleadosAlmacen.get(cboEmpleadoAlmacen.getSelectedIndex()));

           

            if (dba.PeriodoMaquinariaEnObraDba.updatePeriodoMaquinariaEnObra(periodoMaquinariaEnObra)) {
                JOptionPane.showMessageDialog(null, "Datos Modificados");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }

    }

    public void borrar() {
        int fila = tblPeriodoMaquinaria.getSelectedRow();
        String identificador = (String) tblPeriodoMaquinaria.getValueAt(fila, 0);

        try {

            if (dba.PeriodoMaquinariaEnObraDba.deletePeriodoMaquinariaEnObra(Integer.valueOf(identificador))) {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jXDatePickerFechaInicio = new org.jdesktop.swingx.JXDatePicker();
        jXDatePickerFechaFin = new org.jdesktop.swingx.JXDatePicker();
        cboObra = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jXDatePickerFechaSolicitud = new org.jdesktop.swingx.JXDatePicker();
        jXDatePickerFechaRecepcion = new org.jdesktop.swingx.JXDatePicker();
        cboMaquinaria = new javax.swing.JComboBox<>();
        cboJefeObra = new javax.swing.JComboBox<>();
        cboEmpleadoAlmacen = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPeriodoMaquinaria = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestión de Obras"));

        jLabel3.setText("Fecha de Inicio:");

        jLabel4.setText("Fecha de Fin:");

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

        cboObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboObraActionPerformed(evt);
            }
        });

        jLabel1.setText("Obra:");

        jLabel2.setText("Maquinaria:");

        jLabel5.setText("Fecha de solicitud:");

        jLabel6.setText("Fecha de recepcion:");

        jLabel7.setText("Jefe de obra:");

        jLabel8.setText("Empleado almacen:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addGap(43, 43, 43)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboObra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jXDatePickerFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jXDatePickerFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jXDatePickerFechaSolicitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jXDatePickerFechaRecepcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboMaquinaria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboJefeObra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboEmpleadoAlmacen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addGap(32, 32, 32))))
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboMaquinaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jXDatePickerFechaSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jXDatePickerFechaRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboJefeObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cboEmpleadoAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrar)
                    .addComponent(btnModificar)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        tblPeriodoMaquinaria.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPeriodoMaquinaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPeriodoMaquinariaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPeriodoMaquinaria);

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

    private void tblPeriodoMaquinariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPeriodoMaquinariaMouseClicked
        if (evt.getButton() == 1) {
            int fila = tblPeriodoMaquinaria.getSelectedRow();
            PeriodoMaquinariaEnObra periodoMaquinariaEnObra = new PeriodoMaquinariaEnObra();
            try {
                periodoMaquinariaEnObra = dba.PeriodoMaquinariaEnObraDba.getPeriodoMaquinariaEnObra(Integer.parseInt(String.valueOf(tblPeriodoMaquinaria.getValueAt(fila, 0))));
            } catch (SQLException ex) {
                Logger.getLogger(DialogoPeriodoMaquinariaEnObra.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                jXDatePickerFechaInicio.setDate(periodoMaquinariaEnObra.getFechaInicio());
                jXDatePickerFechaFin.setDate(periodoMaquinariaEnObra.getFechaFin());
                cboObra.setSelectedItem(periodoMaquinariaEnObra.getObra());
                cboMaquinaria.setSelectedItem(periodoMaquinariaEnObra.getMaquinaria());
                jXDatePickerFechaSolicitud.setDate(periodoMaquinariaEnObra.getFechaSolicitud());
                jXDatePickerFechaRecepcion.setDate(periodoMaquinariaEnObra.getFechaRecepcion());
                cboJefeObra.setSelectedItem(periodoMaquinariaEnObra.getJefeDeObra());
                cboEmpleadoAlmacen.setSelectedItem(periodoMaquinariaEnObra.getEmpleadoAlmacen());

                habilitar();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido leer la información en la BD");
            }
        }
    }//GEN-LAST:event_tblPeriodoMaquinariaMouseClicked

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

    private void cboObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboObraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboObraActionPerformed

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
            java.util.logging.Logger.getLogger(DialogoPeriodoMaquinariaEnObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogoPeriodoMaquinariaEnObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogoPeriodoMaquinariaEnObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogoPeriodoMaquinariaEnObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogoPeriodoMaquinariaEnObra dialog = new DialogoPeriodoMaquinariaEnObra(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cboEmpleadoAlmacen;
    private javax.swing.JComboBox<String> cboJefeObra;
    private javax.swing.JComboBox<String> cboMaquinaria;
    private javax.swing.JComboBox<Obra> cboObra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXDatePicker jXDatePickerFechaFin;
    private org.jdesktop.swingx.JXDatePicker jXDatePickerFechaInicio;
    private org.jdesktop.swingx.JXDatePicker jXDatePickerFechaRecepcion;
    private org.jdesktop.swingx.JXDatePicker jXDatePickerFechaSolicitud;
    private javax.swing.JTable tblPeriodoMaquinaria;
    // End of variables declaration//GEN-END:variables
}
