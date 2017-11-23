package com.tiago.cursojava.aula19.labs;

import java.util.Random;

public class ExercicioJava12Aula19 {

	public static void main(String[] args) {

		int[] a = new int[10];
		int soma = 0;
		
		Random gerador = new Random();
		
		for (int i = 0; i < a.length; i++) {
			a[i] = gerador.nextInt();
			System.out.println(a[i]);
			soma += a[i];
		}
		
		/*for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				cont++;
		}*/

		System.out.println("Soma de todos os elementos armazenados no vetor: " + soma);

	}

}
