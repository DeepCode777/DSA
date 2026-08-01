import java.util.Scanner;
public class Fibonacci
{
    public static void fibonacci(int a, int b, int n){
        if (n == 0){
            return;
        }
        System.out.println(a);
        fibonacci(b, a+b, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Your First Starting Number Of Fibonacci");
        int n = sc.nextInt();
        
        System.out.println("Enter Your Second Number Of Fibonacci");
        int m = sc.nextInt();
        
        System.out.println("Enter Your Steps Of Fibonacci Sequence");
        int fibo = sc.nextInt();
        
        fibonacci(n,m,fibo);
    }
}