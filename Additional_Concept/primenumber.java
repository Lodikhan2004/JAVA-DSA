package Additional_Concept;
import java.util.*;
public class primenumber {
    //Calculates prime number or not
    public static boolean prime(int n){    
       boolean isPrime=true;
       for(int i=2; i<=Math.sqrt(n); i++){
        if(n % i==0){
            isPrime=false;
            break;
        }
       }
       return isPrime;
    }

    //Prime numbers in range
    public static void primeInRange(int n){    
       for(int i=2; i<=n; i++){
        if(prime(i)){
            System.out.print(i+" ");
        }
       }
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        int n=sc.nextInt();
        sc.close();
        if(n<2){
            System.out.println("Not prime!");
            return ;
        }
        primeInRange(n);

       /*  boolean prime=prime(n);
        if(prime==true){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }*/
        
    }
    
}
