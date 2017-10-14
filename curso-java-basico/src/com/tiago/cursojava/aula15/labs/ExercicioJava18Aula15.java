package com.tiago.cursojava.aula15.labs;

import java.util.Scanner;

public class ExercicioJava18Aula15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int num = scan.nextInt();
		
		if ( num % 2 == 0 ) {
			System.out.println("O número digitado é par.");
		} else {
			System.out.println("O número digitado é impar.");
		}

	}

}
