package POJOS;

import java.util.*;
public class MaterialParaObra {

	Material material;
	Obra obra;
	private float CantidadMaterial;
	AdministrativoObra administrativoObra;
	JefeDeObra jefeDeObra;
	/**
	 * Este es el coste del material en el momento de la asignaci�n a la obra.
	 */
	private float coste;
	private Date fechaSolicitud;
	private Date fechaRecepcion;

	public float getCantidadMaterial() {
		// TODO - implement MaterialAsignadoAObra.getCantidadMaterial
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param CantidadMaterial
	 */
	public void setCantidadMaterial(float CantidadMaterial) {
		// TODO - implement MaterialAsignadoAObra.setCantidadMaterial
		throw new UnsupportedOperationException();
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

	public MaterialParaObra() {
		// TODO - implement MaterialAsignadoAObra.MaterialParaObra
		throw new UnsupportedOperationException();
	}

}