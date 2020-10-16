import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class checkUser {
    public static void main(String[] args) {
        String sName = args[0];
        Process p = null;
        if(System.getProperty("os.name").equals("Windows 10")){
            ProcessBuilder pb = new ProcessBuilder("cmd","/c net user "+sName);

            try {
                p = pb.start();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                System.exit(p.waitFor());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }else{
            String[] sLinux ={"/bin/bash", "-c", "getent passwd | grep "+sName};
            try {
                p = Runtime.getRuntime().exec(sLinux);
            } catch (IOException e) {
                e.printStackTrace();
            }

            BufferedReader bF = new BufferedReader(new InputStreamReader(p.getInputStream()));

            try {
                if (bF.readLine()!= null){
                    System.out.println("El usuario existe.");
                    System.exit(0);
                }else{
                    System.out.println("El usuario no existe.");
                    System.exit(1);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
