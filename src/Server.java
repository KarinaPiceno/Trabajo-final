import java.net.*;
import java.util.List;
import java.util.stream.Collectors;
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
                    
                    String parametros[]=line.trim().split(",");
                    
                    switch (parametros[ProtocoloServer.T_USUARIO.indice]){
                        case "a":
                            //caso para administrador
                            break;
                        case "p":
                            //caso para propietario
                            break;
                        case "u":
                            List<Usuarios> u1 = Logs.listaUsuarios.stream().filter(n -> n.id.equals(parametros[ProtocoloServer.ID.indice])).collect(Collectors.toList());  
                            Usuarios usuario = u1.get(0);
                            switch (Integer.parseInt(parametros[ProtocoloServer.PROCESO.indice])){
                                case 0: //caso de entrada
                                    if (usuario.verificarAcceso(parametros)){
                                        responseToClient = "Acceso aceptado";
                                        Logs.newLogEntrada("Entrada, id de usuario: "+ parametros[ProtocoloServer.ID.indice]);
                                    } else {
                                        responseToClient= "Acceso denegado, usuario o contraseñas incorrectas";
                                        Logs.newLogEntrada("Intento de entrada denegado");
                                    }
                                    break;
                                case 1: //caso de salida
                                    if (usuario.verificarAcceso(parametros)){
                                        responseToClient = "Acceso aceptado";
                                        Logs.newLogEntrada("Salida, id de usuario: "+ parametros[ProtocoloServer.ID.indice]);
                                    } else {
                                        responseToClient= "Acceso denegado, usuario o contraseñas incorrectas";
                                        Logs.newLogEntrada("Intento de salida denegado");
                                    }
                                    break;
                                case 3: //agregar invitado;
                                    
                                    break;
                                default:

                            }
                            break;
                            case "i":
                                responseToClient = Persona.buscarUsuario(parametros);
                                
                                out.writeUTF(responseToClient);
                                responseToClient = "Over";
                                break;
                        default:
                    }
                            
                    
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
