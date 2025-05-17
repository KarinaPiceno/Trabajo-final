public class Usuarios extends Persona implements Configuracion{
    public boolean permisos[] = {false,false,false,false};
    int tipoUsuario;
    public Usuarios(String nombre, String apellidoP, String apellidoM, String CURP, String direccion, int edad, String telefono){
        super(nombre, apellidoP, apellidoM, CURP, direccion, edad, telefono);
        if (edad<18){
            tipoUsuario=0;
            permisos[Permisos.ENTRAR.indice] = true;
            permisos[Permisos.SALIR.indice] = true;
            Logs.agregarUsuario(this);
            
        } else{
            tipoUsuario=1;
            permisos[Permisos.ENTRAR.indice] = true;
            permisos[Permisos.SALIR.indice] = true;
            permisos[Permisos.CREAR_INVITADO.indice] = true;
            permisos[Permisos.BORRAR_INVITADO.indice] = true;
            Logs.agregarUsuario(this);
            }
        }
         public Usuarios(String nombre, String apellidoP, String apellidoM, String CURP, String direccion, int edad){
        super(nombre, apellidoP, apellidoM, CURP, direccion, edad);
        if (edad<18){
            tipoUsuario=0;
            permisos[Permisos.ENTRAR.indice] = true;
            permisos[Permisos.SALIR.indice] = true;
            Logs.agregarUsuario(this);
            
        } else{
            tipoUsuario=1;
            permisos[Permisos.ENTRAR.indice] = true;
            permisos[Permisos.SALIR.indice] = true;
            permisos[Permisos.CREAR_INVITADO.indice] = true;
            permisos[Permisos.BORRAR_INVITADO.indice] = true;
            Logs.agregarUsuario(this);
        }
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
    public static void main(String[] args) {
        Usuarios u1 = new Usuarios("karina", "piceno", "castellanos", "pickdhdhdj55", 
        "lazy town", 15);
        System.out.println(u1.toString());
        Usuarios u2 = new Usuarios("Sandy", "Guerrero", "Grimaldo", "sandyHermosa", 
        "bikini bottom", 20, "3312162475");
        System.out.println(u2.toString());
       /*  try{
            listaUsuarios.add(u1);
        }catch (Exception e){
            System.out.println(e);
        }
        */
        Logs.mostrarUsuarios();
    }
}
