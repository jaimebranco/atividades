package vetor;

import java.util.Scanner;

public class Exercicio1Vetor {

	public static void main(String[] args) {
		int vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int numero;
		boolean encontrado = false;

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o número que você deseja encontrar: ");
		numero = leia.nextInt();

		for (int c = 0; c < 10; c++) {
			if (numero == vetor[c]) {
				System.out.println("O número " + numero + " está na posição: " + c);
				encontrado = true;
			}
		}
		if (encontrado != true) {
			System.out.println("O " + numero + " não foi encontrado");
		}
	}
}
