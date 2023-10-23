package examen20231024;

import java.util.Scanner;

import utils.utilArrays;

public class prueba3 {

	/**
	 * 4º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
	 * A continuación pedirás al usuario un valor y buscarás dicho valor en el array. Si lo encuentras, 
	 * debes indicar al usuario la posición del array en que se encuentra. En caso de que no encuentres 
	 * el valor buscado, debes indicárselo también al usuario.
	 * @param args
	 */
	public static void main(String[] args) {
		
		int array[]	= new int[150];
		int numero;
		boolean numeroAparece = false;
		Scanner sc = new Scanner(System.in);
		
		utilArrays.inicializaArray(array);
		utilArrays.imprimeArray(array);
		
		System.out.println("\nIntroduzca un número: ");
		numero = sc.nextInt();
		

		for (int i = 0; i < array.length; i++) {
			
			if (array[i] == numero) {
				System.out.println("Su numero aparece en el array en la posición " + i);
				numeroAparece = true;
			}
		}
		
		if(numeroAparece==false) System.out.println("Su numero no aparece en el array");
	}

}
