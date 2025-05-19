public enum Permisos {
    CREAR_INVITADO (3),
    BORRAR_INVITADO (2),
    SALIR (1),
    ENTRAR (0);
    int indice;
    Permisos (int indice){
        this.indice = indice;
    }
}