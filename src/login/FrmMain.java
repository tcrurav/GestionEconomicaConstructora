/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;



import MaquinariaObra.DialogoMaquinariaObra;
import POJOS.Empleado;


import dba.PersonaDba;
import jefeDeObra.PanelSolicitarMaterialObra;

import static gestioneconomicaconstructora.OpcionesDeMenu.*;
import static gestioneconomicaconstructora.TiposDePersona.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import obra.DialogoObra;
import obra.PanelObra;

import empleadoAlmacen.DarDeAltaMaterial;
import javax.swing.JDialog;



/**
 *
 * @author Tiburcio
 */
public class FrmMain extends javax.swing.JFrame {
    /**
     * Creates new form FrmMain
     */
    public FrmMain(Empleado empleado) {
        initComponents();
        this.setTitle("Constructura");
        habilitarMenus(empleado);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    public FrmMain() {
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void habilitarMenus(Empleado empleado){
        try {
            int tipoDeEmpleado = PersonaDba.getDiscriminator(empleado);
            switch(tipoDeEmpleado){
                case EMPLEADO_ALMACEN:
                    break;
                case ADMINISTRATIVO_OBRA:

                    mnuItemComprobarRecepcionMaquinariaEnObra.setEnabled(true);
                    mnuItemComprobarRecepcionMateriales.setEnabled(true);
                    mnuItemDarAltaAMaterial.setEnabled(true);

                    break;
                case ADMINISTRATIVO_MANO_DE_OBRA:
                    
                    break;
                case EMPLEADO_OBRA:
                    break;
                case JEFE_DE_OBRA:

                    mnuItemSolicitarMaterialParaUnaObra.setEnabled(true);

                    break;
                case ADMINISTRATIVO_PRESUPUESTOS:
                    mnuItemCrearObra.setEnabled(true);
                    mnuItemIntroducirPresupuesto.setEnabled(true);
                    break;
                case ADMINISTRATIVO_CONTABILIDAD:
                    break;
                case CONTACTO_PROVEEDOR:
                    break;
            }
        } catch (SQLException ex) {
            //Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Tipo de Persona no Válido");
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

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuObra = new javax.swing.JMenu();
        mnuItemCrearObra = new javax.swing.JMenuItem();
        mnuItemIntroducirPresupuesto = new javax.swing.JMenuItem();
        mnuItemIntroducirCantidadFacturada = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnuItemMonstrarBalanceDeObra = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        mnuMaterial = new javax.swing.JMenu();
        mnuItemSolicitarMaterialParaUnaObra = new javax.swing.JMenuItem();
        mnuItemAsignarMaterialAObra = new javax.swing.JMenuItem();
        mnuItemDarAltaAMaterial = new javax.swing.JMenuItem();
        mnuItemComprobarRecepcionMateriales = new javax.swing.JMenuItem();
        mnuEmpleado = new javax.swing.JMenu();
        mnuItemSolicitarPeriodoTrabajadorObra = new javax.swing.JMenuItem();
        mnuItemAsignarSueldoAEmpleado = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        mnuItemDarDeAltaAEmpleado = new javax.swing.JMenuItem();
        mnuItemDarAltaCategoriaEmpleado = new javax.swing.JMenuItem();
        mnuProveedor = new javax.swing.JMenu();
        mnuItemDarAltaProveedores = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuItemSolicitarMaquinariaParaUnaObra = new javax.swing.JMenuItem();
        mnuItemAsignarMaquinariaAObra = new javax.swing.JMenuItem();
        mnuDarAltaMaquinaria = new javax.swing.JMenuItem();
        mnuItemComprobarRecepcionMaquinariaEnObra = new javax.swing.JMenuItem();
        mnuAlbaran = new javax.swing.JMenu();
        mnuItemVerificarAlbaranDeCompra = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem4.setText("jMenuItem4");

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        mnuObra.setText("Obra");

        mnuItemCrearObra.setText("Crear Obra");
        mnuItemCrearObra.setEnabled(false);
        mnuItemCrearObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemCrearObraActionPerformed(evt);
            }
        });
        mnuObra.add(mnuItemCrearObra);

        mnuItemIntroducirPresupuesto.setText("Introducir Presupuesto");
        mnuItemIntroducirPresupuesto.setEnabled(false);
        mnuItemIntroducirPresupuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemIntroducirPresupuestoActionPerformed(evt);
            }
        });
        mnuObra.add(mnuItemIntroducirPresupuesto);

        mnuItemIntroducirCantidadFacturada.setText("Introducir Cantidad Facturada");
        mnuItemIntroducirCantidadFacturada.setEnabled(false);
        mnuObra.add(mnuItemIntroducirCantidadFacturada);

        jMenuItem2.setText("Introducir Cantidad Cobrada");
        jMenuItem2.setEnabled(false);
        mnuObra.add(jMenuItem2);

        mnuItemMonstrarBalanceDeObra.setText("Mostrar Balance de Obra");
        mnuItemMonstrarBalanceDeObra.setEnabled(false);
        mnuObra.add(mnuItemMonstrarBalanceDeObra);

        jMenuItem3.setText("Introducir Porcentaje de Obra Ejecutada");
        jMenuItem3.setEnabled(false);
        mnuObra.add(jMenuItem3);

        jMenuBar1.add(mnuObra);

        mnuMaterial.setText("Material");

        mnuItemSolicitarMaterialParaUnaObra.setText("Solicitar Material para una Obra");
        mnuItemSolicitarMaterialParaUnaObra.setEnabled(false);

        mnuItemSolicitarMaterialParaUnaObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemSolicitarMaterialParaUnaObraActionPerformed(evt);
            }
        });

        mnuMaterial.add(mnuItemSolicitarMaterialParaUnaObra);

        mnuItemAsignarMaterialAObra.setText("Asignar Material a Obra");
        mnuItemAsignarMaterialAObra.setEnabled(false);
        mnuMaterial.add(mnuItemAsignarMaterialAObra);

        mnuItemDarAltaAMaterial.setText("Dar de Alta a Material");
        mnuItemDarAltaAMaterial.setEnabled(false);

		
        mnuItemDarAltaAMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemDarAltaAMaterialActionPerformed(evt);
            }
        });

        mnuMaterial.add(mnuItemDarAltaAMaterial);

        mnuItemComprobarRecepcionMateriales.setText("Comprobar Recepción de Materiales");
        mnuItemComprobarRecepcionMateriales.setEnabled(false);
        mnuMaterial.add(mnuItemComprobarRecepcionMateriales);

        jMenuBar1.add(mnuMaterial);

        mnuEmpleado.setText("Empleado");

        mnuItemSolicitarPeriodoTrabajadorObra.setText("Solicitar Periodo de Trabajador para Obra");
        mnuItemSolicitarPeriodoTrabajadorObra.setEnabled(false);
        mnuItemSolicitarPeriodoTrabajadorObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemSolicitarPeriodoTrabajadorObraActionPerformed(evt);
            }
        });
        mnuEmpleado.add(mnuItemSolicitarPeriodoTrabajadorObra);

        mnuItemAsignarSueldoAEmpleado.setText("Asignar Sueldo a Empleado");
        mnuItemAsignarSueldoAEmpleado.setEnabled(false);
        mnuEmpleado.add(mnuItemAsignarSueldoAEmpleado);

        jMenuItem6.setText("Asignar horas de Trabajador a Obra");
        jMenuItem6.setEnabled(false);
        mnuEmpleado.add(jMenuItem6);

        mnuItemDarDeAltaAEmpleado.setText("Dar de Alta a Empleado");
        mnuItemDarDeAltaAEmpleado.setEnabled(false);
        mnuEmpleado.add(mnuItemDarDeAltaAEmpleado);

        mnuItemDarAltaCategoriaEmpleado.setText("Dar de Alta a Categoria de Empleado");
        mnuItemDarAltaCategoriaEmpleado.setEnabled(false);
        mnuEmpleado.add(mnuItemDarAltaCategoriaEmpleado);

        jMenuBar1.add(mnuEmpleado);

        mnuProveedor.setText("Proveedor");

        mnuItemDarAltaProveedores.setText("Dar de Alta a Proveedores");
        mnuItemDarAltaProveedores.setEnabled(false);
        mnuProveedor.add(mnuItemDarAltaProveedores);

        jMenuBar1.add(mnuProveedor);

        jMenu2.setText("Maquinaria");
        jMenu2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jMenu2ComponentHidden(evt);
            }
        });

        mnuItemSolicitarMaquinariaParaUnaObra.setText("Solicitar Maquinaria para una Obra");
        mnuItemSolicitarMaquinariaParaUnaObra.setEnabled(false);
        jMenu2.add(mnuItemSolicitarMaquinariaParaUnaObra);

        mnuItemAsignarMaquinariaAObra.setText("Asignar Maquinaria a Obra");
        mnuItemAsignarMaquinariaAObra.setEnabled(false);
        jMenu2.add(mnuItemAsignarMaquinariaAObra);

        mnuDarAltaMaquinaria.setText("Dar de Alta a Maquinaria");
        mnuDarAltaMaquinaria.setEnabled(false);
        jMenu2.add(mnuDarAltaMaquinaria);

        mnuItemComprobarRecepcionMaquinariaEnObra.setText("Comprobar Recepción Maquinaria en Obra");
        mnuItemComprobarRecepcionMaquinariaEnObra.setEnabled(false);


        mnuItemComprobarRecepcionMaquinariaEnObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemComprobarRecepcionMaquinariaEnObraActionPerformed(evt);
            }
        });


        jMenu2.add(mnuItemComprobarRecepcionMaquinariaEnObra);

        jMenuBar1.add(jMenu2);

        mnuAlbaran.setText("Albarán");

        mnuItemVerificarAlbaranDeCompra.setText("Verificar Albarán de Compra");
        mnuItemVerificarAlbaranDeCompra.setEnabled(false);
        mnuAlbaran.add(mnuItemVerificarAlbaranDeCompra);

        jMenuBar1.add(mnuAlbaran);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuItemCrearObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemCrearObraActionPerformed
        // Para hacerlo con un JDialog (alternativamente)

        DialogoObra dialogoObra = new DialogoObra(this, true);
        dialogoObra.setVisible(true);
        
        // Para hacerlo con un JPanel (alternativamente)
        //JPanel panel = new PanelObra(MNU_CREAR_OBRA);
        //setContentPane(panel);
        //pack();

    }//GEN-LAST:event_mnuItemCrearObraActionPerformed

    private void mnuItemSolicitarPeriodoTrabajadorObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemSolicitarPeriodoTrabajadorObraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuItemSolicitarPeriodoTrabajadorObraActionPerformed

    private void jMenu2ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jMenu2ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ComponentHidden

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void mnuItemIntroducirPresupuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemIntroducirPresupuestoActionPerformed
        // Para hacerlo con un JDialog (alternativamente)
        //DialogoObra dialogoObra = new DialogoObra(this, true);
        //dialogoObra.setVisible(true);
        
        // Para hacerlo con un JPanel (alternativamente)
        JPanel panel = new PanelObra(MNU_INTRODUCIR_PRESUPUESTO);
        setContentPane(panel);
        pack();
    }//GEN-LAST:event_mnuItemIntroducirPresupuestoActionPerformed



    private void mnuItemComprobarRecepcionMaquinariaEnObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemComprobarRecepcionMaquinariaEnObraActionPerformed
       DialogoMaquinariaObra dialogoMaquinariaObra = new DialogoMaquinariaObra(this, true);
        dialogoMaquinariaObra.setVisible(true);
    }//GEN-LAST:event_mnuItemComprobarRecepcionMaquinariaEnObraActionPerformed

    private void mnuItemDarAltaAMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemDarAltaAMaterialActionPerformed
        // TODO add your handling code here:
        DarDeAltaMaterial altaMaterial = new DarDeAltaMaterial(this, true);
        altaMaterial.setVisible(true);
       
    }//GEN-LAST:event_mnuItemDarAltaAMaterialActionPerformed


    private void mnuItemSolicitarMaterialParaUnaObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemSolicitarMaterialParaUnaObraActionPerformed
        //CODIGO DE RUBEN PARA INVOCAR LA VENTANA SOLICITAR MATERIAL PARA OBRA
        PanelSolicitarMaterialObra PanelSolicitarMaterial=new PanelSolicitarMaterialObra();
        setContentPane(PanelSolicitarMaterial);
        pack();
    }//GEN-LAST:event_mnuItemSolicitarMaterialParaUnaObraActionPerformed


    
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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenu mnuAlbaran;
    private javax.swing.JMenuItem mnuDarAltaMaquinaria;
    private javax.swing.JMenu mnuEmpleado;
    private javax.swing.JMenuItem mnuItemAsignarMaquinariaAObra;
    private javax.swing.JMenuItem mnuItemAsignarMaterialAObra;
    private javax.swing.JMenuItem mnuItemAsignarSueldoAEmpleado;
    private javax.swing.JMenuItem mnuItemComprobarRecepcionMaquinariaEnObra;
    private javax.swing.JMenuItem mnuItemComprobarRecepcionMateriales;
    private javax.swing.JMenuItem mnuItemCrearObra;
    private javax.swing.JMenuItem mnuItemDarAltaAMaterial;
    private javax.swing.JMenuItem mnuItemDarAltaCategoriaEmpleado;
    private javax.swing.JMenuItem mnuItemDarAltaProveedores;
    private javax.swing.JMenuItem mnuItemDarDeAltaAEmpleado;
    private javax.swing.JMenuItem mnuItemIntroducirCantidadFacturada;
    private javax.swing.JMenuItem mnuItemIntroducirPresupuesto;
    private javax.swing.JMenuItem mnuItemMonstrarBalanceDeObra;
    private javax.swing.JMenuItem mnuItemSolicitarMaquinariaParaUnaObra;
    private javax.swing.JMenuItem mnuItemSolicitarMaterialParaUnaObra;
    private javax.swing.JMenuItem mnuItemSolicitarPeriodoTrabajadorObra;
    private javax.swing.JMenuItem mnuItemVerificarAlbaranDeCompra;
    private javax.swing.JMenu mnuMaterial;
    private javax.swing.JMenu mnuObra;
    private javax.swing.JMenu mnuProveedor;
    // End of variables declaration//GEN-END:variables
}
