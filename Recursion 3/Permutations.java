import java.util.Scanner ;

public class Permutations{
    public static void printPermut(String str, String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
            return ;
        }
        for(int i=0; i<str.length(); i++){
            char curChar = str.charAt(i);
            
            String newstr = str.substring(0,i) + str.substring(i+1);
            
            printPermut(newstr, permutation+curChar);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String : ");
        String str = sc.nextLine();
        
        printPermut(str, "");
    }
}