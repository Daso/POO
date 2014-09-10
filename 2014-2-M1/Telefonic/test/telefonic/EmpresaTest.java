/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telefonic;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author proyecto
 */
public class EmpresaTest {
    private Empresa empresa;
    public EmpresaTest() {
        empresa = new Empresa();
    }

    @Test
    public void cuandoHago1pasoPago500() {
        empresa.registrarPasos(1);
        Assert.assertEquals(500.0, empresa.calcularPago(), 0.0);
    }
    
    @Test
    public void cuandoHago1010pasoPago520() {
        empresa.registrarPasos(1010);
        Assert.assertEquals(520.0, empresa.calcularPago(), 0.0);
    }
    
    @Test
    public void cuandoHago1101pasoPago540() {
        empresa.registrarPasos(1101);
        Assert.assertEquals(540.0, empresa.calcularPago(), 0.0);
    }
}

 