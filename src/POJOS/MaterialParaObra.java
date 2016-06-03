package POJOS;

import java.util.*;

public class MaterialParaObra {

        private Material material;
	private Obra obra;
	private float CantidadMaterial;
	private AdministrativoObra administrativoObra;
	private JefeDeObra jefeDeObra;
	/**
	 * Este es el coste del material en el momento de la asignaci�n a la obra.
	 */
	private float coste;
	private Date fechaSolicitud;
	private Date fechaRecepcion;

	public float getCantidadMaterial() {
		return this.CantidadMaterial;
	}

	/**
	 * 
	 * @param CantidadMaterial
	 */
	public void setCantidadMaterial(float CantidadMaterial) {
		this.CantidadMaterial = CantidadMaterial;
	}


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

	public Date getFechaSolicitud() {
		return this.fechaSolicitud;
	}

	/**
	 * 
	 * @param fechaSolicitud
	 */
	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public Date getFechaRecepcion() {
		return this.fechaRecepcion;
	}

	/**
	 * 
	 * @param fechaRecepcion
	 */
	public void setFechaRecepcion(Date fechaRecepcion) {
		this.fechaRecepcion = fechaRecepcion;
	}

	public MaterialParaObra() {
		// TODO - implement MaterialAsignadoAObra.MaterialParaObra
		throw new UnsupportedOperationException();
	}

    /**
     * @return the material
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(Material material) {
        this.material = material;
    }

    /**
     * @return the obra
     */
    public Obra getObra() {
        return obra;
    }

    /**
     * @param obra the obra to set
     */
    public void setObra(Obra obra) {
        this.obra = obra;
    }

    /**
     * @return the administrativoObra
     */
    public AdministrativoObra getAdministrativoObra() {
        return administrativoObra;
    }

    /**
     * @param administrativoObra the administrativoObra to set
     */
    public void setAdministrativoObra(AdministrativoObra administrativoObra) {
        this.administrativoObra = administrativoObra;
    }

    /**
     * @return the jefeDeObra
     */
    public JefeDeObra getJefeDeObra() {
        return jefeDeObra;
    }

    /**
     * @param jefeDeObra the jefeDeObra to set
     */
    public void setJefeDeObra(JefeDeObra jefeDeObra) {
        this.jefeDeObra = jefeDeObra;
    }

}