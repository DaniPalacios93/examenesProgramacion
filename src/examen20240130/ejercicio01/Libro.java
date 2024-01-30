package examen20240130.ejercicio01;

public class Libro {
	
	private String titulo;
	private String autor;
	
	
	
	
	//// CONSTRUCTORES
	
	public Libro () {
		
	}
	
	public Libro (String titulo, String autor) {
		
		this.titulo = titulo;
		this.autor = autor;
	}
	
	
	
	
	/////// GETTERS & SETTERS

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	

}
