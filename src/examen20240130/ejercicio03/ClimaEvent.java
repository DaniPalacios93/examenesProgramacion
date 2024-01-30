package examen20240130.ejercicio03;

public class ClimaEvent {

	private String tiempoActual;
	
	
	
	//// CONSTRUCTORES
	
	public ClimaEvent () {
		super();
	}
	
	
	public ClimaEvent ( String tiempoActual) {
		super();
		this.tiempoActual = tiempoActual;
	}


	
	
	///// GETTERS & SETTERS
	
	public String getTiempoActual() {
		return tiempoActual;
	}


	public void setTiempoActual(String tiempoActual) {
		this.tiempoActual = tiempoActual;
	}	
		
}
