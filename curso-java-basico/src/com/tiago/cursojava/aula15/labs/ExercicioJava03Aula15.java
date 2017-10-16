package com.tiago.cursojava.aula15.labs;

import java.util.Scanner;

public class ExercicioJava03Aula15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite o sexo (F ou M)");
		String sexo = scan.next();
		
		//System.out.println(sexo);
		
		if (sexo.equalsIgnoreCase("f")) {
			System.out.println("F - Feminino");
		} else if (sexo.equalsIgnoreCase("m")) {
			System.out.println("M - Masculino");
		} else {
			System.out.println("Sexo inválido");
		}

	}

}
