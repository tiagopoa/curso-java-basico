package com.tiago.cursojava.aula15.labs;

import java.util.Scanner;

public class ExercicioJava23Aula15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		double valorProduto = 0;
		double valorTotalCompra = 0;
		String tipoProduto = "";
		int desconto = 0;
		String tipoPagamento = "";
		
		System.out.println("HipermercadoTabajara\n               Até 5kg               Acima de 5kg\n1 - File Duplo    R$ 4,90 por kg        R$ 5,80 por kg\n2 - Alcatra       R$ 5,90 por kg        R$ 6,80 por kg\n3 - Picanha       R$ 6,90 por kg        R$ 7,80 por kg\n\nQual tipo de carne?");
		int tipo = scan.nextInt();

		System.out.println("Quantos kg?");
		double peso = scan.nextDouble();
		
		System.out.println("Qual a fomr a de pagamento?\n\n1 - Cartao Tabajara\n2 - Dinheiro\n3 - Outro Cartao");
		int formaPagamento = scan.nextInt();
		
		switch (tipo){
			case 1: tipoProduto = "File Duplo"; if (peso <= 5) {
			valorProduto = 4.9;
		} else if (peso >5) {
			valorProduto = 5.8;
		} break;
			case 2: tipoProduto = "Alcatra"; if (peso <= 5) {
				valorProduto = 5.9;
			} else if (peso >5) {
				valorProduto = 6.8;
			} break;
			case 3: tipoProduto = "Picanha"; if (peso <= 5) {
				valorProduto = 6.9;
			} else if (peso >5) {
				valorProduto = 7.8;
			} break;
		}
		
		double valorCompra = peso * valorProduto;
				
		switch (formaPagamento) {
		case 1: desconto = 10; tipoPagamento = "Cartao Tabajara"; valorTotalCompra = valorCompra - ((valorCompra * desconto) / 100); break;
		case 2: tipoPagamento = "Dinheiro"; valorTotalCompra = valorCompra - ((valorCompra * desconto) / 100); break;
		case 3: tipoPagamento = "Outro Cartao"; valorTotalCompra = valorCompra - ((valorCompra * desconto) / 100); break;
		}
		
		System.out.println("\n\nHipermercadoTabajara\n\n         CUPOM FISCAL\n" + tipoProduto + "                  Kg " + peso + "    R$" + valorCompra + "\n\n\n\n\nTipo de Pagamento     " + tipoPagamento + "\nDesconto              " + desconto + "%\nValor total a pagar         " + valorTotalCompra);
		
	}

}
