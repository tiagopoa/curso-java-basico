package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class Servidor {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket clientSocket = null;

        
        Boolean onLine = true;
        
        
        try {        	
            serverSocket = new ServerSocket(6789);
            System.out.println("Eleição Iniciada...");
            System.out.println("Aguardando Eleitor...");
            
            while (true) {
                clientSocket = serverSocket.accept();
                Runnable worker = new RequestHandler(clientSocket);
                
            }
        /*    System.out.println("Eleitor conectado!!");
            DataInputStream dis1 = new DataInputStream(
                    listenSocket.getInputStream());
            DataOutputStream dos1 = new DataOutputStream(
                    listenSocket.getOutputStream());
            
            while(onLine){
            String msg1 = dis1.readUTF();
            System.out.println(msg1);
            }
            	//dos.writeUTF(dis.readUTF());*/
            
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(clientSocket != null){
                try {
                    clientSocket.close();
                    serverSocket.close();
                } catch (IOException ex) {
                    Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }
    }

