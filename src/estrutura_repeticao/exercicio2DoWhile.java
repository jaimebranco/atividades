package estrutura_repeticao;

import java.util.Scanner;

public class exercicio2DoWhile {

	public static void main(String[] args) {
		
		int numero; 
		float soma = 0;
		float contador = 0;
		float media;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("digite un numero: ");
			numero = leia.nextInt();
			
			if (numero % 3 == 0 && numero !=0) {
				soma = soma + numero;
				contador++;
				
			}
			
		} while (numero != 0);
		
		if (contador > 0) {
			media = soma / contador;
			System.out.println("A média de todos os múltiplos de 3 é: " + media);
			
		} else {
				System.out.println("O número zero encerra o código");
			}
			
		}
		
		
	}
	



//