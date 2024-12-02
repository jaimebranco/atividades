package atividade;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
	float nota1;
	float nota2;
	float nota3;
	float nota4;
	float soma;
	float media;
	
	
	try (Scanner leia = new Scanner(System.in)) {
		
		System.out.println("Insira a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("Insira a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("Insira a terceira nota: ");
		nota3 = leia.nextFloat();
		System.out.println("Insira a quarta nota: ");
		nota4 = leia.nextFloat();
	}
	
	soma = nota1 + nota2 + nota3 + nota4;
	media = soma / 4;
	
	System.out.println("Sua média é " + media);
	



	}

}
