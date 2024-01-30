package examen20240130.ejercicio04;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Recepcion {

	public static void main(String[] args) {
		
		Date fecha = null;
		
		String fechaUsuario = JOptionPane.showInputDialog("Introduce fecha formato: dd/MM/yyyy HH:mm:ss");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	}

}
