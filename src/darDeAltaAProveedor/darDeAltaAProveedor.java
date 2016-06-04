/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darDeAltaAProveedor;

import POJOS.Empleado;
import POJOS.Persona;
import POJOS.Proveedor;
import dba.AltaProveedores;
import dba.PersonaDba;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marcos
 */
public class darDeAltaAProveedor extends javax.swing.JDialog {

    int menuActual;
    DefaultTableModel modelo;

    /**
     * Creates new form darDeAltaAProveedor
     */
    public darDeAltaAProveedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.menuActual = menuActual;
        mensajeError.setVisible(false);
        deshabilitar();
        llenar();
    }

    public void limpiar() {

        campoNombre.setText("");
        campoDireccion.setText("");
        campoApellidos.setText("");
        campoDNI.setText("");
        campoTelefono.setText("");

    }

    public void habilitar() {
        // if(menuActual == MNU_DAR_ALTA_A_MATERIAL){
        campoNombre.setEnabled(true);
        campoDireccion.setEnabled(true);
        campoApellidos.setEnabled(true);
        campoDNI.setEnabled(true);
        campoTelefono.setEnabled(true);
        // }
    }

    public void deshabilitar() {
        campoNombre.setEnabled(false);
        campoDireccion.setEnabled(false);
        campoApellidos.setEnabled(false);
        campoDNI.setEnabled(false);
        campoTelefono.setEnabled(false);
    }

    public boolean comprobarEstado() {
        String nombre = campoNombre.getText();
        String direc = campoDireccion.getText();
        String ape = campoApellidos.getText();
        String dni = campoDNI.getText();
        String tel = campoTelefono.getText();

        boolean resultado = false;

        if (nombre.equals("") || direc.equals("") || ape.equals("") || dni.equals("") || tel.equals("") && resultado == false) {
            JOptionPane.showMessageDialog(null, "Debe rellenar los campos");
            resultado = false;
        } else {
            resultado = true;
        }
        return resultado;
    }

    public void llenar() {

        String titulos[] = {"Nombre", "Apellidos", "Telefono", "Dni"};
        modelo = new DefaultTableModel(null, titulos);

        String fila[] = new String[4];
        ArrayList<Persona> personas = new ArrayList<>();
        try {
            personas = dba.PersonaDba.getPersonaConsulta();
        } catch (SQLException ex) {
            Logger.getLogger(darDeAltaAProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (Persona per : personas) {
            fila[0] = per.getNombre();
            fila[1] = per.getApellidos();
            fila[2] = per.getTelefono();
            fila[3] = per.getDni();
            modelo.addRow(fila);
        }

        tablaProveedor.setModel(modelo);
    }

    public void nuevo() {
        //Metodo para dar de alta en las tablas
        Proveedor nuevoProveedor = new Proveedor();
        Persona nuevaPersona = new Persona();
        //Donde guardaremos el dni para obtener las IDs
        String dni;
        //Metodo para controlar los campos vacios
        if (comprobarEstado() == true) {
            try {
                //Guardamos en el objeto de las clases los datos de la interfaz
                nuevoProveedor.setNombre(campoNombre.getText());
                nuevoProveedor.setDireccion(campoDireccion.getText());
                nuevoProveedor.setDni(campoDNI.getText());

                nuevaPersona.setNombre(campoNombre.getText());
                nuevaPersona.setApellidos(campoApellidos.getText());
                nuevaPersona.setTelefono(campoTelefono.getText());
                nuevaPersona.setDni(campoDNI.getText());
                //Guardamos el dni
                dni=campoDNI.getText();
                //insertamos en las BD los datos
                if (dba.AltaProveedores.insertProveedor(nuevoProveedor)
                        && dba.PersonaDba.insertPersonaProv(nuevaPersona)) {
                    JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente.");
                    //Hacemos la consulta para obetener los IDs
                    int consulta1 = dba.PersonaDba.selectPersonaID(dni);
                    int consulta2 = dba.AltaProveedores.selectProveedorID(dni);
                    System.out.println(consulta1 +"y"+consulta2);
                    //Insetamos en la tabla los IDs
                    if (dba.AltaProveedores.insertProveedorPersona(consulta1, consulta2)) {
                        JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente en Proveedor_Persona.");

                    }
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Se ha producido un Error. Error:" + ex.getMessage());
            }
        }

    }

    public void modificar() {
        int fila = tablaProveedor.getSelectedRow();
        String identificador = (String) tablaProveedor.getValueAt(fila, 3);

        Proveedor proveedores = new Proveedor();
        Persona persona = new Persona();
        try {
            proveedores.setDni(identificador);
            proveedores.setNombre(campoNombre.getText());
            proveedores.setDireccion(campoDireccion.getText());
            persona.setApellidos(campoApellidos.getText());
            persona.setTelefono(campoTelefono.getText());
            persona.setDni(identificador);
            persona.setNombre(campoNombre.getText());

            if (dba.AltaProveedores.updateProveedores(proveedores) && dba.PersonaDba.updatePersonaConsulta(persona)) {
                JOptionPane.showMessageDialog(null, "Datos Modificados");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }

    }

    public void borrar() throws SQLException {
        int fila = tablaProveedor.getSelectedRow();
        String dniBorrar = (String) tablaProveedor.getValueAt(fila, 3);
        //Hacemos las consultas para obtener los IDs
        int consulta1 = dba.PersonaDba.selectPersonaID(dniBorrar);
        int consulta2 = dba.AltaProveedores.selectProveedorID(dniBorrar);
        try {
            //Borramos de la BD proveedor y persona los que coincidan con ese DNI
            if (dba.PersonaDba.deletePersonaConsulta(dniBorrar) && dba.AltaProveedores.deleteProveedor((dniBorrar))) {
                JOptionPane.showMessageDialog(null, "Datos Borrados");
                //Borramos de la BD persona_proveedor los IDs devueltos en la consulta
                if (dba.AltaProveedores.deleteProveedorPersona(consulta1, consulta2)) {
                    JOptionPane.showMessageDialog(null, "Borrado de la tabla Persona_Proveedor");
                }
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
        campoNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoDireccion = new javax.swing.JTextField();
        mensajeError = new javax.swing.JOptionPane();
        jLabel3 = new javax.swing.JLabel();
        campoDNI = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoApellidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        botonNuevo = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProveedor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Dar de alta proveedor"));

        jLabel1.setText("Nombre:");

        jLabel2.setText("Dirección:");

        jLabel3.setText("DNI:");

        jLabel4.setText("Apellidos:");

        jLabel5.setText("Teléfono:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(campoDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                .addComponent(campoDNI)
                                .addComponent(campoApellidos))))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mensajeError, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(479, 479, 479))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(mensajeError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botonNuevo.setText("Nuevo");
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });

        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonBorrar.setText("Borrar");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        botonAtras.setText("Atrás");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        tablaProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellidos", "Teléfono", "DNI"
            }
        ));
        tablaProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProveedor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(botonNuevo)
                .addGap(18, 18, 18)
                .addComponent(botonGuardar)
                .addGap(18, 18, 18)
                .addComponent(botonModificar)
                .addGap(18, 18, 18)
                .addComponent(botonBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 335, Short.MAX_VALUE)
                .addComponent(botonAtras)
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 786, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonBorrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonNuevo)
                        .addComponent(botonGuardar)
                        .addComponent(botonModificar)
                        .addComponent(botonAtras)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
        // TODO add your handling code here:
        limpiar();
        habilitar();
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void tablaProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProveedorMouseClicked
        // TODO add your handling code here:

        if (evt.getButton() == 1) {
            int fila = tablaProveedor.getSelectedRow();
            Proveedor proveedores = new Proveedor();
            Persona persona = new Persona();
            try {
                persona = dba.PersonaDba.getPersonasConsultaTabla((String.valueOf(tablaProveedor.getValueAt(fila, 3))));
                proveedores = dba.AltaProveedores.getProveedores((String.valueOf(tablaProveedor.getValueAt(fila, 3))));
            } catch (SQLException ex) {
                Logger.getLogger(darDeAltaAProveedor.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                campoNombre.setText(persona.getNombre());
                campoApellidos.setText(persona.getApellidos());
                campoDireccion.setText(proveedores.getDireccion());
                campoTelefono.setText(persona.getTelefono());
                campoDNI.setText(persona.getDni());

                habilitar();

                campoDNI.setEnabled(false);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido leer la información en la BD en la parte de la tabla");
            }
        }
    }//GEN-LAST:event_tablaProveedorMouseClicked

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        // TODO add your handling code here:
        nuevo();
        deshabilitar();
        llenar();
        limpiar();
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        // TODO add your handling code here:
        modificar();
        limpiar();
        deshabilitar();
        llenar();
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        try {
            // TODO add your handling code here:
            borrar();
        } catch (SQLException ex) {
            Logger.getLogger(darDeAltaAProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpiar();
        deshabilitar();
        llenar();
    }//GEN-LAST:event_botonBorrarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JTextField campoDNI;
    private javax.swing.JTextField campoDireccion;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JOptionPane mensajeError;
    private javax.swing.JTable tablaProveedor;
    // End of variables declaration//GEN-END:variables
}
