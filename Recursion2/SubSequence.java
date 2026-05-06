import  java.util.Scanner;

public class SubSequence
{
    public static void subSequence(String str, int index, String newString){
        if(index == str.length()){
            System.out.println(newString);
            return ;
        }
        char curChar = str.charAt(index);
        // To Come
        subSequence (str, index+1, newString+curChar);
        // To Not to Come
        subSequence (str, index+1, newString);
    }
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String : ");
        String str = sc.nextLine();
        
        subSequence(str, 0, "");
    }
}