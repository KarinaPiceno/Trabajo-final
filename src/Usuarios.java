import java.util.List;
import java.util.stream.Collectors;

public class Usuarios extends Persona implements Configuracion{
    public boolean permisos[] = {false,false,false,false};
    int tipoUsuario;
    public Usuarios(String nombre, String apellidoP, String apellidoM, String CURP, String direccion, int edad, String telefono){
        super(nombre, apellidoP, apellidoM, CURP, direccion, edad, telefono);
        id="1";
        setKey1("123");
        setKey2("456");
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
    
    public static boolean verificarAcceso(String id, String key1, String key2){
       try{
           List<Usuarios> u1 = Logs.listaUsuarios.stream().filter(n -> n.id.equals(id)).collect(Collectors.toList());  
           Usuarios info = u1.get(0);
           if (info.getKey1() == key1 && info.getKey2()==key2) {
                return true;
           } else return false;
       } catch (Exception e) {
            return false;
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

}
