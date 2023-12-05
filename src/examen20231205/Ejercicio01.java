package examen20231205;

public class Ejercicio01 {

	/**
	 * 1. (2 puntos – Arrays – Dificultad media) Máxima suma de dos números. Inicializa un array de 10 elementos con
	 * valores enteros al azar entre 0 y 20. A continuación realiza todas las sumas posibles entre dos elementos e imprime
	 * en la consola el array, la suma máxima y los dos elementos que has sumado. Recuerda que para sumar todas las
	 * parejas de elementos posibles puedes usar un bucle que visite todos los elementos del array, una vez que estés
	 * visitando cada elemento puedes lanzar dos bucles más: uno que visite los elementos anteriores y otro que visite los
	 * elementos posteriores a aquel en el que te encuentras.
	 * @param args
	 */
	public static void main(String[] args) {
	
		int array[] = new int[10];
		int suma, sumaMayor = 0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random()*20);
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 1; i < array.length - 1; i++) {
			
			// Suma valores por detrás
			for (int j = i - 1; j >= 0; j--) {
				suma = array[i] + array[j];
				if (suma > sumaMayor) sumaMayor = suma;
			}
			
			//Bucle que suma valores por delante
			for (int j = i + 1; j < array.length; j++) {
				suma = array[i] + array[j];
				if (suma > sumaMayor) sumaMayor = suma;
			}
		}
		
		//Ordenamos para dejar los dos mayores al final
		ordenaPorBurbuja(array);
		
		System.out.println("La suma de " + array[array.length - 1] + " + " + array[array.length - 2] + " = " + sumaMayor);
	}
	
	
	
	/**
	 * Lanza el algoritmo de ordenación "Burbuja" sobre el array introducido en el método.
	 * @param array
	 */
	public static void ordenaPorBurbuja (int array[]) {
		
		int reserva;
		boolean estaOrdenada = true;
		
		do {
			
			estaOrdenada = true;
			
			for (int i = 0; i < (array.length - 1); i++) {
				
				if ( array[i] > array[i+1]) {
					
					reserva = array[i];
					array[i] = array[i + 1];
					array[i+1] = reserva;	
					
					estaOrdenada = false;
				}
			}	
		}while(estaOrdenada == false);
	}
	
}
