package examen20231024;

public class Ejercicio05 {

	/**
	 * (1.95 puntos) Encuentra la cantidad dígitos que posee un número aleatorio. Crea un número al azar
	 * entre 0 y 10.000. Debes mostrar en consola el número generado al azar y, a continuación, la cantidad de
	 * dígitos que posee. Por ejemplo, el número “9” tiene “1” dígito, el número “24” tiene “2” dígitos y el número
	 * “9876” tiene “4” dígitos.
	 * @param args
	 */
	public static void main(String[] args) {
	
		int numero = (int)Math.round(Math.random()*10000);
		
		System.out.println("El número aleatorio generado es el: " + numero);
		
		
		// Va comprobando si el numero es divisible por potencias de base 10 para calcular las cifras del numero. 
		if (numero / 10000 >= 1) {
			
			System.out.println("El número tiene 5 cifras");
		}
		else {
			if(numero / 1000 >= 1) {
				System.out.println("El número tiene 4 cifras");
			}
			else {
				if (numero / 100 >= 1) {
					System.out.println("El número tiene 3 cifras");
				}
				else {
					if (numero / 10 >= 1) {
						System.out.println("El número tiene 2 cifras");
					}
					else {
						System.out.println("El número tiene 1 cifra");
					}
				}
			}
		}
		
	}

}
