package estrutura_repeticao;

import java.util.Scanner;

public class ExercicioFor1 {

	public static void main(String[] args) {
		int numero1, numero2;
		int contador;
		int multiplo;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite o primeiro número do intervalo: ");
		numero1 = leia.nextInt();
		System.out.println("Digite o segundo número do intervalo: ");
		numero2 = leia.nextInt();
		
		
		if (numero2 > numero1) {
			
			for (contador = numero1; contador < numero2; contador++) {
				if (contador % 3 == 0 && contador % 5 == 0) {
				System.out.println(contador + " é múltiplo de 3 e 5.");
				}
			}
				
			
		} else {
			System.out.println("Intervalo inválido.");
			
		}	
		
	}

}
