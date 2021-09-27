package application;

import java.util.Scanner;

import entities.ForEach;

public class ProgramaForEach2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ForEach[] vect = new ForEach[10];
		
		System.out.print("Quantos são os são os trabalhadores?");
		int n = sc.nextInt();
		
		for(int i=0; i<=n; i++) {
			System.out.println(vect[i]);
		}
		System.out.println("----------");
		System.out.println("Convocação para o trabalho: ");
		System.out.print("Name: ");
		for(ForEach obj : vect) {
			System.out.println("Maria Torres");
			sc.nextLine();
			System.out.println("Mirian Rocha");
			sc.nextLine();
			System.out.println("Martha vieira");
		}
		
		System.out.println("----------");
		System.out.println("Email's correspondentes: ");
		System.out.print("Email's: ");
		for(ForEach obj : vect) {
			System.out.println("mat@gmail.com");
			sc.nextLine();
			System.out.println("mrrocha@gmail.com");
			sc.nextLine();
			System.out.println("mvir@gmail.com");
		}
		
		System.out.println();
		System.out.println("approved workers: ");
		for(int i=0; i<10; i++) {
			System.out.println(i + ": " + vect[i]);
		}
		
		sc.close();

	}

}
