package com.tiago.cursojava.aula13.labs;

import java.util.Scanner;

public class ExercicioJava06Aula13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		float A, r;
		
		System.out.println("digite o raio do circulo: ");
		r = scan.nextFloat();
		
		float pi = (float) 3.1416;
		
		double quadrado = Math.pow(r, 2);
		
		A = (float) (pi * quadrado);
		
		System.out.println("A area do circulo é de: " + A);

	}

}
