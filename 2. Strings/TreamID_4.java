import java.util.Scanner;

public class TreamID_4 {
    public static String getUsername(String email) {
        String username = "";

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                break;
            } else {
                username += email.charAt(i);
            }
        }
        return username;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();

        String username = getUsername(email);

        System.out.println(username);
    }
}