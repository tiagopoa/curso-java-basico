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
		
		System.out.println("Qual opera��o deseja realizar?\n1 - Adi��o\n2 - subtra��o\n3 - Multiplica��o\n4 - Divis�o");
		int operacao = scan.nextInt();
		
		switch (operacao) {
		case 1: 
			System.out.println("Adi��o: " + num1 + " + " + num2 + " = " + (num1 + num2)); 
				if (num1+num2 > 0) { 
					System.out.println("O resultado � positivo"); 
					} else { 
						System.out.println("O resultado � negativo"); 
						} 
				if (num1+num2 % 2 == 0) {
					System.out.println("O n�mero � par");
				} else {
					System.out.println("O n�mero � impar");
				} break;
		
		case 2: System.out.println("Subtra��o: " + num1 + " - " + num2 + " = " + (num1 - num2));
		if (num1-num2 > 0) { 
			System.out.println("O resultado � positivo"); 
			} else { 
				System.out.println("O resultado � negativo"); 
				} 
		if (num1-num2 % 2 == 0) {
			System.out.println("O n�mero � par");
		} else {
			System.out.println("O n�mero � impar");
		} break;
		
		case 3: System.out.println("Multiplica��o: " + num1 + " x " + num2 + " = " + (num1 * num2)); 
		if (num1*num2 > 0) { 
			System.out.println("O resultado � positivo"); 
			} else { 
				System.out.println("O resultado � negativo"); 
				} 
		if (num1*num2 % 2 == 0) {
			System.out.println("O n�mero � par");
		} else {
			System.out.println("O n�mero � impar");
		} break;
		
		case 4: System.out.println("divis�o: " + num1 + " / " + num2 + " = " + (num1 / num2)); 
		if (num1/num2 > 0) { 
			System.out.println("O resultado � positivo"); 
			} else { 
				System.out.println("O resultado � negativo"); 
				} 
		if (num1/num2 % 2 == 0) {
			System.out.println("O n�mero � par");
		} else {
			System.out.println("O n�mero � impar");
		} break;
		}
				
	}

}
