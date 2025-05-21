package SistemaCursos;

public class Curso {
    private String nombreCurso;
    private int duracion;

    public Curso(String nombreCurso, int duracion) {
        this.nombreCurso = nombreCurso;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "\n\tNombreCurso: " + nombreCurso + "\n\tDuracion: " + duracion + '}';
    }
    
    
}
