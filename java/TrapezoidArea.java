import java.util.Scanner;

public class p05_TrapezoidArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double b1 = Double.parseDouble(sc.nextLine());
        double b2 = Double.parseDouble(sc.nextLine());
        double h = Double.parseDouble(sc.nextLine());
        double S = (b1+b2)*h/2;
        System.out.println(S);

    }
}
