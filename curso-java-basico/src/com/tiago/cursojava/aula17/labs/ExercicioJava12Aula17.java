package com.tiago.cursojava.aula17.labs;

import java.util.Scanner;

public class ExercicioJava12Aula17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("De qual numero deseja ver a tabuada? ");
		int num = scan.nextInt();
		
		System.out.println("Tabuada de " + num);
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
			
		}

	}

}
