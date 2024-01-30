package examen20240130.ejercicio03;

public class Trabajador implements ClimaListener {

	
	
	// CONSTRUCTOR
	
	public Trabajador () {
		super();
		EstacionMeteorologica.addClimaListener(this);
		
	}
	
	
	
	/**
	 * 
	 */
	public void tiempoLluvia (ClimaEvent e) {
		
		System.out.println("Soy un trabajador, me han informado que ha empezado a llover");
		
	}
	
	
		
	/**
	 * 
	 */
	public void tiempoSoleado (ClimaEvent e) {
		
		System.out.println("Soy un trabajador, me han informado que ha salido el sol");
		
	}
	
	
}
