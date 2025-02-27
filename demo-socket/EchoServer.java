import java.io.*;
import java.net.*;    

public class EchoServer
{
    private static int PORT = 34522;

    public static void main(String[] args) {
        try(ServerSocket server = new ServerSocket(PORT)) {
            while(true) {
                try (
                    Socket socket = server.accept();
                    DataInputStream input = new DataInputStream(socket.getInputStream());
                    DataOutputStream output = new DataOutputStream(socket.getOutputStream())
                ) {
                    for (int i = 0; i < 5; i++) {
                        String msg = input.readUTF(); // read the next client message
                        output.writeUTF(msg); // resend it to the client
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Session extends Thread {
    private final Socket socket;

    public Session(Socket socketForClient) {
        this.socket = socketForClient;
    }

    public void run() {
        try (
            DataInputStream input = new DataInputStream(socket.getInputStream());
            DataOutputStream output = new DataOutputStream(socket.getOutputStream())
        ) {
            for (int i = 0; i < 5; i++) {
                String msg = input.readUTF();
                output.writeUTF(msg);
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}