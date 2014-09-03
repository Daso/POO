package nido;

public class Alumno {
  private String nombre;
  
  public Alumno(){      
      
  }
  
  public void setNombre(String nombre){
      this.nombre = nombre;
  }
  
  public String acariciar(Conejo conejo){
      String mensaje = " ";
      mensaje += "Soy " + this.nombre + " y acaricio";
      mensaje += " a " + conejo.getNombre();
      mensaje += " " + conejo.levantarOrejas();
      return mensaje;
  }
  
}
