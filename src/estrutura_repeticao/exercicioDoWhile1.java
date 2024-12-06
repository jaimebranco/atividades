package estrutura_repeticao;

import java.util.Scanner;

public class exercicioDoWhile1 {

	public static void main(String[] args) {
		int numero;
		int positivo = 0;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();

			if (numero > 0) {
				positivo = numero + positivo;

			}

		} while (numero != 0);
		System.out.println("A soma dos números positivos é: " + positivo);
	}

}
