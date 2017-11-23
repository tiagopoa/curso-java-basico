package com.tiago.cursojava.aula19.labs;

import java.util.Random;

public class ExercicioJava16Aula19 {

	public static void main(String[] args) {

		int[] a = new int[10];
		int menor15 = 0;
		int igual15 = 0;
		int maior15 = 0;
		int cont = 0;
		int mediaMaior15 = 0;
		
		for (int i = 0; i < a.length; i++) {			
			a[i] = new Random().nextInt(40);
			System.out.println(a[i]);
			if (a[i] > 15) {
				maior15 += a[i];
				cont++;
			} else if (a[i] < 15) {
				menor15 += a[i];
			} else {
				igual15++;
			}
		}		
		
		mediaMaior15 = maior15 / cont;
		
		System.out.println("a) a soma de elementos armazenados neste vetor que são inferiores a 15: " + menor15);
		System.out.println("b) a quantidade de elementos armazenados no vetor que são iguais a 15: " + igual15);
		System.out.println("c) a media dos elementos armazenados nov etor que são superiores a 15: " + mediaMaior15);

	}

}
