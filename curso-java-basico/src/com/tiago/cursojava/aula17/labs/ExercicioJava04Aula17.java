package com.tiago.cursojava.aula17.labs;

public class ExercicioJava04Aula17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double paisA = 80000;
		double paisB = 200000;
		int cont = 0;
		
		double taxaCrescimentoPaisA = 3;
		double taxaCrescimentoPaisB = 1.5;
		
		while (paisA <= paisB) {
			paisA = paisA + (paisA * taxaCrescimentoPaisA) / 100;
			paisB = paisB + (paisB * taxaCrescimentoPaisB) / 100;
			cont++;
		}
		
		System.out.println("Em " + cont + " anos o País A igualará ou ultrapassará a população do País B");
		
		/*for (int i = 0; paisA >= paisB ; i++) {
			paisA += paisA + (paisA * taxaCrescimentoPaisA) / 100;
			paisB += paisB + (paisB * taxaCrescimentoPaisB) / 100;
			cont++;
		}
		
		System.out.println(paisA + "\n" + paisB + "\nEm " + cont + " anos o País A igualará ou ultrapassará a população do País B");*/

	}

}
