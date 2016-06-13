package POJOS;

import java.util.*;

public class Maquiaria {

    int PK_ID;

    PeriodoJefeObraEnObra periodoJefeObraEnObra;
    Collection<PeriodoEmpleadoEnObra> periodoEmpleadoEnObra;
    Collection<MaterialParaObra> materialParaObra;
    Collection<PeriodoMaquinariaEnObra> periodoMaquinariaEnObra;
    private Date fechaInicio;
    private Date fechaFin;
    private String Nombre;
    private float Cod_Inventario;
    private float PrecioDeCompra;
    private float cantidadFacturada;

    public String getNombre() {
        return this.Nombre;
    }

    /**
     *
     * @param direccion
     */
    public void setNombre(String direccion) {
        this.Nombre = direccion;
    }

    public Maquiaria() {
        // TODO - implement Obra.Obra
    }

    public Date getFechaInicio() {
        // TODO - implement Obra.getFechaInicio
        return fechaInicio;
    }

    /**
     *
     * @param fechaInicio
     */
    public void setFechaInicio(Date fechaInicio) {
        // TODO - implement Obra.setFechaInicio
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        // TODO - implement Obra.getFechaFin
        return fechaFin;
    }

    /**
     *
     * @param fechaFin
     */
    public void setFechaFin(Date fechaFin) {
        // TODO - implement Obra.setFechaFin
        this.fechaFin = fechaFin;
    }

    public float getCodInventario() {
        return this.Cod_Inventario;
    }

    /**
     *
     * @param presupuestoTotalEjecucion
     */
    public void setCod_Inventario(float presupuestoTotalEjecucion) {
        this.Cod_Inventario = presupuestoTotalEjecucion;
    }



    public float getPrecioDeCompra() {
        return this.PrecioDeCompra;
    }

    /**
     *
     * @param cantidadCobrada
     */
    public void setPrecioDeCompra(float cantidadCobrada) {
        this.PrecioDeCompra = cantidadCobrada;
    }

    public float getCantidadFacturada() {
        return this.cantidadFacturada;
    }

    /**
     *
     * @param cantidadFacturada
     */
    public void setCantidadFacturada(float cantidadFacturada) {
        this.cantidadFacturada = cantidadFacturada;
    }

    public int getPK_ID() {
        return PK_ID;
    }

    public void setPK_ID(int PK_ID) {
        this.PK_ID = PK_ID;
    }

}
