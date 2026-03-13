import java.util.Scanner;

public class replaceLetter_4
{
    public static String replaceChar(String str){
        return str.replace('e','i');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = replaceChar(str);
        System.out.println(result);
    }
}