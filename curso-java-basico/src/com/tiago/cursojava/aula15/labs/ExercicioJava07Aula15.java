package com.tiago.cursojava.aula15.labs;

import java.util.Scanner;

public class ExercicioJava07Aula15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundoo numero: ");
		int num2 = scan.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		int num3 = scan.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("O maior n�mero � o: " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O maior n�mero � o: " + num2);
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("O maior n�mero � o: " + num3);
		}
		
		if (num1 < num2 && num1 < num3) {
			System.out.println("O menor n�mero � o: " + num1);
		} else if (num2 < num1 && num2 < num3) {
			System.out.println("O menor n�mero � o: " + num2);
		} else if (num3 < num1 && num3 < num2) {
			System.out.println("O menor n�mero � o: " + num3);
		}
		
		

	}

}
