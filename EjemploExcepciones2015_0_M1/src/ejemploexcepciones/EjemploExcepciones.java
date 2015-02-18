
package ejemploexcepciones;

import java.io.PrintWriter;

public class EjemploExcepciones {

    public static void main(String[] args) {   
        
        try {
            Calculadora calculadora = new Calculadora();
            System.out.println(calculadora.dividir(4,0));
            calculadora.arreglo(4, 6);          
            System.out.println("Todo OK!!!");
            
        }         
        catch(SaldoNegativoException sne){
            System.out.println(sne.getMessage());
        }        
        catch(ArithmeticException ae){
              System.out.println("Se ha divido entre 0 dos enteros!!! eso es un error");
              System.out.println(ae.getMessage());
              try {
                PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
                writer.println("Se ha divido entre 0 dos enteros!!! eso es un error");
                writer.println(ae.getMessage());
                writer.close();
            } catch (Exception e) {
                System.out.println("Todo está perdido");
            }
              
        } catch (ArrayIndexOutOfBoundsException aie){            
            System.out.println("Error de índice en el arreglo");
        }catch (Exception e) {
              System.out.println("Se ha cometido un error desconocido");
        }finally{
            System.out.println("GRACIAS POR USAR EL SISTEMA");
        }
  
       
    }
    
}
