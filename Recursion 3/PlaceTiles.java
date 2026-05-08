import java.util.Scanner;

public class PlaceTiles{
    public static int placeTile(int n, int m){
        if(n == m){
            return 2;
        }
        if(n < m){
            return 1;
        }
        int vertical = placeTile(n-m, m);
        int horizontal = placeTile(n-1, m);
        
        return vertical+horizontal ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Horizontal Tile Size : ");
        int n = sc.nextInt();
        
        System.out.println("Enter Verticla Tile Size : ");
        int m = sc.nextInt();
        
        System.out.println("Total Possible Way To Place Tile: " +placeTile(n,m));
    }
}