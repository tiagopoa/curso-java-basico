package com.tiago.cursojava.aula19.labs;

import java.util.Random;

public class ExercicioJava32Aula19 {
	
	/*Criar um vetor A com 5 elementos inteiros. Escreva um programa que
	imprima a tabuada de cada um dos elementos do vetor A.*/

	public static void main(String[] args) {

		int[] a = new int[5];
		
		Random gerador = new Random();
		
		for (int i = 0; i <= 4; i++) {
			a[i] = gerador.nextInt(9);
		}
		
		for (int i = 0; i <= 4; i++) {		
			
			System.out.println("\nTaboada de " + a[i]);
			
			for (int k = 1; k <= 10; k++)
			System.out.println(a[i] + " X " + k + " = " + (a[i] * k));
		}
		

	}

}
