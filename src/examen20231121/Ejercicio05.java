package examen20231121;

import utils.utilArrays;

public class Ejercicio05 {

	/**
	 * 5. (2 puntos – Dificultad alta) subArrayDeSumaMaxima. Dado un array de números enteros como el
	 * siguiente {-2, 1, -3, 4, -1, 2, 1, -5, 4}, implementa un método que encuentre el subarray de dimensión
	 * 4 cuya suma sea la mayor de todos los subarrays de dimensión 4. Debes pensar que en un subarray
	 * todos los elementos que lo componen deben ser contiguos.
	 * @param args
	 */
	public static void main(String[] args) {
	
		int array[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		
		int subArraySumaMayor[] = encuentraSubarrayDeSumaMayor(array, 4);
		
		System.out.println("El subArray de 4 elementos cuya suma es mayor es: ");
		utils.utilArrays.imprimeArray(subArraySumaMayor);

	}
	
	/**
	 * Encuentra el subArray de longitud dada cuya suma de elementos es mayor
	 * @param a
	 * @param subArray
	 * @return
	 */
	public static int[] encuentraSubarrayDeSumaMayor (int a[], int subArray) {
		
		int suma = 0;
		int sumaMayor = 0;
		int subArrayPrueba[] = new int[subArray];
		int subArrayMayor[] = new int[subArray];
		int count;
		
		
		//Bucle principal que lee el array
		for (int i = subArray - 1; i < a.length; i++) {
			
			count = 0;
			
			//Bucle que lee los subArrays y los va registrando
			for (int j = i; j > (i - subArray); j--) {
				
				suma += a[j];
				subArrayPrueba[(subArray - 1) - count] = a[j];
				count++;
			}
			
			//En caso de que la suma sea la mayor, se registra
			if(suma > sumaMayor) {
				
				sumaMayor = suma;
				subArrayMayor = subArrayPrueba;
			}
		}
		
		return subArrayMayor;
	}

}
