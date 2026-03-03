import java.util.Scanner;

public class findMinMax_5
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Define Array Size : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        int  min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        System.out.println("Enter Elements in Array : ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(min+ " Is Minimum number");
        System.out.println(max+ " Is Maximum number");
    }
}