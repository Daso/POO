
package ejemplointerfases;


public class Producto implements IImprimible{
    private String descripcion;

    public Producto(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String reporte() {
        return "Producto: " + descripcion;
    }
    
    
    
}
