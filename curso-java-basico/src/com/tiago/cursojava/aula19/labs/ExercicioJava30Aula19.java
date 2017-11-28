package com.tiago.cursojava.aula19.labs;

import java.util.Random;

public class ExercicioJava30Aula19 {

	public static void main(String[] args) {

		/*Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo
		que nos vetor B e C serão armazenados o valores pares e ímpares de
		A, respectivamente.*/
		
		int[] a = new int[20];
		int[] b = new int[10];
		int[] c = new int[10];
		
		Random gerador = new Random();
		
		for (int i = 0; i <= 19; i++) {
			a[i] = gerador.nextInt(100);
			System.out.println("a[" + i + "] = " + a[i]);
		}

			for (int j = 0; j <= 9; j++) {
				if (a[i] % 2 == 0) {
					b[j] = a[i];
				} 
			}
			
			for (int j = 0; j <= 9) 
			
			
			
			
		
		for (int i = 0; i <= 9; i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}
		
		for (int i = 0; i <= 9; i++) {
			System.out.println("c[" + i + "] = " + c[i]);
		}
		

	}

}
