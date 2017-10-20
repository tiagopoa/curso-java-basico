package com.tiago.senac.sistemasdistribuidos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 1000; i += 2) {
			System.out.println("Par: " + i);
			  
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

		}
		
	}





}
