import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = Integer.parseInt(sc.nextLine());

         while ( n<1 || n>100){
             System.out.println("Invalid number!");
              n = Integer.parseInt(sc.nextLine());
         }
        System.out.println("The number is " + n);
    }
}
