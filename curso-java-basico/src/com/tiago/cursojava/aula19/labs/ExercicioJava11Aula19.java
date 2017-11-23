package com.tiago.cursojava.aula19.labs;

import java.util.Random;

public class ExercicioJava11Aula19 {

	public static void main(String[] args) {

		int[] a = new int[10];
		int cont = 0;
		
		Random gerador = new Random();
		
		for (int i = 0; i < a.length; i++) {
			a[i] = gerador.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				cont++;
		}

		System.out.println("Quantidade de valores pares armazenados no vetor: " + cont);
		
	}

}
