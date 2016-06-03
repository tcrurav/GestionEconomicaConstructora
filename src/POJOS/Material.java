package POJOS;

import java.util.*;

public class Material {

	Collection<LineaAlbaran> lineaAlbaran;
	Collection<MaterialParaObra> materialParaObra;

        
        int PK_ID;

	private String codigo;
	private String descripcion;
	private int stockMedio;
	private int stockMinimo;
	/**
	 * El precio del Material.
	 * 
	 * Si viene un nuevo material con un precio diferente se hace lo siguiente:
	 * Si el nuevo precio es mayor que el del almac�n, entonces el precio pasar� a ser el de la nueva compra.
	 * Si el nuevo precio es menor entonces se queda con el anterior.
	 * �
	 */
	private float precio;
	private int stock;



        public void setPK_ID(int PK_ID) {
            this.PK_ID = PK_ID;
        } 
        
        
        public int getPK_ID() {
            return PK_ID;
        }
        

	public String getCodigo() {
		return this.codigo;
	}

	/**
	 * 
	 * @param codigo
	 */

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	/**
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getStockMedio() {
		return this.stockMedio;
	}

	/**
	 * 
	 * @param stockMedio
	 */
	public void setStockMedio(int stockMedio) {
		this.stockMedio = stockMedio;
	}

	public int getStockMinimo() {
		return this.stockMinimo;
	}

	/**
	 * 
	 * @param stockMinimo
	 */
	public void setStockMinimo(int stockMinimo) {
		this.stockMinimo = stockMinimo;
	}

	public float getPrecio() {
		return this.precio;
	}

	/**
	 * 
	 * @param precio
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getStock() {
		return this.stock;
	}

	/**
	 * 
	 * @param stock
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}


	public Material() {
		// TODO - implement Material.Material
		throw new UnsupportedOperationException();
	}

	/*public Material() {
		// TODO - implement Material.Material
		throw new UnsupportedOperationException();
	}*/

    /*public void set(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/


}