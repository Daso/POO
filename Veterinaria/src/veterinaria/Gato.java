package veterinaria;

public class Gato extends Mascota{

    public Gato() {
    }

    public Gato(String nombre) {
        super(nombre);
    }
    
   
    @Override
    public String comunicarse() {
        return "miau miau";
    }
    
        
}
