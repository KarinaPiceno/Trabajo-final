public abstract class Persona {
    //atributos de nuestra clase abstracta
    public String nombre; 
    public String apellidoP; 
    public String apellidoM; 
    public static int ultimold;
    public int telefono;
    private String direccion;
    private int edad;
    private String key1;
    private String key2;
    private String CURP;

    //constructor con nombre, apellido paterno, apellido materno, CURP, direccion y edad
    public Persona(String nombre, String apellidoP, String apellidoM, String CURP, String direccion, int edad){
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.CURP = CURP;
        this.direccion = direccion;
        this.edad = edad;
        // Se genera la id de manera secuencial: se incrementa ultimoId y se asigna a id.
        ultimoId++;
        this.id = ultimoId;
        }


    //constructor con nombre, apellido paterno, apellido materno, CURP, direccion, edad y telefono
    public Persona (String nombre, String apellidoP, String apellidoM, String CURP, String direccion, int edad, int telefono){
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.CURP = CURP;
        this.direccion = direccion;
        this.edad = edad;
        this.telefono = telefono;
        // Se genera la id de manera secuencial: se incrementa ultimoId y se asigna a id.
        ultimoId++;
        this.id = ultimoId;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellidoP + " " + apellidoM;
    
    @Override
    public String toString() {
        return "Persona: " + nombre + " " + apellidoP + " " + apellidoM +
               "CURP: " + CURP + "Edad: " + edad + "Dirección: " + direccion +
               "Num.Teléfono: " + telefono;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona persona = (Persona) obj;
        return this.id == persona.id;
    }

    public abstract void agregarInvitado();
    public abstract void agregarUsuario();



    //getter and setters de nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }
    //getter and setters de apellidoP
    public String getApellidoP() { 
        return apellidoP; 
    }
    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP; 
    }
    //getter and setters de apellidoM
    public String getApellidoM() { 
        return apellidoM; 
    }
    public void setApellidoM(String apellidoM) { 
        this.apellidoM = apellidoM; 
    }
    //getter and setters de id
    public final int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    //getter and setters de ultimoId
    public static int getUltimald() { 
        return ultimald; 
    }
    public static void setUltimald(int ultimald) {
        Persona.ultimald = ultimald; 
    }
    //getter and setters de telefono
    public int getTelefono() { 
        return telefono; 
    }
    public void setTelefono(int telefono) {
         this.telefono = telefono; 
        }
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
