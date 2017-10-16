package com.tiago.cursojava.aula15.labs;

import java.util.Scanner;

public class ExercicioJava10Aula15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Em qual turno voce estuda? \nM - Matutino\nV- Vespertino\nN - Noturno");
		String turno = scan.next();
		
		if (turno.length() > 1) {
			System.out.println("Turno digitado inválido");
		} else if (turno.equalsIgnoreCase("m")) {
			System.out.println("Bom dia!");
		} else if (turno.equalsIgnoreCase("v")) {
			System.out.println("Boa tarde!");
		} else if (turno.equalsIgnoreCase("n")) {
			System.out.println("Boa noite!");
		} else {
			System.out.println("Valor inválido");
		}
	

	}

}
