package examen20231024;

import utils.utilArrays;

public class prueba2 {

	/**
	 * 5º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
	 * Debes obtener la suma de los números pares y los impares en variables separadas.
	 * @param args
	 */
	public static void main(String[] args) {
		
		int array[] = new int[150];
		int sumImpares = 0, sumPares = 0;
		
		utilArrays.inicializaArray(array, 0, 100);
		utilArrays.imprimeArray(array);
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[i] % 2 == 0) {
				sumPares += array[i];
			}
			else {
				sumImpares += array[i];
			}
		}
		
		System.out.println("\nLa suma de los pares es: " + sumPares + "\nLa suma de los impares es: " + sumImpares);
	}	
	
}
