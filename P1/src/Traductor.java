import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Traductor {
    public static void main(String[] args) throws URISyntaxException, IOException {

        int iTime = Integer.parseInt(args[0]);
        String sIdiomaOrigen = selectorIdioma(args[1]);
        String sIdiomaDestino = selectorIdioma(args[2]);
        System.out.println("Introduce el texto a traducir");
        Scanner sc =new Scanner(System.in);
        String sInput = sc.nextLine();
        String sUrl = "https://translate.google.es/?hl=es#view=home&op=translate&sl=" +
                sIdiomaOrigen +
                "&tl=" +
                sIdiomaDestino +
                "&text="+
                convertirEspacio(sInput);
        //String temp = makeUrl(sIdiomaOrigen, sIdiomaDestino );

        /*
        https://translate.google.es/?hl=es#view=home&op=translate&sl=en&tl=es&text=cipote%20home
         */

        Desktop.getDesktop().browse(new URI(sUrl));



    }
    private static String convertirEspacio(String sText){
        return sText.replace(" ","%20");
    }
    private static String selectorIdioma(String sIdioma){
        String sResultado = "";

        if (sIdioma.equals("español")){
            sResultado = "es";
        }else if (sIdioma.equals("ingles")){
            sResultado = "en";
        }


        return sResultado;
    }

    private static String makeUrl(String sOrigen, String sDestino){

        String sResultado = "",sInput;

        System.out.println("Escribe la frase a traducir.");
        Scanner sc =new Scanner(System.in);
        sInput = sc.nextLine();

        /*
        Cambiar espacios por %20
         */
        sInput = sInput.replace(" ","%20");


        /*
        Contruir url
         */
        String Url = "https://translate.google.es/?hl=es#view=home&op=translate&sl=" +
                sOrigen +
                "&tl=" +
                sDestino +
                "&text="+
                sInput;
        System.out.println(Url);
        return sResultado;
    }
}
