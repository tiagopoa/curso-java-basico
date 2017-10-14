package com.tiago.cursojava.aula15.labs;

import java.util.Scanner;

public class ExercicioJava20Aula15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int contador = 0;
		int resposta = 0;
		
		System.out.println("Telefonou para a vitima?\n1 - SIM\n2 - NAO");
		resposta = scan.nextInt();
		if (resposta == 1 ) {
			contador++;
		}
		
		System.out.println("esteve no local do crime?\n1 - SIM\n2 - NAO");
		resposta = scan.nextInt();
		if (resposta == 1 ) {
			contador++;
		}
		
		System.out.println("Mora perto da vitima?\n1 - SIM\n2 - NAO");
		resposta = scan.nextInt();
		if (resposta == 1 ) {
			contador++;
		}
		
		System.out.println("Devia para a vitima?\n1 - SIM\n2 - NAO");
		resposta = scan.nextInt();
		if (resposta == 1 ) {
			contador++;
		}
		
		System.out.println("Ja trabalhou com a vitima?\n1 - SIM\n2 - NAO");
		resposta = scan.nextInt();
		if (resposta == 1 ) {
			contador++;
		}
		
		System.out.println(contador);
		
		switch (contador) {
		case 1: System.out.println("INOCENTE"); break;
		case 2: System.out.println("SUSPEITO"); break;
		case 3: System.out.println("CUMPLICE"); break;
		case 4: System.out.println("CUMPLICE"); break;
		case 5: System.out.println("ASSASSINO"); break;
		}
		
		
		

	}

}
