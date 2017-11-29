package com.tiago.cursojava.aula19.labs;

import java.util.Random;

public class ExercicioJava37Aula19 {
	
	/*Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
	mesmo tamanho, sendo que cada elemento do vetor B seja o fatorial
	do elemento correspondente em A.*/

	public static void main(String[] args) {

		int[] a = new int[15];
		int[] b = new int[15];
		int fat = 0;
		
		Random gerador = new Random();
		
		for (int i = 0; i <= 14; i++) {
			a[i] = gerador.nextInt(5);
			
			while (a[i] == 0) {
				a[i] = gerador.nextInt(10);	
			}	
		}
		
		for (int i = 0; i <= 14; i++) {			
			int res = a[i];
			
			for (int k = 1; k < a[i]; k++) {			
				fat = res * (a[i] - k);
				res = fat;			
			}			
			b[i] = res;	
		}
		
		for (int i = 0; i <= 14; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
			System.out.println("Fatorial de " + a[i] + " é " + b[i]);
		}
	}

}
