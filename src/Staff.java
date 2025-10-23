public class Staff extends Persona {
    private String idStaff;
    private String puesto;

    public Staff(String nombre, String idStaff, String direccion, String puesto) {
        super(nombre, direccion);
        this.idStaff = idStaff;
        this.puesto = puesto;
    }

    // overloaded constructor
    public Staff(String nombre, String idStaff, String direccion) {
        this(nombre, idStaff, direccion, "Empleado");
    }

    public void setIdStaff(String idStaff) {
        this.idStaff = idStaff;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getIdStaff() {
        return idStaff;
    }

    public String getPuesto() {
        return puesto;
    }

}
