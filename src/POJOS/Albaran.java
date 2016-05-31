package POJOS;

import java.util.*;

public class Albaran {

	private Persona proveedor;
	private Empleado empleado;
	private Date fecha;
	private ArrayList<LineaAlbaran> lineaAlbaran;
	private String numAlbaran;

    public Albaran() {
	// TODO - implement Albaran.Albaran
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

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the lineaAlbaran
     */
    public ArrayList<LineaAlbaran> getLineaAlbaran() {
        return lineaAlbaran;
    }

    /**
     * @param lineaAlbaran the lineaAlbaran to set
     */
    public void setLineaAlbaran(ArrayList<LineaAlbaran> lineaAlbaran) {
        this.lineaAlbaran = lineaAlbaran;
    }

    /**
     * @return the numAlbaran
     */
    public String getNumAlbaran() {
        return numAlbaran;
    }

    /**
     * @param numAlbaran the numAlbaran to set
     */
    public void setNumAlbaran(String numAlbaran) {
        this.numAlbaran = numAlbaran;
    }

}