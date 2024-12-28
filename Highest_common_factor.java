

package  practice;
import java.util.Scanner;

public class hcf{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend");
        int dividend = sc.nextInt();
        System.out.println("Enter the divisor");
        int divisor = sc.nextInt();
        int hcf = 0;

        int min = (dividend < divisor) ? dividend : divisor;

        for(int i = 1;i<= min;i++){
            if (dividend%i == 0 &&  divisor%i == 0) {
                hcf = i;
            }
        }
        System.out.println("HCF :-- "+ hcf);


    }
}
