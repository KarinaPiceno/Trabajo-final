import java.time.*;


public class Ingresos{

   
//Vector estatico
    private static String log[];  
    public String entrada; 
    
      

 //Vector estatico para guardar los logs de los ingresos
//id para el log de ingresos para persona 
    public static String getEntrada(int indice) {
        return log[indice];
    }
    

    
    public static int getId() {
        return id;  
    }

//compara key1 con key2, si son iguales regersa true con la fecha y hora actual, si no son iguales regresa false
    public final static boolean verificarId(Persona p1, String key1, String key2) {
        
        if (p1.key1 == key1 && p1.key2 == key2) {
            
            setEntrada(p1.getNombreCompleto() + " - " + java.time.LocalDateTime.now());
            return true;
        } else {

            return false;
        }
    }



    @Override
    public String toString () {
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        return fechaHoraActual.toString() + " - " + Persona.getNombreCompleto();
    }
///entrada de datos, se guarda el log de la persona que ingreso al sistema
    public static void setEntrada(int indice, String log) {
        Ingresos.log[indice] = log;
    }




    
}



     



    
    

