package vetor;

import java.util.Scanner;

public class Exercicio2Vetor {

	public static void main(String[] args) {
		int numero[] = new int [10], contador =0;
		float media, soma = 0;
		
		Scanner leia = new Scanner (System.in);

		for (contador = 0; contador < 10; contador = contador + 1) {
		System.out.println("Digite o " + (contador + 1) + "º número.");
		numero[contador] = leia.nextInt();
		soma = soma + numero[contador];}
				
    	System.out.print("Elementos nos indices ímpares: " );		
		for (contador = 0; contador < 10; contador++) {
	            if (contador % 2 != 0) {
	            System.out.print(numero[contador]);
	            }}
	    System.out.print("\nElementos pares: " );		
	    for (contador = 0; contador < 10; contador++) {
	            if (numero[contador] % 2 == 0) {
	             System.out.print(numero[contador]);	}}	
	             
	    System.out.println("\nSoma: " + soma);

	    media = soma / 10;
	    System.out.println("Média: " +media);	
			}				
		}		
	


/*
 * for (contador = 1; contador < 4; contador = contador + 1) {
 * System.out.println("Digite o " + contador + "º nome: "); nome =
 * leia.nextLine(); System.out.println("O " + contador + " nome é: "+ nome);
 */