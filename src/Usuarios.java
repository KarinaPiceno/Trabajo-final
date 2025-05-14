public class Usuarios extends Persona implements Configuracion{
    public boolean permisos[];

    public Usuarios(String nombre, String apellidoP, String apellidoM, String CURP, String direccion, int edad, int telefono){
        super(nombre, apellidoP, apellidoM, CURP, direccion, edad, telefono);
    }
    
    public boolean verificarPermiso(int id){
        return permisos[id];
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
    public void modificarTelefono(int telefono){ //Metodo implementado de configuracion para modificar el telefono
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
