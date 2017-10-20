package com.tiago.cursojava.aula17.labs;

import java.util.Scanner;

public class ExercicioJava28Aula17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		int div = 0;
		int num = 0;
		
		do {
		System.out.println("Digite um numero para saber se ele é primo: ");
		num = scan.nextInt();
		} while (num <=0);
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				div++;
			}
		}
		
		if (div == 2) {
			System.out.println("O número " + num + " é primo!");
		} else {
			System.out.println("O número " + num + " não é primo!");
		}
		
	}

}
