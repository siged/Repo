import java.util.Scanner;

public class HungryGarfield {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double money = Double.parseDouble(sc.nextLine());
        double rate = Double.parseDouble(sc.nextLine());
        double pizzaPrice = Double.parseDouble(sc.nextLine());
        double lasagnaPrice = Double.parseDouble(sc.nextLine());
        double sandwitchPrice = Double.parseDouble(sc.nextLine());
        long pizzaQuantity = Integer.parseInt(sc.nextLine());
        long lasagnaQuantity = Integer.parseInt(sc.nextLine());
        long sandwitchQuantity = Integer.parseInt(sc.nextLine());

        pizzaPrice = (pizzaPrice / rate) * pizzaQuantity;
        lasagnaPrice = (lasagnaPrice / rate) * lasagnaQuantity;
        sandwitchPrice = (sandwitchPrice / rate) * sandwitchQuantity;
        double total = pizzaPrice + lasagnaPrice + sandwitchPrice;

        if (total <= money) {
            money -= total;
            System.out.printf("Garfield is well fed, John is awesome. Money left: $%.2f.", money);
        } else if (total > money) {
            money = Math.abs(money - total);
            System.out.printf("Garfield is hungry. John is a badass. Money needed: $%.2f.", money);
        }

    }

}
