package estrutura_decisao;

import java.util.Scanner;

public class exercicio1Switch {

	public static void main(String[] args) {
		// Declaracao de variaveis

		int opcao;
		int quantidade;
		float total;
		float cachorroQuente;
		float xSalada;
		float xBacon;
		float bauru;
		float refrigerante;
		float sucoLaranja;

		cachorroQuente = 10f;
		xSalada = 15f;
		xBacon = 18f;
		bauru = 12f;
		refrigerante = 8f;
		sucoLaranja = 13f;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o Código do item: ");
		opcao = leia.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Produto: Cachorro Quente");
			break;
		case 2:
			System.out.println("Produto: X-Salada");
			break;
		case 3:
			System.out.println("Produto: X-Bacon");
			break;
		case 4:
			System.out.println("Produto: Bauru");
			break;
		case 5:
			System.out.println("Produto: Refrigerante");
			break;
		case 6:
			System.out.println("Produto: Suco de Laranja");
			break;

		default:
			System.out.println("Opção inválida");
		}

		System.out.println("Digite a quantidade do item: ");

		quantidade = leia.nextInt();

		switch (opcao) {
		case 1:
			total = cachorroQuente * quantidade;
			System.out.printf("Valor total: %.2f", total);
			break;
		case 2:
			total = xSalada * quantidade;
			System.out.printf("Valor total: %.2f " , total);
			break;
		case 3:
			total = xBacon * quantidade;
			System.out.printf("Valor total: %.2f " , total);
			break;
		case 4:
			total = bauru * quantidade;
			System.out.printf("Valor total: %.2f " , total);
			break;
		case 5:
			total = refrigerante * quantidade;
			System.out.printf("Valor total: %.2f " , total);
			break;
		case 6:
			total = sucoLaranja * quantidade;
			System.out.printf("Valor total: %.2f " , total);
			break;

		default:
			System.out.println("Opção inválida");
		}

		leia.close();

	}

}
