package biblioteca;

public class DVD extends materialBliblioteca {
    private int duracionMinutos;

    public DVD(String titulo, String autor, int duracionMinutos, int anioPublicacion) {
        super(titulo, autor, anioPublicacion);
        this.duracionMinutos = duracionMinutos;
    }
    
    public String toString(){
        return "DVD:\n" +
               "Titulo: " + titulo + "\n" +
               "Autor: " + autor + "\n" +
               "Anio de Publicacion: " + anioPublicacion + "\n" +
               "Duracion: " + duracionMinutos + " minutos\n";
    }
}
