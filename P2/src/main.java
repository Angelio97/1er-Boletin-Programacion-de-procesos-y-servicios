import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> jvmArgs = new ArrayList<>();
        List<String> argsM = new ArrayList<>();

        if (args.length == 1){
            argsM.add(args[0]);
        }else if (args.length == 2){
            argsM.add(args[0]);
            argsM.add(args[1]);
        }else{
            System.out.println("Error en al introducir los parámetros");
        }

        try {
            Process p = JavaProcess.exec(checkUser.class,jvmArgs,argsM);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
