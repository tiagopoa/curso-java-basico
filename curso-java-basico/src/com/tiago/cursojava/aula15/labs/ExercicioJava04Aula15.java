package com.tiago.cursojava.aula15.labs;

import java.util.Scanner;

public class ExercicioJava04Aula15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra\n");
		char letra = scan.next().charAt(0);
		
		if (letra == 'a' || letra == 'A') {
			System.out.println("A letra digitada é uma vogal\n");
		} else if (letra == 'e' || letra == 'E') {
			System.out.println("A letra digitada é uma vogal\n");
		} else if (letra == 'i' || letra == 'I') {
			System.out.println("A letra digitada é uma vogal\n");
		} else if (letra == 'o' || letra == 'O') {
			System.out.println("A letra digitada é uma vogal\n");
		} else if (letra == 'u' || letra == 'U') {
			System.out.println("A letra digitada é uma vogal\n");
		}  else {
			System.out.println("A letra digitada é uma consoante.\n");
		}

	}

}
