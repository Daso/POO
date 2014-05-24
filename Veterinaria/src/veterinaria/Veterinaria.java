package veterinaria;

public class Veterinaria {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.registrarMascota("Ave", 'A');
        cliente.registrarMascota("Fifi", 'P');
        cliente.registrarMascota("Demonio", 'G');
        cliente.registrarMascota("Rambo", 'P');        
        System.out.println(cliente.hacerRuidos());               
    }
    
}
