package veterinaria;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Carlos");        
        Cliente cliente2 = new Cliente("Sandra");
        Perro miPerro = new Perro("Grande", "Fifi", 'm');
        Perro miPerro2 = new Perro("Mediano", "Sultán", 'm');
        Perro miPerro3 = new Perro("Grande", "Lady", 's');
        Gato miGato = new Gato("Satán", 'm');
        Gato miGato2 = new Gato("Lucifer", 'm');
        
        cliente.inscribirMascota(miGato);
        cliente.inscribirMascota(miPerro);
        cliente.inscribirMascota(miPerro2);
        
        cliente2.inscribirMascota(miGato2);
        
        cliente.solicitarServicio(miGato);
        cliente.solicitarServicio(miPerro);
        
        System.out.println(cliente.reporteCliente());
        System.out.println(cliente2.reporteCliente());

    }

}
