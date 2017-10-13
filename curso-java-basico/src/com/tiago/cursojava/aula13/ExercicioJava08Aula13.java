package com.tiago.cursojava.aula13;

import java.util.Scanner;

public class ExercicioJava08Aula13 {
	
	public static void main (String[] args) {
		
		//Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. calcule e mostre o total do seu salário referido no mês.
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora? ");
		double valorPorHora = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalha por mês? ");
		double horastrabalhadasPorMes = scan.nextDouble();
		
		System.out.println("O salário total do mês será: " + valorPorHora * horastrabalhadasPorMes);
		
	}

}
