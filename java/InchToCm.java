import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       double in = scanner.nextDouble();

       double cm = in * 2.54;
        System.out.println(cm);
    }
}
