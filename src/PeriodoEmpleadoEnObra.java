import java.util.*;
public class PeriodoEmpleadoEnObra {

	EmpleadoObra empleado;
	Obra obra;
	private Date fechaInicio;
	private Date fechaFin;
	JefeDeObra jefeDeObra;
	AdministrativoManoDeObra administrativoManoObra;
	/**
	 * Parte proporcional del sueldo correspondiente a la categor�a del trabajador en el momento de la asignaci�n
	 */
	private float coste;
	private Date fechaSolicitud;
	private Date fechaRecepcion;

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

	public float getCoste() {
		return this.coste;
	}

	/**
	 * 
	 * @param coste
	 */
	public void setCoste(float coste) {
		this.coste = coste;
	}

	public PeriodoEmpleadoEnObra() {
		// TODO - implement PeriodoEmpleadoEnObra.PeriodoEmpleadoEnObra
		throw new UnsupportedOperationException();
	}

}