import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.util.logging.Logger;
import java.util.List;
import java.util.ArrayList;


public class Logs{

    private static int nUsuarios=0;
    public static List<UsuarioMax> listaPropietarios = new ArrayList<>();
    public static List<Administrador> listaAdministradores = new ArrayList<>();
    public static List<Usuarios> listaUsuarios = new ArrayList<>();
    public static List<Invitado> listaInvitados = new ArrayList<>();

    public static void mostrarInvitados (){
        for (Invitado i: listaInvitados){
            System.out.println(i.getNombre());
        }
    }
    public static void mostrarUsuarios(){
        for (Usuarios u : listaUsuarios){
            System.out.println(u.nombre);
            
        }
    }

    public static void agregarUsuario(Usuarios u){
        listaUsuarios.add(u);
    }

    // public static int getNusuarios(){
    //    return Logs.nUsuarios;
    //}
    //public static void setnUsuarios(int nUsuarios) {
    //    Logs.nUsuarios = nUsuarios;
    //}
   
    public static void newLogEntrada (String mensaje){
        try {  
            Logger log = Logger.getLogger("Entradas y Salidas"); 
			FileHandler fh = new FileHandler("C:/Users/Karina/Desktop/Trabajo Final/Entradas y Salidas.log");  
			log.addHandler(fh);
			SimpleFormatter formatter = new SimpleFormatter();  
			fh.setFormatter(formatter);  
            log.info(mensaje);
            
		} catch (SecurityException e) {  
            e.printStackTrace();
		} catch (IOException f) {  
            f.printStackTrace();  
	    } 
    }
    public static void newLogSalida(){
        try {  
            Logger log = Logger.getLogger("Entradas y Salidas"); 
			FileHandler fh = new FileHandler("C:/Users/Karina/Desktop/Trabajo Final/Entradas y Salidas.log");  
			log.addHandler(fh);
			SimpleFormatter formatter = new SimpleFormatter();  
			fh.setFormatter(formatter);  
            log.info("mensaje");
            
		} catch (SecurityException e) {  
            e.printStackTrace();
		} catch (IOException f) {  
            f.printStackTrace();  
	    } 
    }
}






    




     



    
    

