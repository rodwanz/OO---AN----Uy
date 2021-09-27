package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import util.CurrencyConverter;

public class ProgranaProduto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		Produto produto = new Produto();

		System.out.print("Digite o valor do produto: ");
		double valorProduto = sc.nextDouble();

		System.out.print("Digite a quantidade: ");
		double quantidade = sc.nextDouble();
		
		double percentualDesconto = 0.0;
					
		double result = Produto.valorDoSubTotal( valorProduto,  quantidade);
		System.out.printf("Valor do sub total = %.2f%n" , result);
		
//		System.out.println();
//		System.out.printf("Desconto: %.2f%n" , percentualDesconto);
		
		double result2 = Produto.desconto( valorProduto,  percentualDesconto);
		System.out.printf("Valor do desconto = %.2f%n" , result2);
		
		double result3 = Produto.valorTotalComDesconto( valorProduto,  quantidade);
		System.out.printf("Valor total com desconto = %.2f%n" , result3);
		
		
		sc.close();

	}

}
