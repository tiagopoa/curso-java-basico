package com.tiago.cursojava.aula17.labs;

import java.util.Scanner;

public class ExercicioJava03Aula17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = scan.next();
		
		while (nome.length() < 4) {
			System.out.println("Nome deve conter mais de 3 caracteres");
			System.out.println("Digite seu nome: ");
			nome = scan.next();			
		}
		
		System.out.println("Idade: ");
		int idade = scan.nextInt();
		
		while (idade < 0 || idade > 150) {
			System.out.println("Idade deve ser entre 0 e 150");
			System.out.println("Idade: ");
			idade = scan.nextInt();			
		}
		
		System.out.println("Salario: ");
		double salario = scan.nextDouble();
		
		while (salario < 0) {
			System.out.println("Salario deve ser maior que zero");
			System.out.println("Salario: ");
			salario = scan.nextDouble();			
		}
		
		System.out.println("Sexo: ");
		String sexo = scan.next();
		
		while (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) {
			System.out.println("Sexo inválido\nDigitar M ou F");
			System.out.println("Sexo: ");
			sexo = scan.next();
		}
		
		System.out.println("Estado Civil: ");
		String estadoCivil = scan.next();
		
		while (!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c") && !estadoCivil.equalsIgnoreCase("v") && !estadoCivil.equalsIgnoreCase("d")) {
			System.out.println("Estado Civil inválido inválido\nDigitar s, c, v ou d");
			System.out.println("Estado Civil: ");
			estadoCivil = scan.next();
		}
		
		
		

		

		

		
		
		
		
		

	}

}
