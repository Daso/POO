package veterinaria;

public class Perro extends Mascota{
  private String tamanho;  

    public Perro(String tamanho, String nombre, char genero) {
        super(nombre, genero);
        this.tamanho = tamanho;
    }

    @Override
    public String presentarse() {
        return "Soy " + nombre + " un perro";
    }

    @Override
    public double servicioBanho() {
        if(tamanho.equals("Grande")){
            return 25.00;
        }else{
           return 15.00; 
        }
    }
    
    
     
}
