package Patterns;
import java.util.*;
public class Inverted_Rotated_HalfPyramid {
    public static void inv_HalfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }    
                for(int k=1;k<=i;k++){
                    System.out.print("*");
                }
                System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int n=sc.nextInt();
        inv_HalfPyramid(n);
        sc.close();
        
    }
    
}
