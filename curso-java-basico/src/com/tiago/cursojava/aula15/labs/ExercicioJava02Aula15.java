package com.tiago.cursojava.aula15.labs;

import java.util.Scanner;

public class ExercicioJava02Aula15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite um numero");
		int num = scan.nextInt();
		
		if (num >= 0) {
		System.out.println("O numero digitado é positivo.");
		} else { 
			System.out.println("O numero digitado é negativo.");
		}

	}

}
