import java.util.*;

public class Material {

	Collection<MaterialAsignadoAObra> materialAsignadoAObra;
	
        private String nombre;
        private int cantidadStock;
        private String numReferencia;
        private float precio;
        private String proveedor;
        

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Material() {

		throw new UnsupportedOperationException();
	}


	public Material(int parameter) {

		throw new UnsupportedOperationException();
	}
        
        public void mostrarMaterial() {

		for(MaterialAsignadoAObra material : materialAsignadoAObra){
                    System.out.println(nombre);
                }
                
	}

}