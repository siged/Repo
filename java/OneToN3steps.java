import java.util.Scanner;

public class OneToN3steps {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n  ; i+=3) {
            System.out.println(i);
        }

    }
}
