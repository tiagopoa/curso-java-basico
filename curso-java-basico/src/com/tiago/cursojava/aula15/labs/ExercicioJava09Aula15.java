package com.tiago.cursojava.aula15.labs;

import java.util.Scanner;

public class ExercicioJava09Aula15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int num2 = scan.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		int num3 = scan.nextInt();
		
		int maior = 0;
		int menor = 0;
		int meio = 0;
		
		if (num1 >= num2 && num1 >= num3) {
			maior = num1;
		} else if (num2 >= num1 && num2 >= num3) {
			maior = num2;
		} else if (num3 >= num2 && num3 >= num1) {
			maior = num3;
		}
		
		if (num1 <= num2 && num1 <= num3) {
			menor = num1;
		} else if (num2 <= num1 && num2 <= num3) {
			menor = num2;
		} else if (num3 <= num2 && num3 <= num1) {
			menor = num3;
		}
		
		if ((num1 >= num2 && num1 <= num3) || (num1 >= num3 && num1 <= num2)) {
			meio = num1;
		} else if ((num2 >= num1 && num2 <= num3) || (num2 >= num3 && num2 <= num1)){
			meio = num2;
		} else if ((num3 >= num2 && num3 <= num1) || (num3 >= num1 && num3 <= num2)){
			meio = num3;
		}
		
		System.out.print("A ordem decrescente dos números digitados é: \n");
		System.out.println("" + maior + "\n" + meio + "\n" + menor);

	}

}
