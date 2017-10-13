package com.tiago.senac.sistemasdistribuidos.aps2;

public class Aps2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Faça um programa concorrente que imprima em uma thread os números pares e, em
		//outra thread, os números ímpares (até 100).

		Thread1 thread1 = new Thread1();
		Thread threadnum1 = new Thread(thread1);
		threadnum1.start();
		
		Thread2 thread2 = new Thread2();
		Thread threadnum2 = new Thread(thread2);
		threadnum2.start();
		
}
}
