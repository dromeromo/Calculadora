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
    * Test que verifica si se realizo la suma con numeros positivos
    */
    public void pruebaSumPositivos(){
        System.out.println("iniciando prueba suma de positivos");
        Calculadora c = new Calculadora();
        int resultado = c.suma(2,3);
        int valor_esperado = 5;
        Assert.assertTrue(resultado==valor_esperado);
    }
    
        @Test
    /*
    * Test que verifica si se realizo la suma con numeros negativos
    */
    public void pruebaSumNegativo(){
        System.out.println("iniciando prueba suma de negativos");
        Calculadora c = new Calculadora();
        int resultado = c.suma(-2,-3);
        int valor_esperado = -5;
        Assert.assertTrue(resultado==valor_esperado);
    }
    
        @Test
    /*
    * Test que verifica si se realizo la suma de positivos y negativos
    */
    public void pruebaSumPosNeg(){
        System.out.println("iniciando prueba suma de positivos y negativos");
        Calculadora c = new Calculadora();
        int resultado = c.suma(2,-3);
        int valor_esperado = -1;
        Assert.assertTrue(resultado==valor_esperado);
    }
    
    /*
    * Test que verifica si se realizo la resta de positivos dos numeros positivos
    */
     @Test
    public void pruebaRestaPositivos(){
        System.out.println("iniciando prueba Resta de positivos");
        Calculadora c = new Calculadora();
        int resultado = c.resta(2,3);
        int valor_esperado = -1;
        Assert.assertTrue(resultado==valor_esperado);
    }
    
    /*
    * Test que verifica si se realizo la resta de negativos dos numeros negativos
    */
     @Test
    public void pruebaRestaNegativos(){
        System.out.println("iniciando prueba Resta de numeros negativos");
        Calculadora c = new Calculadora();
        int resultado = c.resta(-2,-3);
        int valor_esperado = 1;
        Assert.assertTrue(resultado==valor_esperado);
    }
    
     /*
    * Test que verifica si se realizo la resta de dos numeros positivo y negativo 
    */
     @Test
    public void pruebaRestaPostNeg(){
        System.out.println("iniciando prueba Resta de numeros postivo y negativo");
        Calculadora c = new Calculadora();
        int resultado = c.resta(2,-3);
        int valor_esperado = 5;
        Assert.assertTrue(resultado==valor_esperado);
    }
    
        /*
    * Test que verifica si se realizo la multiplicacion de dos numeros positivos 
    */
     @Test
    public void pruebaMultiPos(){
        System.out.println("iniciando prueba multiplicacion de numeros positivos");
        Calculadora c = new Calculadora();
        int resultado = c.multiplicacion(2,3);
        int valor_esperado = 6;
        Assert.assertTrue(resultado==valor_esperado);
    }
    
         /*
    * Test que verifica si se realizo la multiplicacion de dos numeros negativos 
    */
     @Test
    public void pruebaMultiNeg(){
        System.out.println("iniciando prueba multiplicacion de numeros negativos");
        Calculadora c = new Calculadora();
        int resultado = c.multiplicacion(-2,-3);
        int valor_esperado = 6;
        Assert.assertTrue(resultado==valor_esperado);
    }
    
    /*
    * Test que verifica si se realizo la multiplicacion de dos numeros positivo y negativo 
    */
     @Test
    public void pruebaMultiPosNeg(){
        System.out.println("iniciando prueba multiplicacion de numeros positivo y negativo ");
        Calculadora c = new Calculadora();
        int resultado = c.multiplicacion(2,-3);
        int valor_esperado = -6;
        Assert.assertTrue(resultado==valor_esperado);
    }
    
      /*
    * Test que verifica si se realizo la multiplicacion por 0
    */
     @Test
    public void pruebaMulti0(){
        System.out.println("iniciando prueba multiplicacion por 0 ");
        Calculadora c = new Calculadora();
        int resultado = c.multiplicacion(0,-3);
        int valor_esperado = 0;
        Assert.assertTrue(resultado==valor_esperado);
    }
    
    
    
}
