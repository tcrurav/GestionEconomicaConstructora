/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajadorEnObra;


import POJOS.Empleado;
import POJOS.EmpleadoObra;
import obra.*;
import POJOS.JefeDeObra;
import POJOS.Obra;
import POJOS.PeriodoEmpleadoEnObra;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose Aleman
 */
public class AsignarHorasDeTrabajadorEnObra extends javax.swing.JDialog {
    /**
     * Creates new form DialogoObra
     */
    public AsignarHorasDeTrabajadorEnObra(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setTitle("Asignar horas de trabajador en obra");
        initComponents();
        this.pack();      
        this.setLocationRelativeTo(null);
        llenarCombos();
    }

    DefaultTableModel modelo;

    /**
     * Creates new form Formulario
     */

    public void limpiar() {
        final Calendar instance = Calendar.getInstance();
        pickerInicio.setDate(instance.getTime());
        pickerFinalizacion.setDate(instance.getTime());
        pickerSolicitud.setDate(instance.getTime());
        pickerRecepcion.setDate(instance.getTime());
        txtCoste.setText("");
    }

    public void habilitar() {
        pickerInicio.setEnabled(true);
        pickerFinalizacion.setEnabled(true);
        pickerSolicitud.setEnabled(true);
        pickerRecepcion.setEnabled(true);
        comboIdJefeDeObraQueLoSolicita.setEnabled(true);
        comboIdDeLaObra.setEnabled(true);
        comboIdDelEmpleadoDeObra.setEnabled(true);
        txtCoste.setEnabled(false); // Se calcula automaticamente (ver metodo en el POJO PerioEmpleadoEnObra.java)
    }

    public void deshabilitar() {
        pickerInicio.setEnabled(false);
        pickerFinalizacion.setEnabled(false);
        pickerSolicitud.setEnabled(false);
        pickerRecepcion.setEnabled(false);
        comboIdJefeDeObraQueLoSolicita.setEnabled(false);
        comboIdDeLaObra.setEnabled(false);
        comboIdDelEmpleadoDeObra.setEnabled(false);
        txtCoste.setEnabled(false);
    }
    
    
    public void llenarCombos() {
        llenarComboIdsJefeDeObra();
        llenarComboIdsObra();
        llenarCombocomboIdDelEmpleadoDeObra();
    }
    
    // METODOS PARA LLENAR LOS COMBOBOX:
    ArrayList<JefeDeObra> jefesDeObra = new ArrayList<>();
        public void llenarComboIdsJefeDeObra() {
        
        try {
                jefesDeObra = dba.PersonaDba.getJefesDeObra();
            } catch (SQLException ex) {
                Logger.getLogger(FrmObra.class.getName()).log(Level.SEVERE, null, ex);
            }

            for (JefeDeObra jefeDeObra : jefesDeObra) {
                comboIdJefeDeObraQueLoSolicita.addItem(Integer.toString(jefeDeObra.getPK_ID()));
            }
        } 
    
    ArrayList<Obra> obras = new ArrayList<>();
        public void llenarComboIdsObra() {
        
        try {
                obras = dba.ObraDba.getObras();
            } catch (SQLException ex) {
                Logger.getLogger(FrmObra.class.getName()).log(Level.SEVERE, null, ex);
            }

            for (Obra obra : obras) {
                comboIdDeLaObra.addItem(Integer.toString(obra.getPK_ID()));
            }
        } 
        
