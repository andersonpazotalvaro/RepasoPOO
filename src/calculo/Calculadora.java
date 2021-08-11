package calculo;

import excepcion.CalculadoraExcepcion;

import javax.swing.*;

public class Calculadora {

	public double sumar(double numeroUno, double numeroDos) {
		return numeroUno + numeroDos;
	}

	public double restar(double numeroUno, double numeroDos) {
		return numeroUno - numeroDos;
	}

	public double dividir(Number numeroUno, Number numeroDos) {

		if (numeroDos.doubleValue() == 0) {
			throw new CalculadoraExcepcion("No es posible dividir por cero...");
		}

		Number resultado = 0;

		if (numeroEsEntero(numeroUno) && numeroEsEntero(numeroDos)) {
			resultado = numeroUno.longValue() / numeroDos.longValue();
		} else {
			resultado = numeroUno.doubleValue() / numeroDos.doubleValue();
		}

		return resultado.doubleValue();
	}

	public double multiplicar(double numeroUno, double numeroDos) {
		return numeroUno * numeroDos;
	}

	public boolean esNumeroPrimo(int numero) {
		int esprimo=1;
		for(int i=1;i<numero;i++){
			hallarMinimoComunMultiplo(numero,i);
		}
		if (esprimo==1){
			return true;
		}
		return false;
	}

	public long hallarMinimoComunMultiplo(long numeroUno, long numeroDos) {
		//int contador2=1;
		long mcm = 1;
		long contador = 2;

		while (contador <= numeroUno || contador <= numeroDos) {

			if (esDivisionExacta(numeroUno, contador) || esDivisionExacta(numeroDos, contador)) {
				mcm = mcm * contador;

				if (esDivisionExacta(numeroUno, contador)) {
					numeroUno = numeroUno / contador;
				}

				if (esDivisionExacta(numeroDos, contador)) {
					numeroDos = numeroDos / contador;
				}
				//contador2++;
			} else {
				contador = contador + 1;
			}

		}
		return mcm;
	}

	public boolean esDivisionExacta(long numeroUno, long numeroDos) {
		return hallarModuloDivision(numeroUno, numeroDos) == 0;
	}

	public long hallarMaximoComunDivisor(long numeroUno, long numeroDos) {
		long mcd = 1;
		long contador = 2;

		while (contador <= numeroUno || contador <= numeroDos) {

			if (esDivisionExacta(numeroUno, contador) && esDivisionExacta(numeroDos, contador)) {
				mcd = mcd * contador;

				if (esDivisionExacta(numeroUno, contador)) {
					numeroUno = numeroUno / contador;
				}

				if (esDivisionExacta(numeroDos, contador)) {
					numeroDos = numeroDos / contador;
				}
			} else {
				contador = contador + 1;
			}
		}

		return mcd;
	}

	public long hallarModuloDivision(long numeroUno, long numeroDos) {
		if (numeroDos == 0) {
			throw new CalculadoraExcepcion("No es posible hallar el m�dulo de una divisi�n por cero...");
		}

		return numeroUno % numeroDos;
	}

	public boolean numeroEsEntero(Number numero) {
		return (numero instanceof Byte || numero instanceof Short || numero instanceof Integer
				|| numero instanceof Long);
	}

	public double pedirNumero() {
		 double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el numero "));

		return numero;
	}
}
