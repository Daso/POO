package sistemaarchivos;


public class Image implements Iimprimible{
    private String ext;
    private int size;

    @Override
    public String imprimirme() {
        return " :D ";
    }
}
