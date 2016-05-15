package POJOS;

import java.util.*;

public class EmpleadoAlmacen extends Empleado {

	Collection<Albaran> albaran;
	Collection<PeriodoMaquinariaEnObra> periodoMaquinariaEnObra;

	/*public EmpleadoAlmacen() {
		// TODO - implement EmpleadoAlmacen.EmpleadoAlmacen
		throw new UnsupportedOperationException();
	}*/
        
        int PK_ID;
        
        private int codigo;
        private String descripcion;
        private int stockMedio;
        private int stockMinimo;
        private int stock;
        private float precio;

    public void setPK_ID(int PK_ID) {
        this.PK_ID = PK_ID;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setStockMedio(int stockMedio) {
        this.stockMedio = stockMedio;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getPK_ID() {
        return PK_ID;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getStockMedio() {
        return stockMedio;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public int getStock() {
        return stock;
    }

    public float getPrecio() {
        return precio;
    }

}