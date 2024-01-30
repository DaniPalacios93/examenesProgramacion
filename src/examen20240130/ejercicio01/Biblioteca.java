package examen20240130.ejercicio01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class Biblioteca {
	
	private HashMap<String, Libro> inventario = new HashMap<String, Libro>();
	private List<Libro> prestados = new ArrayList<Libro>();
		
		
	
	
	////// CONSTRUCTORES
		
	public Biblioteca () {
		
		inventario.put("El Quijote" , new Libro("El Quijote", "Cervantes"));
		inventario.put("El Quijote 2", new Libro("El Quijote 2, el retorno", "Cervantes"));
		inventario.put("Poemas", new Libro("Poemas", "Lorca"));
		
	}



	
	//// GETTERS & SETTERS

	public HashMap<String, Libro> getInventario() {
		return inventario;
	}

	public void setInventario(HashMap<String, Libro> inventario) {
		this.inventario = inventario;
	}

	public List<Libro> getPrestados() {
		return prestados;
	}

	public void setPrestados(List<Libro> prestados) {
		this.prestados = prestados;
	}
		

}
