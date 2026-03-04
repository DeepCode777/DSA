import java.util.Scanner;

public class twoDarray_7
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int row = sc.nextInt();
        int column = sc.nextInt();
        
        int array[][] = new int[row][column];
        
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                array[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.println("["+i+"]["+j+"] = "+array[i][j]);
            }
        }
    }
}