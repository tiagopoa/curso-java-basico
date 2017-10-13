package com.tiago.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio14Aula13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Faça um programa que peça o tamanho de um arquivo para 
		//download (em MB) e a velocidade de um link de Internet 
		//(em Mbps), calcule e informe o tempo aproximado de download 
		//do arquivo usando este link (em minutos).
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o tamanho do arquivo em MB?");
		int tamanhoArquivoEmMegaByte = scan.nextInt();
		
		System.out.println("Qual a velocidade do link de Internet em Mbps?");
		double velocidadeInternetEmMbps = scan.nextDouble();
		
		double velocidadeInternetEmKbps = velocidadeInternetEmMbps / 0.008;
		
		int tamanhoArquivoEmKiloBytes = tamanhoArquivoEmMegaByte * 1024;
		
		System.out.println("O tempo estimado de download em minutos é de: " + (tamanhoArquivoEmKiloBytes / velocidadeInternetEmKbps) / 60);
		
		

	}

}
