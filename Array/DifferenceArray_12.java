import java.util.Scanner;

public class DifferenceArray_12 {

    public static void differenceArray(int arr[], int start, int end, int add) {

        int diff[] = new int[arr.length + 1];

        diff[start] += add;

        if (end + 1 < diff.length) {
            diff[end + 1] -= add;
        }

        int prefix = 0;

        for (int i = 0; i < arr.length; i++) {
            prefix += diff[i];
            arr[i] += prefix;
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int start = sc.nextInt();
        int end = sc.nextInt();
        int add = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        differenceArray(arr, start, end, add);

        sc.close();
    }
}