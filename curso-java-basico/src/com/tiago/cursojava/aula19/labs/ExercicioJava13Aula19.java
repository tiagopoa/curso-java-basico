package com.tiago.cursojava.aula19.labs;

import java.util.Random;

public class ExercicioJava13Aula19 {

	public static void main(String[] args) {

		int[] a = new int[10];
		int soma = 0;
		
		Random gerador = new Random();
		
		for (int i = 0; i < a.length; i++) {
			a[i] = gerador.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 5 == 0)
				soma += a[i];
		}

		System.out.println("Soma dos elementos armazenados neste vetor que são múltiplos de 5: " + soma);

	}

}
