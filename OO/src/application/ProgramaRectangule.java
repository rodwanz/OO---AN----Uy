package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangule;



public class ProgramaRectangule {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Rectangule rect = new Rectangule();
		
		System.out.println("Enter rectangule width and reight: ");		
		rect.height = sc.nextDouble();
		rect.width = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n" , rect.area());
		System.out.printf("PERIMETER = %.2f%n" , rect.perimeter());
		System.out.printf("DIAGONAL = %.2f%n" , rect.diagonal());
		
				
		sc.close();

	}

}
