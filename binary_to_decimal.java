package practice;
import java.util.Scanner;

public class binarytoDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number");
        int n = sc.nextInt();
        int ans = 0;// converted decimal number;
        int pw = 1;//2 ^ 0 = 1 power of 2
        while(n>0){
            int unit = n%10;
            ans = ans + unit*pw;
            n/=10;
            pw *= 2;// increases the value of power every by multiplying by 2;

        }
        System.out.println("Binary :- "+ans);
    }
}
