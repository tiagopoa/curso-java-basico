package socket.programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static void main(String[] args) {
		/*if (args.length < 1) {
			System.err.println("Usage: java EchoServer <port Number>");
			System.exit(1);
		}*/
		//System.out.println("Server iniciado. Escutando na porta 8005");
		//int portNumber = Integer.parseInt(args[0]);
		try {ServerSocket serverSocket = new ServerSocket(6789);
		System.out.println("Server iniciado. Escutando na porta 6789");
			Socket clientSocket = serverSocket.accept();			
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));			
			System.out.println("Cliente conectado na porta " + serverSocket.getLocalPort() + " Servindo requisições.");			
			String inputLine;			
			while ((inputLine = in.readLine()) != null) {
				System.out.println("Mensagem Recebida: " + inputLine + " from " + clientSocket.toString());
				out.println(inputLine);
			}
		} catch (IOException e) {
			System.out.println("Exception caught when trying to listen on port " + 6789 + " or listening for a connection");			
			e.printStackTrace();
		}

	}

}
