package veterinaria;

public class Perro extends Mascota{
    private char tamanho;

    public Perro() {
    }
        
    public Perro(String nombre, char tamanho) {
        super(nombre);
        this.tamanho = tamanho;
    }

    public Perro(String nombre) {
        super(nombre);
    }
    
    
    
    public char getTamanho() {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }
    
    public String ladrar(){
        return "guau guau";
    }
    
    @Override
    public String comunicarse(){
        return "guau guau";
    }
    
    public int costoServicio(){
        switch(tamanho){
            case 'G':
                return 20;              
            case 'M':
                return 10;
            case 'P':
                return 5;
        }   
        return 0;        
    }
}
