package com.tiago.cursojava.aula19.labs;

import java.util.Random;

public class ExercicioJava23Aula19 {

	public static void main(String[] args) {

		int[] a = new int[10];
		
		for (int i = 0; i < a.length; i ++) {
			a[i] = new Random().nextInt();
			System.out.println(a[i]);
			
			if (a[i] % 2 != 0) {
				break;
			}
			
			System.out.println(i);
			
		}

	}

}
