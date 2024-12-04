package estrutura_decisao;

import java.util.Scanner;

public class exercicio3Switch {

	public static void main(String[] args) {
		
		float numero1;
		float numero2;
		int operacao;
		float total;
		
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o 1º número: ");
		numero1 = leia.nextFloat();
		System.out.println("Digite o 2º número: ");
		numero2 = leia.nextFloat();
		System.out.println("Digite 1 para Soma");
		System.out.println("Digite 2 para Subtração");
		System.out.println("Digite 3 para Multiplicação");
		System.out.println("Digite 4 para Divisão");
		operacao = leia.nextInt();
		
		switch (operacao){
			
			case 1:
				total = numero1 + numero2;
				System.out.println(numero1 + "+" + numero2 + "=" + total);
				break;
			case 2:
				total = numero1 - numero2;
				System.out.println(numero1 + "-" + numero2 + "=" + total);
				break;
			case 3:
				total = numero1 * numero2;
				System.out.println(numero1 + "*" + numero2 + "=" + total);
				break;
			case 4:
				total = numero1 / numero2;
				System.out.println(numero1 + "/" + numero2 + "=" + total);
				break;
			default:
				System.out.println("Opção inválida");
						
		}	
	}
}
