package institutoupc;

import java.util.ArrayList;

public class Curso {
  private String codigo;
  private String nombre;
  private ArrayList<Alumno> alumnos = new ArrayList<>();
  
  public void setCodigo(String codigoRecibido){
    codigo = codigoRecibido;  
  }
  
  public String getCodigo(){
      return codigo;
  }
  
  public void setNombre(String nombreRecibido){
      nombre = nombreRecibido;
  }
  
  public String getNombre(){
      return nombre;
  }
  
  public void matricularAlumno(Alumno alumno){
      alumnos.add(alumno);
  }
  
  public String ListaDeMatriculados(){
      String mensaje = "";
      mensaje += "Bienvenido a " + nombre;
      mensaje += '\n';
      mensaje += "----------------------------";
      mensaje += '\n';
      mensaje += "Los alumnos matriculados son:";
      mensaje += '\n';
      mensaje += "-----------------------------";
      mensaje += '\n';
      for(Alumno alumno: alumnos){
         mensaje += alumno.getNombre();
         mensaje += '\n';
      }      
      return mensaje;
  }
 
  
}
