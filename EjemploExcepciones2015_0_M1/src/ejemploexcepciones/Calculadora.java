
package ejemploexcepciones;


public class Calculadora {
    
    public double dividir(int valor1, int valor2) throws SaldoNegativoException{
        if (valor2 == 0){
           throw new SaldoNegativoException("El Valor no puede ser cero");
        }
        return valor1 / valor2;
    }
           
   public void arreglo(int valor1, int valor2){
       int[] valores = new int[3];
       
       valores[0] = valor1;
       valores[1] = valor2;
   }
    
}
