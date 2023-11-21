package examen20231121;

public class Ejercicio04 {

	/**
	 * 4. (2 puntos – Dificultad media) Ordena alfabéticamente un array de cadenas de caracteres. Dado
	 * un array de cadenas de caracteres en minúsculas, como el siguiente String[] miArray = {"pera",
	 * "manzana", "uva", "naranja", "kiwi"}, implementa un método que lo ordene alfabéticamente.
	 * @param args
	 */
	public static void main(String[] args) {
	
		String[] miArray = {"pera", "manzana", "uva", "naranja", "kiwi"};

	
		imprimeArrayDePalabras(miArray);
		
		ordenaAlfabeticamente(miArray);
		
		System.out.println();
		
		imprimeArrayDePalabras(miArray);
	}
	
	
	/**
	 * Ordena alfabeticamente un array de palabras
	 * @param a
	 */
	public static void ordenaAlfabeticamente (String a[]) {
		
		String reserva;
		boolean estaOrdenada;
		int letraComparada = 0;
		
		do {
			
			estaOrdenada = true;
			
			for (int i = 1; i < a.length; i++) {
				
				//Si coinciden en la primera letra, busca la siguiente hasta que dejen de coincidir
				if(a[i - 1].charAt(letraComparada) == a[i].charAt(letraComparada)) {
					
					while (a[i - 1].charAt(letraComparada) == a[i].charAt(letraComparada)){
						
						letraComparada++;
					}
				}	
				
				//Intercambia el orden de las palabras si la letra de la primera es mayor a la de la segunda
				if (a[i - 1].charAt(letraComparada) > a[i].charAt(letraComparada)) {
								
					reserva = a[i];
					a[i] = a[i - 1];
					a[i - 1] = reserva;
					
					estaOrdenada = false;
				}
				
				//Resetea letra comparada para la siguiente iteracion
				letraComparada = 0;	
			}
			
		}while(!estaOrdenada);
	}
	
	/**
	 * imprime en consola un array de palabras
	 * @param a
	 */
	public static void imprimeArrayDePalabras (String a[]) {
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length(); j++) {
				System.out.print(a[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

}
