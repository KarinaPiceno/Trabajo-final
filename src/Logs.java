import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Logs{
/*extends Persona? o interface?
    ninguno, es una clase independiente de tipo static
    tienes dos opciones, o aqui arriva le pones static, o en cada atributo y método le pones static 
*/ 
    private static int nUsuarios=0;


    public static int getNusuarios(){
        return Logs.nUsuarios;
    }
    public static void setnUsuarios(int nUsuarios) {
        Logs.nUsuarios = nUsuarios;
    }
    Logger logger = Logger.getLogger("Entradas y Salidas"); 
		FileHandler fh; 
        try {  

			// This block configure the logger with handler and formatter  
			fh = new FileHandler("");  
			logger.addHandler(fh);
			SimpleFormatter formatter = new SimpleFormatter();  
			fh.setFormatter(formatter);  

			// the following statement is used to log any messages  
			logger.info("My first log");  

		} catch (SecurityException e) {  
		e.printStackTrace();
		} catch (IOException e) {  
	        e.printStackTrace();  
	    }  

    private static String log[][];  //por el momento siempre se va a hacer un vector, no una matriz, y va a almacenar los diferentes logs

    //static?
    private static final int id = 652; //por que estas creando una id? vas a usar la id de la clase de admin y usuario

    /*     |super() para persona?| nop, la clase es independiente a persona
    public static int getId() {
        return id;

    }
    */

    //que hace entrada?
    //es un string que contiene el nombre del invitado o el id del invitado?
    public String entrada; 
      
    
        //en el set entrada vas a agregar al vector el string resultante del metodo toString()
    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }
        // en el get entrada vas a pedir un int para el indice y vas a devolver el string que se encuentre en ese índice
    public String getEntrada() {
        return entrada;
    }
    

    //super() para persona? nop
    public static int getId() {
        return id;  
    }

    
    //Verifica si el id es correcto, si no lo es retorna false, si lo es retorna true

    //supongo que el id se validara en el servidor
         // si y no, por el momento se va a validar aquí, lo que va a suceder es que tienes que pedir un int que es el id, y vas a pedir 
         //2 string, 1 para key1 y otro para key2. dentro del método vas a comparar el key1 de persona con el key 1 que recibiste y el key2 
        //de persona con el key2 que recibiste. si ambos coinciden entonces vas a llamar al setEntrada y ademas va a regresar un true.
    // Por ahora solo se verifica si el id es el que esta inicializado
    public final static boolean verificarId(int id) {
        
        if (id == 652) {
            System.out.println("ID valido");
            return true;
        } else {
            System.out.println("ID invalido");
            return false;
        }
    }



        //en el override de string va a ser el formato Hora + fecha + nombre, el nombre lo puedes sacar del método getNombreCompleto() de la clase persona
    @Override
    public String toString() {
        return "Ingresos{" +
                "entrada='" + entrada + '\'' +
                ", id=" + id +
                '}';
    }



    
}



     



    
    

