import java.util.Scanner;

public class TreamID{
    public static String treamID(String str){
        int index = str.indexOf('@');
        return str.substring(0, index);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String email = sc.next();
        String username = treamID(email);

        System.out.println(username);
    }
}
