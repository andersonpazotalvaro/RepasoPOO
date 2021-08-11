/*package pruebasunitarias;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import calculo.Calculadora;
import excepcion.CalculadoraExcepcion;

class CalculadoraTest {

	@Test
	@DisplayName("Escenario 1: 5 + 3 = 8")
	void escenarioUno() {
		// Arrange
		int numeroUno = 5;
		int numeroDos = 3;

		// Act
		Calculadora calculadora = new Calculadora();
		double resultado = calculadora.sumar(numeroUno, numeroDos);

		// Assert
		assertTrue(resultado == 8);
	}

	@Test
	@DisplayName("Escenario 2: 5 - 3 = 2")
	void escenarioDos() {
		// Arrange
		int numeroUno = 5;
		int numeroDos = 3;

		// Act
		Calculadora calculadora = new Calculadora();
		double resultado = calculadora.restar(numeroUno, numeroDos);

		// Assert
		assertTrue(resultado == 2);
	}

	@Test
	@DisplayName("Escenario 3: 5 / 2 = 2")
	void escenarioTres() {
		// Arrange
		int numeroUno = 5;
		int numeroDos = 2;

		// Act
		Calculadora calculadora = new Calculadora();
		double resultado = calculadora.dividir(numeroUno, numeroDos);

		// Assert
		assertTrue(resultado == 2);
	}

	@Test
	@DisplayName("Escenario 4: 5.0 / 2 = 2.5")
	void escenarioCuatro() {
		// Arrange
		double numeroUno = 5.0;
		int numeroDos = 2;

		// Act
		Calculadora calculadora = new Calculadora();
		double resultado = calculadora.dividir(numeroUno, numeroDos);

		// Assert
		assertTrue(resultado == 2.5);
	}

	@Test
	@DisplayName("Escenario 5: 10.5 NO es entero")
	void escenarioCinco() {
		// Arrange
		double numero = 10.5;

		// Act
		Calculadora calculadora = new Calculadora();
		boolean resultado = calculadora.numeroEsEntero(numero);

		// Assert
		assertFalse(resultado);
	}

	@Test
	@DisplayName("Escenario 6: 10 es entero")
	void escenarioSeis() {
		// Arrange
		int numero = 10;

		// Act
		Calculadora calculadora = new Calculadora();
		boolean resultado = calculadora.numeroEsEntero(numero);

		// Assert
		assertTrue(resultado);
	}

	@Test
	@DisplayName("Escenario 7: 10.0 NO es entero")
	void escenarioSiete() {
		// Arrange
		double numero = 10.0;

		// Act
		Calculadora calculadora = new Calculadora();
		boolean resultado = calculadora.numeroEsEntero(numero);

		// Assert
		assertFalse(resultado);
	}

	@Test
	@DisplayName("Escenario 8: Divisi�n por cero")
	void escenarioOcho() {
		// Arrange
		double numeroUno = 5.0;
		int numeroDos = 0;

		// Act
		Calculadora calculadora = new Calculadora();

		// Assert
		assertThrows(CalculadoraExcepcion.class, () -> calculadora.dividir(numeroUno, numeroDos));
	}

	@Test
	@DisplayName("Escenario 9: 5 % 3 = 2")
	void escenarioNueve() {
		// Arrange
		int numeroUno = 5;
		int numeroDos = 3;

		// Act
		Calculadora calculadora = new Calculadora();
		long resultado = calculadora.hallarModuloDivision(numeroUno, numeroDos);

		// Assert
		assertTrue(resultado == 2);
	}

	@Test
	@DisplayName("Escenario 10: M�dulo de la divisi�n por cero")
	void escenarioDiez() {
		// Arrange
		int numeroUno = 5;
		int numeroDos = 0;

		// Act
		Calculadora calculadora = new Calculadora();

		// Assert
		assertThrows(CalculadoraExcepcion.class, () -> calculadora.hallarModuloDivision(numeroUno, numeroDos));
	}

	@Test
	@DisplayName("Escenario 11: MCM de 10 y 15 es 30")
	void escenarioOnce() {
		// Arrange
		int numeroUno = 10;
		int numeroDos = 15;

		// Act
		Calculadora calculadora = new Calculadora();
		long resultado = calculadora.hallarMinimoComunMultiplo(numeroUno, numeroDos);

		// Assert
		assertTrue(resultado == 30);
	}
	
	@Test
	@DisplayName("Escenario 12: MCM de 13 y 13 es 13")
	void escenarioDoce() {
		// Arrange
		int numeroUno = 13;
		int numeroDos = 13;

		// Act
		Calculadora calculadora = new Calculadora();
		long resultado = calculadora.hallarMinimoComunMultiplo(numeroUno, numeroDos);

		// Assert
		assertTrue(resultado == 13);
	}
	
	@Test
	@DisplayName("Escenario 13: MCM de 5 y 5 es 5")
	void escenarioTrece() {
		// Arrange
		int numeroUno = 5;
		int numeroDos = 5;

		// Act
		Calculadora calculadora = new Calculadora();
		long resultado = calculadora.hallarMinimoComunMultiplo(numeroUno, numeroDos);

		// Assert
		assertTrue(resultado == 5);
	}
	
	@Test
	@DisplayName("Escenario 14: 11 es primo")
	void escenarioCatorce() {
		// Arrange
		int numero = 11;

		// Act
		Calculadora calculadora = new Calculadora();
		boolean resultado = calculadora.esNumeroPrimo(numero);

		// Assert
		assertTrue(resultado);
	}
	
	@Test
	@DisplayName("Escenario 15: 24 NO es primo")
	void escenarioQuince() {
		// Arrange
		int numero = 24;

		// Act
		Calculadora calculadora = new Calculadora();
		boolean resultado = calculadora.esNumeroPrimo(numero);

		// Assert
		assertFalse(resultado);
	}

}*/
