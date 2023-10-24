package examen20231024;

import java.util.Scanner;

import utils.util;

public class Ejercicio01 {

	/**
	 * (1.95 puntos) Suma los N primeros números primos, desde el 1. Comienza pidiendo un número al
	 * usuario. Una vez que tengas el número del usuario debes encontrar, desde el “1”, tantos números primos
	 * como haya indicado el usuario. Por ejemplo, si el usuario indica “5”, debes mostrar en la consola los
	 * valores “1 2 3 5 7”, siendo estos los cinco primeros números primos.
	 * @param args
	 */
	public static void main(String[] args) {

		int numero, cuentaPrimos = 0, sumaPrimos = 0;
		
		numero = util.dameInt("Indica cuantos primos quieres conseguir");
			
//		for (int num = 1; num < 1000000; num++) {
//			boolean esPrimo = true;
//
//			for (int i = 1; i < num; i++) {
//				if (num % i == 0) {
//					esPrimo = false;
//				}
//			}
//			
//			if (esPrimo == true) {
//				System.out.println(num + " es primo");
//				cuentaPrimos++;
//				sumaPrimos += num;
//			}
//			
//			if (cuentaPrimos >= numero) {
//				break;
//			}
		
	}

}

