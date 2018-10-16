import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int a = Integer.parseInt(sc.nextLine());
         int b = Integer.parseInt(sc.nextLine());

         while (b!=0){
             int Oldb = b;
             b = a%b;
             a=Oldb;

         }
        System.out.println("GSD "+a);
    }
}
