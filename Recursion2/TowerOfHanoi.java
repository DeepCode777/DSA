import java.util.Scanner;

public class TowerOfHanoi
{
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if (n == 1){
            System.out.println("Transform Disk " +n+ " From " +src+ " to " +dest);
            return ;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transform Disk " +n+ " From " +src+ " to " +dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //3
        towerOfHanoi(n, "S", "H", "D");
    }
}