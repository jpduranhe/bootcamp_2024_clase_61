package cl.bootcamp.clase_61.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	Calculadora calculadora;
	
	@BeforeEach
	void setup() {
		calculadora= new Calculadora();
	}
	
	@Test
	void testSumar2Numeros() {
		
		int resultado= calculadora.sumar(1,9);
		
		Assertions.assertEquals(10,resultado);
	}
	@Test
	void testSumar3Numeros() {
		
		int resultado= calculadora.sumar(1,9,2);
		
		Assertions.assertEquals(12,resultado);
	}
	@Test
	void testRestar2Numeros() {
		
		int resultado= calculadora.restar(9,1);
		
		Assertions.assertEquals(8,resultado);
	}
}
