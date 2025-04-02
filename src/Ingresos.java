public class Ingresos{
/*extends Persona? o interface?*/
   
    private static String log[][];

    //static?
    private static final int id = 652;

    /*     |super() para persona?|
    public static int getId() {
        return id;
    }
    */

    //que hace entrada?
    //es un string que contiene el nombre del invitado o el id del invitado?
    public String entrada; 
      
    

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }
    public String getEntrada() {
        return entrada;
    }
    

    //super() para persona?
    public static int getId() {
        return id;  
    }


    //Verifica si el id es correcto, si no lo es retorna false, si lo es retorna true

    //supongo que el id se validara en el servidor
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




    @Override
    public String toString() {
        return "Ingresos{" +
                "entrada='" + entrada + '\'' +
                ", id=" + id +
                '}';
    }



    
}



     



    
    

