package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class RequestHandler implements Runnable {
	private final Socket client;
    ServerSocket serverSocket = null; 
    
	public RequestHandler(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {

		try (  DataInputStream dis = new DataInputStream(
                client.getInputStream());
        DataOutputStream dos = new DataOutputStream(
                client.getOutputStream());) {            
            System.out.println("Thread started with name: " + Thread.currentThread().getName());
            String userInput;
            while ((userInput = dis.readUTF()) != null) {
                //userInput = userInput.replaceAll("[^ A-Za-z0-9]", "");
                System.out.println("Received message from: " + Thread.currentThread().getName() + " : " + userInput);
                dos.writeUTF("Você escreveu: " + userInput);
                //writer.write(userInput);
                //writer.newLine();
                //writer.flush();
            }
        } catch (IOException e) {
                System.out.println("I/O Exception: " + e);                
                } catch (Exception ex){
                        System.out.println("Exception in Thread Run. Exception ");
                        }

	}

}
