package com.tiago.cursojava.aula19.labs;

import java.util.Random;

public class ExercicioJava14Aula19 {

	public static void main(String[] args) {

		int[] a = new int[10];
		int soma = 0;
		
		Random gerador = new Random();
		
		for (int i = 0; i < a.length; i++) {
			a[i] = gerador.nextInt();
			if (a[i] % 5 != 0)
				soma += a[i];
		}		

		System.out.println("Média aritmetica simples dos elementos impares armazenados neste vetor: " + soma);

	}

}
