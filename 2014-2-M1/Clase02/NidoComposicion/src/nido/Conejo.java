package nido;

public class Conejo {
  private String nombre;  
 
  public Conejo(String nombre){
      this.nombre = nombre;
  }
  
  public String getNombre(){
      return this.nombre;
  }
  
  public String levantarOrejas(){
      return "Soy " + this.nombre + " y levanto mis orejas";
  }
  
}
