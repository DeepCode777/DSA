import java.util.Scanner;

public class array
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Define Size If Array : ");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        
        System.out.println("Enter Elements in Array : ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Printing Your Array");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}