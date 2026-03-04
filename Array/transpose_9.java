import java.util.Scanner;

public class transpose_9
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

        for(int j=0; j<column; j++){
            for(int i=0; i<row; i++){
                System.out.print("["+i+"]["+j+"] = "+array[i][j]+" ");
            }
            System.out.println();
        }
    }
}