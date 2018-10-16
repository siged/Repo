import java.util.Scanner;

public class ExtractBitFromInteger {

    public static void main(String[] args) {
        Scanner scan = new java.util.Scanner(System.in);
        
        int n = scan.nextInt();
        int p = scan.nextInt();
        
        int mask = n >> p;
        int bit = mask & 1 ;
        System.out.println(bit);
        }
   
    }
