/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MaquinariaObra;

import POJOS.AdministrativoObra;
import POJOS.EmpleadoAlmacen;
import POJOS.JefeDeObra;
import POJOS.Maquinaria;
import POJOS.Obra;
import POJOS.PeriodoMaquinariaEnObra;
import static gestioneconomicaconstructora.OpcionesDeMenu.MNU_COMPROBAR_RECEPCION_MAQUINARIA_EN_OBRA;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Albbe
 */

public class DialogoMaquinariaObra extends javax.swing.JDialog {
    
    ArrayList<PeriodoMaquinariaEnObra> periodomaquinariaenobra = new ArrayList<PeriodoMaquinariaEnObra>();
     ArrayList<Obra> obras = new ArrayList<Obra>();
     ArrayList<JefeDeObra> jefesDeObra = new ArrayList<JefeDeObra>();
     ArrayList<AdministrativoObra> administrativosObra = new ArrayList<AdministrativoObra>();
     ArrayList<EmpleadoAlmacen> empleadosAlmacen = new ArrayList<EmpleadoAlmacen>();
     ArrayList<Maquinaria> maquinarias = new ArrayList();
     

    DefaultTableModel modelo;
    int menuActual;
    int helperEmpleadoAlmacen;
    int helperJefesDeObra;
    int helperMaquinarias;
    int helperObras; 
    int helperAdministrativosObra;
    /**
     * Creates new form PanelMaquinaObra
     */
    public DialogoMaquinariaObra(java.awt.Frame parent, boolean modal)/*dentro de los parentesis va int menuActual*/ {
       super(parent, modal);
        this.setTitle("Constructora - PeriodoMaquinariaEnObra");
        initComponents();
       this.menuActual = menuActual;
       deshabilitar();
        llenar();
        this.pack();      
        this.setLocationRelativeTo(null);
        LLenarCboObra();
        LlenarCboJefeObra();
        LlenarCboEmpleadoAlmacen();
        LlenarCboAdministrativoObra();
        LlenarCboMaquinaria();
       
        
    }
     
    
    
    
    
    public void LLenarCboObra(){
       
        try{
            obras = dba.ObraDba.getObras();
        }catch (SQLException ex){
             //Logger.getLogger(fPeriodoMaquinariaEnObra.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        for (Obra obra: obras){
            CboObra.addItem(obra.getDireccion());
        }
    }
    
    
        
        public void LlenarCboJefeObra(){
           
           try{
               jefesDeObra = dba.PersonaDba.getJefesDeObra();
           } catch (SQLException ex){
               
           }
           for (JefeDeObra jefedeobra: jefesDeObra ){
               CboJefeObra.addItem(jefedeobra.getNombre());
           }
    
            }
        
            
            public void LlenarCboEmpleadoAlmacen(){
                
                
                try{
                    empleadosAlmacen= dba.PersonaDba.getEmpleadosAlmacen();
                    
                }catch (SQLException ex){
                    
                }
                for (EmpleadoAlmacen empleadoalmacen: empleadosAlmacen){
                    CboEmpleadoAlmacen.addItem(empleadoalmacen.getNombre());
                }
            }
            
            public void LlenarCboAdministrativoObra(){
                
                
                try{
                    administrativosObra = dba.PersonaDba.getAdministrativosObra();
                }catch (SQLException ex){
                    
                }
                for (AdministrativoObra administrativoobra: administrativosObra){
                    CboAdministrativoObra.addItem(administrativoobra.getNombre());
                }
            }
            
            
            
             public void LlenarCboMaquinaria(){
                
                
                try{
                    maquinarias = dba.MaquinariaDba.getMaquinarias();
                }catch (SQLException ex){
                    
                }
                for (Maquinaria maquinaria: maquinarias){
                    CboMaquinaria.addItem(maquinaria.getNombre());
                }
            }
            
            

