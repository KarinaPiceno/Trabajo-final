import java.io.IOException;

public class Main {
 public static void main(String[] args) {
        Usuarios u1 = new Usuarios("Sandy", "Guerrero", "Grimaldo", "lahkd5135", "bikini bottom", 20, "3312162475");
        Logs.agregarUsuario(u1);
        Logs.mostrarUsuarios();
         Server server = new Server(5000);
         //while(true){
             System.out.println("Running server");
             try{
                 server.run();
             } catch (IOException e) {
                System.out.println(e);
             }
         //}
       
    }
}
