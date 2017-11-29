package com.tiago.cursojava.aula19.labs;

import java.util.Random;

public class ExercicioJava36Aula19 {
	
	/*Criar um vetor A com 11 elementos, indexados de 0 at� 10. Sendo que
	cada elemento do vetor A � formado pela pot�ncia de base 2 elevado
	ao expoente igual a posi��o do respectivo elemento, ou seja:
	A[i] = 2i. Sugest�o int A[11];*/

	public static void main(String[] args) {

		int[] a = new int[11];
		
		Random gerador = new Random();
		
		for (int i = 0; i <= 10; i++) {
			a[i] = (int) Math.pow(2, i);
		}

		
		for (int i = 0; i <= 10; i++) {
			System.out.println(a[i]);
		}
		
	}

}
