package com.tiago.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio13Aula13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Fa�a um programa que pergunte quanto voce ganha por hora 
		//e o seu numero de horas trabalhadas no mes. 
		//Calcule e mostre o total do seu salario no referido mes, 
		//sabendo-se que s�o descontados 11% para o Imposto de Renda, 
		//8% para o INSS e 5% para o sindicato, fa�a um programa que 
		//nos d�:
		//a. sal�rio bruto
		//b. quanto pagou ao INSS
		//c. quanto pagou ao sindicato
		//d. sal�rio l�quido
		//Calcule os descontos e o sal�rio l�quido conforme a tabela 
		//abaixo:
		//+ Sal�rio Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato (5%) : R$ = Sal�rio L�quido : R$
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quanto voce ganha por hora");
		double valorPorHora = scan.nextDouble();
		
		System.out.println("Quantas horas voce trabalha por mes?");
		double horasTrabalhadasPorMes = scan.nextDouble();
		
		double salarioBruto = valorPorHora * horasTrabalhadasPorMes;
		
		double impostoDeRenda = salarioBruto * 11 / 100;
		
		double inss = salarioBruto * 8 / 100;
		
		double sindicato = salarioBruto * 5 / 100;
		
		double salarioLiquido = salarioBruto - impostoDeRenda - inss - sindicato;
		
		System.out.println("+ Sal�rio Bruto : R$ " + salarioBruto + "\n- IR (11%) : R$ " + impostoDeRenda + "\n- INSS (8%) : R$ " + inss + "\n- Sindicato (5%) : R$ " + sindicato + "\n= Sal�rio L�quido : R$ " + salarioLiquido);
		

	}

}
