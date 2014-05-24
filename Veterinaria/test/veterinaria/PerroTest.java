
package veterinaria;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class PerroTest {
    
    private Perro perro;
    
    public PerroTest() {
        perro = new Perro();
    }

    @Test
    public void cuandoCreoUnPerroDebeTenerNombre() {
        Perro perro = new Perro("Fido", 'p');
        Assert.assertEquals("Fido",perro.getNombre());
    }
    
    @Test
    public void cuandoElPerroEsGrandeDebeCobrar20(){
        perro.setTamanho('G');
        Assert.assertEquals(20, perro.costoServicio());
    }
    
    @Test
    public void cuandoElPerroEsMedianoDebeCobrar10(){
        perro.setTamanho('M');
        Assert.assertEquals(10, perro.costoServicio());
    }
    
    @Test
    public void cuandoElPerroEsPequeñoDebeCobrar5(){
        perro.setTamanho('P');
        Assert.assertEquals(5, perro.costoServicio());
}
    
    
}
