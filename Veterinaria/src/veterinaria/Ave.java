
package veterinaria;

public class Ave extends Mascota{

    public Ave(String nombre) {
        super(nombre);
    }
    
    @Override
    public String comunicarse(){
        return "pio pio";
    }
}
