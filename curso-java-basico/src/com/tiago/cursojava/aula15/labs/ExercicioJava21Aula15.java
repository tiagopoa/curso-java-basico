package com.tiago.cursojava.aula15.labs;

import java.util.Scanner;

public class ExercicioJava21Aula15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int desconto = 0;
		//double gasolina = 4;
		//double alcool = 3.5;
		double valorLitro = 0;
		
		System.out.println("Qual combustível?\nA - Alcool\nG - Gasolina ");
		char combustivel = scan.next().charAt(0);
		
		System.out.println("Digite a quantidade de litros: ");
		int litros = scan.nextInt();

		if (combustivel == 'a' || combustivel == 'A') {
			valorLitro = 3.5;
			if (litros <= 20) {
			    desconto = 3;
			} else if (litros > 20) {
				desconto = 5;
			}
		} else if (combustivel == 'g' || combustivel == 'G') {
			valorLitro = 4;
			if (litros <= 20) {
			    desconto = 4;
			} else if (litros > 20) {
				desconto = 6;
			} 
		}
			double valorTotal = litros * (valorLitro - ((valorLitro * desconto) / 100));
			
			System.out.println("Valor a pagar: R$" + valorTotal);
	}
}

