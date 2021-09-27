package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramaCotacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();//Preço do dolar
		
		System.out.print("How many dollars will be bought? ");
		double amount = sc.nextDouble();//Quantidade de dolar a ser comprada
		
		double result = CurrencyConverter.dollarToReal(dollarPrice, amount);
		System.out.printf("Amount to be paid in reais = %.2f%n" , result);//Valor a ser pago em reais
		
		sc.close();

	}

}
