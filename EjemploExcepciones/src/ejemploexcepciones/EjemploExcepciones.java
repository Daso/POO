
package ejemploexcepciones;

public class EjemploExcepciones {

   
    public static void main(String[] args) {
      CalculadoraVotos calculadora = new CalculadoraVotos();
        
        try {
          char a = calculadora.leer();  
          System.out.println(a);
          calculadora.registrarVotos(-90);
          System.out.println(calculadora.porcentaje(10000, 1038));          
          System.out.println(calculadora.porcentaje(0, 0));
          //System.out.println(calculadora.resultadosMesa(180, 10));                    
          
        }  
         catch(ArithmeticException ae){
          System.out.println("Ocurrió un error aritmético") ;
          System.out.println(ae.getMessage());                                
        }catch(ArrayIndexOutOfBoundsException are){
          System.out.println("Es un error del arreglo"); 
          System.out.println("Indice " + are.getMessage() + " no existe");
        }    
        catch(MyException miExcepcion){
            System.out.println(miExcepcion.getMessage());        }
        catch (Exception e) {
          System.out.println("Ha ocurrido un error!!!");
        }
       
        
        System.out.println("Gracias por participar");
        
       
    
    
    }
}
