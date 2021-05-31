package aplicativo;

import java.util.Locale;
import java.util.Scanner;

import entidade.DadosCliente;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DadosCliente[] vetor = new DadosCliente[11];

		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= n; i++) {

			System.out.println(i + "º aluguel");

			System.out.print("Nome: ");
			String nome = sc.nextLine();

			System.out.print("Email: ");
			String email = sc.nextLine();

			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			sc.nextLine();
			
			vetor[quarto] = new DadosCliente(nome, email);

		}

		for (int i = 0; i < vetor.length; i++) {
			
			if (vetor[i] != null ){
				System.out.println(i+ ": " + vetor[i]);
			}
			
		}	
		
		sc.close();

	}

}