    public void limpiar(){
        final Calendar instance = Calendar.getInstance();
        jxDateFechaInicio.setDate(instance.getTime());
        jxDateFechaFin.setDate(instance.getTime());
        jxDateFechaRecepcion.setDate(instance.getTime());
        jxDateFechaSolicitud.setDate(instance.getTime());
        
    }
    
    public void habilitar(){
            jxDateFechaInicio.setEnabled(true);
            jxDateFechaFin.setEnabled(true);
            jxDateFechaRecepcion.setEnabled(true);
            jxDateFechaSolicitud.setEnabled(true);
            CboObra.setEnabled(true);
            CboJefeObra.setEnabled(true);
            CboEmpleadoAlmacen.setEnabled(true);
            CboAdministrativoObra.setEnabled(true);
            CboMaquinaria.setEnabled(true);
       
       
        if(menuActual == MNU_COMPROBAR_RECEPCION_MAQUINARIA_EN_OBRA){
            jxDateFechaInicio.setEnabled(true);
        jxDateFechaFin.setEnabled(true);
            jxDateFechaRecepcion.setEnabled(true);
            jxDateFechaSolicitud.setEnabled(true);
            CboObra.setEnabled(true);
            CboJefeObra.setEnabled(true);
            CboEmpleadoAlmacen.setEnabled(true);
            CboAdministrativoObra.setEnabled(true);
            CboMaquinaria.setEnabled(true);
            
            
        }
    }
    
    public void deshabilitar(){
        jxDateFechaInicio.setEnabled(false);
        jxDateFechaFin.setEnabled(false); 
        jxDateFechaRecepcion.setEnabled(false);
        jxDateFechaSolicitud.setEnabled(false);
        CboObra.setEnabled(false);
        CboJefeObra.setEnabled(false);
        CboEmpleadoAlmacen.setEnabled(false);
        CboAdministrativoObra.setEnabled(false);
        CboMaquinaria.setEnabled(false);
        
        
    }
    
    public void llenar(){
        String titulos [] = {"ID", "EmpleadoAlmacenQueAsignaID", "JefeDeObra", "FechaInicio", "FechaFin", "FechaSolicitud", "FechaRecepcion","Maquinaria", "Obra", "AdministrativoObra"  };
        modelo = new DefaultTableModel(null, titulos);
        
        String fila [] = new String [10];
        
        ArrayList<PeriodoMaquinariaEnObra> maquinarias = new ArrayList<>();
        
         try {
            maquinarias = dba.PeriodoMaquinariaEnObraDba.getPeriodoMaquinariasEnObras();
        } catch (SQLException ex) {
            Logger.getLogger(DialogoMaquinariaObra.class.getName()).log(Level.SEVERE, null, ex);
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
            fila[9] = periodomaquinariaenobra.getAdministrativoObra().getNombre();
            
           // fila[1] = String.valueOf(periodomaquinariaenobra.empleadoAlmacen.getNombre());
            //fila[2] = String.valueOf(periodomaquinariaenobra.jefeDeObra.getNombre());
            //fila[3] = String.valueOf(periodomaquinariaenobra.getFechaInicio());
            //fila[4] = String.valueOf(periodomaquinariaenobra.getFechaFin());
           // fila[5] = String.valueOf(periodomaquinariaenobra.getFechaSolicitud());
           // fila[6] = String.valueOf(periodomaquinariaenobra.getFechaRecepcion());
           // fila[7] = String.valueOf(periodomaquinariaenobra.maquinaria.getNombre());
           // fila[8] = String.valueOf(periodomaquinariaenobra.obra.getDireccion());
           // fila[9] = String.valueOf(periodomaquinariaenobra.administrativoObra.getNombre());
            
            

            modelo.addRow(fila);
        }

        TablaMaquinariaObra.setModel(modelo);
               
    }
    
