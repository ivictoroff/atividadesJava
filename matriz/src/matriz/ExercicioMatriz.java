package matriz;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main (String []args) {
		int buscar;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("quantas linha deseja digitar??");
		int l = sc.nextInt();
		System.out.println("quantas colunas deseja digitar??");
		int c = sc.nextInt();
		
		int [][] matriz = new int [l][c];
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("qual numero deseja buscar?");
		buscar= sc.nextInt();
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				if (matriz[i][j] == buscar) {
					System.out.println(i+" "+ j);
				}
			}
		}
		
	}
}
