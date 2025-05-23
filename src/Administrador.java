public class Administrador extends Persona implements Configuracion { //Administrador es subclase de Persona e implementa la interface Configuracion

  

    public Administrador(String nombre, String apellidoP, String apellidoM, String CURP, String direccion, int edad, String telefono){
        super(nombre, apellidoP, apellidoM, CURP, direccion, edad, telefono,'a');
    }
    public Administrador(String nombre, String apellidoP, String apellidoM, String CURP, String direccion, int edad){
        super(nombre, apellidoP, apellidoM, CURP, direccion, edad, 'a');
    }

       





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
