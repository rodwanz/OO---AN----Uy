package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductVector;

public class ProgramaVetor2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ProductVector[] vect = new ProductVector[n];
		
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProductVector(name, price);
		}
		
		double sum = 0.0;
		for(int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / n;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
				
		sc.close();

	}

}
