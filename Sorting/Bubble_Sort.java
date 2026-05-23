import java.util.Scanner;

public class Bubble_Sort {
    // Print Array
    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Recursive Bubble Sort
    public static void bubble(int[] arr, int n) {

        // Base Case
        if(n == 1) {
            return;
        }

        boolean swap = false;

        // One Pass
        for(int j = 0; j <= n - 2; j++) {

            if(arr[j] > arr[j + 1]) {

                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

                swap = true;
            }
        }

        // Recursive Call only if swapping happened
        if(swap) {
            bubble(arr, n - 1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size Of Array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter Elements In Array : ");

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Function Call
        bubble(arr, size);

        // Final Sorted Array
        System.out.println("Sorted Array : ");
        printArray(arr);

        sc.close();
    }
}