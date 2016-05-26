import java.util.*;

public class Proveedor {

	Collection<Persona> contacto;
	Collection<Albaran> albaran;
	private String nombre;
	private String direccion;

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

	public String getDireccion() {
		return this.direccion;
	}

	/**
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Proveedor() {
		// TODO - implement Proveedor.Proveedor
		throw new UnsupportedOperationException();
	}

}