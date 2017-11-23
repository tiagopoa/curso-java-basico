package com.tiago.cursojava.aula17.labs;

public class ExercicioJava33Aula17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Faça um programa que mostre os n termos da Série a seguir:
			//o S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m. 
			
		double s = 0;
		double j = 1;
		double soma = 0;
			for (int i = 1; i <= 1000000; i++) {
				System.out.println(i + "/" + j + " = " + i/j);
				s += i/j;
				j += 2;
			
				soma += i/j;
				
				System.out.println("Soma " + i + ": " + soma);
				
				/*try {
					Thread.sleep(100);
				} catch (Exception e) {
					// TODO: handle exception
				}*/
				
				
			}
			
			System.out.println("Soma da série: " + soma);

	}

}
