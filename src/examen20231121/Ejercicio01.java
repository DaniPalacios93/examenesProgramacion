package examen20231121;

public class Ejercicio01 {

	/**
	 * 1. (2 puntos – Dificultad baja) Suma de matrices. Dadas dos matrices de enteros del mismo tamaño,
	 * tales como {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}} y {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}}, implementa un método que
	 * realice la suma de ambas matrices y devuelva la matriz resultante. El ejercicio debe funcionar para
	 * dos matrices de igual dimensión pero para cualquier dimensión posible.
	 * @param args
	 */
	public static void main(String[] args) {
	
		int matriz1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int matriz2[][] = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
		
		
		int matrizSuma[][] = sumaMatrices(matriz1, matriz2);
		
		utils.utilMatrix.imprimeMatriz(matrizSuma);
		
	}
	
	/**
	 * Suma los valores de igual posicion de dos matrices
	 * @param m
	 * @param n
	 * @return
	 */
	public static int[][] sumaMatrices (int m[][], int n[][]){
		
		int suma[][] = new int[m.length][m[0].length];
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				suma[i][j] = m[i][j] + n[i][j];
			}
		}
		
		return suma;
	}

}
