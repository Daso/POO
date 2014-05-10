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
      
      Curso curso = new Curso();
      curso.setNombre("Ingles - V");
      
      Curso curso2 = new Curso();
      curso2.setNombre("Matemáticas Básicas II");
      
      curso.matricularAlumno(alumno);
      curso.matricularAlumno(alumno2);
      
      curso2.matricularAlumno(alumno);
      
      System.out.println(curso.ListaDeMatriculados());
      System.out.println(curso2.ListaDeMatriculados());
      
      
    }
    
}
