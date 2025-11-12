package Recursion;
//Amazon Question
public class Tilling {
    public static int tile(int n){
        //Base Condition
        if(n == 0 | n == 1){
            return 1; //no of ways is 1
        }
        return  tile(n-1)+tile(n-2);


    }
    public static void main(String[] args) {
        System.out.println(tile(3));
    }
    
}

