import java.util.Scanner;
public class Program
{
    public static void Sum(int n, int sum){
        if (n == 0){
            System.out.println(sum);
            return;
        }
        sum += n;
        Sum(n-1,sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Your Last Number Till the Sum");
        int n = sc.nextInt();
        int sum = 0;
        Sum(n,sum);
    }
}