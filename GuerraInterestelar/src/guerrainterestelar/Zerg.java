
package guerrainterestelar;

public abstract class Zerg {
  protected String nombre;
  protected double ataque;
  protected String rugido;

    public String getName() {
        return nombre;
    }

    public void setName(String name) {
        this.nombre = name;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public String getRugido() {
        return rugido;
    }

    public void setRugido(String rugido) {
        this.rugido = rugido;
    }
  
    public String acechando(){
        return nombre + " me acerco al marine";
    }
    
    public String mostrarme(){
        return "yo " + nombre + " entro al campo " + rugido;        
    }
    
    public String atacar(){
        return nombre  + " ataco y hago " + ataque;
    }
  
}
