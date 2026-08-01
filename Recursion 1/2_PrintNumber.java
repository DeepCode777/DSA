import java.util.Scanner;
public class Program
{
    public static void printNumber(int n,int m){
        if (n == m+1){
            return;
        }
        System.out.println(n);
        printNumber(n+1,m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        printNumber(n,m);
    }
}