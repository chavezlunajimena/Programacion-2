
package SistemaCursos;

public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private int legajo;

    public Persona(String nombre, String apellido, int dni, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Persona:" + "\n\tNombre:" + nombre + "\n\tApellido: " + apellido + "\n\tDni:" + dni + "\n\tLegajo =" + legajo;
    }
    
    
}
