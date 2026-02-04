import java.util.Scanner;

public class ReverseString
{
    public static void printRev(String str, int idx){
        if(idx == 0){                //check index number
            System.out.print(str.charAt(idx));
            return ;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printRev(str, str.length()-1);
    }
}