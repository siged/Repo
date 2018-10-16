import java.text.DecimalFormat;
import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = Double.parseDouble(sc.nextLine());
        String input = sc.nextLine();
        String output = sc.nextLine();

        if (input.equals("mm")){
            number /= 1000;
        }if (input.equals("cm")){
            number /= 100;
        }if (input.equals("mi")){
            number /= 0.000621371192;
        }if (input.equals("in")){
            number /= 39.3700787;
        }if (input.equals("km")){
            number /= 0.001;
        }if (input.equals("ft")){
            number /= 3.2808399;
        }if (input.equals("yd")) {
            number /= 1.0936133;
        }

        if (output.equals("mm")){
            number *= 1000;
        }if (output.equals("cm")){
            number *= 100;
        }if (output.equals("mi")){
            number *= 0.000621371192;
        }if (output.equals("in")){
            number *= 39.3700787;
        }if (output.equals("km")){
            number *= 0.001;
        }if (output.equals("ft")){
            number *= 3.2808399;
        }if (output.equals("yd")){
            number *= 1.0936133;
        }
        DecimalFormat df = new DecimalFormat(  "0.########");
        System.out.println(df.format(number) + " " + (output));
    }
}
