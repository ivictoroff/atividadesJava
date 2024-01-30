package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionarios;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		List <Funcionarios> lista = new ArrayList<>();
		
		System.out.println("quantos funcionario serao digitados: ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("funcionario #"+ (i+1));
			
			System.out.print("ID:");
			Integer id = sc.nextInt();
			
			System.out.print("Nome:");
			String nome = sc.next();
			
			System.out.print("Salario:");
			Double salario = sc.nextDouble();
			
			Funcionarios func = new Funcionarios (id, nome, salario);
			
			lista.add(func);
			
		}
		
		for (int i=0; i<n; i++) {
			System.out.print("insira o funcionario que recebera um aumento salarial: ");
			Integer id = sc.nextInt();
			
			System.out.println("insira a porcentagem: ");
			Double perc= sc.nextDouble();
			
			Funcionarios func = new aumento(perc);
		}
		
		System.out.println(lista);
		
		

	}

}
