package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramaLista {
	
     public static void main(String[] args) {
    	 
    	 List<String> list = new ArrayList<>();
    	 
    	 list.add("Maria");
    	 list.add("Alex");
    	 list.add("Bob");
    	 list.add("Anna");
    	 list.add(1, "maria@gmail.com");
    	 list.add(3, "alex@gmail.com");
    	 list.add(2, "Marco");
    	 list.add(3, "marco@gmail.com");
    	 list.add(7, "bob@gmail.com");
    	 list.add(9, "anna@gmail.com");

    	 
    	 System.out.println(list.size());
   	 
    	 for(String x : list) {
    		 System.out.println(x);   		   	
    	 }
    	 
    	 System.out.println("---------------");
    	 list.remove(1);
    	 list.remove(2);
    	 list.add(3, "alex@gmail.com");
    	 list.remove(3);
    	 list.removeIf(x -> x.charAt(0) == 'M');
    	 for(String x : list) {
    		 System.out.println(x);   		   	
    	 }
    	 
    	 System.out.println("---------------");
    	 System.out.println("Index of Bob: " + list.indexOf("Bob"));
    	 System.out.println("Index of Rob: " + list.indexOf("Rob"));
    	 System.out.println("----------------");
    	 List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
    	 for(String x : result) {
    		 System.out.println(x);   		   	
    	 }
    	 
    	 System.out.println("---------------");
    	 String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
    	 System.out.println(name);
    	 String email = list.stream().filter(x -> x.charAt(0) == 'a').findFirst().orElse(null);
    	 System.out.println(email);
     }

}
