package collections;

import java.util.Scanner;
import java.util.Stack;

public class exercicio1Pilha {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		Integer opcao = 1;
		String nome;

		do {
			System.out.println("********************************************************\n ");
			System.out.println("          1 - Adicionar Livro na pilha  ");
			System.out.println("\n          2 - Listar todos os livros ");
			System.out.println("\n          3 - Retirar livro da pilha ");
			System.out.println("\n          0 - Sair ");
			System.out.println("\n********************************************************");
			System.out.println("\nEntre com a opção desejada:  ");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome: ");
				nome = leia.nextLine();
				stack.push(nome);
				System.out.println("\nPilha:\n\n " + stack.peek() + "\n\nLivro Adicionado! ");
				break;

			case 2:
				System.out.println("\nLista de Livros na Pilha:\n " + stack);
				break;
			case 3:
				if (stack.isEmpty()) {
					System.out.println("A Pilha está vazia!");
					break;
				} else {
					stack.pop();
					System.out.println("\nPilha:\n\n " + stack + "\n\n Um livro foi retirado da pilha");

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
