package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio1CollectionSet {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Scanner leia = new Scanner(System.in);

		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		System.out.println("Digite o número que deseja encontrar: ");
		Integer numero = leia.nextInt();

		for (int contador = 1; contador < 2; contador++) {
			if (numeros.contains(numero)) {
				System.out.println("\nO número " + numero + " foi encontrado!");
			} else {
				System.out.println("\nO número " + numero + " não foi encontrado!");
			}

			leia.close();

		}
	}
}
