package com.tiago.cursojava.aula19;

import java.util.Random;

public class Arrays {

	public static void main(String[] args) {
		
		Random gerador = new Random();
		double soma = 0; 
		double min = -5;
		double max = 46;
		double res = 0;
		double result = 0;
		double media = 0;
		
		double[] temp = new double[365];
		
		for (int i = 0; i < temp.length; i++) {
			res = gerador.nextDouble();
			result = min + (res * (max - min));
			temp[i] = result;
			soma = soma + temp[i];
			media = soma / temp.length;
			
			System.out.println(temp[i]);
		}
		
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + media);
		
		

	}

}
