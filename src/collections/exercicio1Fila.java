package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercicio1Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		Integer opcao = 1;
		String nome;

		do {
			System.out.println("********************************************************\n ");
			System.out.println("          1 - Adicionar cliente na Fila  ");
			System.out.println("\n          2 - Listar todos os clientes ");
			System.out.println("\n          3 - Retirar cliente da fila ");
			System.out.println("\n          0 - Sair ");
			System.out.println("\n********************************************************");
			System.out.println("\nEntre com a opção desejada:  ");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome: ");
				nome = leia.next();
				fila.add(nome);
				System.out.println("\nFila:\n\n " + fila + "\n\nCliente Adicionado! ");
				break;

			case 2:
				System.out.println("\nLista de clientes na fila:\n " + fila);
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!");
					break;
				} else {
					fila.remove();
					System.out.println("\nFila:\n\n " + fila + "\n\n O cliente foi chamado");
					

					// \nO cliente foi chamado!");
					break;
				}
			case 0:
				System.out.println("Programa finalizado");
			}
		} while (opcao != 0);

		leia.close();
	}

}