    public void nuevo() {
        PeriodoMaquinariaEnObra periodomaquinariaenobra = new PeriodoMaquinariaEnObra();

        try {
            periodomaquinariaenobra.setObra(obras.get(CboObra.getSelectedIndex()));
            periodomaquinariaenobra.setJefeDeObra(jefesDeObra.get(CboJefeObra.getSelectedIndex()));
            periodomaquinariaenobra.setAdministrativoObra(administrativosObra.get(CboAdministrativoObra.getSelectedIndex()));
            periodomaquinariaenobra.setEmpleadoAlmacen(empleadosAlmacen.get(CboEmpleadoAlmacen.getSelectedIndex()));
            periodomaquinariaenobra.setMaquinaria(maquinarias.get(CboMaquinaria.getSelectedIndex()));
            //Obra obra = obras.get(CboObra.getSelectedIndex());
            //periodomaquinariaenobra.setObra(obra);
            
            //JefeDeObra jefeDeObra = jefesDeObra.get(CboJefeObra.getSelectedIndex());
            //periodomaquinariaenobra.setJefeDeObra(jefeDeObra);
            
           // AdministrativoObra administrativoobra = administrativosObra.get(CboAdministrativoObra.getSelectedIndex());
           // periodomaquinariaenobra.setAdministrativoObra(administrativoobra);
            
            //EmpleadoAlmacen empleadoAlmacen = empleadosAlmacen.get(CboEmpleadoAlmacen.getSelectedIndex());
            //periodomaquinariaenobra.setEmpleadoAlmacen(empleadoAlmacen);
            
            //Maquinaria maquinaria = maquinarias.get(CboMaquinaria.getSelectedIndex());
           // periodomaquinariaenobra.setMaquinaria(maquinaria);
       
            periodomaquinariaenobra.setFechaInicio(jxDateFechaInicio.getDate());
            
            periodomaquinariaenobra.setFechaFin(jxDateFechaFin.getDate());
            
            periodomaquinariaenobra.setFechaRecepcion(jxDateFechaRecepcion.getDate());
            
            periodomaquinariaenobra.setFechaSolicitud(jxDateFechaSolicitud.getDate());
            
          

            if (dba.PeriodoMaquinariaEnObraDba.insertPeriodoMaquinariaEnObra(periodomaquinariaenobra)) {
                JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente.");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Se ha producido un Error. Error:" + ex.getMessage());
        }

    }
    
    
      public void modificar() {
        int fila = TablaMaquinariaObra.getSelectedRow();
        String identificador = (String) TablaMaquinariaObra.getValueAt(fila, 0);

        PeriodoMaquinariaEnObra periodomaquinariaenobra = new PeriodoMaquinariaEnObra();

        try {
            empleadosAlmacen= dba.PersonaDba.getEmpleadosAlmacen();
            jefesDeObra = dba.PersonaDba.getJefesDeObra();
            administrativosObra = dba.PersonaDba.getAdministrativosObra();
            maquinarias = dba.MaquinariaDba.getMaquinarias();
            obras = dba.ObraDba.getObras();
            
        }catch (SQLException ex) {
            Logger.getLogger(DialogoMaquinariaObra.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            
            periodomaquinariaenobra.setPK_ID(Integer.parseInt(identificador));
            periodomaquinariaenobra.setEmpleadoAlmacen(empleadosAlmacen.get(CboEmpleadoAlmacen.getSelectedIndex()));
            periodomaquinariaenobra.setJefeDeObra(jefesDeObra.get(CboJefeObra.getSelectedIndex()));
            periodomaquinariaenobra.setFechaInicio(jxDateFechaInicio.getDate());
            periodomaquinariaenobra.setFechaFin(jxDateFechaFin.getDate());
            periodomaquinariaenobra.setFechaRecepcion(jxDateFechaRecepcion.getDate());
            periodomaquinariaenobra.setFechaSolicitud(jxDateFechaSolicitud.getDate());
            periodomaquinariaenobra.setMaquinaria(maquinarias.get(CboMaquinaria.getSelectedIndex()));
            periodomaquinariaenobra.setObra(obras.get(CboObra.getSelectedIndex()));
            periodomaquinariaenobra.setAdministrativoObra(administrativosObra.get(CboAdministrativoObra.getSelectedIndex()));
            
            
            
        
            
          /* Obra obra = obras.get(CboObra.getSelectedIndex());
            periodomaquinariaenobra.setObra(obra);
            
           JefeDeObra jefeDeObra = jefesDeObra.get(CboJefeObra.getSelectedIndex());
           periodomaquinariaenobra.setJefeDeObra(jefeDeObra);
            
            AdministrativoObra administrativoobra = administrativosObra.get(CboAdministrativoObra.getSelectedIndex());
            periodomaquinariaenobra.setAdministrativoObra(administrativoobra);
            
            EmpleadoAlmacen empleadoAlmacen = empleadosAlmacen.get(CboEmpleadoAlmacen.getSelectedIndex());
            periodomaquinariaenobra.setEmpleadoAlmacen(empleadoAlmacen);
            
            Maquinaria maquinaria = maquinarias.get(CboMaquinaria.getSelectedIndex());
            periodomaquinariaenobra.setMaquinaria(maquinaria);
            
            
            
            periodomaquinariaenobra.setFechaInicio(jxDateFechaInicio.getDate());
            
            periodomaquinariaenobra.setFechaFin(jxDateFechaFin.getDate());
            
            periodomaquinariaenobra.setFechaRecepcion(jxDateFechaRecepcion.getDate());
            
            periodomaquinariaenobra.setFechaSolicitud(jxDateFechaSolicitud.getDate());*/

            if (dba.PeriodoMaquinariaEnObraDba.updatePeriodoMaquinariaEnObra(periodomaquinariaenobra)) {
                JOptionPane.showMessageDialog(null, "Datos Modificados");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }

    }
      
       public void borrar() {
        int fila = TablaMaquinariaObra.getSelectedRow();
        String identificador = (String) TablaMaquinariaObra.getValueAt(fila, 0);

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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        campoFechaFin = new javax.swing.JPanel();
        jFechaInicio = new javax.swing.JLabel();
        jFechaFin = new javax.swing.JLabel();
        jxDateFechaInicio = new org.jdesktop.swingx.JXDatePicker();
        jxDateFechaFin = new org.jdesktop.swingx.JXDatePicker();
        jObraID = new javax.swing.JLabel();
        jFechaRecepcion = new javax.swing.JLabel();
        jMaquinaria = new javax.swing.JLabel();
        jxDateFechaRecepcion = new org.jdesktop.swingx.JXDatePicker();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaMaquinariaObra = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        CboObra = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jxDateFechaSolicitud = new org.jdesktop.swingx.JXDatePicker();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CboJefeObra = new javax.swing.JComboBox<>();
        CboEmpleadoAlmacen = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        CboAdministrativoObra = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        CboMaquinaria = new javax.swing.JComboBox<>();

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

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        campoFechaFin.setBorder(javax.swing.BorderFactory.createTitledBorder("MaquinariaObra"));
        campoFechaFin.setToolTipText("");
        campoFechaFin.setName(""); // NOI18N

        jFechaInicio.setText("Fecha de Inicio:");

        jFechaFin.setText("Fecha de Fin:");

        jxDateFechaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jxDateFechaInicioActionPerformed(evt);
            }
        });

