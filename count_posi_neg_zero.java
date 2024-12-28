package practice;

import java.util.Scanner;

public class posi_zero_nega {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zero = 0;
        int pos = 0;
        int neg = 0;
        char choice ; 
        do{
            System.out.println("Enter a number");
            int n = sc.nextInt();
            if (n > 0) {
                pos++;
            }
            else if (n <0) {
                neg++;
            }
            else{
                zero++;

            }

            System.out.println("Do you want to continue?");
            choice = sc.next().charAt(0);



        }while(choice == 'y' || choice == 'Y');
        System.out.println("Positive numbers: " + pos);
        System.out.println("Negative numbers: " + neg);
        System.out.println("Zero numbers: " + zero);
    }
}
