/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.test;

import co.edu.unbosque.calculadora.Operadores;
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
        Operadores c = new Operadores();
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
        Operadores c = new Operadores();
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
        Operadores c = new Operadores();
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
        Operadores c = new Operadores();
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
        Operadores c = new Operadores();
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
        Operadores c = new Operadores();
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
        Operadores c = new Operadores();
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
        Operadores c = new Operadores();
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
        Operadores c = new Operadores();
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
        Operadores c = new Operadores();
        int resultado = c.multiplicacion(0,-3);
        int valor_esperado = 0;
        Assert.assertTrue(resultado==valor_esperado);
    }
     /*
    * Test que verifica si se realizo la division con numeros positivos
    */
    @Test
    public void pruebaDiviPos(){
        System.out.println("iniciando prueba division positiva ");
        Operadores c = new Operadores();
         c.division(40,4);
        int valor_esperado = 10;
        Assert.assertTrue(c.getResultado()==valor_esperado);
    }
        /*
    * Test que verifica si se realizo la división de dos numeros negativos  
    */
        @Test
    public void pruebaDiviNeg(){
        System.out.println("iniciando prueba division negativa ");
        Operadores c = new Operadores();
        c.division(-40,-4);
        int valor_esperado = 10;
        Assert.assertTrue(c.getResultado()==valor_esperado);
    }
            /*
    * Test que verifica si se realizo la división de dos numeros positivo y negativo 
    */
            @Test
    public void pruebaDiviPosNeg(){
        System.out.println("iniciando prueba division con numeros positivos y negativos");
        Operadores c = new Operadores();
        c.division(40,-4);
        int valor_esperado = -10;
        Assert.assertTrue(c.getResultado()==valor_esperado);
    }
    
    /*
    * Test que verifica si se realizo la division por 0
    */
    @Test
    public void pruebaDivi0(){
        System.out.println("iniciando prueba division con 0");
        Operadores c = new Operadores();
        c.division(-40,0);
         Assert.assertTrue(c.getResultado()==0);
      
    }
    
    
    
}
