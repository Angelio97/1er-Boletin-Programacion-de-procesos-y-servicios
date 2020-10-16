import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Aleatorio {
    public static void main(String[] args) throws IOException, InterruptedException {
        List<String> jvmArgs = new ArrayList<>();
        List<String> argsM = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String sRespuesta = "";
        do {
            Process p = JavaProcess.exec(GenerarAleatorios.class, jvmArgs, argsM);
            Random random = new Random();
            int iRandom = random.nextInt(11);
            System.out.println("Numero padre: "+iRandom);
            if (iRandom == p.exitValue()){
                System.out.println("Los numeros son iguales!");
            }else
                System.out.println("Los numeros son diferentes!");

            System.out.println("Desea generar otro numero aleatorio?(s/n)");
            sRespuesta = sc.nextLine();

        }while( sRespuesta.equals("s"));


    }
}
