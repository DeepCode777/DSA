import java.util.Scanner;

public class replaceChar_3
{
    public static void replaceChar(String str, String result){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'e'){
                result += 'i';
            }else{
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        replaceChar(str,result);
    }
}