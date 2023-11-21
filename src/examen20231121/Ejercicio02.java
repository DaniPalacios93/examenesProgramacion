package examen20231121;

public class Ejercicio02 {

	/**
	 * 2. (2 puntos – Dificultad baja) Combinación de arrays. Dados dos arrays de caracteres, implementa
	 * un método que combine los elementos de ambos arrays alternando uno de cada array, y devuelva el
	 * nuevo array resultante, en el que todas las letras mayúsculas se conviertan en minúscula.
	 * @param args
	 */
	public static void main(String[] args) {
	
		char letras1[] = {'H', 'o', 'l', 'a'};
		char letras2[] = {'P', 'e', 'l', 'o'};
		
		char combinado[] = combinaArrays(letras1, letras2);
		
		System.out.println(combinado);
		
		
	}
	
	/**
	 * Combina dos arrays de caracteres alternando entre uno y otro
	 * @param a
	 * @param b
	 * @return
	 */
	public static char[] combinaArrays (char a[], char b[]) {
		
		char combinacion[] = new char[a.length];
		
		for (int i = 0; i < combinacion.length; i++) {
			
			if (i % 2 == 0) combinacion[i] = a[i];
			else combinacion[i] = b[i];
		}
		
		convierteEnMinuscula(combinacion);
		
		return combinacion;
		
	}
	
	/**
	 * convierte las mayusculas de un array de caracteres en minusculas
	 * @param a
	 */
	public static void convierteEnMinuscula (char a[]) {
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i] > 'A' && a[i] < 'Z') {
				
				a[i] = (char)(a[i] + 32);
			}
		}
		
	}
	
}
