package com.tiago.cursojava.aula15.labs;

import java.util.Scanner;

public class ExercicioJava14Aula15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota do aluno: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		String conceito = "";
		
		if (media > 9 ) {
			conceito = "A";
		} else if (media > 7.5 && media <= 9) {
			conceito = "B";
		} else if (media > 6 && media <= 7.5) {
			conceito = "C";
		} else if (media > 4 && media <= 6) {
			conceito = "D";
		} else if (media > 0 && media <= 4) {
			conceito = "E";
		}
		
		if (conceito == "A" || conceito == "B" || conceito == "C") {
			System.out.println("APROVADO");
		} else {
			System.out.println("REPROVADO");
		}
		

	}

}
