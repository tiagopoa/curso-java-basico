package com.tiago.cursojava.aula20.labs;

import java.util.Random;

public class ExercicioJava01Aula20 {
	
	/*Gere e imprima uma matriz M 4x4 com valores aleat�rios entre 0-
9. Ap�s isso determine o maior n�mero da matriz e a sua posi��o
(linha, coluna).*/

	public static void main(String[] args) {

		int [][] m = new int[4][4];
		int linha = 0;
		int coluna = 0;
		int maior = Integer.MIN_VALUE;
		
		Random gerador = new Random();
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = gerador.nextInt(9);
			}
		}
		
		for (int i = 0; i < m.length; i++) {
			System.out.println(" ");
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j]);
				
				if (m[i][j] > maior) {
					maior = m[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		
		System.out.println("\n\nO maior numero � o: " + maior + " e foi encontrado na posi��o: linha " + (linha+1) + " coluna " + (coluna+1));

	}

}
