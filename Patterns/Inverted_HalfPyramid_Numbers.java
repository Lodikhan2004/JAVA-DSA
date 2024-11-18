package Patterns;
import java.util.*;
public class Inverted_HalfPyramid_Numbers {
    public static void invHalfPyramidNo(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int n=sc.nextInt();
        invHalfPyramidNo(n);
        sc.close();
        
    }

    
}
