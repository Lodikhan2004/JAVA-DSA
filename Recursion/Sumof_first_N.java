package Recursion;

public class Sumof_first_N {
    public static int sumOfN(int n){
        if(n == 0){
            return 0;
        }
        int sum = n + sumOfN(n-1);
        return sum;
    }
    public static void main(String[] args) {
        int n =4;
        System.out.println("Sum of first N natural :" +sumOfN(n));
        
    }
    
}
