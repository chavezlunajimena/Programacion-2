package SistemaCursos;

public class Estudiante extends Persona {
    private Curso curso;

    public Estudiante(String nombre, String apellido, int dni, int legajo, Curso curso) {
        super(nombre, apellido, dni, legajo);
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCurso: " + curso;
    }
    
    
}
