package utils;

public class utilArrays {

	
//METODOS SIMPLES
	
	
	/**
	 * Inicializa un array con números aleatorios entre 0 y 100
	 * @param array
	 */
	public static void inicializaArray ( int array[]) {
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random()*100);
		}
	}
	
	
	/**
	 * Inicializa un array con números aleatorios entre un límite inferior y un límite superior 
	 * facilitado por el usuario.
	 * @param array
	 * @param limInf
	 * @param limSup
	 */
	public static void inicializaArray ( int array[], int limInf, int limSup) {
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random() * (limSup - limInf)) + limInf;
		}
	}
	
	
	/**
	 * Muetra en consola todos los numeros de un array en linea. 
	 * @param array
	 */
	public static void imprimeArray (int array[]) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}
	
	
	
	
	
//ALGORITMOS DE ORDENACION DE ARRAYS

	
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


	/**
	 * Lanza el algoritmo de ordenación por "inserción directa" sobre el array introducido en el método.
	 * @param array
	 */
	public static void ordenaPorInsercionDirecta (int array[]) {
		
		int extraido, posicionComparada;
		
		for (int i = 1; i < array.length; i++) {
			
			extraido = array[i];
			posicionComparada = i - 1;
			
			while (posicionComparada >=0 && array[posicionComparada] > extraido) {
				
				array[posicionComparada + 1] = array[posicionComparada];
				
				posicionComparada--;
			}
			
			array[posicionComparada + 1] = extraido;
			
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	
	/**
	 * Lanza el algoritmo de ordenación "Shell" sobre el array proporcionado en el metodo, comenzando con una separacion inicial 
	 * de los valores que se comparan segun la variable "tamanioShellInicial
	 * @param array
	 * @param tamañoShellInicial
	 */
	public static void ordenaPorShell (int array[], int tamanioShellInicial) {
		
		int reserva;
		boolean estaOrdenado;
		int shell = tamanioShellInicial;
		
		do {
			
			do {
				
				estaOrdenado = true;
				
				for (int i = 0; i < (array.length - shell); i++) {
					
					if (array[i] > array[i + shell]) {
						
						reserva = array[i];
						array[i] = array[i + shell];
						array[i + shell] = reserva;	
						
						estaOrdenado = false;
					}
				}
			}while (estaOrdenado == false);
			
			shell--;
			
		}while (shell >= 1);
	}
	
	
	/**
	 * Lanza el algoritmo de ordenación por "Selección"
	 * @param array
	 */
	public static void ordenaPorSeleccion (int array[]) {
		
		int reserva, posicionMenor;
		
		for (int i = 0; i < (array.length - 1); i++) {
			
			posicionMenor = i;
			
			for (int j = i + 1; j < array.length; j++) {
				
				if(array[posicionMenor] > array[j]) posicionMenor = j;
			}
			
			reserva = array[i];
			array[i] = array[posicionMenor];
			array[posicionMenor] = reserva;
		}		
	}
	
}



