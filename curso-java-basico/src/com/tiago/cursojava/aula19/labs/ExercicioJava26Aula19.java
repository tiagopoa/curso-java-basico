package com.tiago.cursojava.aula19.labs;

import java.util.Random;

public class ExercicioJava26Aula19 {

	public static void main(String[] args) {

		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		
		Random gerador = new Random();
		
		for(int i = 0; i <=9; i ++) {
			a[i] = gerador.nextInt(5);
			b[i] = gerador.nextInt(5);
			
			System.out.println("a[i] = " + a[i]);
			System.out.println("b[i] = " + b[i]);
			
			if(a[i] > b[i]) {
				c[i] = 1;
			} else if (a[i] == b[i]) {
				c[i] = 0;
			} else if (a[i] < b[i]) {
				c[i] = -1;
			}
			
			System.out.println(c[i]);
		}

	}

}
