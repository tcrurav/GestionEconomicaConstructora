package POJOS;

import java.util.*;

public class Categoria {

	Collection<Empleado> empleado;
	/**
	 * Coste por hora medio de la categor�a de empleado en el momento actual.
	 */
        private int PK_ID;
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
	}

    public int getPK_ID() {
        return PK_ID;
    }

    public void setPK_ID(int PK_ID) {
        this.PK_ID = PK_ID;
    }

}