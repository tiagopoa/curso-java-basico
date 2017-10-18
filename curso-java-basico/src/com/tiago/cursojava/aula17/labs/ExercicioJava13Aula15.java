package com.tiago.cursojava.aula17.labs;

import java.util.Scanner;

public class ExercicioJava13Aula15 {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int resultado = 0;
		
		System.out.println("Digite o numero base: ");
		int base = scan.nextInt();
		
		System.out.println("Digite o numero de potencia: ");
		int potencia = scan.nextInt();
		
		resultado = base;
		
		System.out.println(base + " elevado a " + potencia);
		
		for (int i = 1; i <= (potencia - 1); i++) {
			System.out.println("base: " + base + " x " + resultado + " = " + base * resultado);
			resultado = base * resultado;
			
		}
	
		
	}

}
