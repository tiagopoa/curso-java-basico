package com.tiago.cursojava.aula13;

import java.util.Scanner;

public class ExercicioJava07Aula13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Faça um programa que calcule a area de um quadrado, em seguida mostre o dobro desta area para o usuário.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do lado do quadrado: ");
		int lado = scan.nextInt();
		
		int A = (int) Math.pow(lado, 2);
		
		int resultado = A * 2;
		
		System.out.println("O dobro da area do quadrado é: " + resultado);
	}

}
