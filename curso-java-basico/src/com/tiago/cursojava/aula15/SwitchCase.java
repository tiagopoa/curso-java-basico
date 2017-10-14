package com.tiago.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um dia da semana (1-7)");
		
		int diaSemana = scan.nextInt();
		
		/*if (diaSemana == 1) {
			System.out.println("domingo");
		} else if (diaSemana == 2) {
			System.out.println("segunda");
		} else if (diaSemana == 3) {
			System.out.println("terça");
		} else if (diaSemana == 4) {
			System.out.println("quarta");
		} else if (diaSemana == 5) {
			System.out.println("quinta");
		} else if (diaSemana == 6) {
			System.out.println("sexta");
		} else if (diaSemana == 7) {
			System.out.println("sabado");
		} else {
			System.out.println("não é um dia de semana");
		}

		switch(diaSemana) {
		case 1: System.out.println("domingo"); break;
		case 2: System.out.println("segunda"); break;
		case 3: System.out.println("terça"); break;
		case 4: System.out.println("quarta"); break;
		case 5: System.out.println("quinta"); break;
		case 6: System.out.println("sexta"); break;
		case 7: System.out.println("sábado"); break;
		default: System.out.println("não é um dia de semana");
		}*/
		
		switch(diaSemana) {
		case 2: 
		case 3: 
		case 4: 
		case 5: 
		case 6: System.out.println("Dia útil"); break;
		case 1:
		case 7: System.out.println("Fim de semana"); break;
		default: System.out.println("não é um dia de semana válido");
		}
		
	}

}
