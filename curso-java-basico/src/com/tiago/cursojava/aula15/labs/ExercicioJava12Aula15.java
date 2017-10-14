package com.tiago.cursojava.aula15.labs;

import java.util.Scanner;

public class ExercicioJava12Aula15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o valor da hora trabalhada? ");
		double valorHoraTrabalhada = scan.nextDouble();
		
		System.out.println("Quantidade de horas trabalhadas no mês? ");
		double quantidadeHorasTrabalhadasMes = scan.nextDouble();
				
		double salarioBruto = valorHoraTrabalhada * quantidadeHorasTrabalhadasMes;
		
		int percentualImpostoRenda = 0;
		int percentualInss = 10;
		int percentualFgts = 11;
		double impostoRenda = 0;
		
		if (salarioBruto <= 900) {
			percentualImpostoRenda = 0;
		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
			percentualImpostoRenda = 5;
			impostoRenda = salarioBruto * percentualImpostoRenda / 100;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			percentualImpostoRenda = 10;
			impostoRenda = salarioBruto * percentualImpostoRenda / 100;
		} else if (salarioBruto > 2500) {
			percentualImpostoRenda = 20;
			impostoRenda = salarioBruto * percentualImpostoRenda / 100;
		}
					
		double descontoInss = salarioBruto * 0.1;
		double descontoFgts = salarioBruto * 0.11;
		double totalDescontos = impostoRenda + descontoInss;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salário Bruto: (" + quantidadeHorasTrabalhadasMes + " * " + valorHoraTrabalhada + ")          : R$ " + salarioBruto);
		System.out.println("(-) IR (" + percentualImpostoRenda + "%)          : R$ " + impostoRenda);
		System.out.println("(-) INSS (" + percentualInss + "%)          : R$ " + descontoInss);
		System.out.println("FGTS (" + percentualFgts + "%)          : R$ " + descontoFgts);
		System.out.println("Total de descontos          : R$ " + totalDescontos);
		System.out.println("Salário Líquido          : R$ " + salarioLiquido);
	}

}
