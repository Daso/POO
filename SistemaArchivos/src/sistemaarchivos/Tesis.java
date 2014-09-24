package sistemaarchivos;


public class Tesis implements Iimprimible{
    private String autor;

    @Override
    public String imprimirme() {
        return "Esto es una tesis de grado";
    }
    
   
}
