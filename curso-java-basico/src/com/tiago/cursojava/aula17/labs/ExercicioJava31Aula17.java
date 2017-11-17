package com.tiago.cursojava.aula17.labs;

import java.util.Scanner;

public class ExercicioJava31Aula17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int anoContratacao = 1995;
		double salarioInicial = 1000;
		double reajuste = 1.5;
		double salarioAtual = 0;
				
		for (int i = anoContratacao; i <= 2017; i++) {
			salarioAtual = salarioInicial+(salarioInicial*reajuste/100);		
			reajuste = reajuste *2;
		}
		
		System.out.println("Salário atual em 2017: " + salarioAtual);

	}

}
