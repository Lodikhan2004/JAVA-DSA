package BitManipulation;
import java.util.Scanner;
public class IsPowerOf2 {
    //check if a number is power of 2 or not
    public static boolean isPowerOf2(int num){
        if((num & (num-1)) ==0 ){
         return true;
        }
        return false;
     }
      
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER A NUM :");
        int num=sc.nextInt();
        System.out.println(isPowerOf2(num));
        sc.close();
     }
}
