package examen20231024;

import java.util.Scanner;

import utils.utilArrays;

public class Ejercicio04 {

	
	/**
	 * (1.95 puntos) Encuentra la cantidad de números primos de un array de valores generados al azar.
	 * Debes generar un array de 100 elementos, con valores al azar entre 0 y 100. A continuación, debes
	 * indicar en pantalla cuántos números primos existen en los valores del array. También debes mostrar
	 * dichos números primos. Si un número primo, por ejemplo el “13” se encuentra dos veces en el array,
	 * debes mostrarlo dos veces y contarlo dos veces.
	 * @param args
	 */
	public static void main(String[] args) {
		
		int array[] = new int[100];
		int cuentaPrimos = 0;
		
		utilArrays.inicializaArray(array);
		utilArrays.imprimeArray(array);
		
		System.out.println("\n");
		
		//Recorre el array para comprobar cada valor
		for (int i = 0; i < array.length; i++) {
			
			int divisor = 2;
			boolean primo = true;
			
			//Comprueba si el número tiene divisores
			while (divisor < array[i]) {
						
				if (array[i] % divisor == 0) {
					primo = false;
					break;	
				}
				divisor++;
			}
				
			// Si no tiene divisores y es mayor a 1 entonces lo tiene en cuenta para el recuento final
			if (primo == true && array[i] > 1) {
				System.out.println("El número " + array[i] +  " es primo");
				cuentaPrimos++;
			}
		}
		
		System.out.println("\nEl número total de primos es de: " + cuentaPrimos);
	}

}
