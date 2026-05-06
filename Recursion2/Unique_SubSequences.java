import  java.util.HashSet;
import java.util.Scanner;

public class Unique_SubSequences
{
    public static void subSequence (String str, int index, String newString, HashSet<String> set){
        
        if(index == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return ;
            }
        }
        
        char curChar = str.charAt(index);
        // To Come
        subSequence(str, index+1, newString+curChar, set);
        //To Not to Come
        subSequence(str, index+1,newString,set);
    }
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String : ");
        String str = sc.nextLine();
        HashSet<String> set = new HashSet<>();
        
        subSequence(str, 0, "", set);
    }
}