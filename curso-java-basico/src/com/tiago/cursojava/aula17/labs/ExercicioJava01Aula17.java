package com.tiago.cursojava.aula17.labs;

import java.util.Scanner;

public class ExercicioJava01Aula17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira uma nota de zero a 10: ");
		int nota = scan.nextInt();
		
		while (nota < 0 || nota > 10) {
			System.out.println("Insira uma nota de zero a 10: ");
			nota = scan.nextInt();
		}

	}

}
