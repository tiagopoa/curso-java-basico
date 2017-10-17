package com.tiago.cursojava.aula17.labs;

import java.util.Scanner;

public class ExercicioJava07Aula17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int maior = Integer.MIN_VALUE;
		int i = 0;
		int num = 0;
		
		do {
		System.out.println("Digite o primeiro numero: ");
		num = scan.nextInt();
		if (num > maior) {
			maior = num;
			System.out.println("o numero maior mudou: " + maior);
		}
		i++;
		} while (i<5);
		
		System.out.println("O maior numero digitado foi: " + maior);
		
		
	}

}
