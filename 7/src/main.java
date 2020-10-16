import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException, InterruptedException {

        List<String> jvmArgs = new ArrayList<>();
        List<String> argsM = new ArrayList<>();
        argsM.add(args[0]);
        Process p = JavaProcess.exec(EjecutaBat.class,jvmArgs,argsM);

        p.waitFor();
    }
}
