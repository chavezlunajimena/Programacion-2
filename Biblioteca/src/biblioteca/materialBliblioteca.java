package biblioteca;

public abstract class materialBliblioteca {
    protected String titulo;
    protected String autor;
    protected int anioPublicacion;

    public materialBliblioteca(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    
    public abstract String toString();
}
