package com.tiago.cursojava.aula15.labs;

import java.util.Scanner;

public class ExercicioJava08Aula15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor do primeiro produto: ");
		double valor1 = scan.nextDouble();
		
		System.out.println("Informe o valor do segundoo produto: ");
		double valor2 = scan.nextDouble();
		
		System.out.println("Informe o valor do terceiro produto: ");
		double valor3 = scan.nextDouble();
		
		if (valor1 < valor2 && valor1 < valor3) {
			System.out.println("O produto mais barato é o de valor " + valor1);
		} else if (valor2 < valor1 && valor2 < valor3) {
			System.out.println("O produto mais barato é o de valor " + valor2);
		} else if (valor3 < valor2 && valor3 < valor1) {
			System.out.println("O produto mais barato é o de valor " + valor3);
		} 

	}

}
