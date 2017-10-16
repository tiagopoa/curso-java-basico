package com.tiago.cursojava.aula15.labs;

import java.util.Scanner;

public class ExercicioJava04Aula15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra\n");
		String letra = scan.next();
		
		/*if (letra.equalsIgnoreCase("a")) {
			System.out.println("A letra digitada é uma vogal\n");
		} else if (letra.equalsIgnoreCase("e")) {
			System.out.println("A letra digitada é uma vogal\n");
		} else if (letra.equalsIgnoreCase("i")) {
			System.out.println("A letra digitada é uma vogal\n");
		} else if (letra.equalsIgnoreCase("o")) {
			System.out.println("A letra digitada é uma vogal\n");
		} else if (letra.equalsIgnoreCase("u")) {
			System.out.println("A letra digitada é uma vogal\n");
		}  else {
			System.out.println("A letra digitada é uma consoante.\n");
		}
		
		if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || 
				letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || 
				letra.equalsIgnoreCase("u")) {
			System.out.println("A letra digitada é uma vogal\n");		
		} else {
			System.out.println("A letra digitada é uma consoante\n");
		}*/
			
		if (letra.length() > 1) {
			System.out.println("Não é uma letra válida.");
		} else {
			switch (letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U": System.out.println("A letra digitada é uma vogal\n"); break;
			default: System.out.println("A letra digitada é uma consoante\n");
			}
		}
		
		

	}

}
