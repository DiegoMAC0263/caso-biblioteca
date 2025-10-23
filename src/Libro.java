public class Libro extends ItemBiblioteca {
    private String autor;
    private String isbn;
    private int copiasTotales;

    public Libro(String titulo, String autor, String isbn) {
        super(titulo, titulo, 0, true);  // usamos el titulo como nombre, año 0 y disponible por defecto
        this.autor = autor;
        this.isbn = isbn;
    }

    //setters
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    //getters
    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }
}
