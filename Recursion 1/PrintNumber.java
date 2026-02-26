import java.util.Scanner;

public class PrintNumber
{
    public static void printNumber(int n, int end){
        if (n == end){
            System.out.println(n);
            return ;
        }
        System.out.println(n);
        printNumber(n+1,end);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Staring Number : ");
        int n = sc.nextInt();
        
        System.out.println("Enter Last Number : ");
        int end = sc.nextInt();
        
        if(n <= end){
            printNumber(n,end);
        }else{
            System.out.println("ENTER VALID NUMBER...!");
        }
    }
}