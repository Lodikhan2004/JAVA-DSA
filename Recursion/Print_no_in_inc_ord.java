package Recursion;


public class Print_no_in_inc_ord {
    public static void printInc(int n){
        if(n == 1){
            System.out.print( 1  +" ");
            return;
        }
        printInc(n-1);
        System.out.print(n +" ");
     

    }
    public static void main(String[] args) {
        int n = 5;
        printInc(n);
        
    }
    
}
