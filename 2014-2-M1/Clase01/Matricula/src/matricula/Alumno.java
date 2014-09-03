package matricula;

public class Alumno {
   private String nombre;
   private double nota1;
   private double nota2;
   
   public void inscribir(String nombre, double nota1, double nota2){
       this.nombre = nombre;
       this.nota1 = nota1;
       this.nota2 = nota2;
   }
   
   public double promedio(){
    return (nota1 + nota2) / 2;
 }
   
}
