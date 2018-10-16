import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = Integer.parseInt(sc.nextLine());
        double bonus = 0;
         if (score <= 100) {
             bonus += 5;
         } else if (score > 1000) {
             bonus = score * 0.1;
         }else if(score >= 100){
             bonus += score * 0.2;
         }
        if (score % 2 == 0) {
                 bonus++;
        }
       else if (score % 10 == 5) {
             bonus += 2;
        }

        System.out.println(bonus);
        System.out.println(score + bonus);
}
    }
