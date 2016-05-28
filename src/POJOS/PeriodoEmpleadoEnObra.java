package POJOS;

import dba.PersonaDba;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class PeriodoEmpleadoEnObra {
        
    int PK_ID;

    int empleadoObra_ID;
    int obra_ID;
    int jefeDeObra_ID;

    int administrativoManoObra_ID;

    private Date fechaInicio;
    private Date fechaFin;
    private Date fechaSolicitud;
    private Date fechaRecepcion;
    /**
     * Parte proporcional del sueldo correspondiente a la categor�a del trabajador en el momento de la asignaci�n
     */
    private float coste;

    public float calcularCoste(int empleadoObra_ID, Date fechaInicio, Date fechaFin) {

        // Primero calculamos el coste por hora en general del empleado, segun lo que cobra por su categoria:
        Empleado empleadoParaAsignarAObra = null;
        try {
            empleadoParaAsignarAObra = PersonaDba.getEmpleado(empleadoObra_ID);
        } catch (SQLException ex) {
            Logger.getLogger(PeriodoEmpleadoEnObra.class.getName()).log(Level.SEVERE, null, ex);
        }
        Categoria categoriaDelEmpleadoParaAsignarAObra = empleadoParaAsignarAObra.getCategoria();
        float costePorHoraDeLaCategoriaDelEmpleado = categoriaDelEmpleadoParaAsignarAObra.getCoste();

        // Ahora calculamos el coste diario multiplicando esas horas por 8 de la jornada laboral:
        float costeDiarioDelEmpleado = costePorHoraDeLaCategoriaDelEmpleado * 8;

        // Los dias que se le asigna a la obra:
        int diasDeAsignacionALaObra = diferenciaEnDias (fechaFin, fechaInicio); // Metodo siguiente

        // Coste total: 
        return costeDiarioDelEmpleado * diasDeAsignacionALaObra;
    }

    public static int diferenciaEnDias(Date fechaMayor, Date fechaMenor) {
        long diferenciaEn_ms = fechaMayor.getTime() - fechaMenor.getTime();
        long dias = diferenciaEn_ms / (1000 * 60 * 60 * 24);
        return (int) dias;
    }
    
    public void setCoste (float coste) {
        this.coste = coste;
    }

    public float getCoste () {
        return this.coste;
    }       

    public Date getFechaFin() {
            return this.fechaFin;
    }

    /**
     * 
     * @param fechaFin
     */
    public void setFechaFin(Date fechaFin) {
            this.fechaFin = fechaFin;
    }

    public Date getFechaInicio() {
            return this.fechaInicio;
    }

    /**
     * 
     * @param fechaInicio
     */
    public void setFechaInicio(Date fechaInicio) {
            this.fechaInicio = fechaInicio;
    }

    public Date getFechaRecepcion() {
            return this.fechaRecepcion;
    }

    /**
     * 
     * @param fechaRecepcion
     */
    public void setFechaRecepcion(Date fechaRecepcion) {
            this.fechaRecepcion = fechaRecepcion;
    }

    public Date getFechaSolicitud() {
            return this.fechaSolicitud;
    }

    /**
     * 
     * @param fechaSolicitud
     */
    public void setFechaSolicitud(Date fechaSolicitud) {
            this.fechaSolicitud = fechaSolicitud;
    }




    public PeriodoEmpleadoEnObra() {
            // TODO - implement PeriodoEmpleadoEnObra.PeriodoEmpleadoEnObra
    }

    public int getPK_ID() {
        return PK_ID;
    }

    public void setPK_ID(int PK_ID) {
        this.PK_ID = PK_ID;
    }
        
        
    public int getEmpleadoObra_ID() {
        return empleadoObra_ID;
    }

    public void setEmpleadoObra_ID(int empleadoObra_ID) {
        this.empleadoObra_ID = empleadoObra_ID;
    }

    public int getObra_ID() {
        return obra_ID;
    }

    public void setObra_ID(int obra_ID) {
        this.obra_ID = obra_ID;
    }

    public int getJefeDeObra_ID() {
        return jefeDeObra_ID;
    }

    public void setJefeDeObra_ID(int jefeDeObra_ID) {
        this.jefeDeObra_ID = jefeDeObra_ID;
    }

    public int getAdministrativoManoObra_ID() {
        return administrativoManoObra_ID;
    }

    public void setAdministrativoManoObra_ID(int administrativoManoObra_ID) {
        this.administrativoManoObra_ID = administrativoManoObra_ID;
    }

        
        
        
        
        
        
        
        
        
        
        
        
}