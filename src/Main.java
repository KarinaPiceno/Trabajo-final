import java.io.IOException;

public class Main {
 public static void main(String[] args) {
         Server server = new Server(5000);
         //while(true){
             System.out.println("Running server");
             try{
                 server.run();
             } catch (IOException e) {
                System.out.println(e);
             }
         //}
       
    }
}
