package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		List <String> list= new ArrayList<>();
		list.add("Maria");
		list.add("João");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "MARCO");
		
		System.out.println(list.size());
		
		
		for (String x :list) {
			System.out.println(x);
		}
		System.out.println("-------------------");
		
		list.remove(1);
		list.removeIf(x -> x.charAt(0)=='M');
		for (String x :list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------");
		System.out.println("Indesx of BOB "+ list.indexOf("Bob"));
		System.out.println("Indesx of MARCO "+ list.indexOf("MARCO"));
		
		System.out.println("-------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0)=='A').collect(Collectors.toList());
		
		for (String x :result) {
			System.out.println(x);
		}
		System.out.println("-------------------");
		String name = list.stream().filter(x -> x.charAt(0)=='J').findFirst().orElse(null);
		System.out.println(name);

	}

}
