package cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ServerCliente {
    // initialize socket and input output streams
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream out = null;
    private DataInputStream serverInput = null;
    private String line = "";
    public void setLine(String line){
        this.line=line;
    }
 
    // constructor to put ip address and port
    @SuppressWarnings("deprecation")
	public ServerCliente(String address, int port)
    {
        // establish a connection
        try {
            socket = new Socket(address, port);
            System.out.println("Connected");
 
            // takes input from terminal 
            input = new DataInputStream(System.in);
            
            // sends/rcv data to the socket to/from the server
            out = new DataOutputStream(socket.getOutputStream());
            serverInput = new DataInputStream(socket.getInputStream());
        }
        catch (UnknownHostException u) {
            System.out.println(u);
            return;
        }
        catch (IOException i) {
            System.out.println(i);
            return;
        }
 
        // string to read message from input
        String responseFromServer = "";
        // keep reading until "Over" is input
        while (!this.line.equals("Over")) {
            try {
                if (line.equals("")) {
                    while (line.equals("")){
                        InicioSesion.setRespuesta(this);
                        
                    }
                } else line ="Over";
                out.writeUTF(this.line);
                
                responseFromServer = serverInput.readUTF(); // Read response from server
                System.out.println("Server says: " + responseFromServer);
                if (responseFromServer.equals("true")){
                            MenuPrincipal menu = new MenuPrincipal();
                        }
            }
            catch (IOException i) {
                System.out.println("Over? "+i);
            }
        }
 
        // close the connection
        try {
        	socket.close();
            input.close();
            out.close();            
            serverInput.close();
            
        }
        catch (IOException i) {
            System.out.println(i);
        }
    }
}
