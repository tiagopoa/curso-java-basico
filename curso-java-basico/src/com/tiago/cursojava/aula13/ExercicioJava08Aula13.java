package com.tiago.cursojava.aula13;

import java.util.Scanner;

public class ExercicioJava08Aula13 {
	
	public static void main (String[] args) {
		
		//Fa�a um programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. calcule e mostre o total do seu sal�rio referido no m�s.
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto voc� ganha por hora? ");
		double valorPorHora = scan.nextDouble();
		
		System.out.println("Quantas horas voc� trabalha por m�s? ");
		double horastrabalhadasPorMes = scan.nextDouble();
		
		System.out.println("O sal�rio total do m�s ser�: " + valorPorHora * horastrabalhadasPorMes);
		
	}

}
