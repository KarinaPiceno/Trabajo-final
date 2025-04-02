public enum Permisos {
//que estabas inteentando hacer?? no entiendo tu intención en este código
//lo unico que tienes que hacer es una enumeracion con los dos peermisos que te pasé, los valores de estos se van a usar para encontrar
// el índice en un vector donde se van a guardar los permisos que se les van a asignar a usuarios que no son admin. No te compliques la existencia.

    // agregar invitado??
    // validar por nombre, asignandole un id?

    ACCESO_ADMINISTRADOR("Acceso a administrador"),
    ACCESO_INVITADO("Acceso a invitado"),
    ACCESO_USUARIO("Acceso al usuario"),;

    private final String descripcion;

    Permisos(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

 //en otra clase
    public permisos inv;
    public permisos usuario;
    public permisos admin;
    

//en otra calse 
    // permisos de invitado
    public invitado() {
        invitado = Permisos.invitado;
        if (invitado == Permisos.admin) {
            System.out.println("Acceso a invitado");
        } else {
            System.out.println("No tiene acceso a invitado");
        }

    }




    //permisos de administrador
    modificar_Datos 
}