    ArrayList<EmpleadoObra> empleadosObra = new ArrayList<>();
        public void llenarCombocomboIdDelEmpleadoDeObra() {
        
        try {
                empleadosObra = dba.PersonaDba.getEmpleadosObra();
            } catch (SQLException ex) {
                Logger.getLogger(FrmObra.class.getName()).log(Level.SEVERE, null, ex);
            }

            for (EmpleadoObra empleadoObra : empleadosObra) {
                comboIdDeLaObra.addItem(Integer.toString(empleadoObra.getPK_ID()));
            }
        } 
    // FIN DE LOS METODOS PARA LLENAR LOS COMBOBOX:

        
   public void llenar() {
        String titulos[] = {"ID", "JefeQueSolicita","AdministrativoQueAsigna", "FechaInicio", "FechaFin", "Coste", "FechaSolicitud", "FechaRecepcion", "ObraID", "EmpleadoID"};
        modelo = new DefaultTableModel(null, titulos);

        String fila[] = new String[10];
        ArrayList<PeriodoEmpleadoEnObra> periodosEmpleadoEnObra = new ArrayList<>();
        try {
            periodosEmpleadoEnObra = dba.HorasEnObraDba.getPeriodosEmpleadoEnObras();
        } catch (SQLException ex) {
            Logger.getLogger(FrmObra.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (PeriodoEmpleadoEnObra periodoEmpleadoEnObra : periodosEmpleadoEnObra) {   
            
            fila[0] = String.valueOf(periodoEmpleadoEnObra.getPK_ID());
            fila[1] = String.valueOf(periodoEmpleadoEnObra.getJefeDeObra_ID());
            fila[2] = String.valueOf(periodoEmpleadoEnObra.getAdministrativoManoObra_ID());
            fila[3] = periodoEmpleadoEnObra.getFechaInicio().toString();
            fila[4] = periodoEmpleadoEnObra.getFechaFin().toString();
            fila[5] = String.valueOf(periodoEmpleadoEnObra.getCoste());
            fila[6] = periodoEmpleadoEnObra.getFechaSolicitud().toString();
            fila[7] = periodoEmpleadoEnObra.getFechaRecepcion().toString();
            fila[8] = String.valueOf(periodoEmpleadoEnObra.getObra_ID());
            fila[9] = String.valueOf(periodoEmpleadoEnObra.getEmpleadoObra_ID());

            modelo.addRow(fila);
        }

        tablaAsignarHorasDeTrabajadorEnObra.setModel(modelo);
    }

    public void nuevo() {
         PeriodoEmpleadoEnObra periodoEmpleadoEnObra = new PeriodoEmpleadoEnObra();
        
        periodoEmpleadoEnObra.setJefeDeObra_ID(comboIdJefeDeObraQueLoSolicita.getSelectedIndex());
        periodoEmpleadoEnObra.setAdministrativoManoObra_ID(4); // Discriminador del administrativo
        periodoEmpleadoEnObra.setObra_ID(comboIdDeLaObra.getSelectedIndex());
        periodoEmpleadoEnObra.setEmpleadoObra_ID(comboIdDelEmpleadoDeObra.getSelectedIndex());
        periodoEmpleadoEnObra.setFechaInicio(pickerInicio.getDate());
        periodoEmpleadoEnObra.setFechaFin(pickerFinalizacion.getDate());
        periodoEmpleadoEnObra.setFechaSolicitud(pickerSolicitud.getDate());
        periodoEmpleadoEnObra.setFechaRecepcion(pickerRecepcion.getDate());
        float costeCalculado = periodoEmpleadoEnObra.calcularCoste(comboIdDelEmpleadoDeObra.getSelectedIndex(), pickerInicio.getDate(), pickerFinalizacion.getDate());
        periodoEmpleadoEnObra.setCoste(costeCalculado);
        
        try {
            if (dba.HorasEnObraDba.insertPeriodoEmpleadoEnObra(periodoEmpleadoEnObra)) {
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR, algo ha ido mal - Metodo: nuevo()");
            Logger.getLogger(AsignarHorasDeTrabajadorEnObra.class.getName()).log(Level.SEVERE, null, ex);
        } 

    }

    public void modificar() {
        int fila = tablaAsignarHorasDeTrabajadorEnObra.getSelectedRow();
        String identificador = (String) tablaAsignarHorasDeTrabajadorEnObra.getValueAt(fila, 0);

        PeriodoEmpleadoEnObra periodoEmpleadoEnObra = new PeriodoEmpleadoEnObra();

        try {
            periodoEmpleadoEnObra.setPK_ID(Integer.parseInt(identificador));
            periodoEmpleadoEnObra.setJefeDeObra_ID(comboIdJefeDeObraQueLoSolicita.getSelectedIndex());
            periodoEmpleadoEnObra.setAdministrativoManoObra_ID(4); // Discriminador del administrativo
            periodoEmpleadoEnObra.setObra_ID(comboIdDeLaObra.getSelectedIndex());
            periodoEmpleadoEnObra.setEmpleadoObra_ID(comboIdDelEmpleadoDeObra.getSelectedIndex());
            periodoEmpleadoEnObra.setFechaInicio(pickerInicio.getDate());
            periodoEmpleadoEnObra.setFechaFin(pickerFinalizacion.getDate());
            periodoEmpleadoEnObra.setFechaSolicitud(pickerSolicitud.getDate());
            periodoEmpleadoEnObra.setFechaRecepcion(pickerRecepcion.getDate());
            float costeCalculado = periodoEmpleadoEnObra.calcularCoste(comboIdDelEmpleadoDeObra.getSelectedIndex(), pickerInicio.getDate(), pickerFinalizacion.getDate());
            periodoEmpleadoEnObra.setCoste(costeCalculado);

            if (dba.HorasEnObraDba.updatePeriodoEmpleadoEnObra(periodoEmpleadoEnObra)) {
                JOptionPane.showMessageDialog(null, "Datos Modificados");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR, algo ha ido mal - Metodo: modificar()");
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }

    }

    public void borrar() {
        int fila = tablaAsignarHorasDeTrabajadorEnObra.getSelectedRow();
        String identificador = (String) tablaAsignarHorasDeTrabajadorEnObra.getValueAt(fila, 0);

        try {

            if (dba.HorasEnObraDba.deletePeriodoEmpleadoEnObra(Integer.valueOf(identificador))) {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pickerInicio = new org.jdesktop.swingx.JXDatePicker();
        jLabel3 = new javax.swing.JLabel();
        pickerFinalizacion = new org.jdesktop.swingx.JXDatePicker();
        jLabel4 = new javax.swing.JLabel();
        txtCoste = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pickerSolicitud = new org.jdesktop.swingx.JXDatePicker();
        jLabel6 = new javax.swing.JLabel();
        pickerRecepcion = new org.jdesktop.swingx.JXDatePicker();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAsignarHorasDeTrabajadorEnObra = new javax.swing.JTable();
        btnGuardarLaNuevaAsignacion = new javax.swing.JButton();
        btnModificacion = new javax.swing.JButton();
        btnBaja = new javax.swing.JButton();
        comboIdJefeDeObraQueLoSolicita = new javax.swing.JComboBox<>();
        comboIdDeLaObra = new javax.swing.JComboBox<>();
        comboIdDelEmpleadoDeObra = new javax.swing.JComboBox<>();
        btnNuevaAsignacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Asignar horas de trabajador en obra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        jLabel1.setText("Jefe de obra que lo solicita:");

        jLabel2.setText("Fecha de inicio: ");

        jLabel3.setText("Fecha de finalización:");

        jLabel4.setText("Coste (cálculo automático): ");

        txtCoste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCosteActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha de solicitud:");

        jLabel6.setText("Fecha de recepción:");

        jLabel7.setText("ID de la obra:");

        jLabel8.setText("ID del empleado:");

        tablaAsignarHorasDeTrabajadorEnObra.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaAsignarHorasDeTrabajadorEnObra);

        btnGuardarLaNuevaAsignacion.setText("Guardar la nueva asignación");
        btnGuardarLaNuevaAsignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarLaNuevaAsignacionActionPerformed(evt);
            }
        });

        btnModificacion.setText("Modificacion");
        btnModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificacionActionPerformed(evt);
            }
        });

