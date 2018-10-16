import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine().toLowerCase();
        String city = sc.nextLine().toLowerCase();
        double quantity = Double.parseDouble(sc.nextLine());

        if (product.equals("coffee")){
            if (city.equals("sofia")){
                System.out.println(quantity*0.50);
            }else if (city.equals("plovdiv")){
                System.out.println(quantity*0.40);
            }else if (city.equals("varna")){
                System.out.println(quantity*0.45);
            }
        } if (product.equals("water")){
            if (city.equals("sofia")){
                System.out.println(quantity*0.80);
            }else if (city.equals("plovdiv")){
                System.out.println(quantity*0.70);
            }else if (city.equals("varna")) {
                System.out.println(quantity * 0.70);
            }
            } if (product.equals("beer")){
                if (city.equals("sofia")){
                    System.out.println(quantity*1.20);
                }else if (city.equals("plovdiv")){
                    System.out.println(quantity*1.15);
                }else if (city.equals("varna")){
                    System.out.println(quantity*1.10);
                }}
                if (product.equals("sweets")){
                    if (city.equals("sofia")){
                        System.out.println(quantity*1.45);
                    }else if (city.equals("plovdiv")){
                        System.out.println(quantity*1.30);
                    }else if (city.equals("varna")){
                        System.out.println(quantity*1.35);
                    }
                }
                if (product.equals("peanuts")){
                    if (city.equals("sofia")){
                        System.out.println(quantity*1.60);
                    }else if (city.equals("plovdiv")){
                        System.out.println(quantity*1.50);
                    }else if (city.equals("varna")){
                        System.out.println(quantity*1.55);
                    }
                }
            }
        }
