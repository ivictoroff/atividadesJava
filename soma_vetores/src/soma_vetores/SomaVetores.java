package soma_vetores;

import java.util.Scanner;

public class SomaVetores {
	public static void main (String[]args) {
		int soma= 0;
		int media=0;
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int vetor[] = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.print("valores= ");
		for (int i=0; i<n; i++) {
			System.out.print(vetor[i] );
			System.out.print(" ");
		}
		System.out.println();
		
		for (int i=0; i<n; i++) {
			soma += vetor [i];
		}
		System.out.printf("\nSoma= %d", soma);
		
		for (int i=0; i<n; i++) {
			soma += vetor [i];
			media = soma/ n;
			
		} 
		System.out.printf("\nMedia= %d", media);
	}
}
