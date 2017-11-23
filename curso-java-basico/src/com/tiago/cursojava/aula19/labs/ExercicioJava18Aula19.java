package com.tiago.cursojava.aula19.labs;

import java.util.Random;



public class ExercicioJava18Aula19 {

	public static void main(String[] args) {

		int[] a = new int[10];		
		int menor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) {			
			a[i] = new Random().nextInt(100);
			System.out.println(a[i]);
			if (a[i] > maior) {				
				maior = a[i];
			} else if (a[i] < menor) {
				menor = a[i];
			}
		}

		System.out.println("A menor idade é: " + menor);
		System.out.println("A maior idade é: " + maior);
		
	}

}
