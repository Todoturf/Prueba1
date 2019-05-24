package ListaNotas;

import java.util.Scanner;

public class gestionNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nota = "";
		int categoria = 0;
		Notas listaNotas = new Notas();
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Introduzca el texto");
		nota = entrada.nextLine();
		System.out.println("Introduzca el tipo (0-Normal, 1-Importante, 2-Urgente)");
		categoria = entrada.nextInt();
		listaNotas.setTextoNota(nota);
		listaNotas.setCategoria(categoria);
		System.out.println("Los datos son: Fecha: " + listaNotas.getFechaCreacion() + " Texto: " + listaNotas.getTextoNota() + " Categoría: "+ listaNotas.getCategoria());
		
	}

}
