import java.util.*;

public class Maquinaria {

	Collection<PeriodoMaquinariaEnObra> periodoMaquinariaEnObra;
	private String nombre;
	private float precioDeCompra;
	private Date fechaFinVidaUtil;
	private Date fechaCompra;
	private String codInventario;

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Maquinaria() {
		// TODO - implement Maquinaria.Maquinaria
		throw new UnsupportedOperationException();
	}

	public float getPrecioDeCompra() {
		return this.precioDeCompra;
	}

	/**
	 * 
	 * @param precioDeCompra
	 */
	public void setPrecioDeCompra(float precioDeCompra) {
		this.precioDeCompra = precioDeCompra;
	}

	public Date getFechaFinVidaUtil() {
		return this.fechaFinVidaUtil;
	}

	/**
	 * 
	 * @param fechaFinVidaUtil
	 */
	public void setFechaFinVidaUtil(Date fechaFinVidaUtil) {
		this.fechaFinVidaUtil = fechaFinVidaUtil;
	}

	public Date getFechaCompra() {
		return this.fechaCompra;
	}

	/**
	 * 
	 * @param fechaCompra
	 */
	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public String getCodInventario() {
		return this.codInventario;
	}

	/**
	 * 
	 * @param codInventario
	 */
	public void setCodInventario(String codInventario) {
		this.codInventario = codInventario;
	}

}