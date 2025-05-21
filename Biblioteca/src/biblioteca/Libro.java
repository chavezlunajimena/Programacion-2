package biblioteca;

public class Libro extends materialBliblioteca {
    private String isbn;

    public Libro(String isbn, String titulo, int anioPublicacion, String autor) {
        super(titulo, autor, anioPublicacion);
        this.isbn = isbn;
    }
    
    public String toString(){
      return "Libro:\n" +
               "Titulo: " + titulo + "\n" +
               "Autor: " + autor + "\n" +
               "Anio de Publicacion: " + anioPublicacion + "\n" +
               "ISBN: " + isbn + "\n";
    }
}
