package BitManipulation;
import java.util.*;
public class BitWiseOperations {
    public static void even_odd(int num){
        int bitMask = 1;
        if( (num & bitMask) == 0){
            System.out.println("GIVEN NUMBER " + num + "IS EVEN");
        }
        else{
            System.out.println("GIVEN NUMBER " + num + " IS ODD");

        }
    }
    public static void getIthBit(int num, int i){
        int bitMask = ( 1 << i);
        if((num & bitMask)== 0){
            System.out.println("ith BIT IS : 0 " );
        }
        else{
            System.out.println("ith BIT IS : 1 " );

        }
    }

    public static int setIthBit(int num, int i){
        int bitMask = ( 1 << i);
        return (num | bitMask);
    }

    public static int clearIthBit(int num, int i){
        int bitMask = ~( 1 << i);
        return (num & bitMask);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER A NUM :");
        int num=sc.nextInt();
        System.out.println("Enter the ith position u want to know");
        int i=sc.nextInt();
        //even_odd(num);   
        //getIthBit(num, i);
        //System.out.println(setIthBit(num, i) );
        System.out.println(clearIthBit(num, i) );
        sc.close();
    }
    
}
