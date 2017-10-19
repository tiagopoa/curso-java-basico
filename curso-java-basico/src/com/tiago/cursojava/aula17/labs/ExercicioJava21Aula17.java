package com.tiago.cursojava.aula17.labs;

import java.util.Scanner;

public class ExercicioJava21Aula17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantas turmas?");
		int turmas = scan.nextInt();
		int alunos = 1;
		int soma = 0;
		double media = 0;
		
		for (int i = 1; i <= turmas; i++) {
			
			System.out.println("Informe a quantidade de alunos para a turma " + i);
			alunos = scan.nextInt();
			
			if (alunos > 40 || alunos < 0) {
				System.out.println("Informe a quantidade de alunos entre 1 e 40 no maximo");
				i--;
			} else {
				soma += alunos;
				media = soma / i;
			}
		}
		System.out.println("A média de alunos por turma é de " + media);

	}

}
