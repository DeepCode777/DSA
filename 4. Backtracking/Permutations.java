import java.util.Scanner;

public class Permutations{
    public static void printPermutation(String str, int index, String perm){
        if(str.length() == 0 ){
            System.out.println(perm);
            return ;
        }
        for(int i=0; i<str.length(); i++){
            char curChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            printPermutation(newStr, index+1, perm+curChar);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printPermutation(str, 0, "");
    }
}