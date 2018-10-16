

import java.util.Scanner;
import java.math.BigDecimal;
public class EuroTrip {

    public static void main(String[] args) {
        Scanner scan = new java.util.Scanner(System.in);
        
        double quantity = scan.nextDouble() * 1.2;
        double dmarks = 4210500000000D;
        BigDecimal qINleva = new BigDecimal(quantity);
        BigDecimal sumINdm = new BigDecimal(dmarks);
        
        sumINdm = sumINdm.multiply(qINleva);
        
        System.out.printf("%.2f" +" "+ "marks",sumINdm);
        
        
    }
    
}
