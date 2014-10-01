package models;

import java.util.ArrayList;

public class Curso {
    private String nombre;
    ArrayList <Alumno> alumnos = new ArrayList<>();

    public Curso(String nombre) {
        this.nombre = nombre;
    }        
    
    public void agregarAlumno(Alumno alumno){
        alumnos.add(alumno);
    }
    
    public String listaMatriculados(){
        String list = " ";
        list += "Curso: " + nombre + "\n\n";
        for (Alumno alumno : alumnos){
            list += alumno.toString();
            list += '\n';
        }
        return list;
    }
}
