package com.tiago.cursojava.aula17.labs;

import java.util.Scanner;

public class ExercicioJava30Aula17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Montar a tabuada de: ");
		int num = scan.nextInt();
		
		System.out.println("Começar em: ");
		int inicio = scan.nextInt();
		
		System.out.println("Terminar em: ");
		int fim = scan.nextInt();
		
		while (fim<inicio) {
			System.out.println("O valor deve ser maior que o inicio\nTerminar em: ");
			fim = scan.nextInt();
		}
		
		System.out.println("Vou montar a tabuada de "+ num + " começando em " + inicio + " e terminando em " + fim + ": ");
		
		for (int i = inicio; i <= fim; i++) {
			System.out.println(num + " X " + i + " = " + num*i);
		}

	}

}
