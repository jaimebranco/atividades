package atividade;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		float salario;
		float abono;
		float salariofinal;
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("Digite o seu salário: ");
			salario = leia.nextFloat();
			
			System.out.println("Digite o abono: ");
			abono = leia.nextFloat();
			
			// Processamento de Dados
			
		salariofinal = salario + abono;
		
		System.out.println("O seu salário final é R$" + salariofinal);
			
			
			
		}

	}

}
