package com.tiago.cursojava.aula15.labs;

import java.util.Scanner;

public class ExercicioJava22Aula15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		double valorMorango = 0;
		double valorMaca = 0;
		double valorTotalCompra = 0;
		
		System.out.println("Fruteira Tabajara\n               Até 5kg               Acima de 5kg\nMorango      R$ 2,50 por kg          R$ 2,20 por kg\nMaçã         R$ 1,80 por kg          R$ 1,50 por kg");
		System.out.println("Quantos kg de Morango?");
		int kgMorango = scan.nextInt();
		
		System.out.println("Quantos kg de Maçã?");
		int kgMaca = scan.nextInt();
		
		if (kgMorango <= 5) {
			valorMorango = 2.5;
		} else if (kgMorango > 5) {
			valorMorango = 2.2;
		}
		
		if (kgMaca <= 5) {
			valorMaca = 1.8;
		} else if (kgMaca > 5) {
			valorMaca = 1.5;
		}
		
		double valorTotalMorango = kgMorango * valorMorango;
		double valorTotalMaca = kgMaca * valorMaca;
		
		double valorCompra = valorTotalMaca + valorTotalMorango;
		
		if (kgMaca + kgMorango > 8 || valorCompra > 25) {
			valorTotalCompra = valorCompra - ((valorCompra * 10) / 100);
		} else {
			valorTotalCompra = valorCompra;
		}
		
		System.out.println("Valor total a pagar: R$" + valorTotalCompra);

	}

}
