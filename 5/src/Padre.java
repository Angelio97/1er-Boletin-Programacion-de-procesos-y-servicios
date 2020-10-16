import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Padre {
    public static void main(String[] args) throws IOException, InterruptedException {
        byte bOpcion = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Proceso padre.");

            List<String> jvmArgs = new ArrayList<>();
            List<String> argsM = new ArrayList<>();

            Process p = JavaProcess.exec(Hijo.class, jvmArgs, argsM);

            System.out.println(p.waitFor());
            System.out.println("Escribe 2 para salir!");
            bOpcion = sc.nextByte();

        }while(bOpcion != 2);

    }
}
