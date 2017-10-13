package com.tiago.cursojava.aula13;

import java.util.Scanner;

public class ExercicioJava05Aula13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//faça um programa que converta metros para centimetros
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quantos metros para converter para centimetros");
		double metros = scan.nextDouble();
		
		int centimetros = (int) (metros * 100);
		
		System.out.println("A quantidade de centimetros é: " + centimetros);

	}

}
