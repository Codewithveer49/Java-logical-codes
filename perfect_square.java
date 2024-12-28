package practice;

public class perfect_square {
    public static void main(String[] args) {
        for(int i = 1;i <=10000;i++){
            if(perfect_square(i)){
                System.out.println(i);
            }
        }
       

    }
    static boolean perfect_square(int n){
        int k = 0;
        for(int i = 1;i<n;i++){
            if (n%i==0) {
                k += i;
            }
        }
        if(k == n){
            return  true;
        }
        else{
            return false;
        }

    }
}
