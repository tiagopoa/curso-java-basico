package com.tiago.cursojava.aula17.labs;

import java.util.Scanner;

public class ExercicioJava19Aula17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int num = 1;
		double media = 0;
		//int i = 0;
		double soma = 0;
		
		
		for (int i = 1; num > 0 ; i++) {
		System.out.println("Digite a nota: ");
		num = scan.nextInt();
		soma += num;
		media = soma / i;
		
		System.out.println(media + " = " + soma + " / " + i);
		
		System.out.println("A média dos numeros digitados é: " + media);
		
		}
		
		
		
		
	}
		

	}


