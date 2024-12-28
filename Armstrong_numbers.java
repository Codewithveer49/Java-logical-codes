package practice;

import java.util.Scanner;

public class Armstrong_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a armstrong number to check :- ");
        int n = sc.nextInt();
        int m = n;
        int k = 0;
        int ans  = 0;
        int rem = 0;
        while(n>0){
            rem = n%10;
            k = rem*rem*rem;
            ans += k;
            k = 0;
            n/=10;

        }
        if(m == ans){
            System.out.println("entered number is armstrong number");
        }
        else{
            System.out.println("entered number is not armstrong number");
        }
    }
}
