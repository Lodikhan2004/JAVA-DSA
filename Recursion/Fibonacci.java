package Recursion;

public class Fibonacci {
    public static int fib(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        int fibo = fib(n-1) + fib(n-2);
        return fibo;

    }
    public static void main(String args[]){
        int n = 5 ;
        System.out.println("Fibonacci number :" + fib(n));

    }
    
}
