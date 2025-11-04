package BitManipulation;
import java.util.*;
public class BitWiseOperations {
    //getIthBit
    public static void getIthBit(int num, int i){
        int bitMask = ( 1 << i);
        if((num & bitMask)== 0){
            System.out.println("ith BIT IS : 0 " );
        }
        else{
            System.out.println("ith BIT IS : 1 " );

        }
    }
    //setIthBit
    public static int setIthBit(int num, int i){
        int bitMask = ( 1 << i);
        return (num | bitMask);
    }
    //clearIthBit
    public static int clearIthBit(int num, int i){
        int bitMask = ~( 1 << i);
        return (num & bitMask);
    }
    //update ithbit
    public static int  updateIthBit(int num , int i , int newBit){
       /*  if(newBit == 0){
            return clearIthBit(num, i);
        }
        else{
            return setIthBit(num, i);
        }
        */

        int clear = clearIthBit(num, i);  //step 1 : clear the ith bit
        int bitMask = (newBit << i);      //step 2 : nB<<i
        return clear | bitMask ;          //step 3 : OR OF step1 and step2
    }

    public static int clearLastIBits(int num , int i){
        int bitMask = ~0<<i;  // left shift of -1or ~0 (11111111)
        return num & bitMask; // AND of num and left shift of 
    }

    public static int clearRangeOfBit(int num, int i, int j){
        int a = ~0<<(j+1);
        int b = (1<<i)-1; //doubt ?
        int bitMask = a|b;
        return num & bitMask;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER A NUM :");
        int num=sc.nextInt();
        System.out.println("Enter the ith position:");
        int i=sc.nextInt();
           
        //getIthBit(num, i);
        //System.out.println(setIthBit(num, i) );
        //System.out.println(clearIthBit(num, i) );

        //System.out.println("Enter a newBit to update:");
        //int newBit = sc.nextInt();
        //System.out.println(updateIthBit(num, i, newBit));
        //System.out.println(clearLastIBits(num, i));
        System.out.println(clearRangeOfBit(num, i,4));
        sc.close();
    }
    
}
