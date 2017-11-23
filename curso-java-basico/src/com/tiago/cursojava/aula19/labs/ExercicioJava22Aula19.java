package com.tiago.cursojava.aula19.labs;

public class ExercicioJava22Aula19 {

	public static void main(String[] args) {

		int[] a = new int[10];
		int cont0 = 0;
		int cont1 = 0;
		double percentual0 = 0;
		double percentual1 = 0;
		
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) Math.round(Math.random() * 1);
			System.out.println(a[i]);
		
		if (a[i] == 0) {
			cont0++;
			percentual0 = cont0 * 100 / a.length;
		} else if (a[i] == 1) {
			cont1++;
			percentual1 = cont1 * 100 / a.length;
		}
		
	}
		
		System.out.println("Percentual de 0: " + percentual0);
		System.out.println("Percentual de 1: " + percentual1);
	
		
	
	}
}
