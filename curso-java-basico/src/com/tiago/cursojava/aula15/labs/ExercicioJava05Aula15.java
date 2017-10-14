package com.tiago.cursojava.aula15.labs;

import java.util.Scanner;

public class ExercicioJava05Aula15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aulo: \n");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota do aulo: \n");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7 && media != 10) {
			System.out.println("\nAprovado");
		} else if (media < 7) {
			System.out.println("\nReprovado");
		} else if (media == 10) {
			System.out.println("\nAprovado com Distinção");
		}
	}

}
