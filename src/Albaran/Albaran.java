package Albaran;

import dba.MySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Migueli Ramos
 */
public class Albaran extends javax.swing.JPanel {
    
    Connection conn;
    DefaultTableModel modelo;
    Statement sentencia;
    
    /**
     * Creates new form AlbaranInGra
     */
    public Albaran() {
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
        formulario.setVisible(false);
        conn = MySQL.getConnection();
        deshabilitar();
        llenar();
    }
    
     public void limpiar(){
        cajaTextoNAlbaran.setText("");
        cajaTextoFecha.setText("");
        cajaTextoProveedor.setText("");
        cajaTextoFactura.setText("");
    }
     
     public void habilitar(){
        cajaTextoNAlbaran.setEnabled(true);
        cajaTextoFecha.setEnabled(true);
        cajaTextoProveedor.setEnabled(true);
        cajaTextoFactura.setEnabled(true);
    }
     
     public void deshabilitar(){
     
        cajaTextoNAlbaran.setEnabled(false);
        cajaTextoFecha.setEnabled(false);
        cajaTextoProveedor.setEnabled(false);
        cajaTextoFactura.setEnabled(false);
    
     }
     
     public void llenar(){
        conn = MySQL.getConnection();
        String titulos[] = {"Nº Albaran","Fecha","Proveedor","Factura"};
        String sql = "select * from constructura";
        modelo = new DefaultTableModel(null, titulos);
        
        try {
            sentencia = conn.createStatement();
            ResultSet rs = sentencia.executeQuery(sql);
            
            String fila[] = new String[5];
            
            while(rs.next()){
                fila[0] = rs.getString("Nº");
                fila[1] = rs.getString("Albaran");
                fila[2] = rs.getString("Proveedor");
                fila[3] = rs.getString("Factura");
                
                modelo.addRow(fila);
            }
            
            tablaAlbaran.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(Albaran.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }
     
      public void nuevo(){
        String sql = "insert into alumnos (nombre, apellido1, apellido2) values (?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, cajaTextoNAlbaran.getText());
            ps.setString(2, cajaTextoFecha.getText());
            ps.setString(3, cajaTextoProveedor.getText());
            ps.setString(4, cajaTextoFactura.getText());;
            int n = ps.executeUpdate();
            
            if(n>0){
                JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente.");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se ha producido un Error. Error:" + ex.getMessage());
        }
        
    }
      
       public void modificar(){
        int fila = tablaAlbaran.getSelectedRow();
        String identificador = (String)tablaAlbaran.getValueAt(fila, 0);
        String sql = "update alumnos set nombre=?, apellido1=?, apellido2=? where id=" + identificador;
        PreparedStatement ps;
        try {
            
            ps = conn.prepareCall(sql);
            ps.setString(1, cajaTextoNAlbaran.getText());
            ps.setString(2, cajaTextoFecha.getText());
            ps.setString(3, cajaTextoProveedor.getText());
            ps.setString(4, cajaTextoFactura.getText());;
            
            int n = ps.executeUpdate();
            
            if(n>0){
                JOptionPane.showMessageDialog(null, "Datos Modificados");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }        
    }
      
    public void borrar(){
         
        int fila = tablaAlbaran.getSelectedRow();
        String identificador = (String)tablaAlbaran.getValueAt(fila, 0);
        String sql = "delete from alumnos where id=" + identificador;
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

        menuAlbaran = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlbaran = new javax.swing.JTable();
        insertarAlbaran = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        Albaran = new javax.swing.JLabel();
        formulario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cajaTextoNAlbaran = new javax.swing.JTextField();
        cajaTextoFecha = new javax.swing.JTextField();
        cajaTextoProveedor = new javax.swing.JTextField();
        cajaTextoFactura = new javax.swing.JTextField();
        volverMenu = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        guardar = new javax.swing.JButton();

        menuAlbaran.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tablaAlbaran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nº Albaran", "Fecha", "Proveedor", "Factura"
            }
        ));
        tablaAlbaran.setToolTipText("");
        tablaAlbaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAlbaranMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAlbaran);

        insertarAlbaran.setText("Insertar Albaran");
        insertarAlbaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarAlbaranActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        Albaran.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Albaran.setText("Albaran");

        javax.swing.GroupLayout menuAlbaranLayout = new javax.swing.GroupLayout(menuAlbaran);
        menuAlbaran.setLayout(menuAlbaranLayout);
        menuAlbaranLayout.setHorizontalGroup(
            menuAlbaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuAlbaranLayout.createSequentialGroup()
                .addGroup(menuAlbaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuAlbaranLayout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(insertarAlbaran)
                        .addGap(100, 100, 100)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuAlbaranLayout.createSequentialGroup()
                        .addGap(424, 424, 424)
                        .addComponent(Albaran)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuAlbaranLayout.createSequentialGroup()
                .addGap(0, 100, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        menuAlbaranLayout.setVerticalGroup(
            menuAlbaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuAlbaranLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Albaran)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(menuAlbaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(insertarAlbaran, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47))
        );

        formulario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Nº Albaran");

        jLabel2.setText("Fecha");

        jLabel3.setText("Proveedor");

        jLabel4.setText("Factura");

        volverMenu.setText("Volver");
        volverMenu.setActionCommand("");
        volverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverMenuActionPerformed(evt);
            }
        });

        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        nuevo.setText("Nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formularioLayout = new javax.swing.GroupLayout(formulario);
        formulario.setLayout(formularioLayout);
        formularioLayout.setHorizontalGroup(
            formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nuevo)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formularioLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(modificar)
                        .addGap(46, 46, 46)
                        .addComponent(borrar)
                        .addGap(44, 44, 44)
                        .addComponent(guardar)
                        .addGap(36, 36, 36)
                        .addComponent(volverMenu))
                    .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cajaTextoNAlbaran)
                        .addComponent(cajaTextoFecha)
                        .addComponent(cajaTextoProveedor)
                        .addComponent(cajaTextoFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        formularioLayout.setVerticalGroup(
            formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formularioLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formularioLayout.createSequentialGroup()
                        .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(cajaTextoNAlbaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cajaTextoFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3))
                    .addComponent(cajaTextoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(cajaTextoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formularioLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nuevo)
                            .addComponent(modificar)
                            .addComponent(borrar)
                            .addComponent(guardar))
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formularioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(volverMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuAlbaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(formulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuAlbaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        
        System.exit(0);
       
    }//GEN-LAST:event_salirActionPerformed

    private void insertarAlbaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarAlbaranActionPerformed
        
        formulario.setVisible(true);
        menuAlbaran.setVisible(false);
        
    }//GEN-LAST:event_insertarAlbaranActionPerformed

    private void volverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverMenuActionPerformed
        
        menuAlbaran.setVisible(true);
        formulario.setVisible(false);
        
    }//GEN-LAST:event_volverMenuActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        
        borrar();
        limpiar();
        deshabilitar();
        llenar();
        
    }//GEN-LAST:event_borrarActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
       
        limpiar();
        habilitar();
        
    }//GEN-LAST:event_nuevoActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        
        modificar();
        limpiar();
        deshabilitar();
        llenar();
        
    }//GEN-LAST:event_modificarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        
        nuevo();
        deshabilitar();
        llenar();
        
    }//GEN-LAST:event_guardarActionPerformed

    private void tablaAlbaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAlbaranMouseClicked
        
        if (evt.getButton()==1){           
                int fila = tablaAlbaran.getSelectedRow();              
                String sql = "Select * from alumnos where id=" + tablaAlbaran.getValueAt(fila, 0);
                //JOptionPane.showMessageDialog(null, sql);
            try {
                sentencia = conn.createStatement();
                ResultSet rs = sentencia.executeQuery(sql);
                rs.next();
                
                cajaTextoNAlbaran.setText(rs.getString("nombre"));
                cajaTextoFecha.setText(rs.getString("apellido1"));
                cajaTextoProveedor.setText(rs.getString("apellido2"));
                cajaTextoFactura.setText(rs.getString("apellido2"));
                
                habilitar();
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido leer la información en la BD");
            }
        }
        
    }//GEN-LAST:event_tablaAlbaranMouseClicked

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
            java.util.logging.Logger.getLogger(Albaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Albaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Albaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Albaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Albaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Albaran;
    private javax.swing.JButton borrar;
    private javax.swing.JTextField cajaTextoFactura;
    private javax.swing.JTextField cajaTextoFecha;
    private javax.swing.JTextField cajaTextoNAlbaran;
    private javax.swing.JTextField cajaTextoProveedor;
    private javax.swing.JPanel formulario;
    private javax.swing.JButton guardar;
    private javax.swing.JButton insertarAlbaran;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menuAlbaran;
    private javax.swing.JButton modificar;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton salir;
    private javax.swing.JTable tablaAlbaran;
    private javax.swing.JButton volverMenu;
    // End of variables declaration//GEN-END:variables

    private void pack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
