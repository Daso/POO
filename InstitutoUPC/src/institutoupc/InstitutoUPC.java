/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package institutoupc;

public class InstitutoUPC {

    public static void main(String[] args) {
      Alumno alumno = new Alumno();
      alumno.setNombre("Pedro");
            
      Alumno alumno2 = new Alumno();
      alumno2.setNombre("Sandra");
      
      Alumno alumno3 = new Alumno();
      alumno3.setNombre("Boris");
      
      Alumno alumno4 = new Alumno();
      alumno4.setNombre("Petronila");
      
      Curso curso = new Curso();
      curso.setNombre("Ingles - V");
      curso.setCapacidad(5);
      
      Curso curso2 = new Curso();
      curso2.setNombre("Matemáticas Básicas II");
      curso2.setCapacidad(3);
      
      curso.matricularAlumno(alumno);
      curso.matricularAlumno(alumno2);
      
      curso2.matricularAlumno(alumno);
      curso2.matricularAlumno(alumno2);
      curso2.matricularAlumno(alumno3);
      curso2.matricularAlumno(alumno4);
      
      System.out.println(curso.ListaDeMatriculados());
      System.out.println(curso2.ListaDeMatriculados());
      
      System.out.println(curso.getNombre() + ": Capacidad: " + curso.calcularVacantes());
      System.out.println(curso2.getNombre() + ": Capacidad: " + curso2.calcularVacantes());
      
      
    }
    
}
