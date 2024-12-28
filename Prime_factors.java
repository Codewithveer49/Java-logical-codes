package practice;

import java.util.Scanner;

public class prime_factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an number");
        int n = sc.nextInt();
        
        if ( n<0) {
            System.out.println("Enter a positive number");
        }

        for(int i = 2;i<n;i++){
            while(n%i==0){
                System.out.println(i);
                n/=i;
                
            }
        

        }
        if(n>2)System.out.println(n);
        
        
        

        

    }
}
