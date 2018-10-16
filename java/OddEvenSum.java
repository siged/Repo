import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int OddSum = 0;
        int EvenSum = 0;
        for (int i = 0; i <n  ; i++) {
            int element = Integer.parseInt(sc.nextLine());

            if (i % 2 ==0){
                OddSum += element;
                System.out.println("Yes sum = " + OddSum);
            }else {
                EvenSum += element;
                System.out.println("No diff = " + Math.abs(OddSum - EvenSum));
            }

        }

}}
