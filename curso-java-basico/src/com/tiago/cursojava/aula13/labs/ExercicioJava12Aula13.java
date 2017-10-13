package com.tiago.cursojava.aula13.labs;

import java.util.Scanner;

public class ExercicioJava12Aula13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tendo como os dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte formula:
		//(72.7*altura)-58
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calculadora de peso ideal");
		System.out.println("Digite sua altura:");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7*altura)-58;
		
		System.out.println("Seu peso ideal é: " + pesoIdeal);

	}

}
