package POJOS;

import java.util.*;
public class PeriodoEmpleadoEnObra {

	private EmpleadoObra empleado;
	private Obra obra;
	private Date fechaInicio;
	private Date fechaFin;
	private JefeDeObra jefeDeObra;
	private AdministrativoManoDeObra administrativoManoObra;
	/**
	 * Parte proporcional del sueldo correspondiente a la categor�a del trabajador en el momento de la asignaci�n
	 */
	private float coste;
	private Date fechaSolicitud;
	private Date fechaRecepcion;
        private int id;

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
	}

        public EmpleadoObra getEmpleado() {
            return empleado;
        }

        public void setEmpleado(EmpleadoObra empleado) {
            this.empleado = empleado;
        }

        public Obra getObra() {
            return obra;
        }

        public void setObra(Obra obra) {
            this.obra = obra;
        }

        public JefeDeObra getJefeDeObra() {
            return jefeDeObra;
        }

        public void setJefeDeObra(JefeDeObra jefeDeObra) {
            this.jefeDeObra = jefeDeObra;
        }

        public AdministrativoManoDeObra getAdministrativoManoObra() {
            return administrativoManoObra;
        }

        public void setAdministrativoManoObra(AdministrativoManoDeObra administrativoManoObra) {
            this.administrativoManoObra = administrativoManoObra;
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}