package nido;
/*Desarrollar una aplicación que permita simular el siguiente
 * caso: Un nido tiene alumnos que son puestos en un cuarto
 * con conejos. Cuando un niño acaricie a un conejo este 
 * levantará las orejas
 */

public class Nido {

    
    public static void main(String[] args) {
        Conejo conejo01 = new Conejo("Blanquito"); 
        Conejo conejo02 = new Conejo("Rabito");
        Conejo conejo03 = new Conejo("Bugs Bunny");
        
        Alumno alumno01 = new Alumno();
        alumno01.setNombre("Carlos");
        Alumno alumno02 = new Alumno();
        alumno02.setNombre("Juliana");
        
        System.out.println(alumno01.acariciar(conejo02));
        System.out.println(alumno02.acariciar(conejo03));
        System.out.println(alumno02.acariciar(conejo01));
        
    }
}
