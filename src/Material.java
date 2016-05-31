import java.util.*;

public class Material {

	Collection<MaterialAsignadoAObra> materialAsignadoAObra;
	private String nombre;

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Material() {
		// TODO - implement Material.Material
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param parameter
	 */
	public Material(int parameter) {
		// TODO - implement Material.Material
		throw new UnsupportedOperationException();
	}
        
        public void mostrarMaterial() {
		// TODO - implement Material.Material
		for(MaterialAsignadoAObra material : materialAsignadoAObra){
                    System.out.println(nombre);
                }
                
	}

}