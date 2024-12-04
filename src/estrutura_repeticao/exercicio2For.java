package estrutura_repeticao;

import java.util.Scanner;

public class exercicio2For {

	public static void main(String[] args) {
		int numero;
		int contador;
		int pares = 0, impares = 0;

		Scanner leia = new Scanner(System.in);

		for (contador = 1; contador < 11; contador++) {
			System.out.println("Digite o " + contador + " º numero: ");
			numero = leia.nextInt();

			if (numero % 2 == 0) {
				pares++;

			} else {
				impares++;

			}

		}
		System.out.println("Total de números pares: " + pares);
		System.out.println("Total de números impares: " + impares);
	}

}
