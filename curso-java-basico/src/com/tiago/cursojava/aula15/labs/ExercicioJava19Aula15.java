package com.tiago.cursojava.aula15.labs;

import java.util.Scanner;

public class ExercicioJava19Aula15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o primeiro numero: ");
		int num2 = scan.nextInt();
		
		System.out.println("Qual operação deseja realizar?\n1 - Adição\n2 - subtração\n3 - Multiplicação\n4 - Divisão");
		int operacao = scan.nextInt();
		
		switch (operacao) {
		case 1: 
			System.out.println("Adição: " + num1 + " + " + num2 + " = " + (num1 + num2)); 
				if (num1+num2 > 0) { 
					System.out.println("O resultado é positivo"); 
					} else { 
						System.out.println("O resultado é negativo"); 
						} 
				if (num1+num2 % 2 == 0) {
					System.out.println("O número é par");
				} else {
					System.out.println("O número é impar");
				} break;
		
		case 2: System.out.println("Subtração: " + num1 + " - " + num2 + " = " + (num1 - num2));
		if (num1-num2 > 0) { 
			System.out.println("O resultado é positivo"); 
			} else { 
				System.out.println("O resultado é negativo"); 
				} 
		if (num1-num2 % 2 == 0) {
			System.out.println("O número é par");
		} else {
			System.out.println("O número é impar");
		} break;
		
		case 3: System.out.println("Multiplicação: " + num1 + " x " + num2 + " = " + (num1 * num2)); 
		if (num1*num2 > 0) { 
			System.out.println("O resultado é positivo"); 
			} else { 
				System.out.println("O resultado é negativo"); 
				} 
		if (num1*num2 % 2 == 0) {
			System.out.println("O número é par");
		} else {
			System.out.println("O número é impar");
		} break;
		
		case 4: System.out.println("divisão: " + num1 + " / " + num2 + " = " + (num1 / num2)); 
		if (num1/num2 > 0) { 
			System.out.println("O resultado é positivo"); 
			} else { 
				System.out.println("O resultado é negativo"); 
				} 
		if (num1/num2 % 2 == 0) {
			System.out.println("O número é par");
		} else {
			System.out.println("O número é impar");
		} break;
		}
				
	}

}
