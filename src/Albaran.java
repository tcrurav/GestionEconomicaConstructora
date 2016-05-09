public class Albaran {

	Proveedor proveedor;
	EmpleadoAlmacen empleado;
	Factura factura;
	private String fecha;

	public String getFecha() {
		return this.fecha;
	}

	/**
	 * 
	 * @param fecha
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Albaran() {
		// TODO - implement Albaran.Albaran
		throw new UnsupportedOperationException();
	}
        
        // albaran1
        
	/**
	 * 
	 * @param parameter
	 */
	public Albaran(int parameter) {
		// TODO - implement Albaran.Albaran
		throw new UnsupportedOperationException();
	} 
        
        
        /**
         * 
         * @param proveedor 
         */
        
        //El prooovedor es el que endosa el albaran
      
        
        
        /**
         * 
         * @param proveedor
         * @param empleado
         * @param factura
         * @param fechaString 
         */
            
        //metodo 
        
        
         public static void verificarAlbaranCompra(Proveedor proveedor, EmpleadoAlmacen empleado, Factura factura, String fechaString){
            
           
            
        }
         
         
        /**
         * 
         * @param empleado 
         */
         
        // El Empleado del Almacen es el encargado de firmar el albarna
        
        public static void firmaAlbaran(EmpleadoAlmacen empleado){
            
            String firmaEmpleado = "";
            boolean firma = true;
            
        }
       
        /**
         * 
         * @param factura 
         */
        
        // Se comprueba que el albaran va a ir junto con la factura
        public static void corresponderFactura(Factura factura){
        
        
        }
        
       
        
        
        

}