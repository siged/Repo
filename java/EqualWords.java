import java.util.Scanner;

public class EqualWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine().toLowerCase();
        String word2 = sc.nextLine().toLowerCase();
        if (word1.equals(word2) ){
            System.out.println("yes");
        }else if(word1 != word2){
            System.out.println("no");
        }
    }
}
