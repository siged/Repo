import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());


        for (int i = 1; i <= n ; i++) {
            System.out.print(repeatStr(" ",n-i));
            System.out.println(repeatStr("* ",i));
        }
        for (int i = n-1; i >= 1 ; i--) {
            System.out.print(repeatStr(" ",n-i));
            System.out.println(repeatStr("* ",i));
        }
    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}
