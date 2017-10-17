package com.tiago.cursojava.aula17.labs;

import java.util.Scanner;

public class ExercicioJava02Aula17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu nome de usuario: ");
		String userName = scan.next();
		
		System.out.println("Digite sua senha: ");
		String senha = scan.next();
		
		while (userName.equalsIgnoreCase(senha)) {
			System.out.println("Nome de usuario não pode ser igual a senha");
			System.out.println("Digite seu nome de usuario: ");
			userName = scan.next();
			
			System.out.println("Digite sua senha: ");
			senha = scan.next();
		}
	}

}
