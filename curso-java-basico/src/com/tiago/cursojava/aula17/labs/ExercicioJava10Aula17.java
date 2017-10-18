package com.tiago.cursojava.aula17.labs;

import java.util.Scanner;

public class ExercicioJava10Aula17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		int menor = 0, maior = 0;
		
		System.out.println("Digite um numero: ");
		num1 = scan.nextInt();
		
		System.out.println("Digite um numero: ");
		num2 = scan.nextInt();
		
		if (num1 < num2) {
			menor = num1;
			maior = num2;
		} else {
			menor = num2;
			maior = num1;
		}

		
		for (; menor <= maior ; menor++) {
			System.out.println("Números inteiros do intervalo entre " + num1 + " e " + num2 + ": " + menor);
		}



	}

}
