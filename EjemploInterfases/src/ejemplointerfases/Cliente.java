
package ejemplointerfases;


public class Cliente implements IImprimible{
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String reporte() {
        return "Bienvenido: " + nombre;
    }
   
}
