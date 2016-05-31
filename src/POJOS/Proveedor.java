package POJOS;

import java.util.*;

public class Proveedor {

	Collection<Persona> contacto;
	Collection<Albaran> albaran;
	private String nombre;
	private String direccion;
        int PK_ID;

	public String getNombre() {
		return this.nombre;
	}

    public void setPK_ID(int PK_ID) {
        this.PK_ID = PK_ID;
    }

    public int getPK_ID() {
        return PK_ID;
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

	/*public Proveedor() {
		// TODO - implement Proveedor.Proveedor
		throw new UnsupportedOperationException();
	}*/

}