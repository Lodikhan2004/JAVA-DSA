package Recursion;
//Amazon Question
public class Tilling {
    public static int tile(int n){
        //Base Condition
        if(n == 0 | n == 1){
            return 1; //no of ways is 1
        }
        int vertical = tile(n-1);
        int horizontal = tile(n-2);

        int totalways = vertical + horizontal; //total no of ways 
        return totalways;


    }
    public static void main(String[] args) {
        System.out.println(tile(3));
    }
    
}

