
import java.util.*;

public class EmpleadoObra extends Empleado {

    Collection<PeriodoEmpleadoEnObra> periodoEmpleadoEnObra;
//he insertado la clase persona y la clase Empleado! como ejemplos de lo que debe de tener mi clase ya que necesito datos de esas dos clases.
    
    public class Persona {

       private String nombre = "";
       private String dni = "";
       private String apellidos = "";
       private String direccion = "";

        public String getNombre() {
            return nombre;
        }

        public String getDni() {
            return dni;
        }

        public String getApellidos() {
            return apellidos;
        }

        public String getDireccion() {
            return direccion;
        }
    }
    public class Empleado{

        public float getSueldo() {
            return sueldo;
        }

        public void setSueldo(float sueldo) {
            this.sueldo = sueldo;
        }
        private float sueldo = 0;
        
        
    }

}
