/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.test;

import co.edu.unbosque.calculadora.Calculadora;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author Andres David Romero
 */
public class CalculadoraTest {
    
    @Test
    /*
    * Test que verifica si se realizo la suma
    */
    public void pruebaSumPositivos(){
        System.out.println("iniciando prueba suma de positivos");
        Calculadora c = new Calculadora();
        int resultado = c.suma(2,3);
        int valor_esperado = 5;
        Assert.assertTrue(resultado==valor_esperado);
    }
    
    
    
}
