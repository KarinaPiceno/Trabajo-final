import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;
public class Invitado{
    public boolean permisos[] = {false,false,false,false,false};
    private final int tipo;
    private String nombre; 
    private String apellidoP; 
    private String apellidoM; 
    public int diasMax;
    public LocalDate entrada;
    public LocalDate salida;
    private String key;

    public Invitado(String nombre, String apellidoP, String apellidoM, int diasMax){
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.entrada = LocalDate.now();
        permisos[Permisos.ENTRAR.indice] = true;
        permisos[Permisos.SALIR.indice] = true;
        if (diasMax < 7){
            this.diasMax = diasMax;
            this.tipo = 0;
        } else{
            this.salida = LocalDate.now().plusDays(diasMax);
            this.tipo = 1;
        }
        Random random = new Random();
        int[][] intervalos = {{65,90}, {48,57}};
        for (int i = 0; i < 8; i++){
            int iIntervalos = random.nextInt(intervalos.length);
            this.key += (char)(random.nextInt((intervalos[iIntervalos][1])-(intervalos[iIntervalos][0]) + 1) + (intervalos[iIntervalos][0]));
        }
    }
    
    public Invitado(String nombre, String apellidoP, String apellidoM, LocalDate salida){
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.entrada = LocalDate.now();
        this.salida = salida;
        this.tipo = 1;
        permisos[Permisos.ENTRAR.indice] = true;
        permisos[Permisos.SALIR.indice] = true;
    }
    
    public boolean entrarInvitado(LocalDate fecha){
        if (this.tipo == 1){
            return ChronoUnit.DAYS.between(LocalDate.now(),this.salida) > 0;
        }
        return ChronoUnit.DAYS.between(entrada,LocalDate.now()) > 0;
    }
    public long diasRestantes(Invitado invitado){
        if (this.tipo == 1){
            return ChronoUnit.DAYS.between(LocalDate.now(),this.salida);
        }
        return ChronoUnit.DAYS.between(this.entrada,LocalDate.now());
    }

    public String getKey() {
        return key;
    }
    public void setNombre(String nombre){ 
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setApellidoP(String apellidoP){
        this.apellidoP = apellidoP;
    }
    public String getApellidoP(){
        return this.apellidoP;
    }
    public void setApellidoM(String apellidoM){
        this.apellidoM = apellidoM;
    }
    public String getApellidoM(){
        return this.apellidoM;
    }
    public int getDiasMax(){
        return this.diasMax;
    }
    public void setDiasMax(int diasMax){
        this.diasMax = diasMax;
    }
    public LocalDate getEntrada(){
        return this.entrada;
    }

}
