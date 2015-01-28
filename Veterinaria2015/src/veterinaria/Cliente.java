
package veterinaria;

import java.util.ArrayList;
import java.util.List;


public class Cliente {
  private String nombre;
  private double saldo;
  private List<Mascota> mascotas = new ArrayList <>();
      


    public Cliente(String nombre) {
        this.nombre = nombre;
        this.saldo = 0.0;
    }
     
     public void inscribirMascota(Mascota mascota){
         mascotas.add(mascota);
     }
     
     public void solicitarServicio(Mascota mascota){
         saldo += mascota.servicioBanho();
     }
     
     
     public String reporteCliente(){
         String mensaje = "";
         mensaje += "Soy " + nombre + " y estas son mis mascotas:" + '\n' ;
         mensaje += "--------------------------------------------" + '\n';
         for(Mascota mascota: mascotas){
             mensaje += mascota.presentarse();
             mensaje += '\n';
         }   
         mensaje += "Y debo: " + saldo;
         return mensaje;
     }
}
