public class Miembro extends Persona {
    private String idMiembro;
    private int maxItemsPrestados = 6;
    private int itemsPrestadosActuales = 0;

    public Miembro(String nombre, String idMiembro, String direccion, int maxItemsPrestados) {
        super(nombre, direccion);
        this.idMiembro = idMiembro;
        this.maxItemsPrestados = maxItemsPrestados;
    }

    // overloaded constructor
    public Miembro(String nombre, String idMiembro, String direccion) {
        this(nombre, idMiembro, direccion, 6);
    }

    public void setIdMiembro(String idMiembro) {
        this.idMiembro = idMiembro;
    }

    public void setMaxItemsPrestados(int maxItemsPrestados) {
        this.maxItemsPrestados = maxItemsPrestados;
    }

    public String getIdMiembro() {
        return idMiembro;
    }

    public int getMaxItemsPrestados() {
        return maxItemsPrestados;
    }

    public int getItemsPrestadosActuales() {
        return itemsPrestadosActuales;
    }

    public boolean puedePrestar() {
        return itemsPrestadosActuales < maxItemsPrestados;
    }

    public void prestarItem() {
        if (itemsPrestadosActuales < maxItemsPrestados) {
            itemsPrestadosActuales++;
            System.out.println("Ítem prestado exitosamente. Total de ítems prestados: " + itemsPrestadosActuales);
        } else {
            System.out.println("Límite de ítems prestados alcanzado. No se puede prestar más ítems.");
        }
    }
}
