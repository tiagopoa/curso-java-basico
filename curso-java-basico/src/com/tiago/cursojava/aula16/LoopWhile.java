package com.tiago.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1; //contador
		int max = 10;
		
		System.out.println("Contando até " + max);
		
		while (i <= max) {
			System.out.println(i);
			i++; // i = i + 1; ou i += 1;
		}
		
		System.out.println(i); //valor de 11
		
		do {
			i++;
			System.out.println("Valor de i: " + i);
		} while (i < 15);
		
		System.out.println("Valor de i: " + i);
	}

}
