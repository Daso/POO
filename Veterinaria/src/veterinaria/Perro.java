package veterinaria;

public class Perro extends Mascota{
    private String tamanho;

    public Perro(String tamanho, String nombre, int edad) {
        super(nombre, edad);
        this.tamanho = tamanho;
    }
    
    
    
    public String perseguirseLaCola(){
        return "Me persigo la cola";
    }
    
    @Override
    public String comunicarse(){
        return "guau, guau";
    }
    
    @Override
    public String presentarse(){
       return super.presentarse() + "perro";
    }
    
}

