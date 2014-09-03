
package matricula;


public class Matricula {    
    public static void main(String[] args) {
      Alumno alumno1 = new Alumno();
      alumno1.inscribir("Carlos", 12.5, 14.7);
      System.out.println(alumno1.promedio());
      
       Alumno alumno2 = new Alumno();
      alumno2.inscribir("Pablo", 20.0, 17.7);
      System.out.println(alumno2.promedio());
      
      
    }
}
