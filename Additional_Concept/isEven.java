package Additional_Concept;
import java.util.*;
public class isEven {
    public static boolean Even(int num){
        
        if(num%2==0){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        if(Even(a)){
            System.out.println("Number is even!");
        }
        else{
            System.out.println("Number is odd!");
        }
        sc.close();
        
    }
    
}
