package practice;
// this code is for armstrong numbers from 1 - 100000;

import java.util.Scanner;

public class Armstrong_10000 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i = 1;i <=100000;i++){
            if(Armstrong_number(i)){
                System.out.println(i);
            }
        }


    }
    static boolean Armstrong_number(int n){
        int m = n;
       int k = 0;
       int ans = 0;
       while(n>0){
        int rem = n%10;
        k = rem*rem*rem;
        ans += k;
        k = 0;
        n/=10;

       }
       if (m == ans) {
        return  true;
       }
       else{
        return false;
       }

    }
}
