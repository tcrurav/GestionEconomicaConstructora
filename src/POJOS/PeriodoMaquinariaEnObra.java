package POJOS;

import java.util.*;
public class PeriodoMaquinariaEnObra {




        
        private int PK_ID;
	private Obra obra;
	private Maquinaria maquinaria;
	private Date fechaInicio;
	private Date fechaFin;
	private JefeDeObra jefeDeObra;
	private EmpleadoAlmacen empleadoAlmacen;
	private Date fechaSolicitud;
	private Date fechaRecepcion;

    /**
     * @return the PK_ID
     */
    public int getPK_ID() {
        return PK_ID;
    }

    /**
     * @param PK_ID the PK_ID to set
     */
    public void setPK_ID(int PK_ID) {
        this.PK_ID = PK_ID;
    }

    /**
     * @return the obra
     */
    public Obra getObra() {
        return obra;
    }

    /**
     * @param obra the obra to set
     */
    public void setObra(Obra obra) {
        this.obra = obra;
    }

    /**
     * @return the maquinaria
     */
    public Maquinaria getMaquinaria() {
        return maquinaria;
    }

    /**
     * @param maquinaria the maquinaria to set
     */
    public void setMaquinaria(Maquinaria maquinaria) {
        this.maquinaria = maquinaria;
    }

    /**
     * @return the fechaInicio
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaFin
     */
    public Date getFechaFin() {
        return fechaFin;
    }

    /**
     * @param fechaFin the fechaFin to set
     */
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * @return the jefeDeObra
     */
    public JefeDeObra getJefeDeObra() {
        return jefeDeObra;
    }

    /**
     * @param jefeDeObra the jefeDeObra to set
     */
    public void setJefeDeObra(JefeDeObra jefeDeObra) {
        this.jefeDeObra = jefeDeObra;
    }

    /**
     * @return the empleadoAlmacen
     */
    public EmpleadoAlmacen getEmpleadoAlmacen() {
        return empleadoAlmacen;
    }

    /**
     * @param empleadoAlmacen the empleadoAlmacen to set
     */
    public void setEmpleadoAlmacen(EmpleadoAlmacen empleadoAlmacen) {
        this.empleadoAlmacen = empleadoAlmacen;
    }

    /**
     * @return the fechaSolicitud
     */
    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    /**
     * @param fechaSolicitud the fechaSolicitud to set
     */
    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    /**
     * @return the fechaRecepcion
     */
    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    /**
     * @param fechaRecepcion the fechaRecepcion to set
     */
    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

}