package examen20240130.ejercicio01;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;



/**
 * (2,5 puntos) (Listas y Hashmap parametrizados). Crea una clase llamada “Libro”. Cada libro debe tener
 * un título y un autor. Crea una clase llamada “Biblioteca”. La biblioteca contiene un Hashmap parametrizado
 * que le sirve para almacenar todos los libros de la biblioteca. Crea dos o tres libros, programáticamente, y
 * almacénalos en el Hashmap. La biblioteca también contiene una Lista parametrizada que le permite saber
 * si un libro está prestado o no. Si un libro se encuentra en la lista significará que está prestado. Un libro no
 * puede estar al mismo tiempo en el Hashmap y en la lista.
 * Crea una clase con un método principal, que muestre un menú al usuario con dos opciones: 
 * 1.- prestar
 * libro; 
 * 2.- devolver libro.
 * Cuando se elija la opción de prestar libro se debe recorrer el hashmap y mostrar al usuario todos los libros
 * disponibles, se le pedirá al usuario un título de libro, en ese momento debes buscar el libro en el hashmap
 * e introducirlo en la lista.
 * Cuando se elija la opción de devolver libro se debe mostrar al usuario toda la lista de libros disponibles en
 * la lista, se le pedirá al usuario un título de libro, entonces debes sacar el libro de la lista e introducirlo en el
 * hashmap.
 * @param args
 */
public class PrestamosYDevoluciones {

	public static void main(String[] args) {
		
		int option;
		Biblioteca biblioteca = new Biblioteca();
		Scanner sc = new Scanner(System.in);
		
		
		
		do {
			
			System.out.println("\nMENU: "
					+ "\n 0 - SALIR"
					+ "\n 1 - Prestar libro"
					+ "\n 2 - Devolver libro"
					);
			
			option = sc.nextInt();
			
			
			switch(option) {
			case 0:
				System.out.println("HASTA LUEGO!");
				break;
			case 1:
				prestarLibro(biblioteca);
				break;
			case 2:
				devolverLibro(biblioteca);
				break;
			default:
				System.out.println("número no reconocido");
				break;
			
			}
			
		}while(option != 0);

	}
	
	
	
	private static void prestarLibro (Biblioteca biblioteca) {
		
		String nombre;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("LISTA DE LIBROS");
		Object claves[] = biblioteca.getInventario().keySet().toArray();
		for (int i = 0; i < claves.length; i++) {
			System.out.println("Identificador: " + claves[i] + " - Objeto obtenido: "  + biblioteca.getInventario().get(claves[i]));
		}
		
		System.out.println("Elige un libro:");
		nombre = sc.nextLine();
		
		biblioteca.getPrestados().add(biblioteca.getInventario().get(nombre));
		biblioteca.getInventario().remove(nombre);
	}
	
	
	
	private static void devolverLibro (Biblioteca biblioteca) {
		
		String nombre;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("LISTA DE LIBROS");
		for (int i = 0; i < biblioteca.getPrestados().size(); i++) {
			System.out.print(biblioteca.getPrestados().get(i) + " ");
		}
		System.out.println();
		
		
		System.out.println("Elige un libro para devolver:");
		nombre = sc.nextLine();
		
		
		biblioteca.getInventario().put(biblioteca.getPrestados().get(0).getTitulo(), biblioteca.getPrestados().get(0));
		biblioteca.getPrestados().remove(0);
		
		}
	
	
}
	
	
