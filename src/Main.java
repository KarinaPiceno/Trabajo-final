import java.io.IOException;

public class Main {
 public static void main(String[] args) {
        Usuarios u1 = new Usuarios("Sandy", "Guerrero", "Grimaldo", "lahkd5135", "bikini bottom", 20, "3312162475");
        Logs.agregarUsuario(u1);
        System.out.println(u1.mostrarPermisos()+"\n");
        String parametros[] = {"u","1","123","456","1"};
        System.out.println("Verificar acceso: "+u1.verificarAcceso(parametros));
        String parametros2[] = {"u","1","123","456","3","Karina","Piceno","Castellanos","9"};
        System.out.println("contraseña invitado: " + u1.agregarInvitado(parametros2));
        String parametros3[] ={"u","1","123","456","5","Karina"};
        Logs.mostrarInvitados();
        u1.borrarInvitado(parametros3);
        Logs.mostrarInvitados();
        String parametros4[] = {"i","1","123"};
        System.out.println(Persona.buscarUsuario(parametros4));
        
        Server server = new Server(5000);
            System.out.println("Running server");
            try{
                server.run();
            } catch (IOException e) {
                System.out.println(e);
            }
         
       
    }
}
