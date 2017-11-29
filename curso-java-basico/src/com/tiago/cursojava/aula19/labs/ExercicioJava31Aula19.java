package com.tiago.cursojava.aula19.labs;

import java.util.Random;

/*Ler um vetor A com 20 elementos. Separar os elementos pares e
ímpares de A utilizando apenas um vetor extra B. Sugestão: no início
do vetor B armazene os elementos pares de A e nas posições
restantes do vetor B armazene os elementos de A que são ímpares.*/

public class ExercicioJava31Aula19 {

	public static void main(String[] args) {

		int[] a = new int[20];
		int[] b = new int[20];
		int j = 0;
		int k = 0;
		
		Random gerador = new Random();
		
		for (int i = 0; i <= 19; i++) {
			a[i] = gerador.nextInt(100);
		}
		
		for (int i = 0; i <= 19; i++) {
			if (a[i] % 2 == 0) {
				b[j] = a[i];
				j++;
			}
		}
		
		for (int i = 0; i <= 19; i++) {
			if (a[i] % 2 != 0) {
				b[j] = a[i];
				j++;
			}
		}
		
		
		for(int i = 0; i <= 19; i++) {
		System.out.println(b[i]);
		}

	}

}
