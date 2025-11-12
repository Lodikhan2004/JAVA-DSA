package Recursion;

public class OptimizedPower {
    public static int OptPower(int x, int n){
        if(n == 0){
            return 1;
        }
        // int halfPowerSq = OptPower(x, n/2) * OptPower(x, n/2);
        int halfPower = OptPower(x, n/2);
        int halfPowerSq = halfPower * halfPower; 

        // n is odd
        if(n%2 != 0){
            return x * halfPowerSq;
        }
        return halfPowerSq;

    }
    public static void main(String[] args) {
        System.out.println(OptPower(2, 10));
        
    }
    
}
