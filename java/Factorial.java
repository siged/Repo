import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int n = Integer.parseInt(sc.nextLine());

         int factorial = 1;
         do {
             factorial = factorial * n ;
             n--;
         }
         while(n>1);
        System.out.println(factorial);

        }
    }

