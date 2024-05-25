
package com.mycompany.m5_uf2_pr4;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UtilidadesTest {
    
    public UtilidadesTest() {
    }
    
   

    /**
     * Test of descomponerPrimos method, of class Utilidades.
     */
    @Test
    public void testDescomponerPrimos() {
        System.out.println("descomponerPrimos");
        int num = 36;
        List<Integer> expResult =  Arrays.asList(2, 2, 3, 3);
        List<Integer> result = Utilidades.descomponerPrimos(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of fibonacci method, of class Utilidades.
     */
    @Test
    public void testFibonacci() {
        System.out.println("fibonacci");
        int n = 6;
        List<Integer> expResult = Arrays.asList(0, 1, 1, 2,3,5);
        List<Integer> result = Utilidades.fibonacci(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of sumaDigitos method, of class Utilidades.
     */
    @Test
    public void testSumaDigitos() {
        System.out.println("sumaDigitos");
        int numero = 12345;
        int expResult = 15;
        int result = Utilidades.sumaDigitos(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of esPrimo method, of class Utilidades.
     */
    @Test
    public void testEsPrimo() {
        System.out.println("esPrimo");
        int numero = 17;
        boolean expResult = true;
        boolean result = Utilidades.esPrimo(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of esNumeroPerfecto method, of class Utilidades.
     */
    @Test
    public void testEsNumeroPerfecto() {
        System.out.println("esNumeroPerfecto");
        int numero = 28;
        boolean expResult = true;
        boolean result = Utilidades.esNumeroPerfecto(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of resolverEcuacionSegundoGrado method, of class Utilidades.
     */
    @Test
    public void testResolverEcuacionSegundoGrado() {
        System.out.println("resolverEcuacionSegundoGrado");
        double a = 1.0;
        double b = -3.0;
        double c = 2.0;
        double[] expResult = {2.0,1.0};
        double[] result = Utilidades.resolverEcuacionSegundoGrado(a, b, c);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
