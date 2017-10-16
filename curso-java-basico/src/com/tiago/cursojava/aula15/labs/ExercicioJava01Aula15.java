package com.tiago.cursojava.aula15.labs;

import java.util.Scanner;

public class ExercicioJava01Aula15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero");
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println("O número maior digitado é: " + num1);
		} else {
			System.out.println("O número maior digitado é: " + num2);
		}

	}

}
