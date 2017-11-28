package com.tiago.cursojava.aula19.labs;

import java.util.Random;

/*Ler dois vetores A e B com 10 elementos cada. Construir um vetor C,
sendo este a junção dos dois outros vetores. Os primeiros 10
elementos de C deverão receber os elementos de A e os últimos
elementos C deverão receber os elementos de B. Desta forma, C
deverá ter o dobro de elementos de A e B, ou seja, 20 elementos.*/

public class ExercicioJava29Aula19 {

	public static void main(String[] args) {

		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[20];
		
		Random gerador = new Random();
		
		for (int i = 0; i <= 19; i++) {			
			if (i <= 9) {
				a[i] = gerador.nextInt(100);
				c[i] = a[i];
			} else if (i > 9) {
				b[19-i] = gerador.nextInt(100);
				c[i] = b[19-i];
			}			
		}
		
		for (int i = 0; i <= 19; i++)
			System.out.println(c[i]);

	}

}
