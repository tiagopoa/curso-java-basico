package com.tiago.cursojava.aula15.labs;

import java.util.Scanner;

public class ExercicioJava15Aula15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do primeiro lado do triangulo");
		double lado1 = scan.nextDouble();
		
		System.out.println("Digite o tamanho do segundo lado do triangulo");
		double lado2 = scan.nextDouble();
		
		System.out.println("Digite o tamanho do terceiro lado do triangulo");
		double lado3 = scan.nextDouble();
		
		if (((lado1 + lado2) > lado3 && lado3 >= (lado1 + lado2 - lado3)) || ((lado2 + lado3) > lado1 && lado1 >= (lado2 + lado3 - lado1)) || ((lado3 + lado1) > lado2 && lado2 >= (lado3 + lado1 - lado2))) {
			if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				System.out.println("Equilátero");
			} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("Escaleno");
			} else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
					System.out.println("Isósceles");
			} 
		} else {
			System.out.println("Os valores informados não formam um triangulo.");
			}

	}

}
