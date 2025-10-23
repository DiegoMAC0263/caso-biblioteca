public class Revista extends ItemBiblioteca {
    private int numero;
    private int volumen;

    public Revista(String titulo, int añoPublicacion, boolean disponible, int numero, int volumen) {
        super(titulo, titulo, 0, true);
        this.numero = numero;
        this.volumen= volumen;
    }
    //setters
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setPeriodicidad(String periodicidad) {
        this.volumen = volumen;
    }
    //getters
    public int getNumero() {
        return numero;
    }
    public int getvolumen() {
        return volumen;
    }
}