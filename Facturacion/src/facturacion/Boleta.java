

package facturacion;

public class Boleta extends Comprobante{
    private String serie; 
    public Boleta(String serie, String fecha, String razonSocial) {
        super(fecha, razonSocial);
        this.serie = serie;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public String reporteComprobante() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
}
