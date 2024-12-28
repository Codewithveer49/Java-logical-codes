package practice;

import java.util.Scanner;

public class strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a strong number");
        int n = sc.nextInt();
        int k = n;// used to print the value and store it in variable that is useful in printing the output;
        int factorial = 1;
        int ans = 0;// to store all sumation of all the factorial // eg 145  = 1! + 4! + 5!;
        int rem = 0;
        while(n>0){
            rem = n%10;
            factorial = 1;
            for(int i = 1;i<=rem;i++){
                
                factorial = factorial *i;
               
            }
            ans = ans + factorial;
            n/=10;
        }
        if (ans == k) {
            System.out.println("Entered number is strong number");
        }
        else{
            System.out.println("Entered number is not strong number");
        }

    }
}
