import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {
        Scanner scan = new java.util.Scanner(System.in);
        
        for (int i = 1; i <= 10; i++) {
            for (int j = i + 1; j <= 10; j++) {
                for (int k = j + 1; k <= 10; k++) {
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }

        }
   
    }
