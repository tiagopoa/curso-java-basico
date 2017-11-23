package com.tiago.cursojava.aula19.labs;

import java.util.Random;

public class ExercicioJava02Aula19 {

	public static void main(String[] args) {

		int[] a = new int[8];
		int[] b = new int[8];
		
		Random gerador = new Random();
		
		for (int i = 0; i < a.length; i++) {
			a[i] = gerador.nextInt();
			b[i] = a[i] *2;
		}
		
		for (int i = 0; i < a.length; i++) {
		System.out.println("Array a na posição " + i + " é " + a[i]);
		System.out.println("Array b na posição " + i + " é " + b[i]);
		}

	}

}
