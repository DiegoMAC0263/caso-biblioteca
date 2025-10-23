public class ItemBiblioteca {
    String nombre;
    String Titulo;
    int añoPublicacion;
    boolean disponible;

    public ItemBiblioteca(String nombre, String Titulo, int añoPublicacion, boolean disponible) {
        this.nombre = nombre;
        this.Titulo = Titulo;
        this.añoPublicacion = añoPublicacion;
        this.disponible = disponible;
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    } 
    //getters    
    public String getNombre() {
        return nombre;
    }
    public String getTitulo() {
        return Titulo;
    }
    public int getAñoPublicacion() {
        return añoPublicacion;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public void consultarDisponibilidad() {
        if (disponible) {
            System.out.println("El ítem '" + Titulo + "' está disponible para préstamo.");
        } else {
            System.out.println("El ítem '" + Titulo + "' no está disponible para préstamo.");
        }
    }
    public void getInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Título: " + Titulo);
        System.out.println("Año de Publicación: " + añoPublicacion);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }
    
}
