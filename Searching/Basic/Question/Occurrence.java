import java.util.Scanner;

public class Occurrenc {

    public static void occurence(int[] arr, int find) {
        int first = -1;
        int last = first;
        
        for (int i=0; i<arr.length; i++){
            if (arr[i] == find){
                if ( first == -1){
                    first = i;
                }else{
                    last = i;
                }
            }
        }
        if (first == -1 && last == -1){
            System.out.println("Position Not Found :");
        }else{
            System.out.println(" Fist Position Is : [" + first + "] and Last Position Is : [" + last +"]");
        }
    }

    public static void main(String[] args) {
        System.out.println("---- Find Occurrences ----");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Find Element : ");
        int find = sc.nextInt();

        occurence(arr,find);
        
        sc.close();
    }
}