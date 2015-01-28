package veterinaria;

public class Gato extends Mascota{

      
    
    
    public Gato(String nombre, char genero) {
        super(nombre, genero);
    }
    
    
    
   @Override   
   public String presentarse(){
       return "Soy " + nombre + " el gato";
   }

    @Override
    public double servicioBanho() {
        return 50.00;
    }
    
}
