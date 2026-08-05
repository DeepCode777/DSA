import java.util.Scanner;

public class FindMin {

    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
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

        int result = findMin(arr);

        if (result == 0) {
            System.out.println("Element not found");
        } else {
            System.out.println("Mini Element found : " + result);
        }
        sc.close();
    }
}
