import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int max = 1000000000;
        for (int i = 0; i <n ; i++) {
            int number = Integer.parseInt(sc.nextLine());
            if(number < max){
                max = number;
            }

        }System.out.println(max);
    }
}
