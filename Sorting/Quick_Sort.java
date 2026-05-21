import java.util.Scanner;

public class Quick_Sort{
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        
        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        
        i++;
        int tmp = arr[i];
        arr[i] = arr[high];
        arr[high] = tmp;
        return i;
    }
    
    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Array Size : ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        
        System.out.println("Enter Array Element : ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        
        int n = arr.length;
        quickSort(arr, 0, n-1);
        
        // Print
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}