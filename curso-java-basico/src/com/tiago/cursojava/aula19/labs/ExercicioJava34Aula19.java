package com.tiago.cursojava.aula19.labs;

import java.util.Random;

public class ExercicioJava34Aula19 {
	
	/*Criar um vetor A com 10 elementos inteiros. Escreva um programa que
	imprima cada elemento do vetor A e a relação de todos os pares de 0
	até o respectivo elemento.*/

	public static void main(String[] args) {

		int[] a = new int[10];
			
		Random gerador = new Random();
		
		for (int i = 0; i <= 9; i++) {
			a[i] = gerador.nextInt(100);
			
			for (int k = 0; k <= i; k++) {
				if (a[k] % 2 == 0) {
					System.out.println("Pares do elemento " + a[i] + " são: " + a[k]);
				}
			}
			
		}

	}

}
