package com.tiago.cursojava.aula13;

public class Curtocircuito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso & verdadeiro;
		boolean resultado2 = falso && verdadeiro;
		System.out.println(resultado1);
		System.out.println(resultado2);
		
		//precedencia
		int resultado = 1 + 1 - 1 + 1 * 1 / 1;
		System.out.println(resultado);

	}

}
