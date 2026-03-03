import java.util.Scanner;

public class isSorted_6
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Define Array Size : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        
        System.out.println("Enter Elements in Array : ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        
        boolean isSorted = true;
        
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] < arr[i+1]){
                isSorted = true;
            }else{
                System.out.println("Is Not Shorted");
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Is Shorted");
        }
    }
}