
import POJOS.AdministrativoObra;
import java.util.Date;

public class PeriodoMaquinariaEnObra {

	private JefeDeObra jefeDeObra;
	private EmpleadoAlmacen empleadoAlmacen;
	private AdministrativoObra administrativoObra;
	private Obra obra;
	private Maquinaria maquinaria;
	private int PK_ID;
	private Date fechaInicio;
	private Date fechaFin;
	private Date fechaSolicitud;
	private Date fechaRecepcion;

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
		throw new UnsupportedOperationException();
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
	public PeriodoMaquinariaEnObra(int parameter) {
		// TODO - implement PeriodoMaquinariaEnObra.PeriodoMaquinariaEnObra
		throw new UnsupportedOperationException();
	}


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

    public int getID() {
        return PK_ID;
    }

    public void setID(int ID) {
        this.PK_ID = ID;
    }
}