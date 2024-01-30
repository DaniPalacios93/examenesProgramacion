package examen20240130.ejercicio03;

public class Embalse implements ClimaListener {
	
	
	// CONSTRUCTOR
	
	public Embalse () {
		super();
		EstacionMeteorologica.addClimaListener(this);
	}

	
	/**
	 * 
	 */
	public void tiempoLluvia (ClimaEvent e) {
		
		System.out.println("Soy un embalse, me han informado que ha empezado a llover");
			
	}
	
	
		
	/**
	 * 
	 */
	public void tiempoSoleado (ClimaEvent e) {
		
		System.out.println("Soy un embalse, me han informado que ha salido el sol");
		
	}
	
}
