package institutoupc;

public class Alumno {
  private String codigo;
  private String nombre;
  
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
      
}
