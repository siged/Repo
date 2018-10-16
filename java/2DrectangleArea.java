import java.util.Scanner;

public class RectangleArea2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = Double.parseDouble(sc.nextLine());
        double y1 = Double.parseDouble(sc.nextLine());
        double x2 = Double.parseDouble(sc.nextLine());
        double y2 = Double.parseDouble(sc.nextLine());
        double width = Math.max(x1, x2) - Math.min(x1, x2);
        double height = Math.max(y1, y2) - Math.min(y1, y2);

        double P = 2 * width + 2 * height;
        double S = width * height;

        System.out.println(S);
        System.out.println(P);
    }
}
