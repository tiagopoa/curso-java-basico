package com.tiago.cursojava.aula17.labs;

import java.util.Scanner;

public class ExercicioJava22Aula17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int qtdCd = 0;
		double valorCd = 0;
		double media = 0;
		double soma = 0;
		
		System.out.println("Digite a quantidade de CDs: ");
		qtdCd = scan.nextInt();
		
		for (int i = 1; i <= qtdCd; i++) {
			System.out.println("Informe o valor do cd " + i);
			valorCd = scan.nextDouble();
			soma += valorCd;
			media = soma / i;
		}
		
		System.out.println("Valor total investido em CDs: " + soma);
		System.out.println("Valor médio de cada CD: " + media);

	}

}
