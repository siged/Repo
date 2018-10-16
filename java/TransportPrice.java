import java.util.Scanner;
import java.math.BigDecimal;
public class JavaIntro {

    public static void main(String[] args) {
        Scanner scan = new java.util.Scanner(System.in);
        
        double kilometers = Double.parseDouble(scan.nextLine());
        String daytime = scan.nextLine().toLowerCase();
        double price = 0;
        
        
                if (kilometers < 20 && daytime.equals("day")) {
                    price = kilometers * 0.79 + 0.7;
                }else if (kilometers < 20 && daytime.equals("night")) {
                    price = kilometers * 0.9 + 0.7;
                }
                else if (kilometers >= 20 && kilometers < 100){
                    price = kilometers * 0.09;
                }else if (kilometers > 100){
                    price = kilometers * 0.06;
                }
            System.out.printf("%.2f",price);
        }
    }
