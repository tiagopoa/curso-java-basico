package com.tiago.cursojava.aula15.labs;

import java.util.Scanner;

public class ExercicioJava11Aula15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Organizações Tabajara\nPrograma de reajuste de salário\ndigite o salário do colaborador");
		double salario = scan.nextDouble();

		double novoSalario = 0;
		double valorAumento = 0;
		int percentual = 0;
		
		if (salario <= 280) {
			percentual = 20;
			valorAumento = (salario*percentual/100);
			novoSalario = salario + valorAumento;			
		} else if (salario > 280 && salario < 700) {
			percentual = 15;
			valorAumento = (salario*percentual/100);
			novoSalario = salario + valorAumento;			
		} else if (salario >= 700 && salario < 1500) {
			percentual = 10;
			valorAumento = (salario*percentual/100);
			novoSalario = salario + valorAumento;			
		} else if (salario >= 1500) {
			percentual = 5;
			valorAumento = (salario*percentual/100);
			novoSalario = salario + valorAumento;			
		}
		
		System.out.println("Salário antes do reajuste: " + salario + "\nPercentual de aumento aplicado : " + percentual + "\nValor do aumento: " + valorAumento + "\nNovo Salário: " + novoSalario);

	}

}
