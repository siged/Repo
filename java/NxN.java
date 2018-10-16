import java.util.Scanner;

public class NxN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i <n ; i++) {

            System.out.println(repeatStr("*",n));

            }

    }static String repeatStr(String strToRepeat, int count){
        String text = "";
        for (int i = 0; i <count ; i++) {
            text += strToRepeat;
        }return text;
}}
