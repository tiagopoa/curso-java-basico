package com.tiago.cursojava.aula19.labs;

import java.util.Random;

public class ExercicioJava28Aula19 {

	public static void main(String[] args) {

		int[] a = new int[10];
		int[] b = new int[10];
		
		Random gerador = new Random();
		
		for (int i = 0; i <= 9; i++) {
			a[i] = gerador.nextInt(9);
			b[9-i] = a[i]; 
		}

		System.out.print("a[i] = ");
		for (int i = 0; i <= 9; i++) {			
			System.out.print(a[i] + ",");			
		}
		
		System.out.println();
		
		System.out.print("b[i] = ");
		for (int i = 0; i <= 9; i++) {			
			System.out.print(b[i] + ",");			
		}
		
	}

}
