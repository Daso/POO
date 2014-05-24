package veterinaria;

public abstract class Mascota {
    protected String nombre;
    protected String raza;

    public Mascota() {
    }
    
    public Mascota(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public abstract String comunicarse();
    
}
