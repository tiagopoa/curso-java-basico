package com.tiago.cursojava.aula17.labs;

import java.util.Scanner;

public class ExercicioJava16Aula17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		//System.out.println("Digite o elemento Fibonacci que deseja saber: ");
		//int nTermoFibo = scan.nextInt();
		int fibo = 0;
		int fibo1 = 1;
		int fibo2 = 0;
		
		
			do {
				//System.out.println("Entrou no loop");
				fibo = fibo1 + fibo2;
				fibo1 = fibo2;
				fibo2 = fibo;
				//System.out.println("Fibo: " + fibo);
			} while (fibo <= 500);
		
			System.out.println("Sequencia Fibonacci para o elemento " + " é: " + fibo);
	
	}
		

	}


