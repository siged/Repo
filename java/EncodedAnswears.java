
import java.util.Scanner;

public class EncodedAnswers {

    public static void main(String[] args) {
        Scanner scan = new java.util.Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String result = "";
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        String answer;
        for (int i = 0; i < n; i++) {
            long answerAsNumber = Long.parseLong(scan.nextLine());

            if (answerAsNumber % 4 == 0) {
                answer = "a";
                countA++;
            } else if (answerAsNumber % 4 == 1) {
                answer = "b";
                countB++;
            } else if (answerAsNumber % 4 == 2) {
                answer = "c";
                countC++;
            } else {
                answer = "d";
                countD++;
            }

            result += answer + ' ';
        }

        System.out.println(result);
        System.out.printf("Answer A: %d\nAnswer B: %d\nAnswer C: %d\nAnswer D: %d", countA, countB, countC, countD);
    }
}
