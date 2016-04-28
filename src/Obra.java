import java.util.*;

public class Obra {

	PeriodoJefeObraEnObra periodoJefeObraEnObra;
	Collection<PeriodoEmpleadoEnObra> periodoEmpleadoEnObra;
	Collection<MaterialAsignadoAObra> materialAsignadoAObra;
	Collection<PeriodoMaquinariaEnObra> periodoMaquinariaEnObra;
	private String fechaInicio;
	private String fechaFin;
	private String direccion;
       

	public String getFechaInicio() {
		return this.fechaInicio;
	}

	/**
	 * 
	 * @param fechaInicio
	 */
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return this.fechaFin;
	}

	/**
	 * 
	 * @param fechaFin
	 */
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
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

	public Obra() {
		// TODO - implement Obra.Obra
		throw new UnsupportedOperationException();
	}

}