package com.tiago.cursojava.aula15.labs;

import java.util.Scanner;

public class ExercicioJava17Aula15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o ano: ");
		int ano = scan.nextInt();
		
		if ( ano % 4 == 0  ) {
			if ( ano % 100 != 0) {
					System.out.println("Ano bissexto");
				} else if ( ano % 400 != 0) {
				System.out.println("Ano não bissexto");
			} else {
				System.out.println("Ano bissexto");
			}
		} else {
			System.out.println("Ano não bissexto");
		}
	}
	}



