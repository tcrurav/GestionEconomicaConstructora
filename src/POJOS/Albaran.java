package POJOS;

import java.util.*;

public class Albaran {

        private int PK_ID;
	private Proveedor proveedor;
	private EmpleadoAlmacen empleado;
	private Date fecha;
	private Collection<LineaAlbaran> lineaAlbaran;
	private String numAlbaran;

	public Date getFecha() {
		return this.fecha;
	}

	public Albaran() {
		// TODO - implement Albaran.Albaran
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param fecha
	 */
	public void setFecha(Date fecha) {
		// TODO - implement Albaran.setFecha
		throw new UnsupportedOperationException();
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

    public int getPK_ID() {
        return PK_ID;
    }

    public void setPK_ID(int PK_ID) {
        this.PK_ID = PK_ID;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public EmpleadoAlmacen getEmpleado() {
        return empleado;
    }

    public void setEmpleado(EmpleadoAlmacen empleado) {
        this.empleado = empleado;
    }

    public Collection<LineaAlbaran> getLineaAlbaran() {
        return lineaAlbaran;
    }

    public void setLineaAlbaran(Collection<LineaAlbaran> lineaAlbaran) {
        this.lineaAlbaran = lineaAlbaran;
    }

    

}