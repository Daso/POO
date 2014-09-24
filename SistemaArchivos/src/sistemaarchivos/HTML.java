package sistemaarchivos;

public class HTML implements Iimprimible{
    private String tag;

    @Override
    public String imprimirme() {
        return "<h1>Hola esto es HTML</h1>";
    }
    
}
