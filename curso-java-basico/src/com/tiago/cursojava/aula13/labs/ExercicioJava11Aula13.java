package com.tiago.cursojava.aula13.labs;

import java.util.Scanner;

public class ExercicioJava11Aula13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Faça um programa que peça dois numeros inteiros e um numero real.
		//Calcule e motre:
		//a. o produto do dobro do primeiro com metade do segundo.
		//b. a soma do triplo do primeiro com o terceiro.
		//c. o terceiro elevado ao cubo.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero inteiro: ");
		int numInteiro1 = scan.nextInt();

		System.out.println("Digite o segundo numero inteiro: ");
		int numInteiro2 = scan.nextInt();
		
		System.out.println("Digite um numero real: ");
		double numReal = scan.nextDouble();
		
		double a = (2 * numInteiro1)*(numInteiro2 / 2);
		double b = (3 * numInteiro1 + numReal);
		double c = Math.pow(numReal, 3);
		
		System.out.println("O produto do dobro do primeiro com metade do segundo: " + a);
		System.out.println("A soma do triplo do primeiro com o terceiro: " + b);
		System.out.println("O terceiro elevado ao cubo: " + c);
	}

}
