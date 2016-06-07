package POJOS;



import java.util.Date;

public class PeriodoMaquinariaEnObra {

    public JefeDeObra jefeDeObra;
    public EmpleadoAlmacen empleadoAlmacen;
    public AdministrativoObra administrativoObra;
    public Obra obra;
    public Maquinaria maquinaria;
    private int PK_ID;
    private Date fechaInicio;
    private Date fechaFin;
    private Date fechaSolicitud;
    private Date fechaRecepcion;

    public JefeDeObra getJefeDeObra() {
        return jefeDeObra;
    }

    public void setJefeDeObra(JefeDeObra jefeDeObra) {
        this.jefeDeObra = jefeDeObra;
    }

    public EmpleadoAlmacen getEmpleadoAlmacen() {
        return empleadoAlmacen;
    }

    public void setEmpleadoAlmacen(EmpleadoAlmacen empleadoAlmacen) {
        this.empleadoAlmacen = empleadoAlmacen;
    }

    public AdministrativoObra getAdministrativoObra() {
        return administrativoObra;
    }

    public void setAdministrativoObra(AdministrativoObra administrativoObra) {
        this.administrativoObra = administrativoObra;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public Maquinaria getMaquinaria() {
        return maquinaria;
    }

    public void setMaquinaria(Maquinaria maquinaria) {
        this.maquinaria = maquinaria;
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

    public PeriodoMaquinariaEnObra() {
        // TODO - implement PeriodoMaquinariaEnObra.PeriodoMaquinariaEnObra

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

    /**
     *
     * @param parameter
     */
    public int getPK_ID() {
        return PK_ID;
    }

    public void setPK_ID(int ID) {
        this.PK_ID = ID;
    }





	/**
	 * 
	 * @param parameter
	 */
	public PeriodoMaquinariaEnObra(int parameter) {
		// TODO - implement PeriodoMaquinariaEnObra.PeriodoMaquinariaEnObra
		throw new UnsupportedOperationException();
	}

}

