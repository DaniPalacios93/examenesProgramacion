package examen20240130.ejercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EstacionMeteorologica {

	
	private static List<ClimaListener> listClimaListener = new ArrayList<ClimaListener>();
	
	
	/**
	 * 
	 * @param l
	 */
	public static void addClimaListener (ClimaListener l) {
		listClimaListener.add(l);
	}
	
	
	/**
	 * 
	 * @param l
	 */
	public static void removeClimaListener (ClimaListener l) {
		listClimaListener.remove(l);
	}
	
	
	
	private static void fireClimaLluvia () {
		
		ClimaEvent event = new ClimaEvent();
		
		for (int i = listClimaListener.size() - 1; i >= 0; i--) {
			 listClimaListener.get(i).tiempoLluvia(event);
		}
	}
	
	
	private static void fireClimaSoleado () {
		
		ClimaEvent event = new ClimaEvent();
		
		for (int i = listClimaListener.size() - 1; i >= 0; i--) {
			 listClimaListener.get(i).tiempoSoleado(event);
		}
	}
	
	
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Trabajador trabajador1 = new Trabajador();
		Trabajador trabajador2 = new Trabajador();
		Embalse embalse1 = new Embalse();
		
		int tiempoActual = 0;
		boolean wasRainning = false;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Por favor introduzca el tiempo actual: "
					+ "\n\n0 - SALIR \n1 - Soleado \n2 - Nublado \n3 - Lluvioso \n");
			tiempoActual = sc.nextInt();
			
			switch (tiempoActual) {
				case 0:
					System.out.println("HASTA OTRA");
				case 1:
					if (wasRainning) fireClimaSoleado();
					wasRainning = false;
					break;
				case 2:
					wasRainning = false;
					break;
				case 3:
					fireClimaLluvia();
					wasRainning = true;
					break;
				default:
					System.out.println("Número no reconocido");
			}
			
		}while(tiempoActual != 0);
		
		
	}	
		

}
