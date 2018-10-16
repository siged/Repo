import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double age = Double.parseDouble(sc.nextLine());
        String gender = sc.nextLine();

        if(age<16){
            if (gender.equals("f")){
                System.out.println("Miss");
            }else {
                System.out.println("Master");
            }
        }else {
            if(gender.equals("f")){
                System.out.println("Ms.");
            }else {
                System.out.println("Mr.");
            }
        }
    }
}
