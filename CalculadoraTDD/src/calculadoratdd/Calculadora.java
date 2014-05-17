package calculadoratdd;


public class Calculadora {
    final double IGV = 0.18;
    public double igv(double monto){
        return monto * IGV;
    }        
    public int calcularFactorial(int factor){
        int respuesta = 1;
        for(int x = 1; x <= factor; x++){
            respuesta = respuesta * x;
        }
        return respuesta;
    }
}
