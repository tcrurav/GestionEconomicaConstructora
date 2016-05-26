public class PeriodoMaquinariaEnObra extends Asignacion {

	Obra obra;
	Maquinaria maquinaria;
	private String fechaInicio;
	private String attribute;

	public String getAttribute() {
		return this.attribute;
	}

	/**
	 * 
	 * @param attribute
	 */
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

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

	public PeriodoMaquinariaEnObra() {
		// TODO - implement PeriodoMaquinariaEnObra.PeriodoMaquinariaEnObra
		throw new UnsupportedOperationException();
	}

}