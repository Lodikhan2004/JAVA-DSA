package BitManipulation;

import java.util.Scanner;

public class IsEven_Odd {
    
    //even or odd
    public static void even_odd(int num){
        int bitMask = 1;
        if( (num & bitMask) == 0){
            System.out.println("GIVEN NUMBER " + num + "IS EVEN");
        }
        else{
            System.out.println("GIVEN NUMBER " + num + " IS ODD");

        }
    }
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER A NUM :");
        int num=sc.nextInt();
        even_odd(num);
        sc.close();
     }    

}
