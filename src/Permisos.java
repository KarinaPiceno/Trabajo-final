public enum Permisos {
    BORRAR_USUARIO (5),
    CREAR_USUARIO (4),
    CREAR_INVITADO (3),
    BORRAR_INVITADO (2),
    SALIR (1),
    ENTRAR (0);
    int indice;
    private Permisos (int indice){
        this.indice = indice;
    }
}