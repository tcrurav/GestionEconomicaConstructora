/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodoMaquinariaEnObra;

import POJOS.EmpleadoAlmacen;
import POJOS.JefeDeObra;
import POJOS.Maquinaria;
import POJOS.Obra;
import POJOS.PeriodoMaquinariaEnObra;
import POJOS.Persona;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author samue
 */
public class DialogoPeriodoMaquinariaEnObra extends javax.swing.JDialog {

    /**
     * Creates new form PeriodoMaquinariaEnObra
     */
    public DialogoPeriodoMaquinariaEnObra(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setTitle("Constructora - Periodo de maquinaria en obra");
        initComponents();
        deshabilitar();
        llenar();
        llenarCbo();
        this.pack();      
        this.setLocationRelativeTo(null);
        
    }
    
    DefaultTableModel modelo;
    ArrayList<EmpleadoAlmacen> empleadosAlmacen = new ArrayList<>();
    ArrayList<JefeDeObra> jefesDeObra = new ArrayList<>();
    ArrayList<Maquinaria> maquinarias = new ArrayList<>();
    ArrayList<Obra> obras = new ArrayList<>();

    //Helpers para autoseleccionar los combo box.
    int helperEmpleadoAlmacen;
    int helperJefesDeObra;
    int helperMaquinarias;
    int helperObras; 
                
    public void limpiar() {
        final Calendar instance = Calendar.getInstance();
        jXDatePickerFechaFin.setDate(instance.getTime());
        jXDatePickerFechaInicio.setDate(instance.getTime());
        jXDatePickerFechaRecepcion.setDate(instance.getTime());
        jXDatePickerFechaSolicitud.setDate(instance.getTime());
    }
    
    
    public void habilitar() {
        cboEmpleadoAlmacen.setEnabled(true);
        cboJefeObra.setEnabled(true);
        cboMaquinaria.setEnabled(true);
        cboObra.setEnabled(true);
        jXDatePickerFechaFin.setEnabled(true);
        jXDatePickerFechaInicio.setEnabled(true);
        jXDatePickerFechaRecepcion.setEnabled(true);
        jXDatePickerFechaSolicitud.setEnabled(true);
    }
    

