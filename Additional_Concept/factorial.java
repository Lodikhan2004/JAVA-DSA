package Additional_Concept;
import java.util.*;
public class factorial {

    public static int fact(int n){
        int f=1;
        for(int i=n;i>=1;i--){
            f= f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.close();

        if(a<1){
            System.out.println("Enter a valid no!");
            return;
        }
        System.out.println("Factorial of a number" + fact(a));
    }
    
}
