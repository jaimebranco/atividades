package estrutura_decisao;

import java.util.Scanner;

public class exercicio2Switch {

	public static void main(String[] args) {
		// Declarando variaveis
		String nome;
		int cargo;
		float novoSalario;
		float salarioGerente;
		float salarioVendedor;
		float salarioSupervisor;
		float salarioMotorista;
		float salarioEstoquista;
		float salarioTecnicoTI;
		
		salarioGerente = 10000f;
		salarioVendedor = 1000f;
		salarioSupervisor = 1000f;
		salarioMotorista = 1000f;
		salarioEstoquista = 2000f;
		salarioTecnicoTI = 1000f;
		
		//entrada de dados
		Scanner leia = new Scanner(System.in);

		System.out.println("Nome do colaborador: ");
		nome = leia.next();
		System.out.println("Digite o códido do Cargo: ");
		cargo = leia.nextInt();	

		switch (cargo) {
		case 1:
			novoSalario = salarioGerente + (salarioGerente * 0.10f);
			System.out.printf("Seu salário atual: %.2f " , novoSalario);
			break;
		case 2:
			novoSalario = salarioVendedor + (salarioVendedor * 0.07f);
			System.out.printf("Seu salário atual: %.2f " , novoSalario);
			break;
		case 3:
			novoSalario = salarioSupervisor + (salarioSupervisor * 0.09f);
			System.out.printf("Seu salário atual: %.2f " , novoSalario);
			break;
		case 4:
			novoSalario = salarioMotorista + (salarioMotorista * 0.06f);
			System.out.printf("Seu salário atual: %.2f " , novoSalario);
			break;
		case 5:
			novoSalario = salarioEstoquista + (salarioEstoquista * 0.05f);
			System.out.printf("Seu salário atual: %.2f " , novoSalario);
			break;
		case 6:
			novoSalario = salarioTecnicoTI + (salarioTecnicoTI * 0.08f);
			System.out.printf("Seu salário atual: %.2f " , novoSalario);
			break;
		default:
			System.out.println("Opção inválida");
			System.out.println("Finalizar");
			break;
		}

		leia.close();
	}
}