public class Administrador extends Persona implements Configuracion { //Administrador es subclase de Persona e implementa la interface Configuracion

  

    public Administrador(String nombre, String apellidoP, String apellidoM, String CURP, String direccion, int edad, String telefono, char identificador){
        super(nombre, apellidoP, apellidoM, CURP, direccion, edad, telefono, identificador);
    }
    public Administrador(String nombre, String apellidoP, String apellidoM, String CURP, String direccion, int edad, char identificador){
        super(nombre, apellidoP, apellidoM, CURP, direccion, edad, identificador);
    }

    /* 
        public String crearID(char identificador){
        Random random = new Random();
        int[][] intervalos = {{65,90}, {48,57}};
        String id = "";
        id += identificador;
        for (int i = 0; i < 8; i++){
            int iIntervalos = random.nextInt(intervalos.length);
            id += (char)(random.nextInt((intervalos[iIntervalos][1])-(intervalos[iIntervalos][0]) + 1) + (intervalos[iIntervalos][0]));
        }
        return id;
        }
    */

       





    @Override
    public void modificarNombre(String nombre){ //Metodo implementado de configuracion para modificar el nombre
        this.nombre = nombre;
    }
    @Override
    public void modificarEdad(int edad){ //Metodo implementado de configuracion para modificar la edad
        setEdad(edad);
    }
    @Override
    public void modificarTelefono(String telefono){ //Metodo implementado de configuracion para modificar el telefono
        this.telefono = telefono;
    }
    @Override
    public void modificarDireccion(String direccion){ //Metodo implementado de configuracion para modificar la direccion
        setDireccion(direccion);
    }
    @Override
    public void agregarInvitado(){ //Metodo abstracto heredado de Persona
        
    }
    @Override
    public void agregarUsuario(){ //Metodo abstracto heredado de Persona

    }
}
