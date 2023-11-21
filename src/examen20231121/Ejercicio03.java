package examen20231121;

public class Ejercicio03 {

	/**
	 * 3. (2 puntos – Dificultad media) Suma de elementos en diagonal secundaria. Dada una matriz
	 * cuadrada de enteros, de cualquier tamaño, implementa un método que calcule la suma de los
	 * elementos de la diagonal secundaria.
	 * @param args
	 */
	public static void main(String[] args) {
	
		int matriz[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int sumaDiagonal = sumaDiagonalSecundaria(matriz);
		
		System.out.println("La suma de la diagonal secundaria es: " + sumaDiagonal);
		
	}
	
	/**
	 * Suma la diagonal secundaria de una matriz cuadrada
	 * @param m
	 * @return
	 */
	public static int sumaDiagonalSecundaria (int m[][]) {
		
		int suma = 0;
		int j = m[0].length - 1;
		int i = 0;
		
		while (j >= 0) {
			
			suma += m[i][j];
			j--;
			i++;
		}
		
		return suma;
	}
	
}
