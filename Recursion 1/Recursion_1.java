import java.util.Scanner;

public class Recursion_1
{
    public static void Print(int n){
        if (n == 0){
            return ;
        }
        System.out.println(n);
        Print(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Print(n);
    }
}