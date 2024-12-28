package practice;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a numner");
        int n = sc.nextInt();
        int x = n;
        int rem , k= 0;
        int rev = 0;
        while(n>0){
            rem = n%10;
            rev = rev*10 + rem;
            k = rev;
            n/=10;
        }
        if(x == k){
            System.out.println("Entered number is palindrome");

        }
        else{
            System.out.println("Entered number is not palindrome");
        }
        
        
    }
       
}
