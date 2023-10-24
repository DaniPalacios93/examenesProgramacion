package examen20231024;

import utils.util;
import utils.utilArrays;

public class Ejercicio06 {

	/**
	 * 1.95 puntos) Tiradas de un dado. Implementa un programa que simule 10 tiradas de un dado, almacene
	 * los valores obtenidos en un array de 10 posiciones y cuente cuántas veces se obtuvo un número específico
	 * pedido al usuario. Si el usuario indica un número menor que “1” o mayor que “6” debes volver a pedirle al
	 * usuario que introduzca un valor válido.
	 * @param args
	 */
	public static void main(String[] args) {
	
		int tiradas[] = new int[10];
		int numero, cuentaAciertos = 0;
		
		//Inicializa e imprime el array
		utilArrays.inicializaArray(tiradas, 1, 6);
		utilArrays.imprimeArray(tiradas);
		System.out.println();
		
		numero = util.dameInt("Introduzca un resultado, del 1 al 6 ambos incluidos, para comprobar");
		
		//Vuelve a pedir el número hasta que el resultado entre dentro de los limites correctos [1-6]
		if (numero < 1 || numero >6) {
			do {
				numero = util.dameInt("Introduzca un valor del 1 al 6 por favor.");
				
			}while (numero < 1 || numero >6);
		}
		
		//Lee los resultados del array, comparando con el número del usuario y sumando los coincidentes.
		for (int i = 0; i < tiradas.length; i++) {
			
			if (tiradas[i] == numero) cuentaAciertos++;
		}
		
		System.out.println("El " + numero + " a salido " + cuentaAciertos + " veces.");
	}

}
