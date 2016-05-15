/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleadoAlmacen;

import POJOS.EmpleadoAlmacen;
import static gestioneconomicaconstructora.OpcionesDeMenu.MNU_DAR_ALTA_A_MATERIAL;
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
public class DarDeAltaMaterial extends javax.swing.JDialog {
    int menuActual;
    DefaultTableModel modelo;
    /**
     * Creates new form DarDeAltaMaterial
     */
    public DarDeAltaMaterial(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        
        this.menuActual = menuActual;
        
        deshabilitar();
        
    }

        public void limpiar() {

        campoCodigo.setText("");
        campoDescrip.setText("");
        campoStockMed.setText("");
        campoStockMin.setText("");
        campoPrecio.setText("");
        campoStock.setText("");
    }
        
    public void habilitar() {
       // if(menuActual == MNU_DAR_ALTA_A_MATERIAL){
            campoCodigo.setEnabled(true);
            campoDescrip.setEnabled(true);
            campoPrecio.setEnabled(true);
            campoStock.setEnabled(true);
            campoStockMed.setEnabled(true);
            campoStockMin.setEnabled(true);
       // }
    }
    
    public void deshabilitar() {
        campoCodigo.setEnabled(false);
        campoDescrip.setEnabled(false);
        campoPrecio.setEnabled(false);
        campoStock.setEnabled(false);
        campoStockMed.setEnabled(false);
        campoStockMin.setEnabled(false);
    }    
    
