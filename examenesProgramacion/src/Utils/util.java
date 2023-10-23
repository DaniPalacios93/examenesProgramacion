package Utils;

import java.util.Scanner;

public class util {

	
	/**
	 * Pide un número float al usuario mediante el texto introducido y lo devuelve 
	 * @param texto
	 * @return
	 */
	public static int dameInt(String texto) {
		
		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(texto);
		numero = sc.nextInt();
		
		return numero;
	}
	
	
	
	/**
	 * Pide un número float al usuario mediante el texto introducido y lo devuelve 
	 * @param texto
	 * @return
	 */
	public static float dameFloat(String texto) {
		
		float numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(texto);
		numero = sc.nextFloat();
		
		return numero;
	}
	
	
	
	/**
	 * Pide un número double al usuario mediante el texto introducido y lo devuelve 
	 * @param texto
	 * @return
	 */
	public static double dameDouble(String texto) {
		
		double numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(texto);
		numero = sc.nextDouble();
		
		return numero;
	}

		
		
		
		

	
}
