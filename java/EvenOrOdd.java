import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grade = Double.parseDouble(sc.nextLine());

        if (grade % 2 == 0) {
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }


    }
}
