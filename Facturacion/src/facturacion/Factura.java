
package facturacion;

public class Factura extends Comprobante{
    
    private final double IGV = 0.18;
    private String ruc;
    private double igv;
    private double total;
    private double totalConIGV;
    
    public Factura(String ruc, String fecha, String razonSocial) {
        super(fecha, razonSocial);
        this.ruc = ruc;        
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }
    
    private double calcularTotal(){
        total = 0;
         for(DetalleComprobante detalle : detalles){
           total = total + detalle.getTotal();
        }
         return total;
    }
    
    public void setTotal(){
        total = calcularTotal();
    }
    
    private double calcularIGV(){
        return total * IGV;
    }
    
    public void setIGV(){
        igv = calcularIGV();
    }

    @Override
    public String reporteComprobante() {
        String mensaje = "";
        mensaje += "FACTURA" + '\n';
        mensaje += "Razon Social: " + razonSocial + '\n';
        mensaje += "RUC: " + ruc + '\n';
        mensaje += "IGV: " + igv + '\n';
        mensaje += "-------------DETALLE----------------" + '\n';
        for(DetalleComprobante detalle : detalles){
            mensaje += detalle.reporteDescripcion() + '\n';            
        }
        mensaje += "--------------CIERRE DETALLE-----------" + '\n' ;
        mensaje += "TOTAL: " + total; 
        return mensaje;
    }
   
    
}
