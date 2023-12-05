package examen20231205.objetos;

import java.util.Arrays;

public class Partido {

	private Jugador visitantes[] = new Jugador[5];
	private Jugador locales[] = new Jugador[5];
	private String nombre[] = {"Pepe", "Pablo", "Juan", "Francisco", "Romero", "Eustaquio", "Nanut", "Daniel", "Adrian", "Amancio"};
	
	
	//CONSTRUCTOR
	public Partido() {
		
		for (int i = 0; i < visitantes.length; i++) {
			visitantes[i] = new Jugador();
			visitantes[i].setCanastasAcertadas(0);
			visitantes[i].setCanastasFalladas(0);
			visitantes[i].setNombre("V" + i + " - " + nombre[(int)Math.round(Math.random()*9)]);
		}
		
		for (int i = 0; i < locales.length; i++) {
			locales[i] = new Jugador();
			locales[i].setCanastasAcertadas(0);
			locales[i].setCanastasFalladas(0);
			locales[i].setNombre("L" + i + " - " + nombre[(int)Math.round(Math.random()*9)]);
		}
	
	}
	
	
	/**
	 * 
	 */
	public void jugar () {
		
		int ejecuciones = 0;
		int lanzamiento;
		
		do {
			
			//Lanzamientos del equipo visitante
			for (int i = 0; i < visitantes.length; i++) {
				
				lanzamiento = (int)Math.round(Math.random()*100);
				
				if (lanzamiento <= visitantes[i].getProbabilidad()) {
					visitantes[i].setCanastasAcertadas(visitantes[i].getCanastasAcertadas() + 1);
				}
				else {
					visitantes[i].setCanastasFalladas(visitantes[i].getCanastasFalladas() + 1);
				}
			}
			
			//Lanzamientos del equipo local
			for (int i = 0; i < locales.length; i++) {
				
				lanzamiento = (int)Math.round(Math.random()*100);
				
				if (lanzamiento <= locales[i].getProbabilidad()) {
					locales[i].setCanastasAcertadas(locales[i].getCanastasAcertadas() + 1);
				}
				else {
					locales[i].setCanastasFalladas(locales[i].getCanastasFalladas() + 1);
				}
			}
			
			ejecuciones++;
			
		}while(ejecuciones < 10);
		
	}
	
	
	/**
	 * 
	 */
	public void muestraEstadisticasDelPartido () {
		
		Jugador totalJugadores[] = new Jugador[10];
		boolean estaOrdenada;
		Jugador reserva;
		
		
		//Crea el array de punteros con los jugadores locales y visitantes
		for (int i = 0; i < totalJugadores.length; i++) {
			
			if (i < 5) totalJugadores[i] = visitantes[i];
			else totalJugadores[i] = locales[i - 5];
		}
		
	
		// Ordena el array segun las canastas acertadas por cada jugador
		do {
			
			estaOrdenada = true;
			
			for (int i = 0; i < (totalJugadores.length - 1); i++) {
				
				if ( totalJugadores[i].getCanastasAcertadas() < totalJugadores[i+1].getCanastasAcertadas()) {
					
					reserva = totalJugadores[i];
					totalJugadores[i] = totalJugadores[i + 1];
					totalJugadores[i+1] = reserva;	
					
					estaOrdenada = false;
				}
			}	
		}while(estaOrdenada == false);
		
		
		// Imprime en contola el resultado
		for (int i = 0; i < totalJugadores.length; i++) {
			
			System.out.println(totalJugadores[i].toString());
		}
	}
	
	

	///// GETTERS & SETTERS
	

	public String toString() {
		return "Partido [visitantes=" + Arrays.toString(visitantes) + ", locales=" + Arrays.toString(locales) + "]";
	}
	
	
	public Jugador[] getVisitantes() {
		return visitantes;
	}

	public void setVisitantes(Jugador[] visitantes) {
		this.visitantes = visitantes;
	}

	public Jugador[] getLocales() {
		return locales;
	}

	public void setLocales(Jugador[] locales) {
		this.locales = locales;
	}
	
}
