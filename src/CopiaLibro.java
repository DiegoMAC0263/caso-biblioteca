public class CopiaLibro {
    String idCopia;
    boolean copiaDisponible;
    boolean esPrestamoCortoPlazo;
    
    public  CopiaLibro(String idCopia, boolean copiaDisponible, boolean esPrestamoCortoPlazo) {
        this.idCopia = idCopia;
        this.copiaDisponible = copiaDisponible;
        this.esPrestamoCortoPlazo = esPrestamoCortoPlazo;
    }

    public String getIdCopia() {
        return idCopia;
    }
    public boolean isCopiaDisponible() {
        return copiaDisponible;
    }
    public boolean isEsPrestamoCortoPlazo() {
        return esPrestamoCortoPlazo;
    }

    public void setIdCopia(String idCopia) {
        this.idCopia = idCopia;
    }
    public void setCopiaDisponible(boolean copiaDisponible) {
        this.copiaDisponible = copiaDisponible;
    }
    public void setEsPrestamoCortoPlazo(boolean esPrestamoCortoPlazo) {
        this.esPrestamoCortoPlazo = esPrestamoCortoPlazo;
    }



    
}
