import java.util.Scanner;

public class findString_4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Define Size If Array : ");
        int size = sc.nextInt();

        String arr[] = new String[size];

        System.out.println("Enter Values in Array : ");
        for(int i=0; i<size; i++){
            arr[i] = sc.next();
        }

        String find = sc.next();
        System.out.println(find);
        
        System.out.println("Printing Your Array");
        for(int i=0; i<arr.length; i++){
                System.out.println(arr[i]);
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(find)){ //Compair String
                System.out.println(find + " is on " +i+ " Element");
            }
        }
    }
}