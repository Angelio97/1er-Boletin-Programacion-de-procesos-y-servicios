import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws InterruptedException, IOException {

        // Constante de tiempo a esperar para volver a pedir la nueva URL.
        final int WAIT = 10000;

        final String sRutaProceso = "C:\\Users\\enriq\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe";
        // Scanner para recoger datos.
        Scanner sc = new Scanner(System.in);
        String iUrl;

        do {

            System.out.println("Escribe la url a la que deseas ir:\n" + "Para salir escribe 'salir'");
            iUrl = sc.nextLine();
            List<String> jvmArgs = new ArrayList<>();
            List<String> argsM = new ArrayList<>();
            argsM.add(iUrl);

            if (!iUrl.equals("salir")) {
                Process pb = JavaProcess.exec(abrirNavegador.class ,jvmArgs, argsM);

                pb.waitFor();
                Thread.sleep(WAIT);

            } else {
                System.out.println("Saliendo...");
            }

        } while (!iUrl.equals("salir"));

    }

}
