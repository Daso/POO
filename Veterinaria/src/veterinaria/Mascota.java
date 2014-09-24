package veterinaria;

public abstract class Mascota {
    protected String nombre;
    protected int edad;
    protected String raza;

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
            
    public abstract String comunicarse();
    
    public String presentarse(){
        return "Me llamo " + nombre + " soy un ";
    } 
}
