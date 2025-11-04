//Write a function to print the sum of all odd numbers from 1 to n.
import java.util.*;
public class function6 {
    public static int sumOfOddNumber(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            if(i%2 != 0){
                sum=sum+i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for n:");
        int n=sc.nextInt();
       int res=sumOfOddNumber(n);
       System.out.println("RESULT="+res);
       sc.close();
        
    }
    
}
