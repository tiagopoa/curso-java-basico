package com.tiago.senac.sistemasdistribuidos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread2 thread2 = new Thread2();
		Thread1 thread1 = new Thread1();
	
		
		
		new Thread(thread2).start();
		new Thread(thread1).start();
		
	    
		
		
		
		
		//Thread1 thread3 = new Thread1();
		//thread3.run();
		//threadnum1.start();
		//
		//Thread2 thread4 = new Thread2();
		//Thread threadnum2 = new Thread(thread4);
		//thread4.run();


		
	}

}
