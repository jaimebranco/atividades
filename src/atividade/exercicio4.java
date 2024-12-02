package atividade;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		float numero1;
		float numero2;
		float numero3;
		float numero4;
		float n1n2;
		float n3n4;
		float diferenca;
		
		System.out.print("Olá, digite uma sequência de 4 números para calcular a diferença de dois grupos (número 1 * número 2) - (número 3 * número 4) ");

		try (Scanner leia = new Scanner(System.in)) {
			
			System.out.println("\nInsira o primeiro número: ");
			numero1 = leia.nextFloat();
			System.out.println("Insira segundo número: ");
			numero2 = leia.nextFloat();
			System.out.println("Insira o terceiro número: ");
			numero3 = leia.nextFloat();
			System.out.println("Insira o quarto número: ");
			numero4 = leia.nextFloat();
		}
		
		n1n2 = numero1 * numero2;
		n3n4 = numero3 * numero4;
		diferenca = n1n2 - n3n4;
		
		
		System.out.println("A diferença é: " + diferenca);

	}

}
