package com.aula.calculadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculadoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraApplication.class, args);

		Calculadora calculadoraDoEdu = new Calculadora();
		int resultado =  calculadoraDoEdu.dividir(100, 10);
		System.out.println("O resultado da operação é: " + resultado);
	}

}
