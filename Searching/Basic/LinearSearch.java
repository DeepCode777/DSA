import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int[] arr, int find) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("---- Linear Search -----");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number to find: ");
        int find = sc.nextInt();

        int result = linearSearch(arr, find);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }

        sc.close();
    }
}