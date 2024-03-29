package altura;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
	public static void main (String[] args) {
		double media, percentualMenores;
		int n, menores = 0;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.println("quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		
		String[] nome = new String[n];
		int [] idade = new int[n];
		double[] alturas = new double[n];
		
		
		for (int i=0; i<n; i++) {
			System.out.printf("digite dados da %da pessoa ", i+1);
			
			System.out.print("nome: ");
			nome[i] = sc.next();
			
			System.out.print("idade: ");
			idade[i] = sc.nextInt();
			
			System.out.print("altura: ");
			alturas[i] = sc.nextDouble();
		
		}
		
		int soma = 0;
		for (int i=0; i<n; i++) {
			if (idade[i]< 16) {
				menores++;
			}
			soma += alturas[i];
		}
		media = soma/ n;
		percentualMenores =((double)menores/n) *100;
		
		System.out.printf("altura media: %.2f\n ", media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);
		
		for (int i=0; i<n; i++) {
			if (idade[i]<16) {
				System.out.printf("%s\n", nome[i]);
			}
		}
		
		sc.close();
	}
}
