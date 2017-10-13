package com.tiago.senac.sistemasdistribuidos.aps2;

public class Thread1 implements Runnable {
	public void run() {
		for (int i = 0; i < 101; i++) {
			if (i % 2 == 0) {
		       System.out.println("Par: " + i);
		       
				try {
					Thread.sleep(3 * 1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		     }

	}
}