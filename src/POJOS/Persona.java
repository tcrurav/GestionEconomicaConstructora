package POJOS;

import java.util.*;

public class Persona {

        private int PK_ID;
	private Collection<Proveedor> proveedor;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String dni;

    /**
     * @return the PK_ID
     */
    public int getPK_ID() {
        return PK_ID;
    }

    /**
     * @param PK_ID the PK_ID to set
     */
    public void setPK_ID(int PK_ID) {
        this.PK_ID = PK_ID;
    }

    /**
     * @return the proveedor
     */
    public Collection<Proveedor> getProveedor() {
        return proveedor;
    }

    /**
     * @param proveedor the proveedor to set
     */
    public void setProveedor(Collection<Proveedor> proveedor) {
        this.proveedor = proveedor;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }



}