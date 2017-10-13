package com.tiago.cursojava.aula13;

import java.util.Scanner;

public class ExercicioJava04Aula13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Faça um programa que peça 4 notas bimestrais e mostre a média
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a nota do primeiro bimestre: ");
		int nota1 = scan.nextInt();
		
		System.out.println("Digite a nota do primeiro bimestre: ");
		int nota2 = scan.nextInt();
		
		System.out.println("Digite a nota do primeiro bimestre: ");
		int nota3 = scan.nextInt();
		
		System.out.println("Digite a nota do primeiro bimestre: ");
		int nota4 = scan.nextInt();
		
		int media = ( nota1 + nota2 + nota3 + nota4 ) / 4;
		
		System.out.println("A média dos 4 bimestres é: " + media);

	}

}
