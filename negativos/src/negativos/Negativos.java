package negativos;

import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("quantos numero deseja inserir? ");
		n = sc.nextInt();
		
		int [] vetor = new int[n];
		
		for (int i=0; i< n; i++) {
			System.out.print("digite um numero: ");
			vetor [i] = sc.nextInt();
		}
		System.out.println("numeros digitados:");
		
		for (int i=0; i<n; i++) {
			if (vetor[i]<0 ) {
				System.out.printf("%d\n", vetor[i]);
			}
		}
		sc.close();
	}

}

