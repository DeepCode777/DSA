import java.util.Scanner;

public class PrintCombination
{
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    
    public static void printCombination(String str, int index, String combination){
        if(index == str.length()){
            System.out.println(combination);
            return ;
        }
        
        char curChar = str.charAt(index);
        String mapping = keypad[curChar - '0'];
        
        for(int i=0; i<mapping.length(); i++){
            printCombination(str, index+1, combination+mapping.charAt(i));
        }
    }
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String : ");
        String str = sc.nextLine();
        
        printCombination (str, 0, "");
    }
}