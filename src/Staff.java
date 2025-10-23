public class Staff extends Persona {
    private String idStaff;
    private String puesto;

    public Staff(String nombre, String idStaff, String direccion, String puesto) {
        super(nombre, direccion);
        this.idStaff = idStaff;
        this.puesto = puesto;
    }
    //setters
    public void setIdStaff(String idStaff) {
        this.idStaff = idStaff;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    //getters
    public String getIdStaff() {
        return idStaff;
    }
    public String getPuesto() {
        return puesto;
    }
    
}
