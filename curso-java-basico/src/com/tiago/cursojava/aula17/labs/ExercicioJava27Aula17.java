package com.tiago.cursojava.aula17.labs;

import java.util.Scanner;

public class ExercicioJava27Aula17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*O Departamento Estadual de Meteorologia lhe contratou para
		desenvolver um programa que leia as um conjunto indeterminado de
		temperaturas, e informe ao final a menor e a maior temperaturas
		informadas, bem como a média das temperaturas.*/
		
		Scanner scan = new Scanner(System.in);
		
		double temp = 0;
		int i = 1;
		double menor = Integer.MAX_VALUE;
		double maior = Integer.MIN_VALUE;
		double media = 0;
		double soma = 0;
		
		while (temp != 2000) {
		System.out.println("Temperatura " + i + ": ");
		temp = scan.nextDouble();
		if (temp < menor && temp != 2000) {
			menor = temp;
			soma += temp;
			media = soma / i;
			i++;
		} else if (temp > maior && temp != 2000) {
			maior = temp;
			soma += temp;
			media = soma / i;
			i++;
		}
		
		}
		
		System.out.println("");
		System.out.println("Maior temperatura: " + maior);
		System.out.println("Menor temperatura: " + menor);
		System.out.println("Média: " + media);
		

	}

}
