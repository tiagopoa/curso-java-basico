package com.tiago.cursojava.aula19.labs;

import java.util.Random;

public class ExercicioJava33Aula19 {
	
	/*Criar um vetor A com 10 elementos inteiros. Escreva um programa que
	imprima cada elemento do vetor A e uma mensagem indicando se o
	respectivo elemento é um número primo ou não.*/

	public static void main(String[] args) {

		int[] a = new int[10];
		int div = 0;
		
		Random gerador = new Random();
		
		for (int i = 0; i <= 9; i++) {
			a[i] = gerador.nextInt(1000);
			
			while (a[i] == 0) {
				a[i] = gerador.nextInt(1000);
			}			
		}		
		
		for (int i = 0; i <= 9; i++) {
			
			for (int k = 1; k <= a[i]; k++) {
			if (a[i] % k == 0) {
				div++;
			}
			}
			
			if (div == 2) {
				System.out.println("Numero " + a[i] + " é primo");				
			} else {
				System.out.println("Numero " + a[i] + " não é primo");
			}
			
			div = 0;
		}
		

	}

}
