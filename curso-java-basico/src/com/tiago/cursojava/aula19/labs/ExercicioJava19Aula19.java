package com.tiago.cursojava.aula19.labs;

import java.util.Scanner;

public class ExercicioJava19Aula19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double[] nota1 = new double[10];
		double[] nota2 = new double[10];
		double[] result = new double[10];
		
		
		for (int i = 0; i < nota1.length; i++) {
			System.out.println("Digite a nota 1 do aluno " + (i+1) + ":");
			nota1[i] = scan.nextDouble();
			System.out.println("Digite a nota 2 do aluno " + (i+1) + ":");
			nota2[i] = scan.nextDouble();
			
			result[i] = (nota1[i] + nota2[i]) / 2;
			
		}

		for (int i = 0; i < result.length; i++) {
			if (result[i] >= 7) {
				System.out.println("Aluno " + (i+1) + " está APROVADO");
			} else {
				System.out.println("Aluno " + (i+1) + " está REPROVADO");
			}
		}
		
	}

}
