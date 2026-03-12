import java.util.Scanner;


public class String_2
{
    public static void combineLength(String[] arr){
        int sum = 0;
        int total =0;
        
        for(int i=0; i<arr.length; i++){
            sum = arr[i].length();
            System.out.println("[" +arr[i]+"] -> Length Is = "+sum);
            total += sum;
            sum = 0;
        }
        System.out.println("Combine Length Of Given Array : " +total);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] arr = new String [size];
        
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.next();
        }
        
        combineLength(arr);
    }
}