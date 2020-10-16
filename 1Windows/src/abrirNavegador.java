import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class abrirNavegador {
    public static void main(String[] args) {
       String sUrl = args[0];

       try{
           Desktop.getDesktop().browse(new URI(sUrl));
       }catch (IOException | URISyntaxException e){
           System.out.println("Error en la url");
       }
    }
}
