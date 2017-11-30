package com.tiago.cursojava.aula20;

import java.util.Random;

public class Matrizes {
	
	//Faça um programa que armazene 4 notas para 30 alunos e depois exiba elas.

	public static void main(String[] args) {

		double[][] notasAlunos = new double[30][4];
		
		Random gerador = new Random();
		
		for (int i = 0; i <= 29; i++) {
			for (int k = 0; k <= 3; k++) {
				notasAlunos[i][k] = gerador.nextDouble();
				//System.out.println(i + " " + k);
			}
		}

		for (int i = 0; i <= 29; i++) {
			System.out.println("\n\nAluno " + (i+1) + ": ");
			for (int k = 0; k <= 3; k++) {
				System.out.print(notasAlunos[i][k] + "	");
			}
		}
		
		
	}

}
