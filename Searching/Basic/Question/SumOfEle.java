import java.util.Scanner;

public class SumOfEle {

    public static int linearSearch(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("---- Sum Of Elements -----");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        int result = linearSearch(arr);

        if (result == 0) {
            System.out.println("Element not found");
        } else {
            System.out.println("Elements Sum is : " + result);
        }

        sc.close();
    }
}