        btnBaja.setText("Baja del registro");
        btnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaActionPerformed(evt);
            }
        });

        btnNuevaAsignacion.setText("Nueva asignación");
        btnNuevaAsignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaAsignacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(comboIdJefeDeObraQueLoSolicita, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(comboIdDeLaObra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(comboIdDelEmpleadoDeObra, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCoste, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(97, 97, 97)
                                        .addComponent(btnNuevaAsignacion))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnGuardarLaNuevaAsignacion)
                                .addGap(45, 45, 45)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pickerSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pickerFinalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pickerInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pickerRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(199, 199, 199))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnModificacion)
                                .addGap(61, 61, 61)
                                .addComponent(btnBaja)
                                .addGap(170, 170, 170))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(comboIdJefeDeObraQueLoSolicita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(comboIdDeLaObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboIdDelEmpleadoDeObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(pickerInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(pickerFinalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(pickerSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(pickerRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCoste, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificacion)
                            .addComponent(btnBaja))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevaAsignacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardarLaNuevaAsignacion)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCosteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCosteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCosteActionPerformed

    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed
        borrar();
        limpiar();
        deshabilitar();
        llenar();
    }//GEN-LAST:event_btnBajaActionPerformed

    private void btnGuardarLaNuevaAsignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarLaNuevaAsignacionActionPerformed
        nuevo();
        deshabilitar();
        llenar();        
    }//GEN-LAST:event_btnGuardarLaNuevaAsignacionActionPerformed

    private void btnModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificacionActionPerformed
        modificar();
        limpiar();
        deshabilitar();
        llenar();
    }//GEN-LAST:event_btnModificacionActionPerformed

    private void btnNuevaAsignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaAsignacionActionPerformed
        limpiar();
        habilitar();
    }//GEN-LAST:event_btnNuevaAsignacionActionPerformed

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
            java.util.logging.Logger.getLogger(AsignarHorasDeTrabajadorEnObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsignarHorasDeTrabajadorEnObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsignarHorasDeTrabajadorEnObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsignarHorasDeTrabajadorEnObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AsignarHorasDeTrabajadorEnObra dialog = new AsignarHorasDeTrabajadorEnObra(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnGuardarLaNuevaAsignacion;
    private javax.swing.JButton btnModificacion;
    private javax.swing.JButton btnNuevaAsignacion;
    private javax.swing.JComboBox<String> comboIdDeLaObra;
    private javax.swing.JComboBox<String> comboIdDelEmpleadoDeObra;
    private javax.swing.JComboBox<String> comboIdJefeDeObraQueLoSolicita;
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
    private org.jdesktop.swingx.JXDatePicker pickerFinalizacion;
    private org.jdesktop.swingx.JXDatePicker pickerInicio;
    private org.jdesktop.swingx.JXDatePicker pickerRecepcion;
    private org.jdesktop.swingx.JXDatePicker pickerSolicitud;
    private javax.swing.JTable tablaAsignarHorasDeTrabajadorEnObra;
    private javax.swing.JTextField txtCoste;
    // End of variables declaration//GEN-END:variables
}
