package com.tiago.cursojava.aula19.labs;

import java.util.Random;

public class ExercicioJava27Aula19 {

	public static void main(String[] args) {

		int[] a = new int[10];
		char[] b = new char[10];		
		
		Random gerador = new Random();
		
		for (int i = 0; i <=9; i++) {
			a[i] = gerador.nextInt(20);
			
			//System.out.println("a[i] = " + a[i]);
			
			if(a[i] < 7) {
				b[i] = 'a';
			} else if (b[i] == 7) {
				b[i] = 'b';
			} else if (a[i] > 7 && a[i] < 10) {
				b[i] = 'c';
			} else if (a[i] == 10) {
				b[i] = 'd';
			} else if (a[i] > 10) {
				b[i] = 'e';
			}
			
			System.out.println(b[i]);
		}
		

	}

}
