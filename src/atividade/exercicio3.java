package atividade;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		float salariobruto;
		float adicionalnoturno;
		float horaextra;
		float desconto;
		float salarioliquido;
		
		System.out.println("Insira os dados abaixo para calcular seu salário líquido ");
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("Salário Bruto: ");
			salariobruto = leia.nextFloat();
			System.out.println("Adicional Noturno: ");
			adicionalnoturno = leia.nextFloat();
			System.out.println("Horas extras: ");
			horaextra = leia.nextFloat();
			System.out.println("Descontos: ");
			desconto = leia.nextFloat();
		}
		
		
		salarioliquido = salariobruto + adicionalnoturno + (horaextra * 5) - desconto;
		
		System.out.println("Seu salário bruto é " + salarioliquido);
		
		

	}

}
