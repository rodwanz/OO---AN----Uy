package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramaEmployee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emply = new Employee();
		
		System.out.print("Name: ");
		emply.name = sc.nextLine();
		System.out.print("Gross salary: ");
		emply.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emply.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + emply);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emply.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update data: " + emply);
		
		sc.close();

	}

}
