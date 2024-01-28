package pensionato;

import java.util.Scanner;

import entities.Aluguel;

public class Pensionato {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("quantos quartos vc ira alugar? ");
		int n = sc.nextInt();
		
		Aluguel[] quartos = new Aluguel[10];

		for (int i=0; i<n; i++) {
			System.out.println();
			System.out.println("quarto #"+ (i+1));
			
			System.out.print("nome: ");
			sc.nextLine();
			String nome = sc.next();
			
			System.out.print("email: ");
			String email = sc.next();
			
			System.out.print("quarto: ");
			int quarto = sc.nextInt();
			
			quartos[quarto] = new Aluguel(nome, email);
			
		}
		System.out.println();
		System.out.println("alugueis: ");
		for (int i=0; i<10; i++) {
			if (quartos[i] != null) {
				System.out.print(i + ":" +quartos[i]);
			}
		}
	}
}
