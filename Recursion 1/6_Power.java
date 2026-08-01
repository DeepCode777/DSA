import java.util.Scanner;
public class Program
{
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        if (x == 0){
            return 0;
        }
        
        int x_ = power(x, n-1);
        //System.out.println(x + " " + x_);
        int xn = x * x_;
        // System.out.println(xn);
        return xn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int x = sc.nextInt();
        System.out.println("Enter Your Power : ");
        int n = sc.nextInt();
        
        int output = power(x,n);
        System.out.println(x+ "^" +n+ " = " +output);
    }
}