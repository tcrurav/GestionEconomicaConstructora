package POJOS;

import java.util.*;

public class Obra {

    int PK_ID;

    PeriodoJefeObraEnObra periodoJefeObraEnObra;
    Collection<PeriodoEmpleadoEnObra> periodoEmpleadoEnObra;
    Collection<MaterialParaObra> materialParaObra;
    Collection<PeriodoMaquinariaEnObra> periodoMaquinariaEnObra;
    private Date fechaInicio;
    private Date fechaFin;
    private String direccion;
    private float presupuestoTotalEjecucion;
    private float estimacionCosteMateriales;
    private float estimacionCosteManoDeObra;
    private float estimacionGastosGenerales;
    private float estimacionBeneficioIndustrial;
    private float porcentajeDeObraEjecutado;
    private float cantidadCobrada;
    private float cantidadFacturada;

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

    public float getPresupuestoTotalEjecucion() {
        return this.presupuestoTotalEjecucion;
    }

    /**
     *
     * @param presupuestoTotalEjecucion
     */
    public void setPresupuestoTotalEjecucion(float presupuestoTotalEjecucion) {
        this.presupuestoTotalEjecucion = presupuestoTotalEjecucion;
    }

    public float getEstimacionCosteMateriales() {
        return this.estimacionCosteMateriales;
    }

    /**
     *
     * @param estimacionCosteMateriales
     */
    public void setEstimacionCosteMateriales(float estimacionCosteMateriales) {
        this.estimacionCosteMateriales = estimacionCosteMateriales;
    }

    public float getEstimacionCosteManoDeObra() {
        return this.estimacionCosteManoDeObra;
    }

    /**
     *
     * @param estimacionCosteManoDeObra
     */
    public void setEstimacionCosteManoDeObra(float estimacionCosteManoDeObra) {
        this.estimacionCosteManoDeObra = estimacionCosteManoDeObra;
    }

    public float getEstimacionGastosGenerales() {
        return this.estimacionGastosGenerales;
    }

    /**
     *
     * @param estimacionGastosGenerales
     */
    public void setEstimacionGastosGenerales(float estimacionGastosGenerales) {
        this.estimacionGastosGenerales = estimacionGastosGenerales;
    }

    public float getEstimacionBeneficioIndustrial() {
        return this.estimacionBeneficioIndustrial;
    }

    /**
     *
     * @param estimacionBeneficioIndustrial
     */
    public void setEstimacionBeneficioIndustrial(float estimacionBeneficioIndustrial) {
        this.estimacionBeneficioIndustrial = estimacionBeneficioIndustrial;
    }

    public float getPorcentajeDeObraEjecutado() {
        return this.porcentajeDeObraEjecutado;
    }

    /**
     *
     * @param porcentajeDeObraEjecutado
     */
    public void setPorcentajeDeObraEjecutado(float porcentajeDeObraEjecutado) {
        this.porcentajeDeObraEjecutado = porcentajeDeObraEjecutado;
    }

    public float getCantidadCobrada() {
        return this.cantidadCobrada;
    }

    /**
     *
     * @param cantidadCobrada
     */
    public void setCantidadCobrada(float cantidadCobrada) {
        this.cantidadCobrada = cantidadCobrada;
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

    
    @Override
    public String toString() {
	return direccion;
    }
    
}
