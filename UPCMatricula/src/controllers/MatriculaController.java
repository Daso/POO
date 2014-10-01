package controllers;

import models.Alumno;
import models.Curso;

public class MatriculaController {
    private Curso curso;
    public MatriculaController() {
        crearCurso();
    }
            
    private void crearCurso(){
         curso = new Curso("DEW");
    }
    
    public Alumno crearAlumno(String codigo, String nombre, String apellido){
      Alumno alumno = new Alumno(codigo, nombre, apellido);
      return alumno;
    }
    
    public String matricular(String codigo, String nombre, String apellido){
       Alumno alumno = crearAlumno(codigo, nombre, apellido);
       curso.agregarAlumno(alumno);
       return "Alumnos matriculado satisfactoriamente";
    }
    
    public String reporteMatricula(){
        return curso.listaMatriculados();
    }
    
}
