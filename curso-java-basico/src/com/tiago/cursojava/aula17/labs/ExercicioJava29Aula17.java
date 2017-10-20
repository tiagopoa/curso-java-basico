package com.tiago.cursojava.aula17.labs;

import java.util.Scanner;

public class ExercicioJava29Aula17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um numero para saber se ele é primo: ");
		int num = scan.nextInt();
		
		for (int i = 1; i <= num; i++) {
		
			boolean primo = true;
			
		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				//System.out.println("Não é primo - divisível por " + i);
				primo = false;
			}
		}
		
		if (primo) {
			System.out.println(i);
		}

	}

}
}
