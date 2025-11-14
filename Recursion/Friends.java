package Recursion;


public class Friends {
    public static int friendsPairing(int n){
        //Base case
        if(n == 1 | n == 2){
            return n;

        }

        //Single
        int fnm1 = friendsPairing(n-1);
        //Pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;
        //TotalWays
        int totalways = fnm1 + pairWays;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
        
    }
    
}
