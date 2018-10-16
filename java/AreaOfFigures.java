import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String figura = sc.nextLine();
        double num1 = Double.parseDouble(sc.nextLine());

         if (figura.equals("square")){
             num1 = num1 * num1;
             System.out.println(num1);
         }else if (figura.equals("rectangle")){
             double num2 = Double.parseDouble(sc.nextLine());
             num1 *= num2;
             System.out.println(num1);
         }else if (figura.equals("circle")){
             num1 *= Math.PI * num1;
             System.out.println(num1);
         }else if (figura.equals("triangle")){
             double num2 =Double.parseDouble(sc.nextLine());
             num1 = (num1 * num2)/2;
             System.out.println(num1);
         }
    }
}
