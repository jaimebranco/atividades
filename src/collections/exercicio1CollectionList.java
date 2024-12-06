package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio1CollectionList {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);

		System.out.println("Por favor, digite 5 cores: ");

		for (int contador = 1; contador < 6; contador++) {
			System.out.println("Insira a " + contador + "º cor: ");
			String cor = leia.next();

			cores.add(cor);

		}

		System.out.println("\nListar todas as cores: ");
		for (String cor : cores) {
			System.out.println(cor);

		}

		System.out.println("\nOrdenar todas as cores: ");
		cores.sort(null);
		for (String cor : cores) {
			System.out.println(cor);
		}
		leia.close();
	}

}
