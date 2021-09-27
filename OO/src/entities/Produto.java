package entities;


public class Produto {

	
	public static double valorDoSubTotal(double valorProduto, double quantidade) {
		return valorProduto * quantidade;
	}
	
	public static double percentualDesconto(double quantidade, double desconto) {
		if (quantidade <=10) {
			return desconto = 0.0;
		}else{
			return desconto = 10.0;
		}
	}

	public static double desconto(double valorDoSubTotal, double percentualDesconto) {
		  return (valorDoSubTotal * percentualDesconto)/100;
	}
	
	public static double valorTotalComDesconto(double valorDoSubTotal, double desconto) {
		   return valorDoSubTotal - desconto;
	}

}
