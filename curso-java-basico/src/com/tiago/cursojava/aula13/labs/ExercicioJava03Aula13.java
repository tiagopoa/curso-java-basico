package com.tiago.cursojava.aula13.labs;

import java.util.Scanner;

public class ExercicioJava03Aula13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Fa�a um programa que pe�a dois numeros e imprima a soma
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do numero1");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite o valor do numero2");
		int numero2 = scan.nextInt();
		
		int resultado = numero1 + numero2;
		
		//System.out.println("A soma dos numeros digitados � " + resultado);
		System.out.println(resultado);

	}

}
