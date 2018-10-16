
import java.util.Scanner;

public class Randomizer extends Thread {

    private static char letter;

    public void run() {
        while (true) {

            for (char i = '\u0000'; i <= '\u25ff'; i++) {

                letter = i;

            }
        }
    }

    public static void main(String[] args) {

        Scanner scan = new java.util.Scanner(System.in);
        Randomizer thread = new Randomizer();
        try {
            thread.start();
            
        } catch (Exception ex) {

        }
         String str = scan.nextLine();

         if (str.equals("stop")) {
        try {
            thread.stop();
            System.out.println(letter);
        } catch (Exception ex) {

        }
         }
    }
}
