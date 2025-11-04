package Additional_Concept;
import java.util.*;
public class isPrime {
    public static void main(String[] args) {
        int n=9;
        boolean isPrime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i == 0){
             isPrime = false;
             break; 
            }
        }
        if(isPrime){
            System.out.println("prime number");
        }
        else{
            System.out.println("not prime");
        }
         
    }
    
}