    public void deshabilitar() {
        cboEmpleadoAlmacen.setEnabled(false);
        cboJefeObra.setEnabled(false);
        cboMaquinaria.setEnabled(false);
        cboObra.setEnabled(false);
        jXDatePickerFechaFin.setEnabled(false);
        jXDatePickerFechaInicio.setEnabled(false);
        jXDatePickerFechaRecepcion.setEnabled(false);
        jXDatePickerFechaSolicitud.setEnabled(false);

    }
    
 
public void llenar() {
        String titulos[] = {"ID", "Empleado de almacén", "Jefe de obra", "Fecha de inicio", "Fecha de fin", "Fecha de solicitud", 
            "Fecha de recepción", "Maquinaria", "Obra"};
        
        modelo = new DefaultTableModel(null, titulos);

        String fila[] = new String[9];
        ArrayList<PeriodoMaquinariaEnObra> periodoMaquinariasEnObras = new ArrayList<>();
        
        try {
            periodoMaquinariasEnObras = dba.PeriodoMaquinariaEnObraDba.getPeriodoMaquinariasEnObras();
        } catch (SQLException ex) {
            Logger.getLogger(DialogoPeriodoMaquinariaEnObra.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (PeriodoMaquinariaEnObra periodoMaquinariaEnObra : periodoMaquinariasEnObras) {
            
            fila[0] = String.valueOf(periodoMaquinariaEnObra.getPK_ID());
            fila[1] = periodoMaquinariaEnObra.getEmpleadoAlmacen().getNombre();
            fila[2] = periodoMaquinariaEnObra.getJefeDeObra().getNombre();
            fila[3] = periodoMaquinariaEnObra.getFechaInicio().toString();
            fila[4] = periodoMaquinariaEnObra.getFechaFin().toString();
            fila[5] = periodoMaquinariaEnObra.getFechaSolicitud().toString();
            fila[6] = periodoMaquinariaEnObra.getFechaRecepcion().toString();
            fila[7] = periodoMaquinariaEnObra.getMaquinaria().getNombre();
            fila[8] = periodoMaquinariaEnObra.getObra().getDireccion();
            
            
            modelo.addRow(fila);
        }

        tablaPeriodoMaquinariaEnObra.setModel(modelo);
    }

    public void llenarCbo() {
        //cboEmpleadoAlmacen
        try {       
            empleadosAlmacen = dba.PersonaDba.getEmpleadosAlmacen();
            jefesDeObra = dba.PersonaDba.getJefesDeObra();
            maquinarias = dba.MaquinariaDba.getMaquinarias();
            obras = dba.ObraDba.getObras();
        } catch (SQLException ex) {
            Logger.getLogger(DialogoPeriodoMaquinariaEnObra.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (EmpleadoAlmacen empleadoAlmacen : empleadosAlmacen) {        
            cboEmpleadoAlmacen.addItem(empleadoAlmacen.getNombre());
        }
        
        for (JefeDeObra jefeDeObra : jefesDeObra) {        
            cboJefeObra.addItem(jefeDeObra.getNombre());
        }
        
        for (Maquinaria maquinaria : maquinarias) {        
            cboMaquinaria.addItem(maquinaria.getNombre());
        }
        
        for (Obra obra : obras) {        
            cboObra.addItem(obra.getDireccion());
        }
    }

    public void nuevo() {
        PeriodoMaquinariaEnObra periodoMaquinariaEnObra = new PeriodoMaquinariaEnObra();

        //llenarCbo();
        
        try {
            periodoMaquinariaEnObra.setEmpleadoAlmacen(empleadosAlmacen.get(cboEmpleadoAlmacen.getSelectedIndex()));
            periodoMaquinariaEnObra.setJefeDeObra(jefesDeObra.get(cboJefeObra.getSelectedIndex()));
            periodoMaquinariaEnObra.setFechaInicio(jXDatePickerFechaInicio.getDate());
            periodoMaquinariaEnObra.setFechaFin(jXDatePickerFechaFin.getDate());
            periodoMaquinariaEnObra.setFechaSolicitud(jXDatePickerFechaSolicitud.getDate());
            periodoMaquinariaEnObra.setFechaRecepcion(jXDatePickerFechaRecepcion.getDate());
            periodoMaquinariaEnObra.setMaquinaria(maquinarias.get(cboMaquinaria.getSelectedIndex()));
            periodoMaquinariaEnObra.setObra(obras.get(cboObra.getSelectedIndex()));

            if (dba.PeriodoMaquinariaEnObraDba.insertPeriodoMaquinariaEnObra(periodoMaquinariaEnObra)) {
                JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente.");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Se ha producido un Error. Error:" + ex.getMessage());
        }

    }
    
    
    public void modificar() {
        int fila = tablaPeriodoMaquinariaEnObra.getSelectedRow();
        String identificador = (String) tablaPeriodoMaquinariaEnObra.getValueAt(fila, 0);

        PeriodoMaquinariaEnObra periodoMaquinariaEnObra = new PeriodoMaquinariaEnObra();

        try {       
            empleadosAlmacen = dba.PersonaDba.getEmpleadosAlmacen();
            jefesDeObra = dba.PersonaDba.getJefesDeObra();
            maquinarias = dba.MaquinariaDba.getMaquinarias();
            obras = dba.ObraDba.getObras();
        } catch (SQLException ex) {
            Logger.getLogger(DialogoPeriodoMaquinariaEnObra.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            periodoMaquinariaEnObra.setPK_ID(Integer.parseInt(identificador));
            periodoMaquinariaEnObra.setEmpleadoAlmacen(empleadosAlmacen.get(cboEmpleadoAlmacen.getSelectedIndex()));
            periodoMaquinariaEnObra.setJefeDeObra(jefesDeObra.get(cboJefeObra.getSelectedIndex()));
            periodoMaquinariaEnObra.setFechaInicio(jXDatePickerFechaInicio.getDate());
            periodoMaquinariaEnObra.setFechaFin(jXDatePickerFechaFin.getDate());
            periodoMaquinariaEnObra.setFechaSolicitud(jXDatePickerFechaSolicitud.getDate());
            periodoMaquinariaEnObra.setFechaRecepcion(jXDatePickerFechaRecepcion.getDate());
            periodoMaquinariaEnObra.setMaquinaria(maquinarias.get(cboMaquinaria.getSelectedIndex()));
            periodoMaquinariaEnObra.setObra(obras.get(cboObra.getSelectedIndex()));
           
            if (dba.PeriodoMaquinariaEnObraDba.updatePeriodoMaquinariaEnObra(periodoMaquinariaEnObra)) {
                JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente.");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }

    }
    
    
    public void borrar() {
        int fila = tablaPeriodoMaquinariaEnObra.getSelectedRow();
        String identificador = (String) tablaPeriodoMaquinariaEnObra.getValueAt(fila, 0);

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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cboEmpleadoAlmacen = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cboJefeObra = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cboMaquinaria = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cboObra = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPeriodoMaquinariaEnObra = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jXDatePickerFechaInicio = new org.jdesktop.swingx.JXDatePicker();
        jXDatePickerFechaFin = new org.jdesktop.swingx.JXDatePicker();
        jXDatePickerFechaSolicitud = new org.jdesktop.swingx.JXDatePicker();
        jXDatePickerFechaRecepcion = new org.jdesktop.swingx.JXDatePicker();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Empleado de almacén:");

        cboEmpleadoAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEmpleadoAlmacenActionPerformed(evt);
            }
        });

        jLabel2.setText("Jefe de obra:");

        jLabel3.setText("Fecha de inicio:");

        jLabel4.setText("Fecha de fin:");

        jLabel5.setText("Fecha de solicitud:");

        jLabel6.setText("Fecha de recepción:");

        jLabel7.setText("Maquinaria:");

        cboMaquinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMaquinariaActionPerformed(evt);
            }
        });

        jLabel8.setText("Obra:");

        tablaPeriodoMaquinariaEnObra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        tablaPeriodoMaquinariaEnObra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPeriodoMaquinariaEnObraMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaPeriodoMaquinariaEnObra);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 914, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboEmpleadoAlmacen, 0, 150, Short.MAX_VALUE)
                                    .addComponent(cboJefeObra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboMaquinaria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboObra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jXDatePickerFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jXDatePickerFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jXDatePickerFechaSolicitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jXDatePickerFechaRecepcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboEmpleadoAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cboJefeObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jXDatePickerFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jXDatePickerFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jXDatePickerFechaSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jXDatePickerFechaRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboMaquinaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cboObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnModificar)
                    .addComponent(btnBorrar)
                    .addComponent(btnGuardar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        limpiar();
        habilitar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        modificar();
        limpiar();
        deshabilitar();
        llenar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        borrar();
        limpiar();
        deshabilitar();
        llenar();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        nuevo();
        deshabilitar();
        llenar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tablaPeriodoMaquinariaEnObraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPeriodoMaquinariaEnObraMouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == 1) {
            int fila = tablaPeriodoMaquinariaEnObra.getSelectedRow();
            PeriodoMaquinariaEnObra periodoMaquinariaEnObra = new PeriodoMaquinariaEnObra();
    
            try {
                periodoMaquinariaEnObra = dba.PeriodoMaquinariaEnObraDba.getPeriodoMaquinariaEnObra(Integer.parseInt(String.valueOf(tablaPeriodoMaquinariaEnObra.getValueAt(fila, 0))));
            } catch (SQLException ex) {
                Logger.getLogger(DialogoPeriodoMaquinariaEnObra.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            try {       
                empleadosAlmacen = dba.PersonaDba.getEmpleadosAlmacen();
                jefesDeObra = dba.PersonaDba.getJefesDeObra();
                maquinarias = dba.MaquinariaDba.getMaquinarias();
                obras = dba.ObraDba.getObras();
            } catch (SQLException ex) {
                Logger.getLogger(DialogoPeriodoMaquinariaEnObra.class.getName()).log(Level.SEVERE, null, ex);
            }
   
            for (EmpleadoAlmacen empleadoAlmacen : empleadosAlmacen) {        
                if(empleadoAlmacen.getPK_ID()==periodoMaquinariaEnObra.getEmpleadoAlmacen().getPK_ID()){
                    helperEmpleadoAlmacen = (int) empleadosAlmacen.indexOf(empleadoAlmacen);
                }
            }

            for (JefeDeObra jefeDeObra : jefesDeObra) {        
                if(jefeDeObra.getPK_ID()==periodoMaquinariaEnObra.getJefeDeObra().getPK_ID()){
                    helperJefesDeObra = jefesDeObra.indexOf(jefeDeObra);
                }
            }

            for (Maquinaria maquinaria : maquinarias) {        
                if(maquinaria.getPK_ID()==periodoMaquinariaEnObra.getMaquinaria().getPK_ID()){
                   helperMaquinarias = maquinarias.indexOf(maquinaria);
                }
            }

            for (Obra obra : obras) {        
                if(obra.getPK_ID()==periodoMaquinariaEnObra.getObra().getPK_ID()){
                    helperObras = obras.indexOf(obra);
                }
            }
            
            try {
                
                cboEmpleadoAlmacen.setSelectedIndex(helperEmpleadoAlmacen);
                cboJefeObra.setSelectedIndex(helperJefesDeObra);
                jXDatePickerFechaInicio.setDate(periodoMaquinariaEnObra.getFechaInicio());
                jXDatePickerFechaFin.setDate(periodoMaquinariaEnObra.getFechaFin());
                jXDatePickerFechaSolicitud.setDate(periodoMaquinariaEnObra.getFechaSolicitud());
                jXDatePickerFechaRecepcion.setDate(periodoMaquinariaEnObra.getFechaRecepcion());
                cboMaquinaria.setSelectedIndex(helperMaquinarias);
                cboObra.setSelectedIndex(helperObras);
                
                habilitar();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido leer la información en la BD");
            }
        }
    }//GEN-LAST:event_tablaPeriodoMaquinariaEnObraMouseClicked

    private void cboMaquinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMaquinariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMaquinariaActionPerformed

    private void cboEmpleadoAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEmpleadoAlmacenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEmpleadoAlmacenActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cboEmpleadoAlmacen;
    private javax.swing.JComboBox<String> cboJefeObra;
    private javax.swing.JComboBox<String> cboMaquinaria;
    private javax.swing.JComboBox<String> cboObra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private org.jdesktop.swingx.JXDatePicker jXDatePickerFechaFin;
    private org.jdesktop.swingx.JXDatePicker jXDatePickerFechaInicio;
    private org.jdesktop.swingx.JXDatePicker jXDatePickerFechaRecepcion;
    private org.jdesktop.swingx.JXDatePicker jXDatePickerFechaSolicitud;
    private javax.swing.JTable tablaPeriodoMaquinariaEnObra;
    // End of variables declaration//GEN-END:variables
}
