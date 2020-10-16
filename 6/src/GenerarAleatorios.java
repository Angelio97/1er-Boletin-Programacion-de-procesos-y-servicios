import java.util.Random;

public class GenerarAleatorios {
    public static void main(String[] args) {
       Random r  = new Random();
       int iRandom = r.nextInt(11);
       System.out.println("Numero generado: "+iRandom);
       System.exit(iRandom);
    }
}
