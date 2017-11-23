package com.tiago.cursojava.aula19.labs;

import java.util.Random;

public class ExercicioJava17Aula19 {

	public static void main(String[] args) {

		int[] a = new int[10];		
		int cont = 0;		
		
		for (int i = 0; i < a.length; i++) {			
			a[i] = new Random().nextInt(100);
			System.out.println(a[i]);
			if (a[i] > 35) {				
				cont++;
			}
		}

		System.out.println("Quantidade de pessoas com mais de 35 anos: " + cont);
}
}
