package nPares;

import java.util.Scanner;

public class NumerosPares {
	public static void main(String[] args) {
		
		int quant =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("quantos numeros deseja digitar? ");
		int n = sc.nextInt();
		
		int[] num = new int [n];
		
		for (int i = 0; i<n; i++) {
			System.out.println("digite um numero: ");
			num[i] = sc.nextInt();
			
		}
		System.out.println("\nNUMEROS PARES:");
		for (int i=0; i<n; i++) {
			if (num[i] % 2 == 0) {
				System.out.printf("%d  ", num[i]);
				
				quant++;
			}
		}
		System.out.printf("\nquantidade de pares= %d", quant);
	}
}
