package ListaNotas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirFichero {

	public static void main(String[] args) {
		/*
		 * Pedir un texto por consola y 
		 * escribirlo en un fichero de texto
		 */
		Scanner entrada = new Scanner(System.in);
		entrada.useDelimiter(";");
		
		System.out.println("Introduce un texto:");
		String texto = entrada.next();
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("notas.txt", true));
			bw.write(texto + "\r\n");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}