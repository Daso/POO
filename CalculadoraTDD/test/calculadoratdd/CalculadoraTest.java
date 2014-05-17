package calculadoratdd;


import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
    
    private Calculadora calculadora;
    
    public CalculadoraTest() {
        calculadora = new Calculadora();
    }

    @Test
    public void cuandoIngresoUnMontoDeboRecibirElIGV(){
        
        Assert.assertEquals(18.0,calculadora.igv(100.0),0.0);
    }
    
    @Test
    public void cuandoIngresoUnValorDeboRecibirElFactorial(){
        
        Assert.assertEquals(120, calculadora.calcularFactorial(5));
    }
    
}
