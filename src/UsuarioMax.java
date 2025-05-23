public class UsuarioMax extends Persona{
      //agregar invitado frecuente
    //suspender usuario
     public UsuarioMax(String nombre, String apellidoP, String apellidoM, String CURP, String direccion, int edad, String telefono, char identificador){
        super(nombre, apellidoP, apellidoM, CURP, direccion, edad, telefono, identificador);
    }
    public void modificarNombre(String nombre){ //Metodo implementado de configuracion para modificar el nombre
        this.nombre = nombre;
    }
    public void modificarEdad(int edad){ //Metodo implementado de configuracion para modificar la edad
        setEdad(edad);
    }
    public void modificarTelefono(String telefono){ //Metodo implementado de configuracion para modificar el telefono
        this.telefono = telefono;
    }
    public void modificarDireccion(String direccion){ //Metodo implementado de configuracion para modificar la direccion
        setDireccion(direccion);
    }
    @Override
    public Invitado agregarInvitado(String nombre, String apellidoP, String apellidoM, int diasMax){ //Metodo abstracto heredado de Persona
      return new Invitado(nombre, apellidoP, apellidoM, diasMax);
    }
    @Override
    public Usuarios agregarUsuario(String nombre, String apellidoP, String apellidoM, String CURP, String direccion, int edad, String telefono, char identificador){ //Metodo abstracto heredado de Persona
      return new Usuarios(nombre, apellidoP, apellidoM, CURP, direccion, edad, identificador);
    }

}
