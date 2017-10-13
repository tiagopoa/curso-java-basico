package com.tiago.cursojava.aula13.labs;

import java.util.Scanner;

public class ExercicioJava09Aula13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Faça um programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus celsius.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual a temperatura em graus Farenheit? ");
		double temperaturaFarenheit = scan.nextDouble();
		
		double celsius = ( 5 * ( temperaturaFarenheit - 32 ) / 9 );
		
		System.out.println("A temperatura em graus Celsius é: " + celsius);

	}

}
