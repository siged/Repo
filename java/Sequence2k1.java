import java.util.Scanner;

public class Sequence2k1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <=n ; i=i*2+1) {
            System.out.println(i);
        }
    }
}
