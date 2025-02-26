import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    private static final String SERVER_ADDRESS = "127.0.0.1";
    private static final int SERVER_PORT = 34522;

    public static void main (String[] args) {
        try(
            Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
            DataInputStream input = new DataInputStream(socket.getInputStream());
            DataOutputStream output = new DataOutputStream(socket.getOutputStream())
        ){
            Scanner scan = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                String msg = scan.nextLine();
                output.writeUTF(msg); // send a message to the server
                String receivingMsg = input.readUTF(); // read the reply from the server
                System.out.println("Received from the server: " + receivingMsg);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
