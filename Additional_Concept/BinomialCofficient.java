package Additional_Concept;
import java.util.*;

public class BinomialCofficient {
    public static int factorial(int num){
        int f=1;
        for(int i=num;i>=1;i--){
            f= f*i;
        }
        return f;
    }

    public static void binCoeff(int n,int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nr_fact=factorial(n-r);
        int nCr= n_fact/(r_fact * nr_fact);
        System.out.println("Binomial Coefficient is : "+nCr);
    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n and r :");
        int n=sc.nextInt();
        int r=sc.nextInt();
        binCoeff(n,r);
        sc.close();
        
    }
}
