import java.util.List;
import java.util.stream.Collectors;

public class Usuarios extends Persona implements Configuracion{
    public boolean permisos[] = {false,false,false,false,false,false};
    int tipoUsuario;
    public Usuarios(String nombre, String apellidoP, String apellidoM, String CURP, String direccion, int edad, String telefono){
        super(nombre, apellidoP, apellidoM, CURP, direccion, edad, telefono, 'u');
        System.out.println(id);
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
        super(nombre, apellidoP, apellidoM, CURP, direccion, edad, 'u');
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
    
    public boolean verificarAcceso(String parametros[]){
       try{
            /*String proceso= parametros[ProtocoloServer.PROCESO.indice];
            String idC = parametros[ProtocoloServer.ID.indice];
            String key1C= parametros[ProtocoloServer.KEY_1.indice];
            String key2C =parametros[ProtocoloServer.KEY_2.indice];
            */
            if (this.getKey1() == parametros[ProtocoloServer.KEY_1.indice] && this.getKey2()== parametros[ProtocoloServer.KEY_2.indice] && this.id == parametros[ProtocoloServer.ID.indice] && permisos[Integer.parseInt(parametros[ProtocoloServer.PROCESO.indice])]) {
                return true;
            } else return false;
        } catch (Exception e) {
            return false;
        }
    }
    public String agregarInvitado(String parametros[]){ //Metodo abstracto heredado de Persona
        if (this.getKey1() == parametros[ProtocoloServer.KEY_1.indice] && this.getKey2()== parametros[ProtocoloServer.KEY_2.indice] && this.id == parametros[ProtocoloServer.ID.indice] && permisos[Integer.parseInt(parametros[ProtocoloServer.PROCESO.indice])]) {
            Invitado i = new Invitado(parametros[5], parametros[6], parametros[7], Integer.parseInt(parametros[8]));
            Logs.listaInvitados.add(i);
            return "Invitado creado con exito\nContraseña para acceso de invitado: "+i.getKey(); 
        }else return "Error, este usuario no tiene los permisos necesarios para agregar invitado o faltan datos de invitado";
    }
    public void agregarUsuario(String parametros[]){ //Metodo abstracto heredado de Persona
        if (this.getKey1() == parametros[ProtocoloServer.KEY_1.indice] && this.getKey2()== parametros[ProtocoloServer.KEY_2.indice] && this.id == parametros[ProtocoloServer.ID.indice] && permisos[Integer.parseInt(parametros[ProtocoloServer.PROCESO.indice])]) {
          
        }
    }
    public void borrarInvitado(String parametros[]){
        if (this.getKey1() == parametros[ProtocoloServer.KEY_1.indice] && this.getKey2()== parametros[ProtocoloServer.KEY_2.indice] && this.id == parametros[ProtocoloServer.ID.indice] && permisos[Integer.parseInt(parametros[ProtocoloServer.PROCESO.indice])]) {
         int indexInvitado=Logs.listaInvitados.indexOf(Logs.listaInvitados.stream().filter(n-> n.getNombre()==parametros[5]).findFirst().get());
         System.out.println(indexInvitado);
         Logs.listaInvitados.remove(indexInvitado);
        }
    }
    public void borrarUsuario(String parametros[]){

    }
    public String mostrarPermisos(){
        return "Entrada: " + permisos[Permisos.ENTRAR.indice] + "\nSalida: " + permisos[Permisos.SALIR.indice] + "\nAgregar invitado: " + permisos[Permisos.CREAR_INVITADO.indice];
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

}
