import java.util.Scanner;
public class Factorial
{
    public static void factorial(int n, int fac){
        if (n == 0){
            System.out.println(fac);
            return;
        }
        fac *= n;
        factorial(n-1,fac);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Your Last Number Till the Factorial");
        int n = sc.nextInt();
        int fac = 1;
        factorial(n,fac);
    }
}