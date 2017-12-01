

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JOptionPane;

public class Leitor {

    //Leitor se conecta aos Escritores (três)
    public static void main(String[] args) {
    	int MAX = 3;
        Socket conexao[] = new Socket[MAX];
        DataOutputStream out[] = new DataOutputStream[MAX];
        int[] serverPort = {6780,6781,6782};
        String[] serverIP = {"localhost", "localhost", "localhost"};
        try {
            for (int i = 0; i < MAX; i++) {
            	System.out.println("Leitor ["+i+"]: Entrou");
                conexao[i] = new Socket(serverIP[i], serverPort[i]);
                System.out.println("Conectado com o servidor com IP " + serverIP[i]);
                System.out.println("Conectado com o servidor da porta " + serverPort[i]);
                out[i] = new DataOutputStream(conexao[i].getOutputStream());
            }

            String mensagem = "";
            
            do {
                mensagem = JOptionPane.showInputDialog("Mensagem: ");
                for (int i = 0; i < MAX; i++) {
                    out[i].writeUTF(mensagem);
                }
            } while (!mensagem.equalsIgnoreCase("SAIR"));

            System.out.println("Finalizando a aplicação ...");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            for (int i = 0; i < MAX; i++) {
                if (conexao[i] != null) {
                    try {
                        conexao[i].close();
                    } catch (IOException e) {
                        System.out.println("Close falhou!");
                    }
                }
            }
        }
    }

}