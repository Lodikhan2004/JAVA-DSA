package Additional_Concept;

import java.util.Scanner;

public class sum_Of_Digits_In_Integer {
    public static int integerSum(int n){
        int sum=0;
        while(n>0){
            int lastDigit=(n%10);
            sum=sum+lastDigit;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a integer number:");
         int a=sc.nextInt();
        System.out.println("Sum of an integer number is :" + integerSum(a));
        sc.close();
    }
    
}
