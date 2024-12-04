package estrutura_decisao;

import java.util.Scanner;

public class exercicio2If {

	public static void main(String[] args) {

		// Declarando variaveis
		float numero;

		// Entrada de dados

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número: ");
		numero = leia.nextFloat();

		//

		if (numero > 0 && numero % 2 == 0) {
			System.out.println("O número " + numero + " é par e positivo!");
		}
		else if (numero > 0 && numero % 2 != 0) {
			System.out.println("O número " + numero + " é ímpar e positivo!");
		}
		else if(numero < 0 && numero % 2 == 0 ) {
			System.out.println("O número " + numero + " é par e negativo!");
		}
		else {
			System.out.println("O número " + numero + " é ímpar  e negativo!");
		}

		leia.close();
	}

}
