package com.tiago.cursojava.aula17.labs;

import java.util.Scanner;

public class ExercicioJava24Aula17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do pão: ");
		double pao = scan.nextDouble();
		
		System.out.println("Panificadora Pão de Ontem - Tabela de Preços");
		
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + " - " + (i * pao));
		}

	}

}
