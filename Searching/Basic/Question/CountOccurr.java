import java.util.Scanner;

public class CountOccurr{

    public static int foundOccur(int[] arr, int find) {
        int add = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                add++;
            }
        }
        return add;
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

        System.out.println("Enter number to find: ");
        int find = sc.nextInt();

        int result = foundOccur(arr, find);

        if (result == 0) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found : " + result +" Times");
        }

        sc.close();
    }
}