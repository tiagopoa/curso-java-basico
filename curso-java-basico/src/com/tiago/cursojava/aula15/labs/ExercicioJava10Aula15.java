package com.tiago.cursojava.aula15.labs;

import java.util.Scanner;

public class ExercicioJava10Aula15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Em qual turno voce estuda? \nM - Matutino\nV- Vespertino\nN - Noturno");
		char turno = scan.next().charAt(0);
		
		if (turno == 'm' || turno == 'M') {
			System.out.println("Bom dia!");
		} else if (turno == 'v' || turno == 'V') {
			System.out.println("Boa tarde!");
		} else if (turno == 'n' || turno == 'N') {
			System.out.println("Boa noite!");
		} else {
			System.out.println("Valor inválido");
		}

	}

}
