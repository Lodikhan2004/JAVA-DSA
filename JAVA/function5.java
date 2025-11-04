
//Enter 3 numbers from the user & make a function to print their average.
import java.util.*;
public class function5 {
    public static void averageOfNumbers(int a,int b,int c){
        int avg=(a+b+c)/3;
        System.out.println("Average of 3 numbers:"+ avg);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        averageOfNumbers(a, b, c);
        sc.close();


    }
}