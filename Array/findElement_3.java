import java.util.Scanner;

public class findElement_3
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

        int find = sc.nextInt();
        
        System.out.println("Printing Your Array");
        for(int i=0; i<arr.length; i++){
            if(arr[i] == find){
                System.out.println(find + " is on " +i+ " Element");
            }
        }
    }
}