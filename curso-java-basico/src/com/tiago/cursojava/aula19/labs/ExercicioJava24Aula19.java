package com.tiago.cursojava.aula19.labs;

import java.util.Random;

public class ExercicioJava24Aula19 {

	public static void main(String[] args) {


		int[] a = new int[3];		
		boolean palindromo = false;
		
		while (palindromo == false) {
		
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(9);	
			//System.out.println(a[i]);
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == a[a.length-i-1]) {
				palindromo = true;
			} else {
				palindromo = false;
				break;
			}
		}
		
		if (palindromo==true) {
			System.out.println("O array é um palíndromo.");
			for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);			
			}
		} else {
			System.out.println("O array NÃO é um palíndromo.");
			for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);						
			}			
		}
		
		}
	
	}
}
	


