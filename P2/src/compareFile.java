import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class compareFile {
    public static void main(String[] args) {
        String sFile1 =  args[0], sFile2 = args[1];
        boolean bIguales = true;


        BufferedReader bRead1 = null, bRead2 = null;

        try {
            bRead1 = new BufferedReader(new FileReader(sFile1));
            bRead2 = new BufferedReader(new FileReader(sFile2));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String sLinea1 = "",sLinea2 = "";
        do {
            try {
                sLinea1 = bRead1.readLine();
                sLinea2 = bRead2.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (!sLinea1.equals(sLinea2)){
                bIguales = false;
            }
        }while(sLinea1 != null || sLinea2 != null && bIguales == true);

        if (bIguales){
            System.out.println("Los archivos son iguales.");
        }else{
            System.out.println("Los archivos no son iguales.");
        }

    }
}