        jFechaRecepcion.setText("Fecha Recepcion:");

        jMaquinaria.setText("Obra:");

        TablaMaquinariaObra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID:", "Fecha de Inicio:", "Fecha de Fin:", "Maquinaria:", "Fecha Recepcion:", "Fecha Solicitud:"
            }
        ));
        TablaMaquinariaObra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMaquinariaObraMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TablaMaquinariaObra);

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

        CboObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboObraActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha de Solicitud:");

        jLabel3.setText("Jefe de Obra:");

        jLabel4.setText("Empleado Almacen:");

        jLabel5.setText("Administrativo:");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel6.setText("Maquinaria:");

        javax.swing.GroupLayout campoFechaFinLayout = new javax.swing.GroupLayout(campoFechaFin);
        campoFechaFin.setLayout(campoFechaFinLayout);
        campoFechaFinLayout.setHorizontalGroup(
            campoFechaFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(campoFechaFinLayout.createSequentialGroup()
                .addGroup(campoFechaFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(campoFechaFinLayout.createSequentialGroup()
                        .addGroup(campoFechaFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(campoFechaFinLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jObraID, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jMaquinaria, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFechaRecepcion)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(campoFechaFinLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnNuevo)))
                        .addGap(39, 39, 39)
                        .addGroup(campoFechaFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(campoFechaFinLayout.createSequentialGroup()
                                .addGroup(campoFechaFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jxDateFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                                    .addComponent(jxDateFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jxDateFechaRecepcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CboObra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jxDateFechaSolicitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(52, 52, 52)
                                .addGroup(campoFechaFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(campoFechaFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CboJefeObra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CboEmpleadoAlmacen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CboAdministrativoObra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CboMaquinaria, 0, 130, Short.MAX_VALUE)))
                            .addGroup(campoFechaFinLayout.createSequentialGroup()
                                .addComponent(btnModificar)
                                .addGap(78, 78, 78)
                                .addComponent(btnBorrar)
                                .addGap(156, 156, 156)
                                .addComponent(btnGuardar)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        campoFechaFinLayout.setVerticalGroup(
            campoFechaFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(campoFechaFinLayout.createSequentialGroup()
                .addGroup(campoFechaFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(campoFechaFinLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(campoFechaFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jxDateFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFechaInicio)
                            .addComponent(jLabel3)
                            .addComponent(CboJefeObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(campoFechaFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFechaFin)
                            .addComponent(jxDateFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(CboEmpleadoAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(campoFechaFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jMaquinaria)
                            .addComponent(CboObra, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(campoFechaFinLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(campoFechaFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(CboAdministrativoObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(campoFechaFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(campoFechaFinLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(campoFechaFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFechaRecepcion)
                            .addComponent(jxDateFechaRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(campoFechaFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(campoFechaFinLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(campoFechaFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jxDateFechaSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(campoFechaFinLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(campoFechaFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jObraID))))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, campoFechaFinLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(campoFechaFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(CboMaquinaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)))
                .addGroup(campoFechaFinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnNuevo)
                    .addComponent(btnBorrar)
                    .addComponent(btnGuardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(campoFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jxDateFechaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jxDateFechaInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jxDateFechaInicioActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiar();
        habilitar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void CboObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboObraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CboObraActionPerformed

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

    private void TablaMaquinariaObraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMaquinariaObraMouseClicked
      if (evt.getButton() == 1) {
            int fila = TablaMaquinariaObra.getSelectedRow();
            PeriodoMaquinariaEnObra periodomaquinariaenobra = new PeriodoMaquinariaEnObra();
            try {
                periodomaquinariaenobra = dba.PeriodoMaquinariaEnObraDba.getPeriodoMaquinariaEnObra(Integer.parseInt(String.valueOf(TablaMaquinariaObra.getValueAt(fila, 0))));
            } catch (SQLException ex) {
                Logger.getLogger(DialogoMaquinariaObra.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                
                empleadosAlmacen= dba.PersonaDba.getEmpleadosAlmacen();
                jefesDeObra = dba.PersonaDba.getJefesDeObra();
                administrativosObra = dba.PersonaDba.getAdministrativosObra();
                maquinarias = dba.MaquinariaDba.getMaquinarias();
                obras = dba.ObraDba.getObras();
            
        }catch (SQLException ex) {
            Logger.getLogger(DialogoMaquinariaObra.class.getName()).log(Level.SEVERE, null, ex);
        }
            
                
                 for (EmpleadoAlmacen empleadoAlmacen : empleadosAlmacen) {        
                if(empleadoAlmacen.getPK_ID()==periodomaquinariaenobra.getEmpleadoAlmacen().getPK_ID()){
                    helperEmpleadoAlmacen = (int) empleadosAlmacen.indexOf(empleadoAlmacen);
                }
            }
                 
                 for (JefeDeObra jefeDeObra : jefesDeObra) {        
                if(jefeDeObra.getPK_ID()==periodomaquinariaenobra.getJefeDeObra().getPK_ID()){
                    helperJefesDeObra = jefesDeObra.indexOf(jefeDeObra);
                }
            }
                 
                  for (Maquinaria maquinaria : maquinarias) {        
                if(maquinaria.getPK_ID()==periodomaquinariaenobra.getMaquinaria().getPK_ID()){
                   helperMaquinarias = maquinarias.indexOf(maquinaria);
                }
            }
                  
                   for (Obra obra : obras) {        
                if(obra.getPK_ID()==periodomaquinariaenobra.getObra().getPK_ID()){
                    helperObras = obras.indexOf(obra);
                }
            }
                   
                   for (AdministrativoObra administrativoObra : administrativosObra){
                       
                       if(administrativoObra.getPK_ID()==periodomaquinariaenobra.getObra().getPK_ID()){
                           helperAdministrativosObra = administrativosObra.indexOf(administrativoObra);
                       }
                   }
                   
                   try{
                
                jxDateFechaInicio.setDate(periodomaquinariaenobra.getFechaInicio());
                jxDateFechaFin.setDate(periodomaquinariaenobra.getFechaFin());
                jxDateFechaRecepcion.setDate(periodomaquinariaenobra.getFechaRecepcion());
                jxDateFechaSolicitud.setDate(periodomaquinariaenobra.getFechaSolicitud());
                CboObra.setSelectedItem(String.valueOf(periodomaquinariaenobra.getObra()));
                CboEmpleadoAlmacen.setSelectedItem(String.valueOf(periodomaquinariaenobra.getEmpleadoAlmacen()));
                CboJefeObra.setSelectedItem(String.valueOf(periodomaquinariaenobra.getJefeDeObra()));
                CboAdministrativoObra.setSelectedItem(String.valueOf(periodomaquinariaenobra.getAdministrativoObra()));
                CboMaquinaria.setSelectedItem(String.valueOf(periodomaquinariaenobra.getMaquinaria()));
                
               

                habilitar();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido leer la información en la BD");
            }
            }
            
        
    }//GEN-LAST:event_TablaMaquinariaObraMouseClicked

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
            java.util.logging.Logger.getLogger(DialogoMaquinariaObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogoMaquinariaObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogoMaquinariaObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogoMaquinariaObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogoMaquinariaObra dialog = new DialogoMaquinariaObra(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> CboAdministrativoObra;
    private javax.swing.JComboBox<String> CboEmpleadoAlmacen;
    private javax.swing.JComboBox<String> CboJefeObra;
    private javax.swing.JComboBox<String> CboMaquinaria;
    private javax.swing.JComboBox<String> CboObra;
    private javax.swing.JTable TablaMaquinariaObra;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JPanel campoFechaFin;
    private javax.swing.JLabel jFechaFin;
    private javax.swing.JLabel jFechaInicio;
    private javax.swing.JLabel jFechaRecepcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jMaquinaria;
    private javax.swing.JLabel jObraID;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private org.jdesktop.swingx.JXDatePicker jxDateFechaFin;
    private org.jdesktop.swingx.JXDatePicker jxDateFechaInicio;
    private org.jdesktop.swingx.JXDatePicker jxDateFechaRecepcion;
    private org.jdesktop.swingx.JXDatePicker jxDateFechaSolicitud;
    // End of variables declaration//GEN-END:variables
}
