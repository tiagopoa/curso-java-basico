package com.tiago.cursojava.aula17.labs;

import java.util.Scanner;

public class ExercicioJava05Aula17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		double paisA = 0;
		double paisB = 0;
		double taxaCrescimentoPaisA = 0;
		double taxaCrescimentoPaisB = 0;
		boolean infoValida = true;
		
		do {
		System.out.println("Digite a população do País A: ");
		paisA = scan.nextDouble();
		if (paisA > 0 ) {
			infoValida = true;
		} else if (paisA < 0 ) {
			infoValida = false;
		}
		} while (!infoValida);
		
		do {
		System.out.print("Digite a taxa de crescimento anual do país A:");
		taxaCrescimentoPaisA = scan.nextDouble();
		if (taxaCrescimentoPaisA > 0 ) {
			infoValida = true;
		} else if (taxaCrescimentoPaisA < 0 ) {
			infoValida = false;
		}
		} while (!infoValida);
		
		do {
		System.out.println("Digite a população do País B: ");
		paisB = scan.nextDouble();
		if (paisB > 0 ) {
			infoValida = true;
		} else if (paisB < 0 ) {
			infoValida = false;
		} 
		} while (!infoValida);
		
		do {
		System.out.print("Digite a taxa de crescimento anual do país B:");
		taxaCrescimentoPaisB = scan.nextDouble();
		if (taxaCrescimentoPaisB > 0 ) {
			infoValida = true;
		} else if (taxaCrescimentoPaisB < 0 ) {
			infoValida = false;
		}
		} while (!infoValida);
		
				
		int cont = 0;	
		
		while (paisA <= paisB) {
			paisA = paisA + (paisA * taxaCrescimentoPaisA) / 100;
			paisB = paisB + (paisB * taxaCrescimentoPaisB) / 100;
			cont++;
		}
		
		System.out.println("Em " + cont + " anos o País A igualará ou ultrapassará a população do País B");
		
		System.out.println("População PaisA: " + paisA);
		System.out.println("População PaisB: " + paisB);
		

	}




	}

