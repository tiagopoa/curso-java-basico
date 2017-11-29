package com.tiago.cursojava.aula19.labs;

import java.util.Random;

public class ExercicioJava35Aula19 {

	/*Criar um vetor A com 10 elementos inteiros. Escreva um programa que
	imprima cada elemento do vetor A e a relação de todos os divisores do
	respectivo elemento.*/
	
	public static void main(String[] args) {

		int[] a = new int[10];
		
		Random gerador = new Random();
		
		for (int i = 0; i <= 9; i++) {
			a[i] = gerador.nextInt(1000);
				
			for (int k = 1; k <= a[i]; k++) {
				if (a[i] % k == 0 ) {
					System.out.println("Os divisores do elemento " + a[i] + " são: " + k);
				}
			}
				
			
		}

	}

}
