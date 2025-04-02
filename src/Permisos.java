public enum Permisos {

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