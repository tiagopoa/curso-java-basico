package com.tiago.cursojava.aula13;

import java.util.Scanner;

public class Exercicio10Aula13 {
	
	//Fa�a um programa que pe�a a temperatura em graus Celsius, transforme e mostre em graus Farenheit.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual � a temperatura em graus Celsius? ");
		double temperaturaCelsius = scan.nextDouble();
		
		double temperaturaFarenheit = (temperaturaCelsius / 5) * 9 + 32;
		
		System.out.println("A temperatura em graus Farenheit �: " + temperaturaFarenheit);

	}

}
