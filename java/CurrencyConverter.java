


import java.util.Scanner;


public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Conver USD, EUR or GBP to BGN");
        System.out.print("Enter Currency: ");
        String currency = scan.nextLine().toLowerCase();
        System.out.print("Add value: ");
        double value = Double.parseDouble(scan.nextLine());
        double convertedCurrency = 0;
        
        switch (currency) {
            case "usd":
                convertedCurrency = value * 1.72;
                System.out.printf("%.2f BGN%n",convertedCurrency);
                break;
                
            case "eur":
                convertedCurrency = value * 1.95;
                System.out.printf("%.2f BGN%n",convertedCurrency);
                break;
                
            case "gbp":
                convertedCurrency = value * 2.32;
                System.out.printf("%.2f BGN%n",convertedCurrency);
            default:
                System.out.println("Incorrect Currency.");
                break;
        }
    }
}
