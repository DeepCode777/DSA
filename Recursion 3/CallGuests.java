import java.util.Scanner;

public class CallGuests{
    public static int callGuest(int n){
        if(n <= 1){
            return 1;
        }
        int way1 = callGuest(n-1);
        int way2 = callGuest(n-1) * callGuest(n-2);
        
        return way1+way2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Total Number Of Guest");
        int n = sc.nextInt();
        
        System.out.println("Total Possible Way To Invite Guest : " +callGuest(n));
    }
}