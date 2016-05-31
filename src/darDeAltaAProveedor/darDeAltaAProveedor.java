/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darDeAltaAProveedor;

import POJOS.Proveedor;
import dba.AltaProveedores;
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
    }

    public void habilitar() {
        // if(menuActual == MNU_DAR_ALTA_A_MATERIAL){
        campoNombre.setEnabled(true);
        campoDireccion.setEnabled(true);
        // }
    }

    public void deshabilitar() {
        campoNombre.setEnabled(false);
        campoDireccion.setEnabled(false);
    }

    public boolean comprobarEstado() {
        String nombre = campoNombre.getText();
        String direc = campoDireccion.getText();
        boolean resultado = false;

        if (nombre.equals("") && direc.equals("") && resultado == false) {
            JOptionPane.showMessageDialog(null, "Debe rellenar los campos");
            resultado = false;
        } else {
            resultado = true;
        }
        return resultado;
    }
    
    public boolean comprobarEnTabla(){
        boolean resultado=false;
        String nomBuscar=campoNombre.getText();
        String direcBuscar=campoDireccion.getText();
        AltaProveedores prov = new AltaProveedores();
        
        
        if(prov.comprobarConsulta(nomBuscar, direcBuscar)== false){
            JOptionPane.showMessageDialog(null, "Datos ya almacenados en la BD");
             resultado=false;
        }else{
             resultado=true;
        }
        return resultado;
    }

    public void llenar() {

        String titulos[] = {"ID", "Nombre", "Dirección"};
        modelo = new DefaultTableModel(null, titulos);

        String fila[] = new String[3];
        ArrayList<Proveedor> proveedor = new ArrayList<>();


            try {
                proveedor = dba.AltaProveedores.getProveedor();
            } catch (SQLException ex) {
                Logger.getLogger(darDeAltaAProveedor.class.getName()).log(Level.SEVERE, null, ex);
            }

            for (Proveedor prov : proveedor) {
                fila[0] = String.valueOf(prov.getPK_ID());
                fila[1] = prov.getNombre();
                fila[2] = prov.getDireccion();

                modelo.addRow(fila);
            }


        tablaProveedor.setModel(modelo);
    }

    public void nuevo() {
        Proveedor nuevoProveedor = new Proveedor();
        String nomBuscar, direcBuscar;
        nomBuscar=campoNombre.getText();
        direcBuscar=campoDireccion.getText();


        if (comprobarEstado()==true && comprobarEnTabla()==true) {
            try {
                nuevoProveedor.setNombre(campoNombre.getText());
                nuevoProveedor.setDireccion(campoDireccion.getText());

                if (dba.AltaProveedores.insertProveedor(nuevoProveedor)) {
                    JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente.");
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Se ha producido un Error. Error:" + ex.getMessage());
            }
        }

    }

    public void modificar() {
        int fila = tablaProveedor.getSelectedRow();
        String identificador = (String) tablaProveedor.getValueAt(fila, 0);

        Proveedor proveedores = new Proveedor();

        try {
            proveedores.setPK_ID(Integer.parseInt(identificador));
            proveedores.setNombre(campoNombre.getText());
            proveedores.setDireccion(campoDireccion.getText());

            if (dba.AltaProveedores.updateProveedores(proveedores)) {
                JOptionPane.showMessageDialog(null, "Datos Modificados");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }

    }

    public void borrar() {
        int fila = tablaProveedor.getSelectedRow();
        String identificador = (String) tablaProveedor.getValueAt(fila, 0);

        try {

            if (dba.AltaProveedores.deleteProveedor(Integer.valueOf(identificador))) {
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
        campoNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoDireccion = new javax.swing.JTextField();
        mensajeError = new javax.swing.JOptionPane();
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addComponent(campoDireccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mensajeError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                    .addComponent(jLabel2)
                    .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mensajeError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                "ID", "Nombre", "Dirección"
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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(botonNuevo)
                .addGap(18, 18, 18)
                .addComponent(botonGuardar)
                .addGap(18, 18, 18)
                .addComponent(botonModificar)
                .addGap(18, 18, 18)
                .addComponent(botonBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
                .addComponent(botonAtras)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonNuevo)
                    .addComponent(botonGuardar)
                    .addComponent(botonModificar)
                    .addComponent(botonBorrar)
                    .addComponent(botonAtras))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            try {
                proveedores = dba.AltaProveedores.getProveedores(Integer.parseInt(String.valueOf(tablaProveedor.getValueAt(fila, 0))));
            } catch (SQLException ex) {
                Logger.getLogger(darDeAltaAProveedor.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {

                campoNombre.setText(proveedores.getNombre());
                campoDireccion.setText(proveedores.getDireccion());

                habilitar();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido leer la información en la BD");
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
        // TODO add your handling code here:
        borrar();
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
    private javax.swing.JTextField campoDireccion;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JOptionPane mensajeError;
    private javax.swing.JTable tablaProveedor;
    // End of variables declaration//GEN-END:variables
}
