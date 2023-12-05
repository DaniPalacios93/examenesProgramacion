package examen20231205.objetos;

public class Jugador {
	
	private String nombre;
	private int canastasAcertadas;
	private int canastasFalladas;
	private int probabilidad = (int)Math.round(Math.random()* (80) + 20);
	

	//CONSTRUCTOR
	public Jugador() {
		
	}


	//////GETTERS Y SETTERS
	
	public String toString() {
		return nombre + "\tAciertos: " + canastasAcertadas + " - Fallos: " + canastasFalladas;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCanastasAcertadas() {
		return canastasAcertadas;
	}

	public void setCanastasAcertadas(int canastasAcertadas) {
		this.canastasAcertadas = canastasAcertadas;
	}

	public int getCanastasFalladas() {
		return canastasFalladas;
	}

	public void setCanastasFalladas(int canastasFalladas) {
		this.canastasFalladas = canastasFalladas;
	}

	public int getProbabilidad() {
		return probabilidad;
	}

	public void setProbabilidad(int probabilidad) {
		this.probabilidad = probabilidad;
	}



	
	
	
	

	
	
}
