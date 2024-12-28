package practice;

import java.util.Scanner;

public class lowest_CM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Dividend");
        int dividend = sc.nextInt();
        System.out.println("Enter a divisor");
        int divisor = sc.nextInt();
        int lcm = dividend<divisor? dividend : divisor;
        while(true){
            if(lcm%dividend == 0 && lcm%divisor == 0){
                System.out.println("LCM is = "+lcm);
                break;
            }
           ++lcm;
        }
        // you can use formula such as ((dividend*divisor)/GCD) by using grestest common divisor;
        

        
        
        
        
        
    }
}
