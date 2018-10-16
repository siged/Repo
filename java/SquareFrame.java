import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        System.out.printf("+%s +",repeatStr(" -",n-2));
        System.out.println();
        for (int i = 0; i <n-2 ; i++) {
            System.out.print("| ");
            System.out.print(repeatStr("- ",n-2));
            System.out.print("|");
            System.out.println();
        }
        System.out.printf("+%s +",repeatStr(" -",n-2));
    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}
