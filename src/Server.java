import java.net.*;
import java.io.*;

public class Server {
    //initialize socket and input stream
    private Socket          socket   = null;
    private ServerSocket    server   = null;
    private DataInputStream in       =  null;
    private DataOutputStream out       =  null;
 
    // constructor with port
    public Server(int port)
    {
        // starts server and waits for a connection
        try
        {
            server = new ServerSocket(port);
            System.out.println("Server started");

            System.out.println("Waiting for a client ...");
        } catch(IOException i) {
                    System.out.println(i);
        }
    }

    public void run() throws IOException{
        while (true){
            socket = server.accept();
        System.out.println("Client accepted");

        // takes input from the client socket
        in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        out = new DataOutputStream(socket.getOutputStream());

        BufferedReader serverInput = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        String responseToClient = "";
        // reads message from client until "Over" is sent
        while (!responseToClient.equals("Over")) {
            try {
                if (in.available() > 0) { // Check if client has sent something
                    line = in.readUTF();
                    System.out.println("Client says: " + line);
                    Logs.newLogEntrada ("Mensaje del cliente: " + line);
                }
    
                if (System.in.available() > 0) { // Check if there is input from server console
                    responseToClient = serverInput.readLine();
                    out.writeUTF(responseToClient); // Send response to client
                }

            } catch(IOException i) {
                    System.out.println(i);
                }
            }
            System.out.println("Closing connection");
 
            // close connection
            socket.close();
            in.close();
            out.close();
        }
        
    }
}
