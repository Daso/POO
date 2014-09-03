package nido;

public class Alumno {
  private String nombre;
  private Conejo conejo;
  
  public Alumno(String nombreConejo){
    conejo = new Conejo(nombreConejo);
  }  
  
  
  
  public void setNombre(String nombre){
      this.nombre = nombre;
  }  
  public void setConejo(Conejo conejo){
      this.conejo = conejo;
  }
  
  public String acariciar(){
      String mensaje = " ";
      mensaje += "Soy " + this.nombre + " y acaricio";
      mensaje += " a " + this.conejo.getNombre();
      mensaje += " " + this.conejo.levantarOrejas();
      return mensaje;
  }
  
}
