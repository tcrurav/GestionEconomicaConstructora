import java.util.*;

public class Albaran {

	Proveedor proveedor;
	EmpleadoAlmacen empleado;
	private Date fecha;
	Collection<LineaAlbaran> lineaAlbaran;
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

}