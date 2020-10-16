import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException, InterruptedException {

        String iTime = args[0];
        String sIdiomaOrigen = args[1];
        String sIdiomaDestino = args[2];

        List<String> jvmArgs = new ArrayList<>();
        List<String> argsM = new ArrayList<>();

        argsM.add(iTime);
        argsM.add(sIdiomaOrigen);
        argsM.add(sIdiomaDestino);

        Process p = JavaProcess.exec(Traductor.class, jvmArgs, argsM);

    }
}
