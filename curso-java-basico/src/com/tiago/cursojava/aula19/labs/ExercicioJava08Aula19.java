package com.tiago.cursojava.aula19.labs;

import java.util.Random;

public class ExercicioJava08Aula19 {

	public static void main(String[] args) {

		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		
		Random gerador = new Random();
		
		for (int i = 0; i < a.length; i++) {
			a[i] = gerador.nextInt();
			b[i] = gerador.nextInt();
			c[i] = a[i] * b[i];
		}
		
		for (int i = 0; i < a.length; i++) {
		System.out.println("Array a na posi��o " + i + " � " + a[i]);
		System.out.println("Array b na posi��o " + i + " � " + b[i]);
		System.out.println("Array c na posi��o " + i + " � " + c[i]);
		
		}

	}

}
