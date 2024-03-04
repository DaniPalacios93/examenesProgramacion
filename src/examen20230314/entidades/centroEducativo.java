package examen20230314.entidades;

public class centroEducativo {
	
	private int id;
	private String descripcion;
	
	

	/// CONSTRUCTORES
	
	public centroEducativo() {
		super();
	}
	

	public centroEducativo(int id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		
	}


	///GETTERS & SETTERS
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
