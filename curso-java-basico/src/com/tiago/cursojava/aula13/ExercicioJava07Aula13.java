package com.tiago.cursojava.aula13;

import java.util.Scanner;

public class ExercicioJava07Aula13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Fa�a um programa que calcule a area de um quadrado, em seguida mostre o dobro desta area para o usu�rio.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do lado do quadrado: ");
		int lado = scan.nextInt();
		
		int A = (int) Math.pow(lado, 2);
		
		int resultado = A * 2;
		
		System.out.println("O dobro da area do quadrado �: " + resultado);
	}

}
