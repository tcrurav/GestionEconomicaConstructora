package POJOS;

public class Empleado extends Persona {

    public Empleado() {

    }

    public String getUsuario() {
        return this.usuario;
    }

    /**
     *
     * @param usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return this.contra;
    }

    /**
     *
     * @param contra
     */
    public void setContra(String contra) {
        this.contra = contra;
    }

    private Categoria categoria;
    private String usuario;
    private String contra;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
