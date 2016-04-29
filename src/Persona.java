import java.util.*;

public class Persona {

	Collection<Proveedor> proveedor;
        private String dni;
	private String nombre;
	private String apellidos;
	private String telefono;

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

	public String getApellidos() {
		return this.apellidos;
	}

	/**
	 * 
	 * @param apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return this.telefono;
	}

	/**
	 * 
	 * @param telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Persona() {
		// TODO - implement Persona.Persona
		throw new UnsupportedOperationException();
	}

        
        public String getDni() {
            return dni;
        }

        /**
	 * 
	 * @param dni
	 */
        public void setDni(String dni) {
            this.dni = dni;
        }

}