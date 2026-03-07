public class sumOfTwoD_11
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int column = sc.nextInt();

        int array[][] = new int[row][column];
        
        int sum = 0;
        int colSum = 0;
        int rowSum = 0;

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                array[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.println("["+i+"]["+j+"] = "+array[i][j]);
                rowSum += array[i][j];
            }
            System.out.println("Sum of row " +(i+1)+ " = "+rowSum);
            rowSum = 0;
        }
        
        for(int j=0; j<column; j++){
            for(int i=0; i<row; i++){
                System.out.println("["+i+"]["+j+"] = "+array[i][j]);
                colSum += array[i][j];
                sum += array[i][j];
            }
            System.out.println("Sum of column " +(j+1)+ " = "+colSum);
            colSum = 0;
        }
        System.out.println("Sum Of Whole Metrix is = "+sum);
    }
}