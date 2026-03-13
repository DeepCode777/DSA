import java.util.Scanner;

public class ReplaceLetter
{
    public static void replaceLetter(StringBuilder sb){
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i) == 'e'){
                sb.setCharAt(i,'i');
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        StringBuilder sb = new StringBuilder(sc.nextLine());
        
        replaceLetter(sb);
    }
}