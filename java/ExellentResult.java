import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grade = Double.parseDouble(sc.nextLine());

        if (grade >= 5.5) {
            System.out.println("Excellent!");
        } else {
            System.out.println("Not Excellent.");
        }
    }
}
