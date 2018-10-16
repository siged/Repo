import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = Integer.parseInt(sc.nextLine());
         boolean prime = true;
        
        if ( n >= 0 && n <= 2 && n % 2 != 0){
            System.out.println("Prime");
        }
        else {
            System.out.println("Not prime");
        }
    }
}
