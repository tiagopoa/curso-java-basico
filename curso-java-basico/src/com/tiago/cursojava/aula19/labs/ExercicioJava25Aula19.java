package com.tiago.cursojava.aula19.labs;

import java.util.Random;

public class ExercicioJava25Aula19 {

	public static void main(String[] args) {
		 
		int[] a = new int[100];
		int[] b = new int[100];
		
		Random gerador = new Random(50);
		
		for (int i = 0; i <=99; i++) {
			a[i] = gerador.nextInt();
			if (a[i] % 2 == 0) {
				b[i] = 1; 
			} else if (a[i] % 2 != 0) {
				b[i] = 0;
			}
			
			System.out.println(b[i]);
		}
		

	}

}
