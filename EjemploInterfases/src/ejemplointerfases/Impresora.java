package ejemplointerfases;

public class Impresora {
    public static String imprimir(IImprimible imprimible){
        return imprimible.reporte();
    }
    
    public String reporteImpresora(){
        return "Estoy viva ";
    }
}
