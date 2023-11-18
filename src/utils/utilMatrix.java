package utils;

public class utilMatrix {

	
	/**
	 * Inicializa la matriz con todos los valores a 0.
	 * @param m
	 */
	public static void inicializaMatrizCero (int m[][]) {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = 0;
			}
		}
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
	
	
	/**
	 * Comprueba si una matriz es positiva (si todos sus valores son positivos)
	 * @param m
	 * @return "true" si la matriz es positiva, y "false" si alguno de sus valores es negativo.
	 */
	public static boolean esPositiva (int m[][]) {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				
				if (m[i][j] < 0) return false;
			}
		}
		return true;
	}
	
	
	/**
	 * Comprueba si una matriz es diagonal (Todos los valores menos los de la diagonal principal son nulos)
	 * @param m
	 * @return "true" si la matriz es diagonal, "false" si la matriz NO es diagonal.
	 */
	public static boolean esDiagonal (int m[][]) {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				
				if(i != j && m[i][j] != 0) return false;
			}
		}
		return true;
	}
	
	
	/**
	 * Comprueba si una matriz es triangular (Todos los valores por debajo de la diagonal principal son nulos)
	 * @param m
	 * @return "true" si la matriz es triangular, "false" si la matriz NO es triangular.
	 */
	public static boolean esTriangular (int m[][]) {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				
				if ( i > j && m[i][j] != 0) return false;
			}
		}
		return true;
	}

	
	/**
	 * Comprueba si una matriz dada es dispersa (todas sus filas y columnas contienen al menos un valor nulo)
	 * @param m
	 * @return "true" si es dispersa, "false" si NO es dispersa.
	 */
	public static boolean esDispersa (int m[][]) {
		
		boolean esDispersa = false;
		
		for (int i = 0; i < m.length; i++) {
			
			esDispersa=false;
			
			for (int j = 0; j < m[i].length; j++) {
	
				if (m[i][j] == 0) esDispersa = true;
			}
			
			if (esDispersa == false) return false;
			
		}
		
		for (int i = 0; i < m.length; i++) {
			
			esDispersa=false;
			
			for (int j = 0; j < m[i].length; j++) {
	
				if (m[j][i] == 0) esDispersa = true;
			}
			
			if (esDispersa == false) return false;
			
		}
		
		return true;
	}
	
	
	/**
	 * Transcribe todos los valores de una matriz a un array
	 * @param m
	 * @param filas
	 * @param columnas
	 * @return
	 */
	public static int[] convierteEnArray (int m[][]){
		
		int array[] = new int [m[0].length * m.length];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				array[(i * m[0].length) + j] = m[i][j];
			}
		}
		
		return array;
	}
	
	
	/**
	 * Comprueba si la matriz es simretrica
	 * @param m
	 * @return "true" si la matriz es simetrica, "false" si la matriz NO es simetrica
	 */
	public static boolean esSimetrica (int m[][]) {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				
				if(m[i][j] != m[j][i]) return false;
			}
		}
		
		return true;
	}
	
	
	/**
	 * Transforma la matriz en su traspuesta.
	 * @param m
	 * @param filas
	 * @param columnas
	 * @return la matriz traspuesta
	 */
	public static int[][] matrizTraspuesta (int m[][]){
		
		int matrizTraspuesta[][] = new int[m[0].length][m.length];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				
				matrizTraspuesta[i][j] = m[j][i];
			}
		}
		
		return matrizTraspuesta;
	}
	
	
	/**
	 * Crea una matriz opuesta a partir de una matriz dada (todos sus valores cambian de signo)
	 * @param m
	 * @return la matriz opuesta resultante
	 */
	public static int[][] matrizOpuesta (int m[][]){
		
		int matrizOpuesta[][] = new int[m.length][m[0].length];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				matrizOpuesta[i][j] = m[i][j] * -1;  
			}
		}
		return matrizOpuesta;
	}
	
	
	/**
	 * Borra una fila de una matriz dada
	 * @param m
	 * @param filaBorrar
	 * @return la matriz resultante
	 */
	public static int[][] borraFila	(int m[][], int filaBorrar){
		
		int matrizBorrada[][] = new int[m.length - 1][m[0].length];
		
		for (int i = 0; i < filaBorrar - 1; i++) {
			for (int j = 0; j < m[i].length; j++) {
				matrizBorrada[i][j] = m[i][j];
			}
		}
		
		for (int i = filaBorrar; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				matrizBorrada[i - 1][j] = m[i][j];
			}
		}
		
		return matrizBorrada;
	}
	
}
