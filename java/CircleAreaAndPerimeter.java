import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = Double.parseDouble(sc.nextLine());
        double A = Math.PI * r * r;
        double P = 2 * Math.PI * r;
        System.out.println(A);
        System.out.println(P);
    }
}