    public void llenar() {
        String titulos[] = {"ID", "Codigo", "Descripcion", "StockMedio", "StockMinimo",
            "Precio", "Stock"};
        modelo = new DefaultTableModel(null, titulos);

        String fila[] = new String[7];
        ArrayList<EmpleadoAlmacen> almacen = new ArrayList<>();
        try {
            almacen = dba.AltasMaterialDba.getMateriales();
        } catch (SQLException ex) {
            Logger.getLogger(DarDeAltaMaterial.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (EmpleadoAlmacen material : almacen) {
            fila[0] = String.valueOf(material.getPK_ID());
            fila[1] = String.valueOf(material.getCodigo());
            fila[2] = material.getDescripcion();
            fila[3] = String.valueOf(material.getStockMedio());
            fila[4] = String.valueOf(material.getStockMinimo());
            fila[5] = String.valueOf(material.getPrecio());
            fila[6] = String.valueOf(material.getStock());
    
            modelo.addRow(fila);
        }

        tablaAltaMaterial.setModel(modelo);
    }    
    
    public void nuevo() {
        EmpleadoAlmacen nuevoMaterial = new EmpleadoAlmacen();

        try {
            nuevoMaterial.setCodigo(Integer.parseInt(campoCodigo.getText()));
            nuevoMaterial.setDescripcion(campoDescrip.getText());
            nuevoMaterial.setStockMedio(Integer.parseInt(campoStockMed.getText()));
            nuevoMaterial.setStockMinimo(Integer.parseInt(campoStockMin.getText()));
            nuevoMaterial.setPrecio(Float.parseFloat(campoPrecio.getText()));
            nuevoMaterial.setStock(Integer.parseInt(campoStock.getText()));

            if (dba.AltasMaterialDba.insertMateriales(nuevoMaterial)) {
                JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente.");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Se ha producido un Error. Error:" + ex.getMessage());
        }

    }    
    
    public void modificar() {
        int fila = tablaAltaMaterial.getSelectedRow();
        String identificador = (String) tablaAltaMaterial.getValueAt(fila, 0);

        EmpleadoAlmacen materiales = new EmpleadoAlmacen();

        try {
            materiales.setPK_ID(Integer.parseInt(identificador));
            materiales.setCodigo(Integer.parseInt(campoCodigo.getText()));
            materiales.setDescripcion(campoDescrip.getText());
            materiales.setStockMedio(Integer.parseInt(campoStockMed.getText()));
            materiales.setStockMinimo(Integer.parseInt(campoStockMin.getText()));
            materiales.setPrecio(Float.parseFloat(campoPrecio.getText()));
            materiales.setStock(Integer.parseInt(campoStock.getText()));

            if (dba.AltasMaterialDba.updateMateriales(materiales)) {
                JOptionPane.showMessageDialog(null, "Datos Modificados");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }

    }   
    
    public void borrar() {
        int fila = tablaAltaMaterial.getSelectedRow();
        String identificador = (String) tablaAltaMaterial.getValueAt(fila, 0);

        try {

            if (dba.AltasMaterialDba.deleteMaterial(Integer.valueOf(identificador))) {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoCodigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoDescrip = new javax.swing.JTextArea();
        campoStockMed = new javax.swing.JTextField();
        campoStockMin = new javax.swing.JTextField();
        campoPrecio = new javax.swing.JTextField();
        campoStock = new javax.swing.JTextField();
        botonNuevo = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaAltaMaterial = new javax.swing.JTable();
        botonAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Dar de alta material"));

        jLabel1.setText("Código material:");

        jLabel2.setText("Descripción:");

        jLabel3.setText("Stock medio:");

        jLabel4.setText("Stock minimo:");

        jLabel5.setText("Precio:");

        jLabel6.setText("Stock:");

        campoDescrip.setColumns(20);
        campoDescrip.setRows(5);
        jScrollPane1.setViewportView(campoDescrip);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoCodigo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(campoStockMed)
                            .addComponent(campoStockMin)
                            .addComponent(campoPrecio)
                            .addComponent(campoStock))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoStockMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoStockMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(campoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(campoStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        botonNuevo.setText("Nuevo");
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
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

        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        tablaAltaMaterial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Codigo", "Descripcion", "Stock Medio", "Stock Minimo", "Precio", "Stock"
            }
        ));
        tablaAltaMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAltaMaterialMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaAltaMaterial);

        botonAtras.setText("Atrás");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(botonNuevo)
                .addGap(18, 18, 18)
                .addComponent(botonModificar)
                .addGap(18, 18, 18)
                .addComponent(botonBorrar)
                .addGap(18, 18, 18)
                .addComponent(botonAtras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                .addComponent(botonGuardar)
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonNuevo)
                    .addComponent(botonModificar)
                    .addComponent(botonBorrar)
                    .addComponent(botonGuardar)
                    .addComponent(botonAtras))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        // TODO add your handling code here:
        nuevo();
        deshabilitar();
        llenar();    
        limpiar();
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void tablaAltaMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAltaMaterialMouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == 1) {
            int fila = tablaAltaMaterial.getSelectedRow();
            EmpleadoAlmacen material = new EmpleadoAlmacen();
            try {
                material = dba.AltasMaterialDba.getMateriales(Integer.parseInt(String.valueOf(tablaAltaMaterial.getValueAt(fila, 0))));
            } catch (SQLException ex) {
                Logger.getLogger(DarDeAltaMaterial.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
              
                campoCodigo.setText(String.valueOf(material.getCodigo()));
                campoDescrip.setText(material.getDescripcion());
                campoStockMed.setText(String.valueOf(material.getStockMedio()));
                campoStockMin.setText(String.valueOf(material.getStockMinimo()));
                campoPrecio.setText(String.valueOf(material.getPrecio()));
                campoStock.setText(String.valueOf(material.getStock()));

                habilitar();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido leer la información en la BD");
            }
        }
    }//GEN-LAST:event_tablaAltaMaterialMouseClicked

    /**
     * @param args the command line arguments
     */
   /* public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
      /*  try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DarDeAltaMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DarDeAltaMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DarDeAltaMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DarDeAltaMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DarDeAltaMaterial dialog = new DarDeAltaMaterial(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JTextArea campoDescrip;
    private javax.swing.JTextField campoPrecio;
    private javax.swing.JTextField campoStock;
    private javax.swing.JTextField campoStockMed;
    private javax.swing.JTextField campoStockMin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaAltaMaterial;
    // End of variables declaration//GEN-END:variables
}
