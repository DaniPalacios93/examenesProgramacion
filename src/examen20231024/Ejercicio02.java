package examen20231024;

import utils.util;

public class Ejercicio02 {

	/**
	 * (1.95 puntos) Determinar si un número es perfecto. Un número es perfecto cuando es igual a la suma
	 * de sus divisores. Debes pedir un número al usuario e indicar, en consola, si el número del usuario es
	 * perfecto o no lo es.
	 * @param args
	 */
	public static void main(String[] args) {
	
		int numero = util.dameInt("Introduzca un numero a comprobar: ");
		int sumaDivisores = 0;
		
		// Saca los divisores y los suma
		for(int i = 1; i < numero; i++) {
			
			if ( numero % i == 0) sumaDivisores += i;
		}

		//Comprueba si la suma de sivisores es igual al número
		if (sumaDivisores == numero) {
			
			System.out.println(numero + " Es un número perfecto");
		}
		else {
			System.out.println(numero + " No es un numero perfecto");
		}
		
	}

}
