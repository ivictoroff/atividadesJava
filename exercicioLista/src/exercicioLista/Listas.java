package exercicioLista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Listas {
	public static void main(String []args) {
		
		List <String> list = new ArrayList<>();
		
		list.add("victor"); 
		list.add("anita");
		list.add("duda");
		list.add("keveen");
		list.add(2, "lucas");
		
		System.out.println(list.size());
		
		for (String x : list) {
		System.out.println(x);
		}
		
		System.out.println("---------------------");
		
		list.removeIf(x -> x.charAt(0) == 'v');
		
		for (String x : list) {
		System.out.println(x);
		}
		
		System.out.println("---------------------");
		
		System.out.println("Index of duda: " + list.indexOf("duda"));
		System.out.println("Index of victor: " + list.indexOf("victor"));
		
		System.out.println("---------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'a').collect(Collectors.toList());
		
		for (String x : result) {
		System.out.println(x);
		}
		
		System.out.println("---------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'k').findFirst().orElse(null);
		System.out.println(name);
	}
}
