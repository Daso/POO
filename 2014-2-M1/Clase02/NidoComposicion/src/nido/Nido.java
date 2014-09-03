package nido;
/*Desarrollar una aplicación que permita simular el siguiente
 * caso: Un nido tiene alumnos que son puestos en un cuarto
 * con conejos. Cuando un niño acaricie a un conejo este 
 * levantará las orejas
 */

public class Nido {

    
    public static void main(String[] args) {
      
        
        Alumno alumno01 = new Alumno("Rabito");
        alumno01.setNombre("Carlos");
        Alumno alumno02 = new Alumno("Satán");
        alumno02.setNombre("Juliana");
        
        
        System.out.println(alumno01.acariciar());
        System.out.println(alumno02.acariciar());
        System.out.println(alumno02.acariciar());
        
    }
}
