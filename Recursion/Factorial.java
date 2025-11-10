package Recursion;

public class Factorial {
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int factorial = n * fact(n-1);
        return factorial;

    }
    public static void main(String[] args)  {
        int n = 5  ;
       System.out.println("Factorial of " + n + " is "+ fact(n));
        
    }
    
    
}
