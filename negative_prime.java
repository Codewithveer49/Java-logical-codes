package practice;

import java.util.Scanner;
// negative prime factors

public class prime_negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i = -2;i > n;i--){
            while(n%i==0){
                System.out.println(i);
                n/=i;
            }
        }
        if(n < -2){
            System.out.println(n);
        }


    }
}
