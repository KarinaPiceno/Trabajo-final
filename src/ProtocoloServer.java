public enum ProtocoloServer {
    T_USUARIO (0),
    ID(1),
    KEY_1(2),
    KEY_2(3),
    PROCESO(4);
    int indice;
    private ProtocoloServer(int indice){
        this.indice = indice;
    }

}
