import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double C = Double.parseDouble(sc.nextLine());
        double F = C*1.8+32;
        System.out.printf("%.2f",F);
    }
}

