package ejemploexcepciones;

import java.io.IOException;


public class CalculadoraVotos {
    
  public char leer() throws IOException{
    return (char) System.in.read();
}
  
    
  public void registrarVotos(int votos) throws MyException{
     if (votos < 0){
         throw new MyException("Los votos fueron negativos");
     } 
  }  
  public String resultadosMesa(int votosValidos, int posicion) throws Exception{
      int votos[] = new int[10];
      votos[posicion] = votosValidos;
      return "Votos ingresados";
  }  
    
  public double porcentaje(int votosPartido, int votosTotales)throws Exception{
      return votosPartido / votosTotales;
  }  
}
