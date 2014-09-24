package sistemaarchivos;


public class Txt implements Iimprimible {
    private String language;

    @Override
    public String imprimirme() {
        return "Esto es un texto";
    }
    
}
