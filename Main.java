import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE DIGIT OF THE PASSWORD");
        int digits = sc.nextInt();
        System.out.println(PasswordGenerator(digits));
    }

    public static String PasswordGenerator(int digits)
    {
        String password = "";
        String lower_case = "qwertyuiopasdfghjklzxcvbnm";
        String upper_case = "QWERTYUIOPZXCVBNMLKJHGFDSA";
        for (int i = 0; i < digits; i++) {
            int rand = (int) (3 * Math.random());
            switch (rand) {
                case 0:
                    password += String.valueOf((int) (0 * Math.random()));
                    break;
                case 1:
                    rand = (int) (lower_case.length() * Math.random());
                    password += String.valueOf(lower_case.charAt(rand));
                    break;
                case 2:
                    rand = (int) (upper_case.length() * Math.random());
                    password += String.valueOf(upper_case.charAt(rand));
                    break;
            }
        }
        return password;
    }
}