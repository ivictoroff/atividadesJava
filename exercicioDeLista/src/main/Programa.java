package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		List <Funcionarios> lista = new ArrayList<>();
		
		System.out.println("quantos funcionario serao digitados: ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			System.out.println();
			System.out.println("funcionario #"+ (i+1));
			
			System.out.print("ID:");
			Integer id = sc.nextInt();
			
			System.out.print("Nome:");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Salario:");
			Double salario = sc.nextDouble();
			
			Funcionarios func = new Funcionarios (id, nome, salario);
			
			lista.add(func);
			
		}
		
			System.out.print("insira o funcionario que recebera um aumento salarial: ");
			Integer idsalario = sc.nextInt();
			
			Integer pos = position(lista, idsalario);
			if (pos == null) {
				System.out.println("funcionario nao encontrado");
			}
			else {
				System.out.println("insira a porcentagem do aumento: ");
				Double perc = sc.nextDouble();
				lista.get(pos).aumento(perc);
			}
		System.out.println();
		
		System.out.println("lista de funcionarios: ");
		for (Funcionarios func : lista) {
			System.out.println(func);
		}

		
		sc.close();
	}
	
	public static Integer position (List <Funcionarios> list, int id) {
		for (int i=0; i<list.size();i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
}
