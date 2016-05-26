package POJOS;

import java.util.*;
public class MaterialParaObra {



        private int PK_ID;
   
	public Material material;
	public Obra obra;
	private float CantidadMaterial;
	public AdministrativoObra administrativoObra;
	public JefeDeObra jefeDeObra;
       

	private float coste;
	private Date fechaSolicitud;
	private Date fechaRecepcion;

	public float getCantidadMaterial() {
		// TODO - implement MaterialAsignadoAObra.getCantidadMaterial



		//throw new UnsupportedOperationException();
                return this.CantidadMaterial;


	}

	/**
	 * 
	 * @param CantidadMaterial
	 */
	public void setCantidadMaterial(float CantidadMaterial) {
		// TODO - implement MaterialAsignadoAObra.setCantidadMaterial



		//throw new UnsupportedOperationException();
            this.CantidadMaterial=CantidadMaterial;


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



//		throw new UnsupportedOperationException();
	}

    public int getPK_ID() {
        return PK_ID;
    }

    public void setPK_ID(int PK_ID) {
        this.PK_ID = PK_ID;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public AdministrativoObra getAdministrativoObra() {
        return administrativoObra;
    }

    public void setAdministrativoObra(AdministrativoObra administrativoObra) {
        this.administrativoObra = administrativoObra;
    }

    public JefeDeObra getJefeDeObra() {
        return jefeDeObra;
    }

    public void setJefeDeObra(JefeDeObra jefeDeObra) {
        this.jefeDeObra = jefeDeObra;
    }



}