package veterinaria;

public class Veterinaria {

    public static void main(String[] args) {       
        Perro perro = new Perro("Chico", "Rambo", 1);
        Gato gato = new Gato("Lucifer", 3);
        Gato gato2 = new Gato("Gandalf", 7);
        Ave ave = new Ave("Piolin", 1);
        Reptil reptil = new Reptil("Juancho", 4);
        Cliente cliente = new Cliente();
        cliente.agregarMascota(gato);
        cliente.agregarMascota(perro);
        cliente.agregarMascota(gato2);
        cliente.agregarMascota(ave);
        cliente.agregarMascota(reptil);
        
        System.out.println(cliente.reporteMascotas());
        System.out.println(ave.presentarse());
    }
}
/*
 * 
}
 * */
 