import java.text.DecimalFormat;
import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <=n ; i++) {
            DecimalFormat df = new DecimalFormat("#");

            System.out.println(df.format(Math.pow(2,i)));
        }
    }
}
