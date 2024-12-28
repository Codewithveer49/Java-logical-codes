package practice;

import java.util.Scanner;

public class largest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number ;
        int  max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        
        char choice ;

       do{
           System.out.print("Enter the Number :");
            number = sc.nextInt();        
            if(number > max)
            {
                max = number;
            }            
            if(number < min)
            {
                min = number;
            }  
            System.out.print("Do you want to Continue y/n ? :");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y') ;

        System.out.println("Largest number is "+max);
        System.out.println("smallest number is "+min);
        
    }
    
}
