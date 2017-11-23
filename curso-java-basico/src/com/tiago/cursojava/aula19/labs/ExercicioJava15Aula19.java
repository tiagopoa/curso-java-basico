package com.tiago.cursojava.aula19.labs;

import java.util.Random;

public class ExercicioJava15Aula19 {

	public static void main(String[] args) {

		int[] a = new int[10];
		double impar = 0;
		double par = 0;
		
		Random gerador = new Random();
		
		for (int i = 0; i < a.length; i++) {
			a[i] = gerador.nextInt();
			if (a[i] % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}		
		
		par = par * 100 / a.length;
		impar = impar * 100 / a.length;
		
		System.out.println("Porcentagem de numeros pares no vetor: " + par);
		System.out.println("Porcentagem de numeros pares no vetor: " + impar);
		

		//System.out.println("Média aritmetica simples dos elementos impares armazenados neste vetor: " + soma);

	}

}
