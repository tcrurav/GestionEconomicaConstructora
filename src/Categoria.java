import java.util.*;

public class Categoria {

	Collection<Empleado> empleado;
	/**
	 * Coste por hora medio de la categoría de empleado en el momento actual.
	 */
	private float coste;
	private String nombre;

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

	public Categoria() {
		// TODO - implement Categoria.Categoria
		throw new UnsupportedOperationException();
	}

}