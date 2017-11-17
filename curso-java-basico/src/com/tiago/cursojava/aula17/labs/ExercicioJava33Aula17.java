package com.tiago.cursojava.aula17.labs;

public class ExercicioJava33Aula17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Faça um programa que mostre os n termos da Série a seguir:
			//o S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m. 
			
		int s = 0;
		int j = 1;
			for (int i = 1; ; i++) {
				s += i/j;
				j += 2;
				System.out.println("S: " + s);
				System.out.println("J: " + j);
				
				try {
					Thread.sleep(10);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				
			}

	}

}
