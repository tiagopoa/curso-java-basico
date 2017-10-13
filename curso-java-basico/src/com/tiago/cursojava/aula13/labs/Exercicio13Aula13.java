package com.tiago.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio13Aula13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Faça um programa que pergunte quanto voce ganha por hora 
		//e o seu numero de horas trabalhadas no mes. 
		//Calcule e mostre o total do seu salario no referido mes, 
		//sabendo-se que são descontados 11% para o Imposto de Renda, 
		//8% para o INSS e 5% para o sindicato, faça um programa que 
		//nos dê:
		//a. salário bruto
		//b. quanto pagou ao INSS
		//c. quanto pagou ao sindicato
		//d. salário líquido
		//Calcule os descontos e o salário líquido conforme a tabela 
		//abaixo:
		//+ Salário Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato (5%) : R$ = Salário Líquido : R$
		
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
		
		System.out.println("+ Salário Bruto : R$ " + salarioBruto + "\n- IR (11%) : R$ " + impostoDeRenda + "\n- INSS (8%) : R$ " + inss + "\n- Sindicato (5%) : R$ " + sindicato + "\n= Salário Líquido : R$ " + salarioLiquido);
		

	}

}
