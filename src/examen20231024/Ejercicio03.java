package examen20231024;

import utils.util;

public class Ejercicio03 {

	/**
	 * (1.95 puntos) Encuentra el n-esimo término de la relación de Fibonacci. La serie de Fibonacci se
	 * caracteriza por empezar en ‘1’, para continuar con términos que son siempre iguales a la suma de los
	 * dos términos anteriores. La serie comienza así: “1 1 2 3 5 8 13 21 ...”. Debes pedir un número al usuario
	 * y debes mostrar el término de Fibonacci que corresponda con el orden del número dado por el usuario.
	 * Por ejemplo, si el usuario indica el término “8” debes mostrar en consola el valor “21”, ya que es el octavo
	 * valor de la serie de Fibonacci.
	 * @param args
	 */
	public static void main(String[] args) {

		int numero = 0, posicion;
		int ultimoNumero = 1;
		int penultimoNumero = 1;
		
		posicion = util.dameInt("Introduzca la posicion que desea comprobar: ");
		
		//Devuelve la posicion si se pide la primera o la segunda
		if (posicion == 1) {
			System.out.println("El numero en primera posicion es el " + penultimoNumero);
		}
		else {
			if(posicion == 2) {
				System.out.println("El numero en segunda posicion es el " + ultimoNumero);
			}
			else {
				
				//Calcula el número de la serie a partir de la tercera posición
				for (int i = 3; i <= posicion; i++) {
					
					numero = penultimoNumero + ultimoNumero;
					penultimoNumero = ultimoNumero;
					ultimoNumero = numero;
				
				}
				 System.out.println("El numero en la posicion " + posicion + " de la serie es " + numero);
			}
		
		}

	}

}
