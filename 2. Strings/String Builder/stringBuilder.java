import java.util.Scanner;

public class stringBuilder {
    public static void combineLength(StringBuilder[] sb){
        int total = 0;
        for(int i=0; i<sb.length; i++){
            System.out.println(sb[i] +" -> Length Is = "+ sb[i].length());
            total += sb[i].length();
        }
        System.out.println("Total Length Of Array Is = " +total);
    }
    
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        StringBuilder[] sb = new StringBuilder[size];
        for(int i=0; i<size; i++){
            sb[i] = new StringBuilder(sc.next());
        }
        
        combineLength(sb);
    }
}