import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        boolean neshto = number>= 100 && number<= 200 || number ==0;
        if (neshto){

        }else {
            System.out.println("invalid");
        }
    }
}
