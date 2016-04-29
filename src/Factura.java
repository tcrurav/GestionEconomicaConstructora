import java.util.*;

public class Factura {

	private Collection<Albaran> albaran;
	private String fecha;
        private int numeroFactura;
        private String proveedor;
        //¿fecha maxima de pago?¿forma de pago?
        private float baseImponible;
        private float tipoImpositivo;
        private float importeIvaTotal;
        private float importeTotal;
        private String observaciones;
        private ArrayList <Material> Materiales;
        
        



        //CONSTRUCTOR VACIO
	public Factura() {

                throw new UnsupportedOperationException();
	}

        //CONTRUCTOR CON PARAMETROS       
        public Factura(Collection<Albaran> albaran, String fecha, int numeroFactura, String proveedor, float baseImponible, float tipoImpositivo, float importeIvaTotal, float importeTotal, String observaciones, ArrayList<Material> Materiales) {
            this.albaran = albaran;
            this.fecha = fecha;
            this.numeroFactura = numeroFactura;
            this.proveedor = proveedor;
            this.baseImponible = baseImponible;
            this.tipoImpositivo = tipoImpositivo;
            this.importeIvaTotal = importeIvaTotal;
            this.importeTotal = importeTotal;
            this.observaciones = observaciones;
            this.Materiales = Materiales;
        }

        
          
        
    public Collection<Albaran> getAlbaran() {
        return albaran;
    }

    public void setAlbaran(Collection<Albaran> albaran) {
        this.albaran = albaran;
    }

    public String getFecha() {
        return fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public float getBaseImponible() {
        return baseImponible;
    }

    public void setBaseImponible(float baseImponible) {
        this.baseImponible = baseImponible;
    }

    public float getTipoImpositivo() {
        return tipoImpositivo;
    }

    public void setTipoImpositivo(float tipoImpositivo) {
        this.tipoImpositivo = tipoImpositivo;
    }

    public float getImporteIvaTotal() {
        return importeIvaTotal;
    }

    public void setImporteIvaTotal(float importeIvaTotal) {
        this.importeIvaTotal = importeIvaTotal;
    }

    public float getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(float importeTotal) {
        this.importeTotal = importeTotal;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public ArrayList <Material> getMateriales() {
        return Materiales;
    }

    public void setMateriales(ArrayList <Material> Materiales) {
        this.Materiales = Materiales;
    }


        
        
}//FIN FACTURA