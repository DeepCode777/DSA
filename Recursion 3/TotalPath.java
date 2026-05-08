import java.util.Scanner ;

public class TotalPath{
    public static int countPath(int i, int j, int n, int m){
        if(i == n || j == m){
            return 0;
        }
        if (i == n-1 && j == m-1){
            return 1;
        }
        //To move Down
        int downPaths = countPath(i+1, j, n, m);
        // To Move Right
        int rightPaths = countPath (i, j+1, n, m);
        
        return downPaths+rightPaths;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Your Maze Size !");

        System.out.println("Enter Number Of Row of Maze : ");
        int n = sc.nextInt();

        System.out.println("Enter Number Of Colunn of Maze : ");
        int m = sc.nextInt();

        System.out.println(countPath(0,0,n,m));
        
    }
}