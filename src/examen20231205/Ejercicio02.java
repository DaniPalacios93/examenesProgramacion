package examen20231205;

import java.util.Scanner;

public class Ejercicio02 {

	/**
	 * 2. (2 puntos – Matrices – Dificultad media) Suma de submatriz rectangular. Inicializa una matriz de 5x5
	 * elementos con valores al azar entre 0 y 100. Muéstrala en la consola. Ahora pide al usuario las coordenadas de las
	 * esquinas superior izquierda e inferior derecha de un “rectángulo” (submatriz). Calcula la suma de todos los
	 * elementos dentro de la submatriz. Se muestra a continuación una imagen en la que puedes observar la submatriz
	 * de coordenadas “1, 2” (esquina superior izquierda) y “3, 4” (esquina inferior derecha). Te aconsejo usar una matriz
	 * con datos específicos, no generados al azar, mientras desarrollas el programa. PISTA: es mucho más fácil de lo
	 * que parece, lo puedes conseguir con un recorrido típico de la matriz en el que tendrás que pensar bien qué valores
	 * deben tomar “i” y “j”.
	 * @param args
	 */
	public static void main(String[] args) {
		
		int matriz[][] = new int[5][5];
		int supIzqI, supIzqJ, infDerI, infDerJ;
		int suma = 0;
		Scanner sc = new Scanner(System.in);
		
		inicializaMatrizRandom(matriz);
		imprimeMatriz(matriz);
		
		System.out.println("Introduce la I de la esquina superior izquierda ");
		supIzqI = sc.nextInt();
		System.out.println("Introduce la J de la esquina superior izquierda ");
		supIzqJ = sc.nextInt();
		System.out.println("Introduce la I de la esquina inferior derecha ");
		infDerI = sc.nextInt();
		System.out.println("Introduce la J de la esquina inferior derecha ");
		infDerJ = sc.nextInt();
		
		
		//Recorre la matriz y suma solamente los valores dentro de los limites establecidos
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				
				if(i >= supIzqI && i <= infDerI && j >= supIzqJ && j <= infDerJ) {
					suma += matriz[i][j];
				}
			}
		}
		
		System.out.println("\nLa suma de los valores de la submatriz es:" + suma);
		
		
	}
	
	
	/**
	 * Inicializa una matriz con valores aleatorios entre 0 y 100
	 * @param m matriz previamente declarada
	 */
	public static void inicializaMatrizRandom (int m[][]) {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int)Math.round(Math.random() * 100);
			}
		}
	}

	
	/**
	 * Muestra en consola una matriz
	 * @param m
	 */
	public static void imprimeMatriz (int m[][]) {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
