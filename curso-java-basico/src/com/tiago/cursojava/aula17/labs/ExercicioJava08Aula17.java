package com.tiago.cursojava.aula17.labs;

import java.util.Scanner;

public class ExercicioJava08Aula17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int i = 0;
		double soma = 0, media =0;
		
		do {
		System.out.println("Digite um numero: ");
		 num = scan.nextInt();
		 soma += num;
		i++;
		} while (i < 5);
		
		media = soma / i;
		
		System.out.println("A soma dos números é: " + soma);
		System.out.println("A média dos números é: " + media);
		

	}

}
