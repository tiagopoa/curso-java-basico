package com.tiago.cursojava.aula17.labs;

import java.util.Scanner;

public class ExercicioJava20Aula17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int idade = 0;
		double media = 0;
		int soma = 0;
		
		for (int i = 1; ; i++) {
		System.out.println("Digite a sua idade: ");
		idade = scan.nextInt();
		soma += idade;
		media = soma / i;
		
		System.out.println("A m�dia est� em " + media);
		
			if (media > 0 && media <= 25) {
				System.out.println("M�dia da popula��o: Jovem");
			} else if (media > 25 && media <= 60) {
				System.out.println("M�dia da popula��o: Adulta");
			} else if (media > 60) {
				System.out.println("M�dia da popula��o: Idosa");
			}
		
		}
		
		
		
		}

	}


