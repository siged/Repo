import java.util.Scanner;
import java.math.BigInteger;
public class ProductOfNandM {

    public static void main(String[] args) {
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        BigInteger result = BigInteger.ONE;
        int a = n;
        do {
            
            BigInteger multiplier = new BigInteger("" + a);
            result = result.multiply(multiplier);
            a++;
        } while (a <= m);{
    }
        System.out.printf("product[%d..%d] = %d\n",n,m,result);
        }
   
    }
