package examen20231024;

public class prueba {

	/**
	 *  6º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
	 * Debes mostrar al usuario la suma de los elementos cuyo índice sea par.
	 * @param args
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int array[] = new int[150];
		int suma = 0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random()*100);
			System.out.print(array[i] + " ");
			
			if (i % 2 == 0) suma += array[i];
		}
		
		
		System.out.println("\nLa suma de los numeros de indice par del array es igual a: " + suma);
	}

}
