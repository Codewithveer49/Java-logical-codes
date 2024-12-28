package practice;

import java.util.Scanner;

public class greatest_CD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Dividend");
        int dividend = sc.nextInt();
        System.out.println("Enter a divisor");
        int divisor = sc.nextInt();
        int min = dividend<divisor? dividend : divisor;
        int hcf = 0;

        for(int i = 1;i <= min;i++){
            if(dividend%i==0 && divisor%i==0){
                 hcf = i;
            }

        }
        System.out.println("HCF = "+hcf);

    }
}
