/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facturacion;

/**
 *
 * @author pcsidsub
 */
public class Facturacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Factura factura = new Factura("918273123423", "30/05/2014", "UPC.SAC");
       factura.IngresarDetalleComprobante(1, "Curso Inglés", 1000.0);
       factura.IngresarDetalleComprobante(2, "Caramelos UPC", 20.0);
       factura.IngresarDetalleComprobante(10, "Lapiceros", 0.50);
       factura.setTotal();
       factura.setIGV();
        
       System.out.println(factura.reporteComprobante());
       
        
        
        
    }
    
}
