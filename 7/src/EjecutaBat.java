import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EjecutaBat {
    public static void main(String[] args) throws IOException {
        ProcessBuilder pb = new ProcessBuilder(args[0]);

        /*
        Las barras estan colocadas asi para que funcione tanto en Windows y en Linux.
         */
        pb.redirectOutput(new File("Instrucciones//Logs//SalidaBat.txt"));
        pb.redirectError(new File("Instrucciones//Logs//errorBat.txt"));
        pb.start();
    }
}
