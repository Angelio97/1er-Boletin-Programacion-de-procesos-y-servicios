public class Hijo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Proceso hijo.");
        Thread.sleep(3000);
        System.out.println("Terminado proceso hijo.");
        System.exit(2);
    }
}
