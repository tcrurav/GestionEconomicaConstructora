package POJOS;

import java.util.*;

public class Albaran {

	private Persona proveedor;
	private Empleado empleado;
	private Date fecha;
	Collection<LineaAlbaran> lineaAlbaran;
	private String numAlbaran;

        
	public Date getFecha() {
		return this.fecha;
	}

	/**
	 * 
	 * @param fecha
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNumAlbaran() {
		return this.numAlbaran;
	}

	/**
	 * 
	 * @param numAlbaran
	 */
	public void setNumAlbaran(String numAlbaran) {
		this.numAlbaran = numAlbaran;
	}

    /**
     * @return the proveedor
     */
    public Persona getProveedor() {
        return proveedor;
    }

    /**
     * @param proveedor the proveedor to set
     */
    public void setProveedor(Persona proveedor) {
        this.proveedor = proveedor;
    }

    /**
     * @return the empleado
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * @param empleado the empleado to set
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

}