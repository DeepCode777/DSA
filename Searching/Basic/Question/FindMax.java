import java.util.Scanner;

public class FindMax{

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("---- Count Occurrences ----");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findMax(arr);

        if (result == 0) {
            System.out.println("Element not found");
        } else {
            System.out.println("Max Element found : " + result);
        }
        sc.close();
    }
}
