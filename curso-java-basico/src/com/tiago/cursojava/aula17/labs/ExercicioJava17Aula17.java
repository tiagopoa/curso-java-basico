package com.tiago.cursojava.aula17.labs;

import java.util.Scanner;

public class ExercicioJava17Aula17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero para calcular o fatorial: ");
		int num = scan.nextInt();
		int fat = 0;
		int res = 0;
		
		res = num;
		
		for (int i = 1; i < num; i++) {
			System.out.println("Fat " + res + " x " + (num - i) + " = " + (res*(num-i)));
			fat = res * (num - i);
			res = fat;
		}
		
		System.out.println("Fatorial de " + num + " é " + res);

	}

}
