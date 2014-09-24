package sistemaarchivos;

public class SistemaArchivos {

    
    public static void main(String[] args) {
        
        Image foto = new Image();
        HTML paginaWeb = new HTML();
        Txt texto = new Txt();
        Tesis miTesis = new Tesis();
        Impresora.imprimir(foto);
        Impresora.imprimir(texto);
        Impresora.imprimir(paginaWeb);
        Impresora.imprimir(miTesis);
    }
}
