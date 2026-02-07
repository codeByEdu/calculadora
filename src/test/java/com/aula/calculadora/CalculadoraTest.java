package com.aula.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
     //Arrange
    Calculadora calculadoraTestes = new Calculadora();

    @Test
    void deveTestarSoma(){

        //Act
        int resultado = calculadoraTestes.somar(5, 5);
        
        //Assert
        assertEquals(10,resultado);     
        assertEquals(17, calculadoraTestes.somar(12, 5));   
    }

    @Test
    void deveTestarDivisao(){

        //Act
        int resultado = calculadoraTestes.dividir(-5000, -10);
        //Assert
        assertEquals(500, resultado);

    }

    @Test
    void deveSubtrairDoisNumeros(){

        int resultado = calculadoraTestes.subtrair(20, 60);
        assertEquals(-40,resultado);

    }

    @Test
    void deveMultiplicarDoisNumeros(){

        int resultado = calculadoraTestes.multiplicar(8, 7);
        assertEquals(56, resultado);
    }
}
