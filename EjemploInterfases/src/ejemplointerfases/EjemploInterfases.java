
package ejemplointerfases;


public class EjemploInterfases {

   
    public static void main(String[] args) {
       Producto producto = new Producto("Carne");
       Cliente cliente = new Cliente("Carlos");
             
       System.out.println(Impresora.imprimir(cliente));
       
       Impresora impresora = new Impresora();
       System.out.println(impresora.reporteImpresora());
       
       
    }
    
}
