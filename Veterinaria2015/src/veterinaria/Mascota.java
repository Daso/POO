package veterinaria;


public abstract class Mascota {
  protected String nombre;
  protected String raza;
  protected char genero;
  protected boolean vacunado;

    public Mascota(String nombre, char genero) {
        this.nombre = nombre;
        this.genero = genero;
        this.vacunado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
  
    public void vacunarme(){
        this.vacunado = true;
    }
    
    public String estaVacunado(){
      if(vacunado){
          return "Estoy vacunado";}
      else{
           return "No estoy vacunado";
      }  
    }
    
    public abstract String presentarse();
    public abstract double servicioBanho();
}
