package presentacion;

import calculo.Calculadora;

import javax.swing.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

public class Pantalla {



	public static void main(String[] args) {


		Calculadora calculadora = new Calculadora();

		boolean seguirEjecutando= true;

		while (seguirEjecutando){
			List <String> seleccionar = Arrays.asList("   sumar   ", "   restar  ", "multiplicar", "dividir", "MCM","MCD", "Es primo");
			int seleccion= JOptionPane.showOptionDialog(null,"Calculadora","Calculadora",0,JOptionPane.QUESTION_MESSAGE,null,seleccionar.toArray(),null);

			switch (seleccion) {
				case 0:{
					double numeroUno= calculadora.pedirNumero();
					double numeroDos= calculadora.pedirNumero();
					JOptionPane.showMessageDialog(null,"resultado de : "+numeroUno+" + "+numeroDos+" = "+ calculadora.sumar(numeroUno,numeroDos));
					break;
				}
				case 1:{
					double numeroUno= calculadora.pedirNumero();
					double numeroDos= calculadora.pedirNumero();
					JOptionPane.showMessageDialog(null,"resultado de : "+numeroUno+" - "+numeroDos+" = "+ calculadora.restar(numeroUno,numeroDos));
					break;
				}
				case 2:{
					double numeroUno= calculadora.pedirNumero();
					double numeroDos= calculadora.pedirNumero();
					JOptionPane.showMessageDialog(null,"resultado de : "+numeroUno+" * "+numeroDos+" = "+ calculadora.multiplicar(numeroUno,numeroDos));
					break;
				}
				case 3:{
					double numeroUno= calculadora.pedirNumero();
					double numeroDos= calculadora.pedirNumero();
					JOptionPane.showMessageDialog(null,"resultado de : "+numeroUno+" / "+numeroDos+" = "+ calculadora.dividir(numeroUno,numeroDos));
					break;
				}
				case 4:{
					int numeroUno= (int) calculadora.pedirNumero();
					int numeroDos= (int) calculadora.pedirNumero();
					JOptionPane.showMessageDialog(null,"el minimo comun multiplo entre : "+numeroUno+" y "+numeroDos+" es "+ calculadora.hallarMinimoComunMultiplo(numeroUno,numeroDos));
					break;
				}
				case 5:{
					int numeroUno= (int) calculadora.pedirNumero();
					int numeroDos= (int) calculadora.pedirNumero();
					JOptionPane.showMessageDialog(null,"el maximo comun divisor entre : "+numeroUno+" y "+numeroDos+" es "+ calculadora.hallarMaximoComunDivisor(numeroUno,numeroDos));
					break;
				}
				case 6:{
					int numeroUno= (int) calculadora.pedirNumero();
					if(calculadora.esNumeroPrimo(numeroUno)){
					JOptionPane.showMessageDialog(null,"el numero : "+numeroUno+" es primo ");
					}else{
						JOptionPane.showMessageDialog(null,"el numero : "+numeroUno+" NO es primo ");
					}
					break;
				}
				case -1:{
					seguirEjecutando=false;
					break;

				}

			}

		}

	}
}
