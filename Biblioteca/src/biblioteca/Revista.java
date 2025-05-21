package biblioteca;

public class Revista extends materialBliblioteca {
    private int numeroEdicion;

    public Revista(String titulo, String autor, int numeroEdicion, int anioPublicacion) {
        super(titulo, autor, anioPublicacion);
        this.numeroEdicion = numeroEdicion;
    }
    
    public String toString(){
        return "Revista\n" +
               "Titulo: " + titulo + "\n" +
               "Autor: " + autor + "\n" +
               "Anio de Publicacion: " + anioPublicacion + "\n" +
               "Numero de Edicion: " + numeroEdicion + "\n";
    }
}
