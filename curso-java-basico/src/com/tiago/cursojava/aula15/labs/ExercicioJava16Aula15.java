package com.tiago.cursojava.aula15.labs;

import java.util.Scanner;

public class ExercicioJava16Aula15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);		
		
		System.out.println("Calculadora de raizes de equação do segundo grau\nax2 + bx + c\n");
		
		System.out.println("Digite o valor para A");
		int a = scan.nextInt();
		
		int b = 0;
		int c = 0;
		
		if (a == 0) {
			System.out.println("A equação não é de segundo grau. programa encerrado.");
		} else {
			System.out.println("Digite o valor para B");
			b = scan.nextInt();
		
			System.out.println("Digite o valor para C");
			c = scan.nextInt();			
		}
		
		int delta = (int) ( -b + Math.sqrt((Math.pow(b, 2)-4*a*c ))) / 2*a;
		
		if ( delta < 0 ) {
			 System.out.println("O delta calculado é negativo, a equação não possui raízes reais. Programa encerrado");
		} else if ( delta == 0 ){	
			System.out.println("O delta encontrado possui apenas uma raiz real que é: " + delta);
		} else if ( delta > 0 ) {
			int delta2 = (int) ( -b - Math.sqrt((Math.pow(b, 2)-4*a*c))) / 2*a;
			System.out.println("O delta encontrado possui duas raízes reais: \nRaiz 1: " + delta + "\nRaiz 2: " + delta2);
		}
	}

}
