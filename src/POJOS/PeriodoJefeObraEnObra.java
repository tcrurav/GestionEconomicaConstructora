package POJOS;

import java.util.*;
public class PeriodoJefeObraEnObra {

	JefeDeObra jefeDeObra;
	Albaran obra;
	private Date fechaInicio;
	private Date fechaFin;
	/**
	 * Parte proporcional del sueldo correspondiente a la categor�a del trabajador en el momento de la asignaci�n
	 */
	private float coste;

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

}