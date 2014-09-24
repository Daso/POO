package veterinaria;

public class Gato extends Mascota{

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }
    
    public String aranhar(){
        return "Te araño";
    }

    @Override
    public String comunicarse() {
        return "miau miau";
    }
    
   @Override
    public String presentarse(){
       return super.presentarse() + "gato";
    }
}
