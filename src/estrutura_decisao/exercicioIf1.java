package estrutura_decisao;

import java.util.Scanner;

public class exercicioIf1 {

	public static void main(String[] args) {
		// Variaveis
		int A;
		int B;
		int C;
		int soma;

		// Entrada de dados

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o número A: ");
		A = leia.nextInt();
		System.out.println("Digite o número B: ");
		B = leia.nextInt();
		System.out.println("Digite o número C: ");
		C = leia.nextInt();

		// Processamento

		soma = A + B;

		if (soma > C) {
			System.out.print("A Soma de A + B é Maior do que C");
		} 
		else if (soma < C) {
			System.out.print("A Soma de A + B é Menor do que C");
		}
		else {
			System.out.print("A Soma de A + B é Igual a C");
		}
	}

}
