package com.tiago.cursojava.aula17.labs;

import java.util.Scanner;

public class ExercicioJava25Aula17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		while (1==1) {
			double valor = 0;
			double soma = 0;
			double valorDinheiro = 0;
			double troco = 0;
			int i = 1;
			System.out.println("\nLojas Tabajara\n ");
		do {
		System.out.print("\nProduto " + i + ": R$ ");
		valor = scan.nextDouble();
		soma += valor;
		i++;
		} while (valor != 0);
		
		System.out.print("Total: R$" + soma);
		
		System.out.print("\nDinheiro: R$");
		valorDinheiro = scan.nextDouble();
		
		if (valorDinheiro < soma) {
			System.out.print("Falta R$" + (soma - valorDinheiro));
		} else {
		System.out.print("Troco: R$" + (valorDinheiro - soma) + "\n...");
		}
		
		}

	}

}
