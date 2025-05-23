import java.util.Random;

public abstract class Persona {

    public final String crearID(char identificador){
        Random random = new Random();
        int[][] intervalos = {{65,90}, {48,57}};
        String id = "";
        id += identificador;
        for (int i = 0; i < 8; i++){
            int iIntervalos = random.nextInt(intervalos.length);
            id += (char)(random.nextInt((intervalos[iIntervalos][1])-(intervalos[iIntervalos][0]) + 1) + (intervalos[iIntervalos][0]));
        }
        return id;
    }
    //atributos de nuestra clase abstracta
    public String nombre; 
    public String apellidoP; 
    public String apellidoM; 
    public String id;
    public  String telefono;
    private String direccion;
    private int edad;
    private String key1;
    private String key2;
    private String CURP;

    //constructor con nombre, apellido paterno, apellido materno, CURP, direccion y edad
    public Persona(String nombre, String apellidoP, String apellidoM, String CURP, String direccion, int edad, char identificador){
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.CURP = CURP;
        this.direccion = direccion;
        this.edad = edad;
        this.id = crearID(identificador);
        
        }


    //constructor con nombre, apellido paterno, apellido materno, CURP, direccion, edad y telefono
    public Persona (String nombre, String apellidoP, String apellidoM, String CURP, String direccion, int edad, String telefono, char identificador){
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.CURP = CURP;
        this.direccion = direccion;
        this.edad = edad;
        this.telefono = telefono;
        this.id= crearID(identificador);
    }

    public String getNombreCompleto() {
        return nombre + " " + apellidoP + " " + apellidoM;
    }
    @Override
    public String toString() {
        return "Nombre: " + getNombreCompleto() + "\nID: " + id +
               "\nCURP: " + CURP + "\nEdad: " + edad + "\nDirección: " + direccion +
               "\nNum.Teléfono: " + telefono;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona persona = (Persona) obj;
        return this.id == persona.id;
    }
    public static String buscarUsuario (String parametros[]){
        long hayUsuario = Logs.listaAdministradores.stream().filter(n->(n.nombre.equals(parametros[1])||n.id.equals(parametros[1]))&&(n.getKey1().equals(parametros[2])||n.getKey2().equals(parametros[2]))).count();
        hayUsuario += Logs.listaUsuarios.stream().filter(n->(n.nombre.equals(parametros[1])||n.id.equals(parametros[1]))&&(n.getKey1().equals(parametros[2])||n.getKey2().equals(parametros[2]))).count();
        hayUsuario += Logs.listaPropietarios.stream().filter(n->(n.nombre.equals(parametros[1])||n.id.equals(parametros[1]))&&(n.getKey1().equals(parametros[2])||n.getKey2().equals(parametros[2]))).count();
        if (hayUsuario>0){
            System.out.println(true);
            return "true";
        } else return "false";
    }
    public abstract String agregarInvitado(String parameetros[]);
    public abstract void borrarInvitado(String parameetros[]);
    public abstract void agregarUsuario(String parameetros[]);
    public abstract void borrarUsuario(String parameetros[]);




   
   
   
    
    //getter and setters de direccion
    public String getDireccion() { 
        return direccion; 
    }
    public void setDireccion(String direccion) { 
        this.direccion = direccion; 
    }
    //getter and setters de edad
    public int getEdad() { 
        return edad; 
    }
    public void setEdad(int edad) { 
        this.edad = edad; 
    }
    //getter and setters de key1
    public String getKey1() {
        return key1;
    }
    public void setKey1(String key1) {
        this.key1 = key1;
    }
    //getter and setters de key2
    public String getKey2() {
        return key2;
    }
    public void setKey2(String key2) {
        this.key2 = key2;
    }
    //getter and setters de CURP
    public String getCURP() {
        return CURP;
    }
    public void setCURP(String CURP) {
        this.CURP = CURP;
    }



    
}
