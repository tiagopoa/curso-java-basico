package com.tiago.cursojava.aula17.labs;

import java.util.Scanner;

public class ExercicioJava32Aula17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Especificação			Código				Preço");
		System.out.println("Cachorro Quente			100					R$ 1,20");
		System.out.println("Bauru Simples			101					R$ 1,30");
		System.out.println("Bauru com Ovo			102					R$ 1,50");
		System.out.println("Hambúrguer				103					R$ 1,20");
		System.out.println("Cheeseburguer			104					R$ 1,30");
		System.out.println("Refrigerante			105					R$ 1,00");
		
		Boolean fim = false;
		int codigo = 0;
		int q1 = 0;
		int q2 = 0;
		int q3 = 0;
		int q4 = 0;
		int q5 = 0;
		int q6 = 0;
		
		String p1 = "Cachorro Quente";
		String p2 = "Bauru Simples";
		String p3 = "Bauru com Ovo";
		String p4 = "Hambúrguer";
		String p5 = "Cheeseburguer";
		String p6 = "Refrigerante";
		
		while (fim==false) {
			
			System.out.println("Digite o código do pedido: ");
			codigo = scan.nextInt();
			
			if (codigo==0) fim = true;
			
			switch (codigo) {
			case 100: { System.out.println("Quantos? ");
						q1 = scan.nextInt();
						p1 = "Cachorro Quente";
						if (q1==0) fim = true;
						break;
						}
			case 101: { System.out.println("Quantos? ");
						q2 = scan.nextInt();
						p2 = "Bauru Simples";
						if (q2==0) fim = true;
						break;
						}
			case 102: { System.out.println("Quantos? ");
						q3 = scan.nextInt(); 
						p3 = "Bauru com Ovo";
						if (q3==0) fim = true;
						break;
						}
			case 103: { System.out.println("Quantos? ");
						q4 = scan.nextInt(); 
						p4 = "Hambúrguer";
						if (q4==0) fim = true;
						break;
						}
			case 104: { System.out.println("Quantos? ");
						q5 = scan.nextInt(); 
						p5 = "Cheeseburguer";
						if (q5==0) fim = true;
						break;
						}
			case 105: { System.out.println("Quantos? ");
						q6 = scan.nextInt(); 
						p6 = "Refrigerante";
						if (q6==0) fim = true;
						break;
						}
			}		
		}
		
		System.out.println("\n" + p1 + " X " + q1 + " = " + 1.2*q1);
		System.out.println("\n" + p2 + " X " + q2 + " = " + 1.3*q2);
		System.out.println("\n" + p3 + " X " + q3 + " = " + 1.5*q3);
		System.out.println("\n" + p4 + " X " + q4 + " = " + 1.2*q4);
		System.out.println("\n" + p5 + " X " + q5 + " = " + 1.3*q5);
		System.out.println("\n" + p6 + " X " + q6 + " = " + 1*q6);
		
	}

}
