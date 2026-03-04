import java.util.Scanner;

public class findElement_8
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int row = sc.nextInt();
        int column = sc.nextInt();
        
        int array[][] = new int[row][column];
        
        int find = sc.nextInt();
        
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                array[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                if(array[i][j] == find)
                System.out.println(find +" Is on array[" +i+ "] [" +j+ "] Positon - ");
            }
        }
    }
}