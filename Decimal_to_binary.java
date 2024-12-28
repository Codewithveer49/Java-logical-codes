package practice;

import java.util.Scanner;

public class DecimaltoBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;// conversion to binary number ;
        int power = 1;
        while(n!=0){
            int parity = n%2;
            ans = ans + parity*power;
            power *= 10;
            n/=2;

        }
        System.out.println(ans);
    }
}
