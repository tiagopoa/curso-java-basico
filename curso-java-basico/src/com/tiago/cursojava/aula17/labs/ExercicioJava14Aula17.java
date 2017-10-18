package com.tiago.cursojava.aula17.labs;

import java.util.Scanner;

public class ExercicioJava14Aula17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int par = 0;
		int impar = 0;
		
		for (int i = 1; i <= 10; i++) {
		System.out.println("Digite um numero: ");
		num = scan.nextInt();
		if (num % 2 == 0) {
			par++;
		} else {
			impar++;
		}
		}
		
		System.out.println("Quantidade de numeros pares: " + par + "\nQuantidade de numeros impares: " + impar);

	}

}
